package grapevine;

import java.io.*;
import java.util.*;
import java.net.*;
import java.rmi.*;
import sun.net.NetworkServer;

public class GrapeVine {

//    private static Socket conexion; //Socket para conectarse con el cliente
//    private static final String ip = "127.0.0.1"; //ip a la cual se conecta
    
    public static void main(String[] args) throws IOException, InterruptedException{
        
        final String HOST = "25.107.131.108";
        final int PUERTO = 55;
        
        //SERVIDOR
        ServerSocket ss = new ServerSocket(55); //escucho puerto 55
        Socket conexionserver = ss.accept();//Hay una conexion ENTRANTE <-
        System.out.println("Un cliente se ha conectado.");//Canales de entrada y salida de datos
        BufferedReader entradaserver = new BufferedReader(new InputStreamReader(conexionserver.getInputStream()));
        DataOutputStream salidaserver = new DataOutputStream(conexionserver.getOutputStream());
        salidaserver.writeUTF("Dime Cosas\n");        
        salidaserver.flush();
        
        
        //CLIENTE
        Socket conexioncliente = new Socket (HOST, PUERTO);
        DataOutputStream mensaje = new DataOutputStream(conexioncliente.getOutputStream());
        
        
        
        
        String cad="";
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        while (true){
            //RECIBO
            if((cad = entradaserver.readLine()) != null){
                System.out.println("Luis " + cad);    
            }else if (cad.equals("exit")){
                break;
            }
            //ESCRIBO
            if ((entradaTeclado = entradaEscaner.nextLine())!=null){
                mensaje.writeUTF(entradaTeclado);
            }
  
        }

        entradaserver.close();
        salidaserver.close();
        ss.close();//Aqui se cierra la conexión con el cliente
        conexioncliente.close();
        
        
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
