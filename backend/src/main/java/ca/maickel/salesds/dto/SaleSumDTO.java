package ca.maickel.salesds.dto;

import ca.maickel.salesds.entities.Salesman;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String salesman;
    private Double value;

    public SaleSumDTO() {
    }

    public SaleSumDTO(Salesman salesman, Double value) {
        this.salesman = salesman.getName();
        this.value = value;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
