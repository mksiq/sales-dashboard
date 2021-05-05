package ca.maickel.salesds.controllers;

import ca.maickel.salesds.dto.SalesmanDTO;
import ca.maickel.salesds.services.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salesmen")
public class SalesmanController {
    @Autowired
    private SalesmanService salesmanService;

    @GetMapping
    public ResponseEntity<List<SalesmanDTO>> findAll(){
        return ResponseEntity.ok(salesmanService.findAll());
    }

}
