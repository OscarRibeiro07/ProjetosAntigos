package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import br.com.mrtech.autocenter.automoveis.domain.TipoAutomovel;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class ListaAutomoveisResponse {
    private UUID idAutomovel;
    private TipoAutomovel tipo;
    private String placa;
    private int valorDiaria;

    public static List<ListaAutomoveisResponse> converte(List<Automovel> automovel) {
        return automovel.stream().map(ListaAutomoveisResponse::new).collect(Collectors.toList());
    }
    public ListaAutomoveisResponse(Automovel automovel) {
        this.idAutomovel = automovel.getIdAutomovel();
        this.tipo = automovel.getTipo();
        this.placa = automovel.getPlaca();
        this.valorDiaria = automovel.getValorDiaria();
    }
}
