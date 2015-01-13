
package grapevine;

import java.util.ArrayList;

public class Persona_Real implements Persona{

    String nombreUsuario;
    int ip;
    int id;
    ArrayList <Reunion> reunion;
    ArrayList <Persona> persona;
    Proxy proxy;

    // CONSTRUCTOR
    public Persona_Real(String nombreUsuario, int ip, int id, ArrayList<Reunion> reunion, ArrayList<Persona> persona, Proxy proxy) {
        this.nombreUsuario = nombreUsuario;
        this.ip = ip;
        this.id = id;
        this.reunion = reunion;
        this.persona = persona;
        this.proxy = proxy;
    }

    // GETTERS & SETTERS
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Reunion> getReunion() {
        return reunion;
    }

    public void setReunion(ArrayList<Reunion> reunion) {
        this.reunion = reunion;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }
    
    @Override
    public void reservarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
