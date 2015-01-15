package grapevine;

import java.util.Date;


public class Mensaje {
    
    String contenido;
    String autor;
    Date hora;

    // CONSTRUCTOR
    public Mensaje(String contenido, String autor) {
        this.contenido = contenido;
        this.autor = autor;
        this.hora = new Date();

    }

    // GETTERS & SETTERS
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNombreUsuario() {
        return autor;
    }

    public void setNombreUsuario(String autor) {
        this.autor = autor;
    }

    public Date getHora() {
        return hora;
    }

    @Override
    public String toString(){
        return ("-- " + this.autor + " " + this.hora + " --\n" + this.contenido);
    }
}
