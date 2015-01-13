package grapevine;

import java.util.Date;


public class Mensaje {
    
    String contenido;
    String nombreUsuario;
    Date hora;

    public Mensaje(String contenido, String nombreUsuario) {
        this.contenido = contenido;
        this.nombreUsuario = nombreUsuario;
        this.hora = new Date();
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    

    //Hola caracola
    //hola caracolo

    
}
