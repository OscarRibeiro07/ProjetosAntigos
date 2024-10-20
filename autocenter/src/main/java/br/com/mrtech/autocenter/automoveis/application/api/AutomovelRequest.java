package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.domain.Marca;
import br.com.mrtech.autocenter.automoveis.domain.TipoAutomovel;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
public class AutomovelRequest {
    @NotNull
    private TipoAutomovel tipo;
    @NotNull
    private Marca marca;
    @NotBlank
    @Size(min = 20, message = "A descricao deve ter no minimo 20 caracteres")
    private String descricao;
    @NotBlank
    private String placa;
    private Boolean alugado = false;
    @NotNull
    private int valorDiaria;
    @NotNull
    private LocalDate anoFabricacao;
}
