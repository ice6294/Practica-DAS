
package grapevine;

import java.util.*;

public class Calendario {
    
    ArrayList<Cita> calendar;

    // CONSTRUCTOR
    public Calendario() {
        this.calendar = null;
    }

    // GETTERS & SETTERS
    public ArrayList<Cita> getCalendar() {
        return calendar;
    }

    public void setCalendar(ArrayList<Cita> calendar) {
        this.calendar = calendar;
    }
    
    // MÉTODOS
    public boolean agregarCita(Date ini, Date fin){
        return true;
    }
}
