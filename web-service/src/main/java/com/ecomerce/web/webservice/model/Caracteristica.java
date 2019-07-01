package com.ecomerce.web.webservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Caracteristica {

    @Id
    @GeneratedValue
    private long idCaracteristica;

    @NotNull
    private String titulo;

    private String descripcion;

    @ManyToOne()
    @JoinColumn(name = "idProducto")
    private Producto producto;

    public Caracteristica(long idCaracteristica, @NotNull String titulo, String descripcion, Producto producto) {
        this.idCaracteristica = idCaracteristica;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

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

    public long getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(long idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caracteristica that = (Caracteristica) o;
        return idCaracteristica == that.idCaracteristica &&
                Objects.equals(titulo, that.titulo) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCaracteristica, titulo, descripcion, producto);
    }

    @Override
    public String toString() {
        return "Caracteristica{" +
                "idCaracteristica=" + idCaracteristica +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", producto=" + producto +
                '}';
    }
}
