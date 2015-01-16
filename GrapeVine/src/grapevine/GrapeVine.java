package grapevine;

import java.io.IOException;
import java.util.*;
import java.net.*;
import java.rmi.*;

public class GrapeVine {

//    private static Socket conexion; //Socket para conectarse con el cliente
//    private static final String ip = "127.0.0.1"; //ip a la cual se conecta
    
    public static void main(String[] args) throws IOException, InterruptedException{
        
        ServerSocket sockEntrada = new ServerSocket(55);
        
                
        Thread.sleep(300000);//300 segundos esperando
                
        
        
//        
//        Persona_Real p1 = new Persona_Real("Federico", 77, 1234, new ArrayList<>(), new ArrayList<>());
//        Persona_Real p2 = new Persona_Real("Alfonso", 22, 4321, new ArrayList<>(), new ArrayList<>());
//        Persona_Real p3 = new Persona_Real("Antonio", 442, 9877, new ArrayList<>(), new ArrayList<>());
//        
//        Date fecha_ini = new Date(2015,3,15,15,10);
//        Date fecha_fin = new Date(2015,3,15,15,15);
//        
//        ArrayList<Persona_Real> integrantes = new ArrayList<>();
//        integrantes.add(p1);
//        integrantes.add(p2);
//        integrantes.add(p3);
//        p1.crearEvento(666, integrantes, fecha_ini, fecha_fin);
//        System.out.println("p1: ");
//        System.out.println("    Pizarras: "+ p1.getPizarras().size());
//        System.out.println("    Observados: "+ p1.getPizarras().get(0).getObservador().getRestoParticipantes().size());
//        System.out.println("p2: ");
//        System.out.println("    Pizarras: "+ p2.getPizarras().size());
//        System.out.println("    Observados: "+ p2.getPizarras().get(0).getObservador().getRestoParticipantes().size());
//        System.out.println("p3: ");
//        System.out.println("    Pizarras: "+ p3.getPizarras().size());
//        System.out.println("    Observados: "+ p3.getPizarras().get(0).getObservador().getRestoParticipantes().size());
//        
//        String entradaTeclado = "";
//        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
//        
//        Mensaje m;
//        int id=666;
//        System.out.println("Bienvenido a GrapeVine. Comienza la reunion:");
//        while(true){
//            System.out.print("~ ");
//            entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
//            if (entradaTeclado.equals("exit")){
//                break;
//            } else {
//                m = new Mensaje(entradaTeclado,"Luis");
//                p1.escribir(m,id);
//            }
//        }
    }
}
