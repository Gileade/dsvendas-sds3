package br.com.gile.dsvendas.controller;

import br.com.gile.dsvendas.dto.SaleDTO;
import br.com.gile.dsvendas.dto.SaleSuccessDTO;
import br.com.gile.dsvendas.dto.SaleSumDTO;
import br.com.gile.dsvendas.service.SaleSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleSevice sevice;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = sevice.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
        List<SaleSumDTO> list = sevice.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> sucessGroupedBySeller(){
        List<SaleSuccessDTO> list = sevice.sucessGroupedBySeller();
        return ResponseEntity.ok(list);
    }
}
