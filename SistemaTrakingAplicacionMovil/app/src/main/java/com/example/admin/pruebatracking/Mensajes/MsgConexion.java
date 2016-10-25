package com.example.admin.pruebatracking.Mensajes;

/**
 * Created by Mario on 18/10/2016.
 */
public class MsgConexion extends Mensaje{

    public MsgConexion(String to, String from, String fecha, String mensaje) {
        super(to, from, fecha, "MsgConexion");
        this.Mensaje = mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        this.Mensaje = mensaje;
    }

    private String Mensaje;
}
