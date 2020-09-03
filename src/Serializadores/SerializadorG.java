package Serializadores;

import Clases.MatrizCama;
import Listas.ListaDoctor;
import Listas.ListaDoctorDeCitas;
import Listas.ListaPaciente;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializadorG {

    public static void Serializar (String sNombreArchivo, ListaDoctor  arreglo) {
        try {
            ObjectOutputStream escritor = new  ObjectOutputStream (new FileOutputStream (sNombreArchivo));
            escritor.writeObject(arreglo);
            escritor.flush();
            System.out.println("Arhivo "+sNombreArchivo+ " guardado correctamete\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ListaDoctor Deserializar (String sNombreArchivo) {
        ListaDoctor  arreglo = new ListaDoctor ();
        try{
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo)); 
            arreglo = (ListaDoctor)lector.readObject();
        } catch ( FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return arreglo;    
    }
    
    public static void Serializar2 (String sNombreArchivo, ListaDoctorDeCitas arreglo) {
        try {
            ObjectOutputStream escritor = new  ObjectOutputStream (new FileOutputStream (sNombreArchivo));
            escritor.writeObject(arreglo);
            escritor.flush();
            System.out.println("Arhivo "+sNombreArchivo+ " guardado correctamete\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ListaDoctorDeCitas Deserializar2 (String sNombreArchivo) {
        ListaDoctorDeCitas  arreglo = new ListaDoctorDeCitas ();
        try{
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo)); 
            arreglo = (ListaDoctorDeCitas)lector.readObject();
        } catch ( FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return arreglo;    
    }
    
    public static void Serializar3 (String sNombreArchivo,  ListaPaciente arreglo) {
        try {
            ObjectOutputStream escritor = new  ObjectOutputStream (new FileOutputStream (sNombreArchivo));
            escritor.writeObject(arreglo);
            escritor.flush();
            System.out.println("Arhivo "+sNombreArchivo+ " guardado correctamete\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ListaPaciente Deserializar3 (String sNombreArchivo) {
        ListaPaciente  arreglo = new ListaPaciente ();
        try{
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo)); 
            arreglo = (ListaPaciente)lector.readObject();
        } catch ( FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return arreglo;    
    }
    
    public static void Serializar4 (String sNombreArchivo,  MatrizCama matriz) {
        try {
            ObjectOutputStream escritor = new  ObjectOutputStream (new FileOutputStream (sNombreArchivo));
            escritor.writeObject(matriz);
            escritor.flush();
            System.out.println("Arhivo "+sNombreArchivo+ " guardado correctamete\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MatrizCama Deserializar4 (String sNombreArchivo) {
        MatrizCama m = new MatrizCama ();
        try{
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo)); 
            m = (MatrizCama)lector.readObject();
        } catch ( FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return m;    
    }
}
