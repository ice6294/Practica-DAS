
package grapevine;

import java.util.*;

public class Cita {
    
    Date fecha_ini;
    Date fecha_fin;
    
    // CONSTRUCTOR
    public Cita(Date fecha_ini, Date fecha_fin) {
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
    }
    
    // GETTERS & SETTERS
    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
}
