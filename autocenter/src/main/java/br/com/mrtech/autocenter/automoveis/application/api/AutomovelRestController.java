package br.com.mrtech.autocenter.automoveis.application.api;

import br.com.mrtech.autocenter.automoveis.application.service.AutomovelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AutomovelRestController implements AutomovelAPI {
    private final AutomovelService service;

    @Override
    public AutomovelIdResponse postCadastraNovoVeiculo(AutomovelRequest automovelRequest) {
        log.info("[inicia] AutomovelRestController - postCadastraNovoVeiculo");
        AutomovelIdResponse automovel = service.cadastraNovoAutomovel(automovelRequest);
        log.info("[finaliza] AutomovelRestController - postCadastraNovoVeiculo");
        return automovel;
    }
    @Override
    public List<ListaAutomoveisResponse> getListaTodosVeiculos() {
        log.info("[inicia]  AutomovelRestController - getListaTodosVeiculos");
        List<ListaAutomoveisResponse> lista = service.listaTodosVeiulos();
        log.info("[finaliza]  AutomovelRestController - getListaTodosVeiculos");
        return lista;
    }
    @Override
    public DetalheAutomovelResponse getDetalhaAutomovel(UUID idAutomovel) {
        log.info("[inicia] AutomovelRestController - getDetalhaAutomovel");
        DetalheAutomovelResponse detalhes = service.detalhaAutomovel(idAutomovel);
        log.info("[finaliza] AutomovelRestController - getDetalhaAutomovel");
        return detalhes;
    }

    @Override
    public void getAlteraInformacoesVeiculo(UUID idAutomovel, AlteraInformacoesRequest informacoesRequest) {
        log.info("[inicia] AutomovelRestController - getAlteraInformacoesVeiculo");
        service.alteraInformacoesVeiculo(idAutomovel,informacoesRequest);
        log.info("[finaliza] AutomovelRestController - getAlteraInformacoesVeiculo");
    }

    @Override
    public void deletaAutomovelPorId(Long idAutomovel) {
        log.info("[inicia] AutomovelRestController - deletaAutomovelPorId");
        service.deletaAutomovelPorId(idAutomovel);
        log.info("[finaliza] AutomovelRestController - deletaAutomovelPorId");
    }
}
