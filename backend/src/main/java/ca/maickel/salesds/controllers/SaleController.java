package ca.maickel.salesds.controllers;

import ca.maickel.salesds.dto.SaleDTO;
import ca.maickel.salesds.dto.SaleSumDTO;
import ca.maickel.salesds.repositories.SalesmanRepository;
import ca.maickel.salesds.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        return ResponseEntity.ok(saleService.findAll(pageable));
    }

    @GetMapping(value = "/total-by-salesman")
    public ResponseEntity<List<SaleSumDTO>> findAll(){
        return ResponseEntity.ok(saleService.totalBySalesman());
    }
}
