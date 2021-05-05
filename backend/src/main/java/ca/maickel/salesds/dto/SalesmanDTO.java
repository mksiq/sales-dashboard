package ca.maickel.salesds.dto;

import ca.maickel.salesds.entities.Salesman;

import java.io.Serializable;
import java.util.Objects;

public class SalesmanDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    public SalesmanDTO() {
    }

    public SalesmanDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SalesmanDTO(Salesman salesman) {
        this.id = salesman.getId();
        this.name = salesman.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesmanDTO that = (SalesmanDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
