package br.com.mrtech.autocenter.automoveis.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class AutomovelIdResponse {
    private UUID idAutomovel;
}
