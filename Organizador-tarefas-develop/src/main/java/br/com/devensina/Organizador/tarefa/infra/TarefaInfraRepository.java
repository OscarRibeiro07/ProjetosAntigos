package br.com.devensina.Organizador.tarefa.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.devensina.Organizador.handler.APIException;
import br.com.devensina.Organizador.tarefa.application.repository.TarefaRepository;
import br.com.devensina.Organizador.tarefa.domain.Tarefa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Repository
public class TarefaInfraRepository implements TarefaRepository {
	
	
	private final TarefaSpringDataJPARepository tarefaSpringDataJPARepository;

	@Override
	public Tarefa salva(Tarefa tarefa) {
		log.info("[inicia] TarefaInfraRepository - salva");
		Tarefa salva = tarefaSpringDataJPARepository.save(tarefa);
		log.info("[finaliza] TarefaInfraRepository - salva");
		return salva;
	}

	@Override
	public List<Tarefa> buscaTodasTarefas() {
		log.info("[inicia] TarefaInfraRepository - buscaTodasTarefas");
		var list = tarefaSpringDataJPARepository.findAll();
		log.info("[fnaliza] TarefaInfraRepository - buscaTodasTarefas");
		return list;
	}

	@Override
	public Tarefa buscaTarefaPorId(UUID idTarefa) {
		log.info("[inicia] TarefaInfraRepository - buscaTarefaPorId");		
		var busca = tarefaSpringDataJPARepository.findById(idTarefa).orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Essa tarefa não foi encontrada ou id incorreto"));
		log.info("[finaliza] TarefaInfraRepository - buscaTarefaPorId");		
		return busca;
	}

	@Override
	public void deleta(UUID idTarefa) {
		log.info("[inicia] TarefaInfraRepository - buscaTarefaPorId");	
		tarefaSpringDataJPARepository.deleteById(idTarefa);
		log.info("[finaliza] TarefaInfraRepository - buscaTarefaPorId");		
		
	}
}
