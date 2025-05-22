package com.Startup.tienda.DTOS;

public class RespuestaDTO {
    
    private String mensaje;
    private Object entidad;
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public Object getEntidad() {
        return entidad;
    }
    public void setEntidad(Object entidad) {
        this.entidad = entidad;
    }

    

}
