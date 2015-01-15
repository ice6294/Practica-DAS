package grapevine;

import java.util.ArrayList;


public class Tablon {
    
    ArrayList <Mensaje> mensajes;

    // CONSTRUCTOR
    public Tablon() {
        this.mensajes = new ArrayList<>();
    }

    // GETTERS & SETTERS
    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }
 
    // METODOS
    public void addMensaje(Mensaje mensaje){
        System.out.println(mensaje.toString()); //imprimimos
        this.mensajes.add(mensaje); //y guardamos
    }
    
    public void mostrarTodosMensajes(){
        for (Mensaje mensaje : this.mensajes) {//Imprimimos todos los mensajes
            System.out.println(mensaje.toString());
        }
    }
}
