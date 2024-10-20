package br.com.mrtech.autocenter.automoveis.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("/v1/automovel")
public interface AutomovelAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    AutomovelIdResponse postCadastraNovoVeiculo(@RequestBody @Valid AutomovelRequest automovelRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ListaAutomoveisResponse> getListaTodosVeiculos();

    @GetMapping("/{idAutomovel}")
    @ResponseStatus(code = HttpStatus.OK)
    DetalheAutomovelResponse getDetalhaAutomovel(@PathVariable UUID idAutomovel);

    @PatchMapping("/{idAutomovel}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)

    void  getAlteraInformacoesVeiculo(@PathVariable UUID idAutomovel,@RequestBody @Valid AlteraInformacoesRequest informacoesRequest);

}
