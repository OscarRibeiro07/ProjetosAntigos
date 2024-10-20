package br.com.devensina.Organizador.tarefa.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.devensina.Organizador.tarefa.domain.Status;
import br.com.devensina.Organizador.tarefa.domain.Tarefa;
import lombok.Getter;
@Getter
public class TarefaDetalhadaResponse {

	private String tarefa;
	private String descricao;
	@Enumerated(EnumType.STRING)
	private Status status = Status.A_FAZER;
	private int contagemPomodoro ;
	private LocalDateTime inicio;
	private LocalDate finalizarEm;
	private String obs;

	public TarefaDetalhadaResponse(Tarefa t) {
		this.tarefa = t.getTarefa();
		this.descricao = t.getDescricao();
		this.status = t.getStatus();
		this.contagemPomodoro = t.getContagemPomodoro();
		this.inicio = t.getInicio();
		this.finalizarEm = t.getFinalizarEm();
		this.obs = t.getObs();
	}
}
