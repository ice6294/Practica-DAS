package grapevine;

import java.net.InetAddress;
import java.util.ArrayList;


public class Observador {
    
    private ArrayList <InetAddress> restoParticipantes;
    private Reunion reunion;

    // CONSTRUCTOR
    public Observador(Reunion reunion) {
        this.restoParticipantes = null;
        this.reunion=reunion;
    }

    // GETTERS & SETTERS

    public ArrayList<InetAddress> getRestoParticipantes() {
        return restoParticipantes;
    }

    public void setRestoParticipantes(ArrayList<InetAddress> restoParticipantes) {
        this.restoParticipantes = restoParticipantes;
    }
    
    //FUNCIONES DE PASO DE MENSAJE
    
    public void actualizaRestoParticipantes(Mensaje m){
        for (int i=0; i<restoParticipantes.size();i++){
            //CAMBIAR LUIS
           // restoParticipantes.get(i).actualizarme(m);
        }
    }
    
    public void actualizarme(Mensaje m){
        this.reunion.guardar(m);
    }
}
