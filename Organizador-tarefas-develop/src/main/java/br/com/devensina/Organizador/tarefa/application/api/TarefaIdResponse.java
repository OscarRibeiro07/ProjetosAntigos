package br.com.devensina.Organizador.tarefa.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TarefaIdResponse {
	private UUID idTarefa;
}
