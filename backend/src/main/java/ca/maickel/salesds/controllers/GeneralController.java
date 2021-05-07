package ca.maickel.salesds.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GeneralController {

    @GetMapping
    public ResponseEntity<String> checkAPi(Pageable pageable){
        return ResponseEntity.ok("{'message': 'Api is running'}");
    }
}
