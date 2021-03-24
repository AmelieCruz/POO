/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import modelo.*;

/**
 *
 * @author andre
 */
public class Factory implements Serializable{
    private static ArrayList<Paciente> pacientes;
    private static ArrayList<Enfermera> enfermeras;
    private static ArrayList<Medico> medicos;
    private static ArrayList<Medicamento> medicamentos;
    private static Archivo archivo;
    private static int clavesSeguro;
    private static int clavesAcceso;
    public static final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd-MM-YYYY"), 
            FORMATO_HORA = new SimpleDateFormat("HH:mm");
    private static final Factory FACTORY = new Factory();
    private Factory() {
        pacientes =new ArrayList<>();
        enfermeras =new ArrayList<>();
        medicos = new ArrayList<>();
        medicamentos= new ArrayList<>();
        clavesSeguro = 10000000;
        clavesAcceso = 100000;
        archivo = new Archivo();
        this.cargarDatos();
    }
    public static Factory getInstance(){
        return FACTORY;
    }
    /*
    *Metodo que genera por primera vez Entidades de la clinica
    */
    private void generar(){
        String[] sustancias = {"Paracetamol", "Salbutamol", "Naproxeno", "Ketorolako"};
        String[] presentaciones ={"20 mg", "50 mcg", "50 ml", "15 mcg"};
        double[] precios ={30.0, 55.0, 20.0, 100.0};
        for(int i =0; i<4; i++){
            Medicamento medicamento = new Medicamento(sustancias[i], presentaciones[i], precios[i]);
            agregar(medicamento);
        }
        String nombres[]= {"Maria", "Jose", "Juan", "Maritza", "Amelie", "Carolina"};
        String apellidosPat[]={"Sanches", "Dominguez", "Perez", "Rosales", "Cruz", "Gutierrez"};
        String apellidosMat[]={"Gonzales", "Gallegos", "Gutierrez", "Flores", "Granados", "Jimenez"};
        String domicilios[]={"Av. Guadalupe 340", "Calle Proton 42", "Callejon Del Beso 2"
                            , "Calle Rosa 36", "Av. acueducto 609", "Abedules 15"};
        String[] CURPs = {"SAGM051886MHG01", "DOGJ050100HDFRRO02"};
        String[] userNames ={"RosaI1512", "Arista20", "Medicn123", "Arabia!2"};
        String[] especialidades={"Neurologia", "Neumologia"};
        String[] horarios ={"09:00-15:00", "10:00-17:00"};
        String[] areas= {"Administrativos", "Traumatología"};
        Random aleatorio = new Random();
        Paciente[] paciente= new Paciente[2];
        for(int i = 0; i<6; i++){
            Calendar fechaNac= Calendar.getInstance();
            fechaNac.set(2020-(18+aleatorio.nextInt(50)), aleatorio.nextInt(12), 1+aleatorio.nextInt(27));
            String telefono[] = {String.valueOf(10000000 + aleatorio.nextInt(999999))};
            if(i<2){
               paciente[i] = new Paciente(CURPs[i], nombres[i], apellidosPat[i], apellidosMat[i], fechaNac, domicilios[i], telefono);
            }else if(i<4){
                agregar(new Enfermera(areas[i-2],userNames[i-2],horarios[i-2], nombres[i], apellidosPat[i], apellidosMat[i], fechaNac, domicilios[i], telefono));
            }else{
                agregar(new Medico(especialidades[i-4],userNames[i-2], horarios[i-4], nombres[i], apellidosPat[i], apellidosMat[i], fechaNac, domicilios[i], telefono));
            }
        }
        ArrayList<String> alergias = new ArrayList<>();
        ArrayList<String> padecimientos = new ArrayList<>();
        ArrayList<String> enfHereditarias = new ArrayList<>();
        alergias.add("Pelo de gato"); alergias.add("Sulfas");
        padecimientos.add("Asma");padecimientos.add("Migraña");
        enfHereditarias.add("Cancer");
        ArrayList<String> alergias2 = new ArrayList<>();
        ArrayList<String> padecimientos2 = new ArrayList<>();
        ArrayList<String> enfHereditarias2 = new ArrayList<>();
        alergias2.add("Polen");
        padecimientos2.add("Rinitis");
        enfHereditarias2.add("Hipertension");
        paciente[0].setHistorial(new HistorialClinico ('f', "O+",1.56, 50.0, enfHereditarias, padecimientos, alergias));
        paciente[1].setHistorial(new HistorialClinico ('m', "O-",1.85, 85.0, enfHereditarias2, padecimientos2, alergias2));
        agregar(paciente[0]);
        agregar(paciente[1]);
        
    }
    /*
    * metodo para agregar pacientes al sistema
    */
    public static void agregar(Paciente paciente){
        paciente.setClaveSeguro(String.valueOf(clavesSeguro));
        pacientes.add(paciente);
        clavesSeguro++;
        try{
            archivo.guardar(paciente);
        }catch(Exception e){}
    }
    
    /*
    * metodo para agregar medicos al sistema
    */
    public static void agregar(Medico medico){
        medico.setClaveAcceso(String.valueOf(clavesAcceso));
        clavesAcceso++;
        medicos.add(medico);
        try{
            archivo.guardar(medico);
        }catch(Exception e){}
    }
    
    /*
    * metodo para agregar enfermeras al sistema
    */
    public static void agregar(Enfermera enfermera){
        enfermera.setClaveAcceso(String.valueOf(clavesAcceso));
        clavesAcceso++;
        enfermeras.add(enfermera);
        try{
         archivo.guardar(enfermera);
        }catch(Exception e){}
    }
    
    /*
    * metodo para agregar medicamentos al sistema
    */
    public static void agregar(Medicamento medicamento){
        medicamentos.add(medicamento);
        try{
            archivo.guardar(medicamento);
        }catch(Exception e){}
    }
    /*
    * metodo para cargar los datos de archivos
    */
    private void cargarDatos(){
        try{
            archivo.recuperar();
            clavesSeguro = 10000000+pacientes.size();
            clavesAcceso = 100000+enfermeras.size()+medicos.size();
        }catch(Exception e){
            if(e.getMessage().equals("NotExist"))
                this.generar();
            else{
                System.out.println("Eror al cargar los archivos"+ e.getMessage());
                System.gc();
            }
        }
    }
    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public static ArrayList<Enfermera> getEnfermeras() {
        return enfermeras;
    }

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public static ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }
    /**
     * funcion que retorna un ArrayList con todos los Medicos y 
     * Enfermeras del sistema
     * @return ArrayList de Trabajadores
     */
    public static ArrayList<Trabajador> getTrabajadores(){
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        for(Medico med: medicos) trabajadores.add(med);
        for(Enfermera enf: enfermeras) trabajadores.add(enf);
        return trabajadores;
    }

    public static void setPacientes(ArrayList<Paciente> pacientes) {
        Factory.pacientes = pacientes;
    }

    public static void setEnfermeras(ArrayList<Enfermera> enfermeras) {
        Factory.enfermeras = enfermeras;
    }

    public static void setMedicos(ArrayList<Medico> medicos) {
        Factory.medicos = medicos;
    }

    public static void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        Factory.medicamentos = medicamentos;
    }
    /**
     * metodo sobrecargado que actualiza en el sistema la informacion del paciente
     * que se envia por el parametro
     * @param paciente
     */
    public static void actualizarInfo(Paciente paciente){
        pacientes.remove(paciente);
        pacientes.add(paciente);
        try{
            archivo.guardar(paciente);
        }catch(Exception e){}
    }
    /**
     * metodo sobrecargado que actualiza en el sistema la informacion del medico
     * que se envia por el parametro
     * @param medico
     */
     public static void actualizarInfo(Medico medico){
        medicos.remove(medico);
        medicos.add(medico);
        try{
            archivo.guardar(medico);
        }catch(Exception e){}
    }
    
}
