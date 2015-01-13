
package grapevine;

import java.util.ArrayList;

public class Persona_Real implements Persona{

    String nombreUsuario;
    int ip;
    int id;
    ArrayList <Reunion> reunion;
    ArrayList <Persona> persona;
    Proxy proxy;

    public Persona_Real(String nombreUsuario, int ip, int id, ArrayList<Reunion> reunion, ArrayList<Persona> persona, Proxy proxy) {
        this.nombreUsuario = nombreUsuario;
        this.ip = ip;
        this.id = id;
        this.reunion = reunion;
        this.persona = persona;
        this.proxy = proxy;
    }
    
    @Override
    public void reservarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
