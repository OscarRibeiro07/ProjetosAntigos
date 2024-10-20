package br.com.mrtech.autocenter.automoveis.application.service;

import br.com.mrtech.autocenter.automoveis.application.api.*;

import java.util.List;
import java.util.UUID;

public interface AutomovelService {
    AutomovelIdResponse cadastraNovoAutomovel(AutomovelRequest automovelRequest);
    List<ListaAutomoveisResponse> listaTodosVeiulos();
  
    DetalheAutomovelResponse detalhaAutomovel(UUID idAutomovel);
    void alteraInformacoesVeiculo(UUID idAutomovel, AlteraInformacoesRequest informacoesRequest);

