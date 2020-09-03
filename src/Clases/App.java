
package Clases;
import System.Sistema;
import Serializadores.SerializadorG;
import Ventanas.*;
public class App {
 
    public static void main(String[] args) {
        
        try{
            Sistema.planilla.setDoctores(SerializadorG.Deserializar("doctores"));
            Sistema.planilla.setDoccitas(SerializadorG.Deserializar2("doctorescitas"));
            Sistema.planilla.setPacientes(SerializadorG.Deserializar3("pacientes"));
            Sistema.planilla.setHabitaciones(SerializadorG.Deserializar4("habitaciones"));
            System.out.println("Archivo cargados correctamente\n");
        }catch(Exception e){
            System.out.println("No se encontraron archivos.");
        }
        
        Login l= new Login();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
        l.show();
    }
    
}
