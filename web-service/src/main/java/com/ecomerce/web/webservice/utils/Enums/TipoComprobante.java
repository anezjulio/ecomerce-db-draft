package com.ecomerce.web.webservice.utils.Enums;

public enum TipoComprobante {
    ORDEN("orden"),
    RECIBO("recibo");

    private String tipo;

    TipoComprobante(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
