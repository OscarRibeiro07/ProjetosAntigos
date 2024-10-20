package br.com.mrtech.autocenter.automoveis.domain;

import br.com.mrtech.autocenter.automoveis.application.api.AlteraInformacoesRequest;
import br.com.mrtech.autocenter.automoveis.application.api.AutomovelRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Automovel {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    @Column(columnDefinition = "UUID", name = "idAutomovel", unique = true,nullable = false)
    private UUID idAutomovel;
    @Enumerated(value = EnumType.STRING)
    private TipoAutomovel  tipo;
    @Enumerated(value = EnumType.STRING)
    private Marca marca;
    private String descricao;
    @NotBlank
    @Column(unique = true)
    private String placa;
    private Boolean alugado = false;
    private int valorDiaria;
    @NotNull
    private LocalDate anoFabricacao;
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAtualizacao;

    public Automovel(AutomovelRequest automovelRequest) {
        this.tipo = automovelRequest.getTipo();
        this.marca = automovelRequest.getMarca();
        this.descricao = automovelRequest.getDescricao();
        this.placa =  automovelRequest.getPlaca();
        this.alugado =  automovelRequest.getAlugado();
        this.valorDiaria =  automovelRequest.getValorDiaria();
        this.anoFabricacao =  automovelRequest.getAnoFabricacao();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
    public void alteraRequest(AlteraInformacoesRequest informacoesRequest) {
        this.descricao = informacoesRequest.getDescricao();
        this.alugado =  informacoesRequest.getAlugado();
        this.valorDiaria =  informacoesRequest.getValorDiaria();
        this.dataHoraDaUltimaAtualizacao= LocalDateTime.now();
    }
}
