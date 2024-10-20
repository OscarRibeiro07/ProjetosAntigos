package br.com.devensina.Organizador.usuario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devensina.Organizador.usuario.domain.Usuario;

public interface UsuarioSpringDataJPARepository extends JpaRepository<Usuario, UUID> {

}
