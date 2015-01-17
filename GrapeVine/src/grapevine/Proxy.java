package grapevine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class Proxy implements Persona, Serializable{
    
    private Persona_Real persona;   //nombre del usuario es único y no puede repetirse

    // CONSTRUCTOR

    public Proxy(Persona_Real persona) {
        this.persona = persona;
    }

    // GETTERS & SETTERS

    public Persona_Real getPersona() {
        return persona;
    }

    public void setPersona(Persona_Real persona) {
        this.persona = persona;
    }
 
    
    // MÉTODOS
    @Override
    public boolean GestorReunion(ArrayList<Amigo> personas, Date fecha_ini, Date fecha_fin){
            ArrayList<Boolean> arrayAux=new ArrayList<>();
            for (Amigo persona : personas){
                arrayAux.add(persona.HuecoCalendario(fecha_ini, fecha_fin));
            }
            boolean aux=true;
            for (Boolean bo:arrayAux){
                aux=aux&&bo;
            }
            
            if (aux == false){
                System.out.println("Algún usuario no dispone de ese horario. ERROR AL CREAR LA REUNION");
                return false;
            } else {
                arrayAux.clear();
                aux=true;
                for (Amigo persona : personas){
                    arrayAux.add(persona.Confirma(personas, fecha_ini));
                }
                for (Boolean bo:arrayAux){
                    aux=aux&&bo;
                }
                if (aux == false){
                    System.out.println("Algún usuario ha rechazado la reunión");
                    return false;
                } else{
                    for (Amigo persona : personas){
                        persona.Notifica(fecha_ini);
                    }
                    
                }
            
            
            
            
            }
            
            
            // recordar crear en un fichero local llamado reuniones.txt
            //mirar que todos las personas de esa reuniones.txt tienen libre una determinada fechaini
            // en caso correcto para todas las personas de la reunion llamar a confirmacion de reunión y esperar en un bucle hasta obtener todos true
             return true;// en caso de recibir un false break en el bucle y enviar false 
    }
    
//    public boolean ComprobarAgenda(){//QUÉ COJONES ES ESTO ¿?¿?¿?¿?¿?¿?¿?
//        
//    }

//    public boolean SolicitarReserva(){
//        //supongo que en caso de que ComprobarAgenda() sea true entonces será true y esto es lo que se llamará dentro de la clase persona
//        return true;//por defecto
//    }
    
//    public boolean Reservado(){//Agregar reunión al array de reuniones
//        return true;//por defecto
//    }
    
//    @Override
//    public void reservarHorario() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public boolean HuecoCalendario(Date ini, Date fin) {
        return true; //BY THE MOMENT, HAY QUE HACERLO
    }
   
    
}
