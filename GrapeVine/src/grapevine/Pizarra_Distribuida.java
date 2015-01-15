
package grapevine;

import java.util.*;

public class Pizarra_Distribuida {
    
    Reunion reunion;
    Observador observador;
    ArrayList <Persona_Real> participantes;

    // CONSTRUCTOR
    public Pizarra_Distribuida(ArrayList<Persona_Real> personas, Date ini, Date fin) {
        this.reunion = new Reunion(personas, ini, fin);
        for (Persona_Real persona : personas ) {
            persona.crearReunion(reunion);
        }
        this.observador = new Observador();
        this.Persona = Persona;
    }

    // GETTERS & SETTERS
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

    public ArrayList<Persona_Real> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Persona_Real> participantes) {
        this.participantes = participantes;
    }
    
}
