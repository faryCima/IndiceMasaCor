package com.mariasanchez.android.model;

/**
 * Created by Mariela on 01/06/2016.
 */
public class Pregunta {
    private Integer idResTexto;
    private boolean RespuestaVerdadera;

    //Constructor
    public Pregunta(Integer idResTexto ,boolean RespuestaVerdadera){
        this.idResTexto = idResTexto;
        this.RespuestaVerdadera = RespuestaVerdadera;
    }

    public void setidResTexto(Integer idResTexto){
        this.idResTexto = idResTexto;
    }
    public Integer getidResTexto(){
        return this.idResTexto;
    }
    public void setRespuestaVerdadera(boolean RespuestaVerdadera){
        this.RespuestaVerdadera = RespuestaVerdadera;
    }
    public boolean isRespuestaVerdadera(){
        return this.RespuestaVerdadera;
    }
}
