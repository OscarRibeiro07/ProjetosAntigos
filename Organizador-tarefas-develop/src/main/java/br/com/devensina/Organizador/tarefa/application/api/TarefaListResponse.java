package br.com.devensina.Organizador.tarefa.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.devensina.Organizador.tarefa.domain.Tarefa;
import lombok.Getter;

@Getter
public class TarefaListResponse {
	private UUID idTarefa;
	private String tarefa;
	
	public static List<TarefaListResponse> converte(List<Tarefa> tarefa) {
		return tarefa.stream().map(TarefaListResponse::new).collect(Collectors.toList());
	}
	
	public TarefaListResponse(Tarefa lista) {
		
		this.idTarefa = lista.getIdTarefa();
		this.tarefa = lista.getTarefa();
	}
}
