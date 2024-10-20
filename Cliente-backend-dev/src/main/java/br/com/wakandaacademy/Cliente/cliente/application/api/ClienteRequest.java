package br.com.wakandaacademy.Cliente.cliente.application.api;

import java.time.LocalDate;

import br.com.wakandaacademy.Cliente.cliente.domain.Sexo;
import lombok.Getter;

@Getter
public class ClienteRequest {
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private String cpf;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos = true;
}
