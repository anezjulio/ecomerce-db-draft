package com.ecomerce.web.webservice.utils.Enums;

public enum EstadoOperacion {
    ACEPTADO("aceptado"),
    PENDIENTE("pendiente"),
    RECHAZADO("rechazado");

    private String estado;

    EstadoOperacion(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
