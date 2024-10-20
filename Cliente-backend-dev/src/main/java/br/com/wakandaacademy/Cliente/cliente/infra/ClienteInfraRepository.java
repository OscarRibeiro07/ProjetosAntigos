package br.com.wakandaacademy.Cliente.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.wakandaacademy.Cliente.cliente.application.repository.ClienteRepository;
import br.com.wakandaacademy.Cliente.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		Cliente salvaCliente = clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return salvaCliente;
	}

	@Override
	public List<Cliente> buscaTodosCliente() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosCliente");	
		List<Cliente> buscaClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClienteInfraRepository - buscaTodosCliente");		
		return buscaClientes;
	}

	@Override
	public Cliente buscaClientePorId(UUID idCliente) {
		log.info("[inicia] ClienteInfraRepository - buscaClientePorId");
		Cliente buscaCliente = clienteSpringDataJPARepository.findById(idCliente).orElseThrow(null);
		log.info("[finaliza] ClienteInfraRepository - buscaClientePorId");	
		return buscaCliente;
	}
}
