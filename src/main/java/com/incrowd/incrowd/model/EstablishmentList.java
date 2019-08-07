package com.incrowd.incrowd.model;

import java.util.ArrayList;
import java.util.List;

public class EstablishmentList {

    List<Establishment> establishments = new ArrayList<>();

    public EstablishmentList(List<Establishment> establishments) {
        this.establishments = establishments;
    }

    public List<Establishment> getEstablishments() {
        return establishments;
    }

    public void setEstablishments(List<Establishment> establishments) {
        this.establishments = establishments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstablishmentList that = (EstablishmentList) o;

        return establishments != null ? establishments.equals(that.establishments) : that.establishments == null;
    }

    @Override
    public int hashCode() {
        return establishments != null ? establishments.hashCode() : 0;
    }
}
