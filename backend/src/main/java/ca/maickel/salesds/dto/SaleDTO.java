package ca.maickel.salesds.dto;

import ca.maickel.salesds.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class SaleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer visitedCustomers;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SalesmanDTO salesman;

    public SaleDTO() {
    }

    public SaleDTO(Long id, Integer visitedCustomers, Integer deals, Double amount, LocalDate date, SalesmanDTO salesman) {
        this.id = id;
        this.visitedCustomers = visitedCustomers;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.salesman = salesman;
    }

    public SaleDTO(Sale sale) {
        this.id = sale.getId();
        this.visitedCustomers = sale.getVisitedCustomers();
        this.deals = sale.getDeals();
        this.amount = sale.getAmount();
        this.date = sale.getDate();
        this.salesman = new SalesmanDTO(sale.getSalesman());
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisitedCustomers() {
        return visitedCustomers;
    }

    public void setVisitedCustomers(Integer visitedCustomers) {
        this.visitedCustomers = visitedCustomers;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SalesmanDTO getSalesman() {
        return salesman;
    }

    public void setSalesman(SalesmanDTO salesman) {
        this.salesman = salesman;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleDTO saleDTO = (SaleDTO) o;
        return Objects.equals(id, saleDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
