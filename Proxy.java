
package practicadas;

import java.util.ArrayList;


public class Proxy implements Persona{
    
    String nombreUsuario;
    int ip;
    int id;
    ArrayList <Reunion> reunion;
    ArrayList <Persona> persona;

    @Override
    public void reservarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
