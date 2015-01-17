
package grapevine;

import java.util.Objects;

public class Amigo {
    
    //Atributos
    private String nombreUsuario;
    private int ip;
    
    //Constructor
    public Amigo (String nU, int ip){
        
        this.nombreUsuario = nU;
        this.ip = ip;
                
    }
    
    //Getters & Setters

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

    @Override
    public String toString() {
        return ("Nombre de usuario=" + nombreUsuario + ", IP=" + ip);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Amigo other = (Amigo) obj;
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        if (this.ip != other.ip) {
            return false;
        }
        return true;
    }
    
    
    
}
