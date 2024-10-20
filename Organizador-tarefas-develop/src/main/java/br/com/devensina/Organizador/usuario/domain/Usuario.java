package br.com.devensina.Organizador.usuario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.devensina.Organizador.usuario.application.api.UsuarioRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID", name = "idUsuario", unique = true, nullable = false, updatable = false)
	private UUID idUsuario;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Column(unique = true)
	@Email
	private String email;
	@NotBlank
	private String telefone;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotNull
	private LocalDate dataNascimento;
	private Boolean aceitaTermos = true;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Usuario(UsuarioRequest usuarioRequest) {
		this.nomeCompleto = usuarioRequest.getNomeCompleto();
		this.email = usuarioRequest.getEmail();
		this.telefone = usuarioRequest.getTelefone();
		this.sexo = usuarioRequest.getSexo();
		this.cpf = usuarioRequest.getCpf();
		this.dataNascimento = usuarioRequest.getDataNascimento();
		this.aceitaTermos = usuarioRequest.getAceitaTermos();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}

