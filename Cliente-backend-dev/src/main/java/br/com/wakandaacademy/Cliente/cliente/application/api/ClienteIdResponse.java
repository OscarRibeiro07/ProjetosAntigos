package br.com.wakandaacademy.Cliente.cliente.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteIdResponse {
	private UUID idCliente;
}
