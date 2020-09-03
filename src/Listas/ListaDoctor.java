package Listas;

import Clases.Doctor;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class ListaDoctor implements Serializable {
    
    public class NodoDoctor implements Serializable {
        Doctor D;
        NodoDoctor siguiente = null;
        NodoDoctor (Doctor doc){
            D = doc;
        }
    }
    
    NodoDoctor P = null;
    int longitud = 0;
    
    public void InsertarDoctor_Final (Doctor d){        
        NodoDoctor Q = new NodoDoctor (d);
        if( P == null ){            
            P = Q;
        }else {
            NodoDoctor T = P;
            while (T.siguiente != null) {
                T = T.siguiente;
            }
            T.siguiente = Q;
        }
        longitud++;
    }
    
    public void ObtenerCodigoDoctor (Doctor d) {
        NodoDoctor Q = P;
        while(Q != null){
            if(Q.D.getEspecialidad().equals(d.getEspecialidad())){
                d.setCodigo(Q.D.getCodigo());
            }
            Q = Q.siguiente;
        }
    }
}
