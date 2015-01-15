
package grapevine;

import java.util.ArrayList;


public class Observador {
    
    ArrayList <Observador> restoParticipantes;
    Reunion reunion;

    // CONSTRUCTOR
    public Observador(Reunion reunion) {
        this.restoParticipantes = null;
        this.reunion=reunion;
    }

    // GETTERS & SETTERS

    public ArrayList<Observador> getRestoParticipantes() {
        return restoParticipantes;
    }

    public void setRestoParticipantes(ArrayList<Observador> restoParticipantes) {
        this.restoParticipantes = restoParticipantes;
    }
    
    //FUNCIONES DE PASO DE MENSAJE
    
    public void actualizaRestoParticipantes(Mensaje m){
        for (int i=0; i<restoParticipantes.size();i++){
            restoParticipantes.get(i).actualizarme(m);
        }
    }
    
    public void actualizarme(Mensaje m){
        this.reunion.guardar(m);
    }
}
