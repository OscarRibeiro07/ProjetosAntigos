package br.com.devensina.Organizador.tarefa.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@RequestMapping("/v1/tarefa/{idUsuario}")
public interface TarefaAPI {
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	TarefaIdResponse postCriaNovaTarefa(@RequestBody @Valid TarefaRequest tarefaRequest,@PathVariable UUID idUsuario);
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	List<TarefaListResponse> getListaTodasTarefas();
	
	@GetMapping("/{idTarefa}")
	@ResponseStatus(value = HttpStatus.OK)
	TarefaDetalhadaResponse getDetalheTarefa(@PathVariable UUID idTarefa);
	
	@PostMapping("/{idTarefa}/pausaCurta")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	void postMudaStatusPausaCurta(@PathVariable UUID idTarefa);
	
	@DeleteMapping("/{idTarefa}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT )
	void deletaTarefaPorId(@PathVariable UUID idTarefa);
	
	@PostMapping("/{idTarefa}/concluido")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	void postMudaStatusConcluido(@PathVariable UUID idTarefa);
	
	@PostMapping("/{idTarefa}/pausaLonga")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	void postMudaStatusPAusaLonga(@PathVariable UUID idTarefa);
	
}
