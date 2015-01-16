package grapevine;

import java.util.*;

public class Cita {
    
    private Date fecha_ini;
    private Date fecha_fin;
    
    // CONSTRUCTOR
    public Cita(Date fecha_ini, Date fecha_fin) {
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
    }
    
    // GETTERS & SETTERS
    public Date getFecha_ini() {
        return fecha_ini;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cita other = (Cita) obj;
        if (!Objects.equals(this.fecha_ini, other.fecha_ini)) {
            return false;
        }
        if (!Objects.equals(this.fecha_fin, other.fecha_fin)) {
            return false;
        }
        return true;
    }
    
    
    
}
