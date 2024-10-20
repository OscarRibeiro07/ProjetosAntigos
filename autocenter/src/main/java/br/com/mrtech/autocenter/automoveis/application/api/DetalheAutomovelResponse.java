package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import br.com.mrtech.autocenter.automoveis.domain.Marca;
import br.com.mrtech.autocenter.automoveis.domain.TipoAutomovel;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class DetalheAutomovelResponse {
    private UUID idAutomovel;
    private TipoAutomovel tipo;
    private Marca marca;
    private String descricao;
    private String placa;
    private Boolean alugado = false;
    private int valorDiaria;
    private LocalDate anoFabricacao;
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAtualizacao;

    public DetalheAutomovelResponse(Automovel automovel) {
        this.idAutomovel = automovel.getIdAutomovel();
        this.tipo =  automovel.getTipo();
        this.marca =  automovel.getMarca();
        this.descricao =  automovel.getDescricao();
        this.placa =  automovel.getPlaca();
        this.alugado =  automovel.getAlugado();
        this.valorDiaria =  automovel.getValorDiaria();
        this.anoFabricacao =  automovel.getAnoFabricacao();
        this.dataHoraDoCadastro =  automovel.getDataHoraDoCadastro();
        this.dataHoraDaUltimaAtualizacao =  automovel.getDataHoraDaUltimaAtualizacao();
    }
}
