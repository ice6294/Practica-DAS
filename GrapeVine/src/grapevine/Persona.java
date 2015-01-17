package grapevine;

import java.util.ArrayList;
import java.util.Date;


public interface Persona {
    public boolean GestorReunion(ArrayList<Amigo> personas, Date fecha_ini, Date fecha_fin);
    public boolean HuecoCalendario(Date ini, Date fin);
}
