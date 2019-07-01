package com.ecomerce.web.webservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class Categoria {
    @Id
    @GeneratedValue
    private long idCategoria;

    private String descripcion;

    @NotNull
    private String titulo;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> ListaProducto;

    public Categoria(long idCategoria, String descripcion, @NotNull String titulo, List<Producto> listaProducto) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.titulo = titulo;
        ListaProducto = listaProducto;
    }

    public List<Producto> getListaProducto() {
        return ListaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        ListaProducto = listaProducto;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return idCategoria == categoria.idCategoria &&
                Objects.equals(descripcion, categoria.descripcion) &&
                Objects.equals(titulo, categoria.titulo) &&
                Objects.equals(ListaProducto, categoria.ListaProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategoria, descripcion, titulo, ListaProducto);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", descripcion='" + descripcion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ListaProducto=" + ListaProducto +
                '}';
    }
}
