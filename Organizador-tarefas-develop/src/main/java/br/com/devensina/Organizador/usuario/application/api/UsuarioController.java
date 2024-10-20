package br.com.devensina.Organizador.usuario.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.devensina.Organizador.usuario.application.sevice.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@RestController
public class UsuarioController implements UsuarioAPI {

	private final UsuarioService usuarioService;

	@Override
	public UsuarioIdResponse cadastrNovoUsuario(UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioController - cadastrNovoUsuario ");
		UsuarioIdResponse usuario = usuarioService.cadastraNovoUsuario(usuarioRequest);
		log.info("[finaliza] UsuarioController - cadastrNovoUsuario ");
		return usuario;
	}

	@Override
	public UsuarioDetalhadoResponse detalhaUsuario(UUID idUsuario) {
		log.info("[inicia] UsuarioController - detalhaUsuario ");
		UsuarioDetalhadoResponse detalhes = usuarioService.detalhaUsuario( idUsuario);
		log.info("[finaliza] UsuarioController - detalhaUsuario ");
		return detalhes;
	}

	@Override
	public void deletaUsuarioPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioController - deletaUsuarioPorId ");
		usuarioService.deletaUsuarioPorId(idUsuario);
		log.info("[finaliza] UsuarioController - deletaUsuarioPorId ");
		
	}

}
