package br.com.gile.dsvendas.controller;

import br.com.gile.dsvendas.dto.SellerDTO;
import br.com.gile.dsvendas.service.SellerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerSevice sevice;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> list = sevice.findAll();
        return ResponseEntity.ok(list);
    }
}
