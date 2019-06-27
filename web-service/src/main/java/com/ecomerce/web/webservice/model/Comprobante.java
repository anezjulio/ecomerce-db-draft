package com.ecomerce.web.webservice.model;

import com.ecomerce.web.webservice.utils.Enums.EstadoComprobante;
import com.ecomerce.web.webservice.utils.Enums.TipoComprobante;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Comprobante {

    @Id
    @GeneratedValue
    private long idComprobante;

    private String direccion;

    @ManyToOne()
    @JoinColumn(name = "idFactura")
    private Factura factura;

    @NotNull
    private TipoComprobante tipoComprobante;

    private EstadoComprobante estadoComprobante;

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public EstadoComprobante getEstadoComprobante() {
        return estadoComprobante;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public void setEstadoComprobante(EstadoComprobante estadoComprobante) {
        this.estadoComprobante = estadoComprobante;
    }

    public long getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(long idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comprobante that = (Comprobante) o;
        return idComprobante == that.idComprobante &&
                Objects.equals(direccion, that.direccion) &&
                Objects.equals(factura, that.factura) &&
                tipoComprobante == that.tipoComprobante &&
                estadoComprobante == that.estadoComprobante;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComprobante, direccion, factura, tipoComprobante, estadoComprobante);
    }

    @Override
    public String toString() {
        return "Comprobante{" +
                "idComprobante=" + idComprobante +
                ", direccion='" + direccion + '\'' +
                ", factura=" + factura +
                ", tipoComprobante=" + tipoComprobante +
                ", estadoComprobante=" + estadoComprobante +
                '}';
    }
}
