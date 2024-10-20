package expertostech.encriptarsenhausuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import expertostech.encriptarsenhausuario.model.UsuarioModel;

public interface UsuarioRepositiry extends JpaRepository<UsuarioModel, Integer> {
	public Optional<UsuarioModel> findByLogin(String login);
}
