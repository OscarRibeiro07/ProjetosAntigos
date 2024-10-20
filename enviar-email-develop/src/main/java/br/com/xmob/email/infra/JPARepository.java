package br.com.xmob.email.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xmob.email.domain.EmailModel;

public interface JPARepository extends JpaRepository<EmailModel, UUID> {

}
