
package grapevine;

import java.util.ArrayList;


public class Observador {
    
    ArrayList <Persona> persona;
    ArrayList <Observador> observador;

    public Observador(ArrayList<Persona> persona, ArrayList<Observador> observador) {
        this.persona = persona;
        this.observador = observador;
    }

    public Observador(ArrayList<Persona> persona) {
        this.persona = persona;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
    }

    public ArrayList<Observador> getObservador() {
        return observador;
    }
/*
    public void setObservador(ArrayList<Observador> observador) {
        this.observador = observador;
    }*/
    
    
}
