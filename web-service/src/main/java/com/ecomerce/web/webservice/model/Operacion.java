package com.ecomerce.web.webservice.model;

import com.ecomerce.web.webservice.utils.Enums.EstadoOperacion;
import com.ecomerce.web.webservice.utils.Enums.TipoOperacion;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Operacion {

    @Id
    @GeneratedValue
    private long idOperacion;

    private LocalDateTime fechaYHora;

    private String motivo;

    @NotNull
    private TipoOperacion tipoOperacion;

    private EstadoOperacion estadoOperacion;

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    @ManyToOne()
    @JoinColumn(name = "idFactura")
    private Factura factura;

    public Operacion(long idOperacion, LocalDateTime fechaYHora, String motivo, @NotNull TipoOperacion tipoOperacion, EstadoOperacion estadoOperacion, Factura factura) {
        this.idOperacion = idOperacion;
        this.fechaYHora = fechaYHora;
        this.motivo = motivo;
        this.tipoOperacion = tipoOperacion;
        this.estadoOperacion = estadoOperacion;
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public EstadoOperacion getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(EstadoOperacion estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public long getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(long idOperacion) {
        this.idOperacion = idOperacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operacion operacion = (Operacion) o;
        return idOperacion == operacion.idOperacion &&
                Objects.equals(fechaYHora, operacion.fechaYHora) &&
                Objects.equals(motivo, operacion.motivo) &&
                tipoOperacion == operacion.tipoOperacion &&
                estadoOperacion == operacion.estadoOperacion &&
                Objects.equals(factura, operacion.factura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOperacion, fechaYHora, motivo, tipoOperacion, estadoOperacion, factura);
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "idOperacion=" + idOperacion +
                ", fechaYHora=" + fechaYHora +
                ", motivo='" + motivo + '\'' +
                ", tipoOperacion=" + tipoOperacion +
                ", estadoOperacion=" + estadoOperacion +
                ", factura=" + factura +
                '}';
    }
}
