package br.com.devensina.Organizador.usuario.application.api;

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

@RequestMapping("/v1/usuario")
public interface UsuarioAPI {
	
	@PostMapping("/cadastro")
	@ResponseStatus(value = HttpStatus.CREATED)
	UsuarioIdResponse cadastrNovoUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest);
	
	@GetMapping("/{idUsuario}")
	@ResponseStatus(value = HttpStatus.OK)
	UsuarioDetalhadoResponse detalhaUsuario(@PathVariable UUID idUsuario);
	
	@DeleteMapping("/{idUsuario}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	void deletaUsuarioPorId(@PathVariable UUID idUsuario);
	
}
