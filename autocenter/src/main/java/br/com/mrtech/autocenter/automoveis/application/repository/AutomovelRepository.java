package br.com.mrtech.autocenter.automoveis.application.repository;

import br.com.mrtech.autocenter.automoveis.domain.Automovel;

import java.util.List;
import java.util.UUID;

public interface AutomovelRepository {
    Automovel salva(Automovel automovel);
    List<Automovel> buscaTodosVeiculos();

    Automovel buscaAutomovelId(UUID idAutomovel);
}