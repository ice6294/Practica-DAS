package grapevine;

import java.util.*;

public class Calendario {
    
    private ArrayList<Cita> calendar;

    // CONSTRUCTOR
    public Calendario() {
        this.calendar = null;
    }

    // GETTERS & SETTERS
    public ArrayList<Cita> getCalendar() {
        return calendar;
    }

    public void setCalendar(ArrayList<Cita> calendar) {
        this.calendar = calendar;
    }
    
    // MÉTODOS
    public boolean agregarCita(Date ini, Date fin){
        Cita c = new Cita (ini,fin);
        return this.agregarCita(c);
    }
    
    public boolean agregarCita(Cita cita){
        
        
        if (this.calendar.isEmpty()){
            
            this.calendar.add(cita);
            return true;
            
        }else {
           
            ArrayList <Cita> aux = new ArrayList ();
            int i = 0; 
            Cita cita1 = this.calendar.get(i);
          
            
            while ((i < this.calendar.size()) && (cita1.getFecha_fin().before(cita.getFecha_ini()))){
                
                aux.add(cita1);
                i++;
                if (i < this.calendar.size()){
                 
                    cita1 = this.calendar.get(i);
                    if (cita.getFecha_fin().before(cita1.getFecha_ini())){
                        
                        aux.add(cita);
                        for (int j = i; j < this.calendar.size(); j++){
                            
                            aux.add(this.calendar.get(j));
                            
                        }
                        this.calendar = aux;
                        return true;
                        
                    }
                    
                } else {
                    
                    //En caso de que lleguemos al final del array
                    aux.add(cita);
                    this.calendar = aux;
                    return true;
                    
                }  
                              
            }
            //En caso de que las fechas coincidan
            if (cita1.equals(cita)){
                
                System.out.println("ERROR. YA TIENES UNA CITA A ESA HORA");
                return false;
                
            } else if (cita.getFecha_ini().before(cita1.getFecha_fin())){
                
                if (cita.getFecha_ini().before(cita1.getFecha_ini())){
                    
                    aux.add(cita);
                    for (int j = i; j < this.calendar.size(); j++){
                            
                        aux.add(this.calendar.get(j));
                            
                    }
                    this.calendar = aux;
                    return true;
                    
                }else {
                    
                    System.out.println("ERROR. LA CITA COINCIDE CON OTRA");
                    return false;
                    
                }
                
            }
            
        }
        
        
       
        
        
        return true;
    }
}
