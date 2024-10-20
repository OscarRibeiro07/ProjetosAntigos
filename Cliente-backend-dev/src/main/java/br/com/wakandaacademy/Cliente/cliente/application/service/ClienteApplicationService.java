package br.com.wakandaacademy.Cliente.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.wakandaacademy.Cliente.cliente.application.api.ClienteDetalhadoResponse;
import br.com.wakandaacademy.Cliente.cliente.application.api.ClienteIdResponse;
import br.com.wakandaacademy.Cliente.cliente.application.api.ClienteListResponse;
import br.com.wakandaacademy.Cliente.cliente.application.api.ClienteRequest;
import br.com.wakandaacademy.Cliente.cliente.application.repository.ClienteRepository;
import br.com.wakandaacademy.Cliente.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteIdResponse cadastraNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - cadastraNovoCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
		return ClienteIdResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> listaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - listaTodosClientes");
		 List<Cliente> clientes = clienteRepository.buscaTodosCliente();
		log.info("[finaliza] ClienteApplicationService - listaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse clienteDetalhado(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - clienteDetalhado");
		Cliente cliente = clienteRepository.buscaClientePorId(idCliente);
		log.info("[finaliza] ClienteApplicationService - clienteDetalhado");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public void deletaClientePorId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - deletaClientePorId");
		clienteRepository.buscaClientePorId(idCliente);
		clienteRepository.deletaClientePorId(idCliente);
		log.info("[finaliza] ClienteApplicationService - deletaClientePorId");
		
	}
}
