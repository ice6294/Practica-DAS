
package grapevine;

import java.util.ArrayList;


public class Proxy implements Persona{
    
    String nombreUsuario;
    int ip;
    int id;
    ArrayList <Reunion> reunion;
    ArrayList <Persona> persona;

    public Proxy(String nombreUsuario, int ip, int id, ArrayList<Reunion> reunion, ArrayList<Persona> persona) {
        this.nombreUsuario = nombreUsuario;
        this.ip = ip;
        this.id = id;
        this.reunion = reunion;
        this.persona = persona;
    }
    
    @Override
    public void reservarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
