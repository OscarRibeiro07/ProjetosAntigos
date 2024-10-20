package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.*;
import br.com.mrtech.autocenter.automoveis.application.repository.AutomovelRepository;
import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class AutomoveApplicationService implements AutomovelService {
    private final AutomovelRepository repository;

    @Override
    public AutomovelIdResponse cadastraNovoAutomovel(AutomovelRequest automovelRequest) {
        log.info("[inicia]  AutomoveApplicationService  - cadastraNovoAutomovel ");
        Automovel automovel = repository.salva(new Automovel(automovelRequest));
        log.info("[finaliza]  AutomoveApplicationService  - cadastraNovoAutomovel ");
        return AutomovelIdResponse.builder().idAutomovel(automovel.getIdAutomovel()).build();
    }
    @Override
    public List<ListaAutomoveisResponse> listaTodosVeiulos() {
        log.info("[inicia] AutomoveApplicationService - listaTodosVeiulos ");
        List<Automovel> automovel = repository.buscaTodosVeiculos();
        log.info("[finaliza] AutomoveApplicationService - listaTodosVeiulos ");
        return ListaAutomoveisResponse.converte(automovel);
    }
    @Override
    public DetalheAutomovelResponse detalhaAutomovel(UUID idAutomovel) {
       log.info("[inicia]  AutomoveApplicationService - detalhaAutomovel ");
       Automovel automovel = repository.buscaAutomovelId(idAutomovel);
       log.info("[finaliza]  AutomoveApplicationService - detalhaAutomovel ");
        return new DetalheAutomovelResponse(automovel);
    }

    @Override
    public void alteraInformacoesVeiculo(UUID idAutomovel, AlteraInformacoesRequest informacoesRequest) {
        log.info("[inicia]  AutomoveApplicationService - alteraInformacoesVeiculo ");
        Automovel automovel = repository.buscaAutomovelId(idAutomovel);
        automovel.alteraRequest(informacoesRequest);
        repository.salva(automovel);
        log.info("[finaliza]  AutomoveApplicationService - alteraInformacoesVeiculo ");
    }

    @Override
    public void deletaAutomovelPorId(Long idAutomovel) {
        log.info("[inicia]  AutomoveApplicationService - deletaAutomovelPorId ");
        repository.buscaAutomovelId(idAutomovel);
        repository.deletaAutomovelPorId(idAutomovel);
        log.info("[finaliza]  AutomoveApplicationService - deletaAutomovelPorId ");
    }
}
