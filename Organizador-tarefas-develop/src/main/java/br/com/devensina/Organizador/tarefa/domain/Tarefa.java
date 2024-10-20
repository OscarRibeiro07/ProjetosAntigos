package br.com.devensina.Organizador.tarefa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import br.com.devensina.Organizador.tarefa.application.api.TarefaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Tarefa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID", name = "idTarefa", unique = true, nullable = false, updatable = false)
	private UUID idTarefa;
	@NotBlank
	private String tarefa;
	@NotBlank
	private String descricao;
	@Enumerated(EnumType.STRING)
	private Status status = Status.A_FAZER;
	private int contagemPomodoro = 1;
	private LocalDateTime inicio;
	private LocalDate finalizarEm;
	private String obs;
	
	public Tarefa(TarefaRequest tarefaRequest) {
		this.tarefa = tarefaRequest.getTarefa();
		this.descricao = tarefaRequest.getDescricao();
		this.status = tarefaRequest.getStatus();
		this.contagemPomodoro = tarefaRequest.getContagemPomodoro();
		this.inicio = LocalDateTime.now();
		this.finalizarEm = tarefaRequest.getFinalizarEm();
		this.obs = tarefaRequest.getObs();
	}

	public void pausaCurta(Tarefa tarefa2) {
		this.status = Status.PAUSA_CURTA;
	}

	public void concluido(Tarefa tarefa2) {
		this.status = Status.CONCLUIDO;
		
	}

	public void pausaLonga(Tarefa tarefa2) {
		this.status = Status.PAUSA_LONGA;
		
	}
}
