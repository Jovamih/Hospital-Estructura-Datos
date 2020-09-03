package Listas;

import Clases.Cita;
import java.io.Serializable;

public class PilaCitas implements Serializable {
    
    public class NodoPila implements Serializable {
        Cita cita;
        NodoPila siguiente = null;
        NodoPila (Cita c){
            cita = c;
        }
    }
    
    NodoPila P = null;
    int longitud = 0;
    
    public void InsertarCita () {
        
    } 
    
    public void DesempilarCita () {
        
    }
    
}
