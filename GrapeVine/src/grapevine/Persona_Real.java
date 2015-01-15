
package grapevine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Persona_Real implements Persona, Serializable{

    String nombreUsuario;   //nombre del usuario es único y no puede repetirse
    int ip; //entero que simula la ip del usuario
    int password; //contraseña única para identificar al usuario
    ArrayList <Pizarra_Distribuida> pizarras;
    ArrayList <Persona> amigos;//en el uml llamado "personas"
    Proxy proxy; //Encargado de interactuar directamente con la "máquina" se encargará de la E/S

    // CONSTRUCTOR
    public Persona_Real(String nombreUsuario, int ip, int password, ArrayList<Pizarra_Distribuida> pizarras, ArrayList<Persona> persona, Proxy proxy)  {
        this.nombreUsuario = nombreUsuario;
        this.ip = ip;
        this.password = password;
        this.pizarras = pizarras;
        this.amigos = persona;
        this.proxy = proxy;
    }
    public Persona_Real(Persona_Real pr){
        this.nombreUsuario = pr.getNombreUsuario();
        this.ip = pr.getIp();
        this.password = pr.getIp();
        this.pizarras = pr.getReunion();
        this.amigos = pr.getPersonas();
        this.proxy = pr.getProxy();
    }
    
    public boolean GuardarDatosFichero(Persona_Real pr) throws IOException{
        String fichero = "amigosRegistradas.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
        Persona_Real p=new Persona_Real(pr);
        BufferedReader br = null;
        try {
           //Crear un objeto BufferedReader al que se le pasa 
           //   un objeto FileReader con el nombre del fichero
           br = new BufferedReader(new FileReader(fichero));
           //Leer la primera línea, guardando en un String
           String texto = br.readLine();
           //Repetir mientras no se llegue al final del fichero
           while(texto != null && !texto.equals(p.toString()))
           {
               //Leer la siguiente línea
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
                if (br.readLine()==null){
                    oos.writeObject(p); 
                    oos.close();
                    return true;
                }
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    // GETTERS & SETTERS
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

    public int getId() {//Método que desaparecerá cuando se termine el periodo de implementación
        return password;
    }

    public void setId(int password) {// recordar seguridad y confirmación
        this.password = password;
    }

    public ArrayList<Pizarra_Distribuida> getReunion() {
        return pizarras;
    }

    public void setReunion(ArrayList<Pizarra_Distribuida> pizarras) {
        this.pizarras = pizarras;
    }

    public ArrayList<Persona> getPersonas() {
        return amigos;
    }

    public void setPersonas(ArrayList<Persona> amigos) {
        this.amigos = amigos;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }
    
    public boolean AgregarContacto(){
        return false;
    }
    
    public boolean EliminarContacto(Persona p){//recordar E/S
       return this.amigos.remove(p);
       //falta actualizar ficheros
    }
    
    public boolean ConfirmacionReunion(Reunion r) throws IOException{
        if(ConsultaProxy()){
            System.out.println("¿Desea confirmar que esta libre y quiere la reunión?: (S/N) "+r.toString());
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            String teclado = br.readLine();
            if(teclado.equals("s")||teclado.equals("S")){
               return true;  
            }
            if(teclado.equals("n")||teclado.equals("N")){
               return false;  
            }else{
                System.out.println("USTED HA PULSADO UNA TECLA QUE NO ES CORRECTA REUNIÓN...");
            }
        }
        return false;
    }
       
    public boolean ConsultaProxy(){ // se comunica con la "máquina" 
        return true;// de momento hasta que se haga la vista con ficheros
    }
    
    public boolean EnReunion(){// Me falta fecha inicio en la clase reunón
        for(int i=0;i<=this.pizarras.size();i++){
            if (this.pizarras.get(i).getReunion().isActiva()){
                return true;
            }
        }
        return false;
    }
    
//    public void CrearReunion(){ // me falta añadir los atributos necesarios para una reunión
//        pizarras nueva= new Reunion();// me falta llamar al constructor de forma adecuada metienndo los atributos correctos
//    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombreUsuario);
        hash = 61 * hash + this.ip;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona_Real other = (Persona_Real) obj;
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        if (this.ip != other.ip) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public void reservarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Persona_Real{" + "nombreUsuario=" + nombreUsuario + ", ip=" + ip + ", password=" + password + ", pizarras=" + pizarras + ", amigos=" + amigos + ", proxy=" + proxy + '}';
    }
    
    
    
}
