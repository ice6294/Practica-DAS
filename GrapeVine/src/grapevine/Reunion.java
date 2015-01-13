
package grapevine;

public class Reunion {
    
    int contador;
    int id;
    Tablon tablon;
    Observador observador;

    public Reunion(int contador, int id, Tablon tablon, Observador observador) {
        this.contador = contador;
        this.id = id;
        this.tablon = tablon;
        this.observador = observador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    
}
