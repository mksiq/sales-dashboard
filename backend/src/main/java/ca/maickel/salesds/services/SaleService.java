package ca.maickel.salesds.services;

import ca.maickel.salesds.dto.SaleDTO;
import ca.maickel.salesds.dto.SaleSumDTO;
import ca.maickel.salesds.repositories.SaleRepository;
import ca.maickel.salesds.repositories.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SalesmanRepository salesmanRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        // to persist in memory, this would not be suggested if there was a large number of salesmen.
        // Without it will do a select for every salesman
        salesmanRepository.findAll();
        return saleRepository.findAll(pageable)
                .map(SaleDTO::new);
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> totalBySalesman(){
        salesmanRepository.findAll();
        return saleRepository.totalBySalesman();
    }
}
