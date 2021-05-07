package ca.maickel.salesds.repositories;

import ca.maickel.salesds.dto.SaleSuccessDTO;
import ca.maickel.salesds.dto.SaleSumDTO;
import ca.maickel.salesds.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("SELECT " +
            " new ca.maickel.salesds.dto.SaleSumDTO(sale.salesman, SUM(sale.amount)) " +
            " FROM Sale AS sale " +
            " GROUP BY sale.salesman")
    List<SaleSumDTO> totalBySalesman();

    @Query("SELECT " +
            " new ca.maickel.salesds.dto.SaleSuccessDTO(sale.salesman, SUM(sale.deals),SUM(sale.visitedCustomers)) " +
            " FROM Sale AS sale " +
            " GROUP BY sale.salesman")
    List<SaleSuccessDTO> successBySalesman();
}
