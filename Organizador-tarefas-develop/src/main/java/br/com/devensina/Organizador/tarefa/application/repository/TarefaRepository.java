package br.com.devensina.Organizador.tarefa.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.devensina.Organizador.tarefa.domain.Tarefa;

public interface TarefaRepository {
	Tarefa salva(Tarefa tarefa);
	List<Tarefa> buscaTodasTarefas();
	Tarefa buscaTarefaPorId(UUID idTarefa);
	void deleta(UUID idTarefa);
}
