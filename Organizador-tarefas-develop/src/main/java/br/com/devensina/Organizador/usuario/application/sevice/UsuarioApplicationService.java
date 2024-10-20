package br.com.devensina.Organizador.usuario.application.sevice;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.devensina.Organizador.usuario.application.api.UsuarioDetalhadoResponse;
import br.com.devensina.Organizador.usuario.application.api.UsuarioIdResponse;
import br.com.devensina.Organizador.usuario.application.api.UsuarioRequest;
import br.com.devensina.Organizador.usuario.application.repository.UsuarioRepository;
import br.com.devensina.Organizador.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@RequiredArgsConstructor
@Service
public class UsuarioApplicationService implements UsuarioService {

	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioIdResponse cadastraNovoUsuario(UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioApplicationService - cadastrNovoUsuario ");
		Usuario user = usuarioRepository.salva(new Usuario(usuarioRequest));
		log.info("[finaliza] UsuarioApplicationService - cadastrNovoUsuario ");
		return UsuarioIdResponse.builder().idUsuario(user.getIdUsuario()).build();
	}

	@Override
	public UsuarioDetalhadoResponse detalhaUsuario(UUID idUsuario) {
		log.info("[inicia] UsuarioApplicationService - detalhaUsuario ");
		Usuario user =  usuarioRepository.buscaUsuarioPorId(idUsuario);
		log.info("[finaliza] UsuarioApplicationService - detalhaUsuario ");
		return new UsuarioDetalhadoResponse(user);
	}

	@Override
	public void deletaUsuarioPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioApplicationService - deletaUsuarioPorId ");
		Usuario user =  usuarioRepository.buscaUsuarioPorId(idUsuario);
		usuarioRepository.deleta(user);
		log.info("[inicia] UsuarioApplicationService - deletaUsuarioPorId ");
		
	}

}
