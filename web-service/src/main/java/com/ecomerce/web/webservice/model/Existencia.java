package com.ecomerce.web.webservice.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Existencia {

    @Id
    @GeneratedValue
    private long idExistencia;

    private LocalDateTime fechaYHoraIngreso;

    private long cantidad;

    @ManyToOne()
    @JoinColumn(name = "idProducto")
    private Producto producto;

    public Existencia(long idExistencia, LocalDateTime fechaYHoraIngreso, long cantidad, Producto producto) {
        this.idExistencia = idExistencia;
        this.fechaYHoraIngreso = fechaYHoraIngreso;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public LocalDateTime getFechaYHoraIngreso() {
        return fechaYHoraIngreso;
    }

    public void setFechaYHoraIngreso(LocalDateTime fechaYHoraIngreso) {
        this.fechaYHoraIngreso = fechaYHoraIngreso;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getIdExistencia() {
        return idExistencia;
    }

    public void setIdExistencia(long idExistencia) {
        this.idExistencia = idExistencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Existencia that = (Existencia) o;
        return idExistencia == that.idExistencia &&
                cantidad == that.cantidad &&
                Objects.equals(fechaYHoraIngreso, that.fechaYHoraIngreso) &&
                Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idExistencia, fechaYHoraIngreso, cantidad, producto);
    }

    @Override
    public String toString() {
        return "Existencia{" +
                "idExistencia=" + idExistencia +
                ", fechaYHoraIngreso=" + fechaYHoraIngreso +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }
}
