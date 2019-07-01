package com.ecomerce.web.webservice.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class DetalleFactura {

    @Id
    @GeneratedValue
    private long idDetalleFactura;

    @ManyToOne()
    @JoinColumn(name = "idProducto")
    private Producto producto;

    @ManyToOne()
    @JoinColumn(name = "idFactura")
    private Factura factura;

    private BigDecimal precio;

    private long cantidad;

    public long getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public DetalleFactura(long idDetalleFactura, Producto producto, Factura factura, BigDecimal precio, long cantidad) {
        this.idDetalleFactura = idDetalleFactura;
        this.producto = producto;
        this.factura = factura;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setIdDetalleFactura(long idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleFactura that = (DetalleFactura) o;
        return idDetalleFactura == that.idDetalleFactura &&
                cantidad == that.cantidad &&
                Objects.equals(producto, that.producto) &&
                Objects.equals(factura, that.factura) &&
                Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetalleFactura, producto, factura, precio, cantidad);
    }

    @Override
    public String toString() {
        return "DetalleFactura{" +
                "idDetalleFactura=" + idDetalleFactura +
                ", producto=" + producto +
                ", factura=" + factura +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
