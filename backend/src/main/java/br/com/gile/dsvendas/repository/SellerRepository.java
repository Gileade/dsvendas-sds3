package br.com.gile.dsvendas.repository;

import br.com.gile.dsvendas.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
