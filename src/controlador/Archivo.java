/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author andre
 */
public class Archivo {
    
    /*
    *variable para la escritura de archivos
    */
    private FileWriter archivoWriter;
    /*
        *variables para el guardado/recuperación de objetos 
    */
    private ObjectOutputStream objsWriter; 
    private ObjectInputStream objsReader;
    private FileOutputStream objsFileWriter;
    private FileInputStream objsFileReader;

    public Archivo(String nombreArchivo){
        try {
            if(nombreArchivo.equals("Enfermeras.dat")||nombreArchivo.equals("Medicamentos.dat")||
                    nombreArchivo.equals("Medicos.dat")||nombreArchivo.equals("Pacientes.dat"))
             throw new Exception("No se le puede asignar ese nombre al archivo");
                
            archivoWriter= new FileWriter(nombreArchivo);
        }
        catch(IOException e){
            System.out.println("error al abrir el archivo");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Archivo(){
    }

    public void setArchivoWriter(String nombreArchivo) {
        try {
            if(nombreArchivo.equals("Enfermeras.dat")||nombreArchivo.equals("Medicamentos.dat")||
                    nombreArchivo.equals("Medicos.dat")||nombreArchivo.equals("Pacientes.dat"))
             throw new Exception("No se le puede asignar ese nombre al archivo");
            archivoWriter= new FileWriter(nombreArchivo);
        }
        catch(IOException e){
            System.out.println("error al abrir el archivo");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    /*
    * funcion que escribe en el fichero que se especifica al crearse el objeto
    */
    public void escribirArchivo(String contenido){
        try{
            archivoWriter.write(contenido);
        }catch(IOException e){}
        finally{
            try{
                archivoWriter.close();  
            }catch(IOException e){}
        }
    }
    /*
    *funcion sobrecargada que almacena todos los datos de cada Paciente en un fichero
    */
    public void guardar(Paciente paciente) throws IOException{
        objsFileWriter = new FileOutputStream("Pacientes.dat");
        objsWriter = new ObjectOutputStream(objsFileWriter);
        objsWriter.writeObject(Factory.getPacientes());
        objsFileWriter.close();
    }
    
    public void guardar(Medico medico) throws IOException{
        objsFileWriter = new FileOutputStream("Medicos.dat");
        objsWriter = new ObjectOutputStream(objsFileWriter);
        objsWriter.writeObject(Factory.getMedicos());
        objsFileWriter.close();
    }
    public void guardar(Enfermera enfermera) throws IOException{
        objsFileWriter = new FileOutputStream("Enfermeras.dat");
        objsWriter = new ObjectOutputStream(objsFileWriter);
        objsWriter.writeObject(Factory.getEnfermeras());
        objsFileWriter.close();
    }
    public void guardar(Medicamento medicamento) throws IOException{
        objsFileWriter = new FileOutputStream("Medicamentos.dat");
        objsWriter = new ObjectOutputStream(objsFileWriter);
        objsWriter.writeObject(Factory.getMedicamentos());
        objsFileWriter.close();
    }
    /*
    *metodo que recupera los datos de los ficheros de almacenamiento 
    */
    public void recuperar() throws IOException{
        Object obj = null;
        File file = new File("Pacientes.dat");
        ArrayList<Paciente> pac = null;
        if(!file.exists()) throw new IOException("NotExist");
        else{
            objsFileReader = new FileInputStream(file);
            objsReader = new ObjectInputStream(objsFileReader);
            try {
                obj = objsReader.readObject();
            } catch (ClassNotFoundException ex){}
            try{
                pac=(ArrayList<Paciente>) obj;
                Factory.setPacientes(pac);
            }catch(Exception e){
                System.out.println("error desde aqui");
                file.delete();
                throw new IOException("NotExist");
            }
            objsFileReader.close();
            objsReader.close();
        }
       file = new File("Enfermeras.dat");
        ArrayList<Enfermera> enf = null;
        if(!file.exists()) throw new IOException("NotExist");
        else{
            objsFileReader = new FileInputStream(file);
            objsReader = new ObjectInputStream(objsFileReader);
            try {
                obj = objsReader.readObject();
            } catch (ClassNotFoundException ex){}
            try{
                enf=(ArrayList<Enfermera>) obj;
                Factory.setEnfermeras(enf);
            }catch(Exception e){
                System.out.println("error desde aqui");
                 file.delete();
                 throw new IOException("NotExist");
            }

            objsFileReader.close();
            objsReader.close();
        }
        Factory.setEnfermeras(enf);
        file = new File("Medicos.dat");
        ArrayList<Medico> med = null;
        if(!file.exists()) throw new IOException("NotExist");
        else{
            objsFileReader = new FileInputStream(file);
            objsReader = new ObjectInputStream(objsFileReader);
            try {
                obj = objsReader.readObject();
            } catch (ClassNotFoundException ex){
            }
            try{
                med=(ArrayList<Medico>) obj;
                Factory.setMedicos(med);
            }catch(Exception e){
                file.delete();
                throw new IOException("NotExist");
            }
            objsFileReader.close();
            objsReader.close();    
        }
        Factory.setMedicos(med) ;
        file = new File("Medicamentos.dat");
        ArrayList<Medicamento> medi = null;
        if(!file.exists()) throw new IOException("NotExist");
        else{
            objsFileReader = new FileInputStream(file);
            objsReader = new ObjectInputStream(objsFileReader);
            try {
                obj = objsReader.readObject();
            } catch (ClassNotFoundException ex){}
            try{
                medi=(ArrayList<Medicamento>) obj;
                Factory.setMedicamentos(medi);
            }catch(Exception e){
                 file.delete();
                 throw new IOException("NotExist");
            }
            objsFileReader.close();
            objsReader.close();
        }
        Factory.setMedicamentos(medi);
        
    }
     
     
    
}
