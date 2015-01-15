
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
    
    public void mostrarMensaje(Mensaje mensaje){
        mensaje.toString();
    }
    
    // METODOS
    public void add(Mensaje mensaje){
        this.mostrarMensaje(mensaje);
        this.mensajes.add(mensaje);
    }
    
    public void mostrarTodosMensajes(){
        
        for (int i = 0; i < this.mensajes.size(); i++){
            
            this.mensajes.get(i).toString();
            
        }
        
    }
}
