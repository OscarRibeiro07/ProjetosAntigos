package br.com.devensina.Organizador.tarefa.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devensina.Organizador.tarefa.domain.Tarefa;

public interface TarefaSpringDataJPARepository extends JpaRepository<Tarefa, UUID> {

}
