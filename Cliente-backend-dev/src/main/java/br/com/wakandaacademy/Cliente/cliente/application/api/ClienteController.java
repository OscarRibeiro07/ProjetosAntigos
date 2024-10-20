package br.com.wakandaacademy.Cliente.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.wakandaacademy.Cliente.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteIdResponse postCadastraNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCadastraNovoCliente");
		ClienteIdResponse cliente = clienteService.cadastraNovoCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCadastraNovoCliente");
		return cliente;
	}

	@Override
	public List<ClienteListResponse> getListaTodosClientes() {
		log.info("[inicia] ClienteController - getListaTodosClientes");
		List<ClienteListResponse> lista = clienteService.listaTodosClientes();
		log.info("[finaliza] ClienteController - getListaTodosClientes");
		return lista;
	}

	@Override
	public ClienteDetalhadoResponse getClienteDetalhado(UUID idCliente) {
		log.info("[inicia] ClienteController - getClienteDetalhado");
		ClienteDetalhadoResponse cliente = clienteService.clienteDetalhado(idCliente);
		log.info("[finaliza] ClienteController - getClienteDetalhado");
		return cliente;
	}

	@Override
	public void deletaClintePorId(UUID idCliente) {
		log.info("[inicia] ClienteController - deletaClintePorId");
		clienteService.deletaClientePorId(idCliente);
		log.info("[finaliza] ClienteController - deletaClintePorId");
	}
}
