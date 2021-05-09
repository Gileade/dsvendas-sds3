package br.com.gile.dsvendas.repository;

import br.com.gile.dsvendas.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
