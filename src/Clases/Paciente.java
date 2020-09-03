package Clases;

import Listas.PilaCitas;
import java.io.Serializable;


public class Paciente implements Serializable {
    
    private String dni;
    private String nombre;
    private String apellido;
    private String sexo;
    private String telefono;
    private boolean hospitalizado;
    PilaCitas historial;     
    
    public Paciente () {
        dni = "";
        nombre = "   -";
        apellido = "";
        sexo = "";
        telefono = "12345";
        hospitalizado = false;
        historial = new PilaCitas ();        
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public boolean isHospitalizado() {
        return hospitalizado;
    }

    public void setHospitalizado(boolean hospitalizado) {
        this.hospitalizado = hospitalizado;
    }    
}
