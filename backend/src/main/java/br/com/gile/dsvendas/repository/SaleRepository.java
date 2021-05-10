package br.com.gile.dsvendas.repository;

import br.com.gile.dsvendas.dto.SaleSuccessDTO;
import br.com.gile.dsvendas.dto.SaleSumDTO;
import br.com.gile.dsvendas.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {


    @Query("SELECT new br.com.gile.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new br.com.gile.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> sucessGroupedBySeller();
}
