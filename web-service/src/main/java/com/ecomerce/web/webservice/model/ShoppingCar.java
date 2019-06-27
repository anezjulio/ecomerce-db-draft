package com.ecomerce.web.webservice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ShoppingCar {

    @Id
    @GeneratedValue
    private long idShoppingCar;

    @ManyToOne()
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne()
    @JoinColumn(name = "idProducto")
    private Producto producto;

    public long getIdShoppingCar() {
        return idShoppingCar;
    }

    public void setIdShoppingCar(long idShoppingCar) {
        this.idShoppingCar = idShoppingCar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCar that = (ShoppingCar) o;
        return idShoppingCar == that.idShoppingCar &&
                Objects.equals(usuario, that.usuario) &&
                Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idShoppingCar, usuario, producto);
    }

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "idShoppingCar=" + idShoppingCar +
                ", usuario=" + usuario +
                ", producto=" + producto +
                '}';
    }
}
