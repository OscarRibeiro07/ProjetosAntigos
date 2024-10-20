package br.com.mrtech.autocenter.automoveis.infra;


import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutomovelSpringDataJpaRepository extends JpaRepository<Automovel, UUID> {
}
