
package grapevine;

import java.util.ArrayList;


public class Observador {
    
    ArrayList <Observador> restoParticipantes;
    Reunion reunion;

    // CONSTRUCTOR
    public Observador(ArrayList<Observador> restoParticipantes, Reunion reunion) {
        this.restoParticipantes = restoParticipantes;
        this.reunion=reunion;
    }

    // GETTERS & SETTERS

    public ArrayList<Observador> getObservador() {
        return restoParticipantes;
    }

    public void setObservador(ArrayList<Observador> restoParticipantes) {
        this.restoParticipantes = restoParticipantes;
    }
    
    //FUNCIONES DE PASO DE MENSAJE
    
    public void actualizaRestoParticipantes(Mensaje m){
        
        for (int i=0; i<restoParticipantes.size();i++){
            restoParticipantes.get(i).actualizarme(m);
        }
        
    }
    
    public void actualizarme(Mensaje m){
        this.reunion.escribir(m);
    }
}
