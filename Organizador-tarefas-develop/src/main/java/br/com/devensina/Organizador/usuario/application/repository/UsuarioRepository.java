package br.com.devensina.Organizador.usuario.application.repository;

import java.util.UUID;

import br.com.devensina.Organizador.usuario.domain.Usuario;

public interface UsuarioRepository {
	Usuario salva(Usuario usuario);
	Usuario buscaUsuarioPorId(UUID idUsuario);
	void deleta(Usuario user);
}
