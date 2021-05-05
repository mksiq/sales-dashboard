package ca.maickel.salesds.repositories;

import ca.maickel.salesds.entities.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesmanRepository extends JpaRepository<Salesman, Long> {
}
