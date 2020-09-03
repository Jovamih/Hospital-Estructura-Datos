
package Clases;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha (int d, int m, int a) {
        dia = d;
        mes = m;
        año = a;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
