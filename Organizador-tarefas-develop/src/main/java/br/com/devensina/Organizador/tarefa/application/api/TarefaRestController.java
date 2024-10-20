package br.com.devensina.Organizador.tarefa.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.devensina.Organizador.tarefa.application.service.TarefaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@RestController
public class TarefaRestController implements TarefaAPI {

	private final TarefaService tarefaService;

	@Override
	public TarefaIdResponse postCriaNovaTarefa(TarefaRequest tarefaRequest, UUID idUsuario) {
		log.info("[inicia] TarefaRestController - postCriaNovaTarefa");
		TarefaIdResponse tarefa = tarefaService.postCrivaNovaTarefa(tarefaRequest, idUsuario);
		log.info("[finaliza] TarefaRestController - postCriaNovaTarefa");
		return tarefa;
	}

	@Override
	public List<TarefaListResponse> getListaTodasTarefas() {
		log.info("[inicia] TarefaRestController - getListaTodasTarefas");
		List<TarefaListResponse> listaTarefas = tarefaService.getListaTodasTarefas();
		log.info("[finaliza] TarefaRestController - getListaTodasTarefas");
		return listaTarefas;
	}

	@Override
	public TarefaDetalhadaResponse getDetalheTarefa(UUID idTarefa) {
		log.info("[inicia] TarefaRestController - getDetalheTarefa");
		TarefaDetalhadaResponse tarefa = tarefaService.getDetalheTarefa(idTarefa);
		log.info("[finaliza] TarefaRestController - getDetalheTarefa");
		return tarefa;
	}

	@Override
	public void postMudaStatusPausaCurta(UUID idTarefa) {
		log.info("[inicia] TarefaRestController - postMudaStatusPausaCurta");
		tarefaService.mudaStatusPausaCurta(idTarefa);
		log.info("[finaliza] TarefaRestController - postMudaStatusPausaCurta");
	}
	
	@Override
	public void deletaTarefaPorId(UUID idTarefa) {
		log.info("[inicia] TarefaRestController - deletaTarefaPorId");		
		tarefaService.deletaTarefaPorId(idTarefa);
		log.info("[finaliza] TarefaRestController - deletaTarefaPorId");		
	}
	public void postMudaStatusConcluido(UUID idTarefa) {
		log.info("[inicia] TarefaRestController - postMudaStatusConcluido");
		tarefaService.mudaStatusConcluido(idTarefa);
		log.info("[finaliza] TarefaRestController - postMudaStatusConcluido");
	}
	public void postMudaStatusPAusaLonga(UUID idTarefa) {
		log.info("[inicia] TarefaRestController - postMudaStatusPAusaLonga");
		tarefaService.mudaStatusPausaLonga(idTarefa);
		log.info("[finaliza] TarefaRestController - postMudaStatusPAusaLonga");
	}
}
