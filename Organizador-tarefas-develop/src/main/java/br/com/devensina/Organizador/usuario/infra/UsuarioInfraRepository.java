package br.com.devensina.Organizador.usuario.infra;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.devensina.Organizador.handler.APIException;
import br.com.devensina.Organizador.usuario.application.repository.UsuarioRepository;
import br.com.devensina.Organizador.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@RequiredArgsConstructor
@Repository
public class UsuarioInfraRepository implements UsuarioRepository {

	private final UsuarioSpringDataJPARepository usuarioSpringDataJPARepository;

	@Override
	public Usuario salva(Usuario usuario) {
		log.info("[inicia] UsuarioInfraRepository - salva ");
		var salva = usuarioSpringDataJPARepository.save(usuario);
		log.info("[inicia] UsuarioInfraRepository - salva ");
		return salva;
	}

	@Override
	public Usuario buscaUsuarioPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioInfraRepository - buscaUsarioPorId ");
		var busca = usuarioSpringDataJPARepository.findById(idUsuario).orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, 
				"Usuario não encontrado"));
		log.info("[finaliza] UsuarioInfraRepository - buscaUsarioPorId ");
		return busca;
	}

	@Override
	public void deleta(Usuario user) {
		log.info("[inicia] UsuarioInfraRepository - deleta ");
		usuarioSpringDataJPARepository.delete(user);
		log.info("[finaliza] UsuarioInfraRepository - deleta ");
		
	}

}
