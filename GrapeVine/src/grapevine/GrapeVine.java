package grapevine;

import java.util.*;

public class GrapeVine {

    
    public static void main(String[] args) {
        
        Persona_Real p1 = new Persona_Real("Federico", 77, 1234, new ArrayList<>(), null);
        Persona_Real p2 = new Persona_Real("Alfonso", 22, 4321, new ArrayList<>(), null);
        
        p1.AgregarContacto(p2);
        p2.AgregarContacto(p1);
        
        Date fecha_ini = new Date();
        Date fecha_fin = new Date();
        
        ArrayList<Persona_Real> integrantes = new ArrayList<>();
        p1.crearEvento(integrantes, fecha_ini, fecha_fin);
                
                
    }
    
}
