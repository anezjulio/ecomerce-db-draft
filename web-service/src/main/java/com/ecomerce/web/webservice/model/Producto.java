package com.ecomerce.web.webservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
public class Producto {
    @Id
    @GeneratedValue
    private long idProducto;

    private String descripcion;

    @NotNull
    private String titulo;

    @NotNull
    private BigDecimal precio;

    private boolean esCupon;

    @ManyToOne()
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    @OneToMany(mappedBy = "producto")
    private List<Existencia> listaExistencia;

    @OneToMany(mappedBy = "producto")
    private List<Caracteristica> listaCaracteristica;

    @OneToMany(mappedBy = "producto")
    private List<DetalleFactura> listaDetalleFactura;

    @OneToMany(mappedBy = "producto")
    private List<ShoppingCar> listaShoppingCar;

    public List<Existencia> getListaExistencia() {
        return listaExistencia;
    }

    public void setListaExistencia(List<Existencia> listaExistencia) {
        this.listaExistencia = listaExistencia;
    }

    public List<Caracteristica> getListaCaracteristica() {
        return listaCaracteristica;
    }

    public void setListaCaracteristica(List<Caracteristica> listaCaracteristica) {
        this.listaCaracteristica = listaCaracteristica;
    }

    public List<DetalleFactura> getListaDetalleFactura() {
        return listaDetalleFactura;
    }

    public void setListaDetalleFactura(List<DetalleFactura> listaDetalleFactura) {
        this.listaDetalleFactura = listaDetalleFactura;
    }

    public List<ShoppingCar> getListaShoppingCar() {
        return listaShoppingCar;
    }

    public void setListaShoppingCar(List<ShoppingCar> listaShoppingCar) {
        this.listaShoppingCar = listaShoppingCar;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public boolean isEsCupon() {
        return esCupon;
    }

    public void setEsCupon(boolean esCupon) {
        this.esCupon = esCupon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return idProducto == producto.idProducto &&
                esCupon == producto.esCupon &&
                Objects.equals(descripcion, producto.descripcion) &&
                Objects.equals(titulo, producto.titulo) &&
                Objects.equals(precio, producto.precio) &&
                Objects.equals(categoria, producto.categoria) &&
                Objects.equals(listaExistencia, producto.listaExistencia) &&
                Objects.equals(listaCaracteristica, producto.listaCaracteristica) &&
                Objects.equals(listaDetalleFactura, producto.listaDetalleFactura) &&
                Objects.equals(listaShoppingCar, producto.listaShoppingCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, descripcion, titulo, precio, esCupon, categoria, listaExistencia, listaCaracteristica, listaDetalleFactura, listaShoppingCar);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", descripcion='" + descripcion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", esCupon=" + esCupon +
                ", categoria=" + categoria +
                ", listaExistencia=" + listaExistencia +
                ", listaCaracteristica=" + listaCaracteristica +
                ", listaDetalleFactura=" + listaDetalleFactura +
                ", listaShoppingCar=" + listaShoppingCar +
                '}';
    }
}
