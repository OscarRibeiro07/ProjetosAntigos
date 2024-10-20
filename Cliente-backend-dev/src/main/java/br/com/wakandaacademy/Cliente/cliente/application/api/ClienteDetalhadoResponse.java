package br.com.wakandaacademy.Cliente.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.wakandaacademy.Cliente.cliente.domain.Cliente;
import br.com.wakandaacademy.Cliente.cliente.domain.Sexo;
import lombok.Getter;

@Getter
public class ClienteDetalhadoResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private String cpf;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos = true;
	private LocalDateTime dataHoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.cpf = cliente.getCpf();
		this.sexo = cliente.getSexo();
		this.dataNascimento = cliente.getDataNascimento();
		this.aceitaTermos = cliente.getAceitaTermos();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
}
