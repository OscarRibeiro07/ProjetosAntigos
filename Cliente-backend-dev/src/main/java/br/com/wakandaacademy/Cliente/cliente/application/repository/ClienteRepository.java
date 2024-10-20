package br.com.wakandaacademy.Cliente.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.wakandaacademy.Cliente.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosCliente();
	Cliente buscaClientePorId(UUID idCliente);
}
