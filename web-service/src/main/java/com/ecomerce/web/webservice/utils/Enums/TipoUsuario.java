package com.ecomerce.web.webservice.utils.Enums;

public enum TipoUsuario {
    CLIENTE("cliente"),
    EMPLEADO("empleado");

    String descripcion;

    TipoUsuario(String descripcion){
        this.descripcion = descripcion;
    }

    public boolean isEmpleado(){
        if(TipoUsuario.EMPLEADO.descripcion.equalsIgnoreCase(this.getDescripcion())){
            return true;
        }else{
            return false;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }
}
