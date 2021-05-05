package ca.maickel.salesds.services;

import ca.maickel.salesds.dto.SalesmanDTO;
import ca.maickel.salesds.repositories.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SalesmanService {

    @Autowired
    private SalesmanRepository salesmanRepository;

    public List<SalesmanDTO> findAll() {
        return salesmanRepository.findAll()
                .stream()
                .map(SalesmanDTO::new)
                .collect(Collectors.toList());
    }

}
