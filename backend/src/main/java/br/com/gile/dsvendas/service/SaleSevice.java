package br.com.gile.dsvendas.service;

import br.com.gile.dsvendas.dto.SaleDTO;
import br.com.gile.dsvendas.model.Sale;
import br.com.gile.dsvendas.repository.SaleRepository;
import br.com.gile.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleSevice {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result =  repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
}
