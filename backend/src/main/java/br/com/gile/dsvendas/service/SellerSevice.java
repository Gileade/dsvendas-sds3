package br.com.gile.dsvendas.service;

import br.com.gile.dsvendas.dto.SellerDTO;
import br.com.gile.dsvendas.model.Seller;
import br.com.gile.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerSevice {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result =  repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
