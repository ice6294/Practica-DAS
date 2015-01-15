
package grapevine;

import java.util.ArrayList;


public class Tablon {
    
    ArrayList <Mensaje> mensajes;

    // CONSTRUCTOR
    public Tablon(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    // GETTERS & SETTERS
    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }
    
    public void mostrarMensajes(){
        this.mensajes.get(mensajes.size()).imprimeMensaje();
    }
    
    // METODOS
    public void add(Mensaje mensaje){
        this.mensajes.add(mensaje);
    }
}
