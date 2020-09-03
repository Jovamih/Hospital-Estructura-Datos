package Clases;
import java.io.Serializable;

public class Cita implements Serializable {
    private String turno;
    private String servicio;
    Fecha fechaReservada;
    Doctor doc; 
    private String doctor;
    
    public Cita () {
        turno = "Tarde";
        servicio = "";
        fechaReservada = new Fecha (29,11,1999);
        doc = new Doctor ();
        doctor = "Juan Perez";
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Fecha getFechaReservada() {
        return fechaReservada;
    }

    public void setFechaReservada(Fecha fechaReservada) {
        this.fechaReservada = fechaReservada;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
