package br.com.devensina.Organizador.tarefa.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

import br.com.devensina.Organizador.tarefa.domain.Status;
import lombok.Value;

@Value
public class TarefaRequest {
	@NotEmpty(message = "O campo nome da tarefa não pode estar vazio")
	private String tarefa;
	@NotEmpty(message = "O campo descricao da tarefa não pode estar vazio")
	private String descricao;
	private Status status;
	private int contagemPomodoro;
	private LocalDateTime inicio;
	private LocalDate finalizarEm;
	private String obs;
}
