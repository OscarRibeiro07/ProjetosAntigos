package br.com.devensina.Organizador.tarefa.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.devensina.Organizador.tarefa.application.api.TarefaDetalhadaResponse;
import br.com.devensina.Organizador.tarefa.application.api.TarefaIdResponse;
import br.com.devensina.Organizador.tarefa.application.api.TarefaListResponse;
import br.com.devensina.Organizador.tarefa.application.api.TarefaRequest;
import br.com.devensina.Organizador.tarefa.application.repository.TarefaRepository;
import br.com.devensina.Organizador.tarefa.domain.Tarefa;
import br.com.devensina.Organizador.usuario.application.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service
public class TarefaApplicationService implements TarefaService {

	private final TarefaRepository tarefaRepository;
	private final UsuarioRepository user;

	@Override
	public TarefaIdResponse postCrivaNovaTarefa(TarefaRequest tarefaRequest, UUID idUsuario) {
		log.info("[inicia] TarefaApplicationService - postCriaNovaTarefa");
		user.buscaUsuarioPorId(idUsuario);
		Tarefa tarefa = tarefaRepository.salva(new Tarefa(tarefaRequest));
		log.info("[inicia] TarefaApplicationService - postCriaNovaTarefa");
		return TarefaIdResponse.builder().idTarefa(tarefa.getIdTarefa()).build();
	}

	@Override
	public List<TarefaListResponse> getListaTodasTarefas() {
		log.info("[inicia] TarefaApplicationService - getListaTodasTarefas");
		List<Tarefa> tarefa = tarefaRepository.buscaTodasTarefas();
		log.info("[inicia] TarefaApplicationService - getListaTodasTarefas");
		return TarefaListResponse.converte(tarefa);
	}

	@Override
	public TarefaDetalhadaResponse getDetalheTarefa(UUID idTarefa) {
		log.info("[inicia] TarefaApplicationService - getDetalheTarefa");
		Tarefa t = tarefaRepository.buscaTarefaPorId(idTarefa);
		log.info("[inicia] TarefaApplicationService - getDetalheTarefa");
		return new TarefaDetalhadaResponse(t);
	}

	@Override
	public void mudaStatusPausaCurta(UUID idTarefa) {
		log.info("[inicia] TarefaApplicationService - mudaStatusPausaCurta");
		Tarefa tarefa = tarefaRepository.buscaTarefaPorId(idTarefa);
		tarefa.pausaCurta(tarefa);
		tarefaRepository.salva(tarefa);
		log.info("[finaliza] TarefaApplicationService - mudaStatusPausaCurta");
	}

	@Override
	public void deletaTarefaPorId(UUID idTarefa) {
		log.info("[inicia] TarefaApplicationService - deletaTarefaPorId");
		 tarefaRepository.buscaTarefaPorId(idTarefa);
		tarefaRepository.deleta(idTarefa);
		log.info("[inicia] TarefaApplicationService - deletaTarefaPorId");
	}
	@Override
	public void mudaStatusConcluido(UUID idTarefa) {
		log.info("[inicia] TarefaApplicationService - mudaStatusPausaCurta");
		Tarefa tarefa = tarefaRepository.buscaTarefaPorId(idTarefa);
		tarefa.concluido(tarefa);
		tarefaRepository.salva(tarefa);
		log.info("[finaliza] TarefaApplicationService - mudaStatusPausaCurta");
	}
	@Override
	public void mudaStatusPausaLonga(UUID idTarefa) {
		log.info("[inicia] TarefaApplicationService - mudaStatusPausaCurta");
		Tarefa tarefa = tarefaRepository.buscaTarefaPorId(idTarefa);
		tarefa.pausaLonga(tarefa);
		tarefaRepository.salva(tarefa);
		log.info("[finaliza] TarefaApplicationService - mudaStatusPausaCurta");
	}

}
