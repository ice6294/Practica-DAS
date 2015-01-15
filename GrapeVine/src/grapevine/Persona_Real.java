
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

    // VARIABLES
    String nombreUsuario;   //nombre del usuario es único y no puede repetirse
    int ip; //entero que simula la ip del usuario
    int password; //contraseña única para identificar al usuario
    ArrayList <Pizarra_Distribuida> pizarras;
    ArrayList <Persona_Real> amigos;//en el uml llamado "personas"
    Proxy proxy; //Encargado de interactuar directamente con la "máquina" se encargará de la E/S

    // CONSTRUCTOR
    public Persona_Real(String nombreUsuario, int ip, int password, ArrayList<Pizarra_Distribuida> pizarras, ArrayList<Persona_Real> amigos)  {
        this.nombreUsuario = nombreUsuario;
        this.ip = ip;
        this.password = password;
        this.pizarras = pizarras;
        this.amigos = amigos;
        this.proxy = new Proxy(this);
    }
    public Persona_Real(Persona_Real pr){
        this.nombreUsuario = pr.getNombreUsuario();
        this.ip = pr.getIp();
        this.password = pr.getIp();
        this.pizarras = pr.getPizarras();
        this.amigos = pr.getPersonas();
        this.proxy = pr.getProxy();
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

    public ArrayList<Pizarra_Distribuida> getPizarras() {
        return pizarras;
    }

    public void setPizarras(ArrayList<Pizarra_Distribuida> pizarras) {
        this.pizarras = pizarras;
    }

    public ArrayList<Persona_Real> getPersonas() {
        return amigos;
    }

    public void setPersonas(ArrayList<Persona_Real> amigos) {
        this.amigos = amigos;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }
    
    
    
    //METODOS
    public void AgregarContacto(Persona_Real p){
        this.amigos.add(p);
    }
    
    public boolean crearEvento(int id, ArrayList<Persona_Real> personas, Date fecha_ini, Date fecha_fin){
        if (this.proxy.GestorReunion()){    // se le pasaraían los atributos ...
            ArrayList<Observador> observadores = new ArrayList<>();
            for (Persona_Real persona : personas) { // la propia persona tiene que estar en la lista
                // Creamos una pizarra (con observador sin apuntar a otros observadores) en cada persona
                Pizarra_Distribuida evento = new Pizarra_Distribuida(id, personas, fecha_ini, fecha_fin);
                persona.agregarEvento(evento);
                observadores.add(evento.getObservador());
            }
            System.out.println("Observadores"+observadores.size());
            for (int i=0; i<observadores.size();i++){
                System.out.println("Compruebo mientras "+i+" <= "+observadores.size());
                // Los observadores de todos los participantes se apuntarán entre sí
                ArrayList<Observador> aux = (ArrayList<Observador>) observadores.clone();
                personas.get(i).getPizarra(id).getObservador().setRestoParticipantes(aux);
                personas.get(i).getPizarra(id).getObservador().getRestoParticipantes().remove(i);
                System.out.println(i);
            }
            return true;
        } else {
            System.out.println("Pos nada, la próxima vez será");
            return false;
        }
    }
    
    public Pizarra_Distribuida getPizarra (int id){
        int i=0;
        while (i<pizarras.size()){
            if (this.pizarras.get(i).getId()==id){
                return this.pizarras.get(i);
            }
            i++;
        }
        return null;
    }
    
    public void agregarEvento (Pizarra_Distribuida evento) {
        this.pizarras.add(evento);
    }
    
    public boolean EliminarContacto(Persona p){//recordar E/S
       return this.amigos.remove(p);
       //falta actualizar ficheros
    }
    
    public boolean ConfirmacionEvento(Reunion r) throws IOException{
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
    
    public boolean escribir(Mensaje m){ /*devuelve true si se ha podido escribir y false si no 
            (si en el momento en el que se llama a la función no hay ninguna reunión prevista, 
            se devuelve false y punto, si hay una reunión, se elije, se la llama y se le envía el mensaje*/
        
        //una vez elegida la pizarra que estuviera activa se haría
        //Pizarra_Distribuida piz = new Pizarra_Distribuida(amigos);
        //piz.getReunion().escribirMensaje(m);
        
        
        System.out.println("Te metes el mensaje por el culo imbécil ;)");
        return false;
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
    
    
    
    // OTROS
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
