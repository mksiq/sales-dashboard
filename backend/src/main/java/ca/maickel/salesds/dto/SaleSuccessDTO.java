package ca.maickel.salesds.dto;

import ca.maickel.salesds.entities.Salesman;

import java.io.Serializable;

public class SaleSuccessDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String salesman;
    private Long deals;
    private Long visitedCustomers;

    public SaleSuccessDTO() {
    }

    public SaleSuccessDTO(Salesman salesman, Long deals, Long visitedCustomers) {
        this.salesman = salesman.getName();
        this.deals = deals;
        this.visitedCustomers = visitedCustomers;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }

    public Long getVisitedCustomers() {
        return visitedCustomers;
    }

    public void setVisitedCustomers(Long visitedCustomers) {
        this.visitedCustomers = visitedCustomers;
    }
}
