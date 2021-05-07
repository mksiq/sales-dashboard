package ca.maickel.salesds.repositories;

import ca.maickel.salesds.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
