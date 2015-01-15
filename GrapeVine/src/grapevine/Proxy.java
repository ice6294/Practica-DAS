
package grapevine;

import java.io.Serializable;
import java.util.ArrayList;


public class Proxy implements Persona, Serializable{
    
    String nombreUsuario;   //nombre del usuario es único y no puede repetirse
    int ip; //entero que simula la ip del usuario
    int id; //contraseña única para identificar al usuario
    ArrayList <Reunion> reunion;
    ArrayList <Persona> persona;

    public Proxy(String nombreUsuario, int ip, int id, ArrayList<Reunion> reunion, ArrayList<Persona> persona) {
        this.nombreUsuario = nombreUsuario;
        this.ip = ip;
        this.id = id;
        this.reunion = reunion;
        this.persona = persona;
    }

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

    public int getId() {//Método que desaparecerá cuando se termine el periodo de implementación
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
    
//    public boolean GestorReunion(){// recordar crear en un fichero local llamado reuniones.txt
//            //mirar que todos las personas de esa reuniones.txt tienen libre una determinada fechaini
//            // en caso correcto para todas las personas de la reunion llamar a confirmacion de reunión y esperar en un bucle hasta obtener todos true
//             return false;// en caso de recibir un false break en el bucle y enviar false 
//    }
    
//    public boolean ComprobarAgenda(){//QUÉ COJONES ES ESTO ¿?¿?¿?¿?¿?¿?¿?
//        
//    }

//    public boolean SolicitarReserva(){
//        //supongo que en caso de que ComprobarAgenda() sea true entonces será true y esto es lo que se llamará dentro de la clase persona
//        return true;//por defecto
//    }
    
//    public boolean Reservado(){//Agregar reunión al array de reuniones
//        return false;//por defecto
//    }
    
    @Override
    public void reservarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
