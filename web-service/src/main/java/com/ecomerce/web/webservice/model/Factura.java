package com.ecomerce.web.webservice.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
public class Factura {

    @Id
    @GeneratedValue
    private long idFactura;

    private LocalDateTime fechaYHora;

    private BigDecimal montoTotal;

    @OneToMany(mappedBy = "factura")
    private List<Comprobante> listaComprobante;

    @OneToMany(mappedBy = "factura")
    private List<Operacion> listaOperacion;

    @OneToMany(mappedBy = "factura")
    private List<DetalleFactura> listaDetalleFactura;

    @ManyToOne()
    @JoinColumn(name = "idSede")
    private Sede sede;

    @ManyToOne()
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Factura(long idFactura, LocalDateTime fechaYHora, BigDecimal montoTotal, List<Comprobante> listaComprobante, List<Operacion> listaOperacion, List<DetalleFactura> listaDetalleFactura, Sede sede, Usuario usuario) {
        this.idFactura = idFactura;
        this.fechaYHora = fechaYHora;
        this.montoTotal = montoTotal;
        this.listaComprobante = listaComprobante;
        this.listaOperacion = listaOperacion;
        this.listaDetalleFactura = listaDetalleFactura;
        this.sede = sede;
        this.usuario = usuario;
    }

    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public List<Comprobante> getListaComprobante() {
        return listaComprobante;
    }

    public void setListaComprobante(List<Comprobante> listaComprobante) {
        this.listaComprobante = listaComprobante;
    }

    public List<Operacion> getListaOperacion() {
        return listaOperacion;
    }

    public void setListaOperacion(List<Operacion> listaOperacion) {
        this.listaOperacion = listaOperacion;
    }

    public List<DetalleFactura> getListaDetalleFactura() {
        return listaDetalleFactura;
    }

    public void setListaDetalleFactura(List<DetalleFactura> listaDetalleFactura) {
        this.listaDetalleFactura = listaDetalleFactura;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return idFactura == factura.idFactura &&
                Objects.equals(fechaYHora, factura.fechaYHora) &&
                Objects.equals(montoTotal, factura.montoTotal) &&
                Objects.equals(listaComprobante, factura.listaComprobante) &&
                Objects.equals(listaOperacion, factura.listaOperacion) &&
                Objects.equals(listaDetalleFactura, factura.listaDetalleFactura) &&
                Objects.equals(sede, factura.sede) &&
                Objects.equals(usuario, factura.usuario);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idFactura, fechaYHora, montoTotal, listaComprobante, listaOperacion, listaDetalleFactura, sede, usuario);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", fechaYHora=" + fechaYHora +
                ", montoTotal=" + montoTotal +
                ", listaComprobante=" + listaComprobante +
                ", listaOperacion=" + listaOperacion +
                ", listaDetalleFactura=" + listaDetalleFactura +
                ", sede=" + sede +
                ", usuario=" + usuario +
                '}';
    }
}
