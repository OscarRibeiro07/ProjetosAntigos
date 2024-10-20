package br.com.devensina.Organizador.usuario.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.devensina.Organizador.usuario.domain.Sexo;
import lombok.Getter;

@Getter
public class UsuarioRequest {
	private String nomeCompleto;
	private String email;
	private String telefone;
	private Sexo sexo;
	private String cpf;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos;
	private LocalDateTime dataHoraDoCadastro;
}
