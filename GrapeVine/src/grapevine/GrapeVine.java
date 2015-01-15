package grapevine;

import java.util.*;

public class GrapeVine {

    
    public static void main(String[] args) {
        
        Persona_Real p1 = new Persona_Real("Federico", 77, 1234, new ArrayList<>(), new ArrayList<>());
        Persona_Real p2 = new Persona_Real("Alfonso", 22, 4321, new ArrayList<>(), new ArrayList<>());
        Persona_Real p3 = new Persona_Real("Antonio", 442, 9877, new ArrayList<>(), new ArrayList<>());
        
        p1.AgregarContacto(p2);
        p2.AgregarContacto(p1);
        
        Date fecha_ini = new Date();
        Date fecha_fin = new Date();
        
        ArrayList<Persona_Real> integrantes = new ArrayList<>();
        integrantes.add(p1);
        integrantes.add(p2);
        integrantes.add(p3);
        p1.crearEvento(666, integrantes, fecha_ini, fecha_fin);
        System.out.println("p1: ");
        System.out.println("    Pizarras: "+ p1.getPizarras().size());
        System.out.println("    Observados: "+ p1.getPizarras().get(0).getObservador().getRestoParticipantes().size());
        System.out.println("p2: ");
        System.out.println("    Pizarras: "+ p2.getPizarras().size());
        System.out.println("    Observados: "+ p2.getPizarras().get(0).getObservador().getRestoParticipantes().size());
        System.out.println("p3: ");
        System.out.println("    Pizarras: "+ p3.getPizarras().size());
        System.out.println("    Observados: "+ p3.getPizarras().get(0).getObservador().getRestoParticipantes().size());
        
                
        Mensaje m = new Mensaje("Hola hola", "Federico");
        p1.getPizarras().get(0).getReunion().escribirMensaje(m);
        
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        
        int id=666;
        System.out.println("Comienza la conversación:");
        while(true){
            System.out.print("~ ");
            entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
            m = new Mensaje(entradaTeclado,"Luis");
            p1.escribir(m,id);
        }
    }
}
