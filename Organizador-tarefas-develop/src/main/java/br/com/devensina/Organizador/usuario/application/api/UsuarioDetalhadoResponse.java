package br.com.devensina.Organizador.usuario.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.devensina.Organizador.usuario.domain.Sexo;
import br.com.devensina.Organizador.usuario.domain.Usuario;
import lombok.Getter;
@Getter
public class UsuarioDetalhadoResponse {
	
	private String nomeCompleto;
	private String email;
	private String telefone;
	private Sexo sexo;
	private String cpf;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos = true;
	private LocalDateTime dataHoraDoCadastro;
	public UsuarioDetalhadoResponse(Usuario user) {
		super();
		this.nomeCompleto = user.getNomeCompleto();
		this.email = user.getEmail();
		this.telefone = user.getTelefone();
		this.sexo = user.getSexo();
		this.cpf = user.getCpf();
		this.dataNascimento = user.getDataNascimento();
		this.aceitaTermos = user.getAceitaTermos();
		this.dataHoraDoCadastro = user.getDataHoraDoCadastro();
	}
	
	
	
}
