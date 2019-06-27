package com.ecomerce.web.webservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class Sede {
    @Id
    @GeneratedValue
    private long idSede;

    @NotNull
    private String titulo;

    private String descripcion;

    @OneToMany(mappedBy = "sede")
    private List<Factura> listaFactura;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public long getIdSede() {
        return idSede;
    }

    public void setIdSede(long idSede) {
        this.idSede = idSede;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sede sede = (Sede) o;
        return idSede == sede.idSede &&
                Objects.equals(titulo, sede.titulo) &&
                Objects.equals(descripcion, sede.descripcion) &&
                Objects.equals(listaFactura, sede.listaFactura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSede, titulo, descripcion, listaFactura);
    }

    @Override
    public String toString() {
        return "Sede{" +
                "idSede=" + idSede +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", listaFactura=" + listaFactura +
                '}';
    }
}
