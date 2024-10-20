package br.com.wakandaacademy.Cliente.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.wakandaacademy.Cliente.cliente.application.api.ClienteDetalhadoResponse;
import br.com.wakandaacademy.Cliente.cliente.application.api.ClienteIdResponse;
import br.com.wakandaacademy.Cliente.cliente.application.api.ClienteListResponse;
import br.com.wakandaacademy.Cliente.cliente.application.api.ClienteRequest;

public interface ClienteService {
	ClienteIdResponse cadastraNovoCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> listaTodosClientes();
	ClienteDetalhadoResponse clienteDetalhado(UUID idCliente);
	void deletaClientePorId(UUID idCliente);
}
