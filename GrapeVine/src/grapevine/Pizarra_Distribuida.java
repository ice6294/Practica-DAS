package grapevine;

import java.util.*;

public class Pizarra_Distribuida {
    
    private int id;
    private Reunion reunion;
    private Observador observador;
//    ArrayList <Persona_Real> participantes;

    // CONSTRUCTOR
    public Pizarra_Distribuida(int id, ArrayList<Persona_Real> participantes, Date ini, Date fin) {
        this.id=id;
        this.reunion = new Reunion(participantes, ini, fin);
        this.observador = new Observador(reunion);
        this.reunion.setObservador(observador);
    }

    // GETTERS & SETTERS

    public int getId() {
        return id;
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

//    public ArrayList<Persona_Real> getParticipantes() {
//        return participantes;
//    }
//
//    public void setParticipantes(ArrayList<Persona_Real> participantes) {
//        this.participantes = participantes;
//    }
    
}
