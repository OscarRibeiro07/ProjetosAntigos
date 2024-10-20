package br.com.devensina.Organizador.tarefa.application.service;

import java.util.List;
import java.util.UUID;

import br.com.devensina.Organizador.tarefa.application.api.TarefaDetalhadaResponse;
import br.com.devensina.Organizador.tarefa.application.api.TarefaIdResponse;
import br.com.devensina.Organizador.tarefa.application.api.TarefaListResponse;
import br.com.devensina.Organizador.tarefa.application.api.TarefaRequest;

public interface TarefaService {
	TarefaIdResponse postCrivaNovaTarefa(TarefaRequest tarefaRequest,UUID idUsuario);
	List<TarefaListResponse> getListaTodasTarefas();
	TarefaDetalhadaResponse getDetalheTarefa(UUID idTarefa);
	void mudaStatusPausaCurta(UUID idTarefa);
	void deletaTarefaPorId(UUID idTarefa);
	void mudaStatusConcluido(UUID idTarefa);
	void mudaStatusPausaLonga(UUID idTarefa);
}
