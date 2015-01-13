
package grapevine;

import java.util.ArrayList;

public class Pizarra_Distribuida {
    
    Reunion reunion;
    Observador observador;
    ArrayList <Persona> Persona;

    public Pizarra_Distribuida(Reunion reunion, Observador observador, ArrayList<Persona> Persona) {
        this.reunion = reunion;
        this.observador = observador;
        this.Persona = Persona;
    }

    public Reunion getReunion() {
        return reunion;
    }

    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
    }

    public Observador getObservador() {
        return observador;
    }

    public void setObservador(Observador observador) {
        this.observador = observador;
    }

    public ArrayList<Persona> getPersona() {
        return Persona;
    }

    public void setPersona(ArrayList<Persona> Persona) {
        this.Persona = Persona;
    }
    
    
}
