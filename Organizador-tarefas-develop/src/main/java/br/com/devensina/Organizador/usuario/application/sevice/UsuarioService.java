package br.com.devensina.Organizador.usuario.application.sevice;

import java.util.UUID;

import br.com.devensina.Organizador.usuario.application.api.UsuarioDetalhadoResponse;
import br.com.devensina.Organizador.usuario.application.api.UsuarioIdResponse;
import br.com.devensina.Organizador.usuario.application.api.UsuarioRequest;

public interface UsuarioService {
	UsuarioIdResponse cadastraNovoUsuario(UsuarioRequest usuarioRequest);
	UsuarioDetalhadoResponse detalhaUsuario(UUID idUsuario);
	void deletaUsuarioPorId(UUID idUsuario);
}
