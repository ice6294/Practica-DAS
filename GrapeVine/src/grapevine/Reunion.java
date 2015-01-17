package grapevine;

import java.util.*;

public class Reunion {
    private ArrayList<Amigo> participantes;
    private Date fecha_ini; // faltan getters y setters
    private Date fecha_fin; // faltan getters y setters
    private boolean activa;
    private Tablon tablon;
    private Observador observador;

    // CONSTRUCTOR
    public Reunion(ArrayList<Amigo> participantes, Date fecha_ini, Date fecha_fin) {
        this.participantes=participantes;
        this.fecha_ini=fecha_ini;
        this.fecha_fin=fecha_fin;
        this.activa=false;
        this.tablon = new Tablon();
    }

    // GETTERS & SETTERS

    public Tablon getTablon() {
        return tablon;
    }

    public void setTablon(Tablon tablon) {
        this.tablon = tablon;
    }

    public Observador getObservador() {
        return observador;
    }

    public void setObservador(Observador observador) {
        this.observador = observador;
    }

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

    public boolean isActiva() {
        this.setActiva();
        return activa;
    }

    public void setActiva() {
//        java.util.Date fechaSistema=new Date();
//        this.activa = (fechaSistema.compareTo(this.fecha_ini)>=0) && (fechaSistema.compareTo(this.fecha_fin)==-1);
        this.activa=true;   // TEMPORAL
    }
    
    
    // METODOS
    public void escribirMensaje(Mensaje m){
        guardar(m);
        this.observador.actualizaRestoParticipantes(m);
    }
    
    public void guardar(Mensaje m){
        this.tablon.addMensaje(m);
    }
}
