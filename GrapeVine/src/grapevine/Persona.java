
package grapevine;

import java.util.ArrayList;
import java.util.Date;


public interface Persona {
    public boolean GestorReunion(ArrayList<Persona_Real> personas, Date fecha_ini, Date fecha_fin);
    public boolean HuecoCalendario(Date ini, Date fin);
    public boolean Confirma (Date ini);
    public boolean Notifica ();
}
