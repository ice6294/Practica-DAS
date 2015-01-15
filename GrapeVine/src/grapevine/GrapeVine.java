package grapevine;

import java.util.*;

public class GrapeVine {

    
    public static void main(String[] args) {
        
        Persona_Real p1 = new Persona_Real("Federico", 77, 1234, new ArrayList<>(), new ArrayList<>());
        Persona_Real p2 = new Persona_Real("Alfonso", 22, 4321, new ArrayList<>(), new ArrayList<>());
        
        p1.AgregarContacto(p2);
        p2.AgregarContacto(p1);
        
        Date fecha_ini = new Date();
        Date fecha_fin = new Date();
        
        ArrayList<Persona_Real> integrantes = new ArrayList<>();
        integrantes.add(p1);
        integrantes.add(p2);
        p1.crearEvento(666, integrantes, fecha_ini, fecha_fin);
        System.out.println("1)Numero pizarras Federico "+ p1.getPizarras().size());
        System.out.println("1)Numero pizarras Alfonso "+ p2.getPizarras().size());
    }
    
}
