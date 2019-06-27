package com.ecomerce.web.webservice.utils.Enums;

public enum EstadoComprobante {
    ENTREGADO("entregado"),
    POR_ENTREGAR("por entregar"),
    DEVUELTO("devuelto");

    private String estado;

    EstadoComprobante(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
