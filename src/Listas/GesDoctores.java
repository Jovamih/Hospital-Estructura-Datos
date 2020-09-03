
package Listas;

import Clases.Cama;
import Clases.Doctor;
import Clases.MatrizCama;
import Clases.Paciente;
import Listas.ListaDoctorDeCitas.NodoPaciente;
import java.io.IOException;

public class GesDoctores {
    
    ListaDoctor doctores = new ListaDoctor ();
    ListaDoctorDeCitas doccitas = new ListaDoctorDeCitas();
    ListaPaciente pacientes = new ListaPaciente ();
    MatrizCama habitaciones = new MatrizCama (); 

    public ListaDoctor getDoctores() {
        return doctores;
    }

    public void setDoctores(ListaDoctor doctores) {
        this.doctores = doctores;
    }

    public ListaDoctorDeCitas getDoccitas() {
        return doccitas;
    }

    public void setDoccitas(ListaDoctorDeCitas doccitas) {
        this.doccitas = doccitas;
    }

    public ListaPaciente getPacientes() {
        return pacientes;
    }

    public void setPacientes(ListaPaciente pacientes) {
        this.pacientes = pacientes;
    }

    public MatrizCama getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(MatrizCama habitaciones) {
        this.habitaciones = habitaciones;
    }
   
    public boolean ingresarDoctor (Doctor doc){           
        boolean result=true;
        Agregar(doc);
        return result;    
    }
    
    public void Agregar(Doctor d){
        this.doctores.InsertarDoctor_Final(d);
    }
    
    public boolean ingresarDoctorCitas (Doctor doc){             
        boolean result=true;
        AgregarDoctorCitas (doc);
        return result;    
    }
    
    public void AgregarDoctorCitas (Doctor d){
        this.doccitas.InsertarDoctorCitas_Final(d);
    }
    
    public boolean ingresarPaciente (Paciente pa) {
        boolean result=true;
        AgregarPaciente (pa);
        return result;    
    }
    
    public void AgregarPaciente (Paciente pa) {
        this.pacientes.InsertarPaciente(pa);        
    }
              
    public boolean ingresarPacienteLL (Doctor d, Paciente pa) {
        boolean result = true;
        AgregarPacienteLL (d, pa) ;
        return result;
    }
    
    public void AgregarPacienteLL (Doctor d, Paciente pa) {
        this.doccitas.InsertarPaciente(d, pa);
    }
    
    
    public void pormientras () {
        this.doccitas.recorrerListadeListas();
    }    
    
    public String[][] DataDoctores (){
        int x = this.doctores.longitud;
        String [][] result = new String[this.doctores.longitud][5];
        int i=0;
        ListaDoctor.NodoDoctor Q = this.doctores.P;
        while(Q != null){
            result[i][0] = Q.D.getCodigo();
            result[i][1] = Q.D.getNombre();
            result[i][2] = Q.D.getApellido();
            result[i][3] = Q.D.getArea();
            result[i][4] = Q.D.getEspecialidad();
            Q = Q.siguiente;
            i++;
        }
        return result;
    }
    
    public String[] getTitulos (){
        String result[] = new String[5];
        
        result[0] = "CODIGO";
        result[1] = "NOMBRE";
        result[2] = "APELLIDO";
        result[3] = "AREA";
        result[4] = "ESPECIALIDAD";
        
        return result;
    }
    
    public boolean HospitalizarP (String codigo, String numca) {
        boolean valor = true;
        Paciente p = new Paciente ();
        this.pacientes.hospitalizar(codigo, p);
        this.habitaciones.AsignandoPaciente(p, numca);
        return valor;
    }
    
    public String[] CopiarDatosPaciente (String codigo){        
        ListaPaciente.NodoPaciente Q = this.pacientes.P;       
        String result[] = new String[3];
        while (Q != null){
            
            if(Q.Pac.getDNI().equals(codigo)){
                result[0] = Q.Pac.getNombre();
                result[1] = Q.Pac.getApellido();
                result[2] = Q.Pac.getSexo();
            }
            Q = Q.siguiente;                                    
        }
        return result;
    }
        
    public String [] ConsultasGenerales () {
        String result[] = new String[10];
        int a = 0, b = 0, c =0; 
        int psh=0, psm=0, ph=0, phh=0, phm =0;
        result [0] = String.valueOf(this.doctores.longitud);
        ListaDoctor.NodoDoctor Q = this.doctores.P;
        while(Q != null){   
            if(Q.D.getArea().equals("Consulta")){
                a ++;
            }
            if(Q.D.getArea().equals("Hospitalizacion")){
                b ++;
            }
            if(Q.D.getArea().equals("Emergencia")){
                c ++;
            }
            Q = Q.siguiente;
        }  
        result [2] = String.valueOf(a); 
        result [1] = String.valueOf(b); 
        result [3] = String.valueOf(c); 
        ListaPaciente.NodoPaciente T = this.pacientes.P;
         while(T != null){   
            if(T.Pac.getSexo().equals("Masculino")){
                psh ++;
                if(T.Pac.isHospitalizado()){
                    ph ++;
                    phh ++;
                }
            }
            if(T.Pac.getSexo().equals("Femenino")){
                psm ++;
                if(T.Pac.isHospitalizado()){
                    ph ++;
                    phm ++;
                }
            }            
            T = T.siguiente;
        }  
        result [4] = String.valueOf(this.pacientes.longitud); 
        result [5] = String.valueOf(psh); 
        result [6] = String.valueOf(psm); 
        result [7] = String.valueOf(ph); 
        result [8] = String.valueOf(phh); 
        result [9] = String.valueOf(phm);                 
        return result;
    }
    
    public String [] CamasxEsp (String esp) {
        String r [] = this.habitaciones.ObtenerNumeros(esp);        
        return r;        
    }
    
    public String [][] DatosCamas (String especialidad) {
        String [][] result = new String[5][5];
        result = this.habitaciones.DatosCamaxEspecialidad(especialidad);                
        return result;      
    }

    public void Llenar_guia () throws IOException {
        this.pacientes.ObtenerGuia();
    }
    
    public String [] Opciones (String esp) {
        int l = 0, indice = 1;
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while(Q != null){           
            if(Q.D.getEspecialidad().equals(esp)){
                l ++;
            }
            Q = Q.siguiente;
        }
        String r [] = new String [l+1];
        r[0] = "Sin Seleccionar";
        ListaDoctorDeCitas.NodoDoctor T = this.doccitas.P;
        while(T != null){           
            if(T.D.getEspecialidad().equals(esp)){
                String aux = T.D.getApellido() + " " + T.D.getNombre();
                r[indice] =  aux;
                indice ++;
            }
            T = T.siguiente;
        }
        return r;
    }

    public String [] PacientesDeConsultas (String codi) {
        int l = 0, indice = 1;   
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        ListaDoctorDeCitas.NodoDoctor T = null;
        while(Q != null){           
            if(Q.D.getCodigo().equals(codi)){
                T = Q;
                l = Q.D.getNumpacientes();
            }
            Q = Q.siguiente;
        }
        String r [] = new String [l+1];
        r[0] = "Sin Seleccionar";
        
        ListaDoctorDeCitas.NodoPaciente S = T.cabpaciente;
        
        while (S != null){
            String aux = S.p.getApellido();
            r[indice] =  aux;
            indice ++;
            S = S.siguiente;
        }
        return r;
    }
    
    public String[] ObtenerDatosPaciente (String codigo){
        
        String result[] = new String[5];
        String aux = "";
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while (Q != null){
            ListaDoctorDeCitas.NodoPaciente T = Q.cabpaciente;            
            while (T != null){
                if(T.p.getDNI().equals(codigo)){    
                    aux = Q.D.getNombre() + " " + Q.D.getApellido();
                    result[0] = T.p.getNombre();
                    result[1] = T.p.getApellido();
                    result[2] = T.p.getSexo();
                    result[3] = Q.D.getEspecialidad();
                    result[4] = aux;
                }
                T = T.siguiente;
            }
            Q = Q.siguiente;
        }
        return result;
    }
    
    public String[] ObtenerNombreApellidoDoctorCitas (String codigo){
        String result[] = new String[3];
        String aux = "";
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while (Q != null){
            if(Q.D.getCodigo().equals(codigo)){ 
                result[0] = Q.D.getNombre();
                result[1] = Q.D.getApellido();
                result[2] = Q.D.getEspecialidad();
            }            
            Q = Q.siguiente;
        }
        return result;
    }

    public void BuscarD (Doctor d){
        this.doccitas.ObtenerCodigoDoctor(d);
    }
    
    public String CitasxDoctor (String codigo) {
        String texto = "";
        int aux = 1;
        ListaDoctorDeCitas.NodoDoctor Q = this.doccitas.P;
        while (Q != null){
            if(Q.D.getCodigo().equals(codigo)){
                ListaDoctorDeCitas.NodoPaciente T = Q.cabpaciente;            
                while (T != null){
                    String a =  "CITA # " + (aux) + 
                                "\n\tNOMBRE: " + T.p.getNombre() +
                                "\n\tAPELLIDO: " + T.p.getApellido() + 
                                "\n\tDNI: " + T.p.getDNI() +                                 
                                "\n==============================================\n";
                    texto += a;
                    aux ++;                    
                    T = T.siguiente;
                }
            }
            Q = Q.siguiente;
        }
        return texto;
    }
}
