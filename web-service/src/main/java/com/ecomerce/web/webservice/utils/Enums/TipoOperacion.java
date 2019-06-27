package com.ecomerce.web.webservice.utils.Enums;

public enum TipoOperacion {
    PAGO("pago"),
    REINTEGRO("reintegro"),
    COMPRA("compra");

    public String tipo;

    TipoOperacion(String tipo){
        this.tipo = tipo;
    }

    public boolean isCompra(){
        if(TipoOperacion.COMPRA.tipo.equalsIgnoreCase(this.tipo)){
            return true;
        }else {
            return false;
        }
    }

    public String getTipo() {
        return tipo;
    }
}
