
package Clases;
import java.io.Serializable;

public class Doctor implements Serializable {
    private String codigo;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String telefono;
    private String area; //consulta, hospitalizacion, emergencia
    private int numpacientes;
    
    public Doctor (){
        codigo = "D-0001";
        nombre = "";
        apellido = "";
        especialidad = "";
        numpacientes = 0;   
        telefono = "987654321";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumpacientes() {
        return numpacientes;
    }

    public void setNumpacientes(int numpacientes) {
        this.numpacientes = numpacientes;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
