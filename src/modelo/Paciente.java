/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 * Entidad que es atendida por un doctor, se le registra en el sistema con una 
 * clave de seguro para que pueda ser identificado en la Clínica
 * @author andre
 */
public class Paciente extends Persona implements Serializable{
    private final String CURP;
    private String claveSeguro;
    private HistorialClinico historial;
    private ArrayList<Cita> citas;

    public Paciente() {
        CURP = "";
        citas = new ArrayList<>();
    }
    
    public Paciente(String CURP, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String Domicilio, String[] telefono) {
        this(CURP, null,nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, Domicilio, telefono);
    }

    public Paciente(String CURP, HistorialClinico historial, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String Domicilio, String[] telefono) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, Domicilio, telefono);
        this.CURP = CURP;
        this.historial = historial;
        citas = new ArrayList<>();
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }
    
    public String getCURP() {
        return CURP;
    }

    public String getClaveSeguro() {
        return claveSeguro;
    }

    public HistorialClinico getHistorial() {
        return historial;
    }

    public void setClaveSeguro(String claveSeguro) {
        this.claveSeguro = claveSeguro;
    }

    public void setHistorial(HistorialClinico historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Paciente: \n"+super.toString()+"\nCURP:" + CURP + "\nClaveSeguro:" + claveSeguro;
    }
    public String toStringComplete(){
        return "Paciente: \n"+super.toString()+"\nCURP:" + CURP + "\nClaveSeguro:" + claveSeguro+"\nHistorial Clinico: "+ historial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.CURP, other.CURP)) {
            return false;
        }
        if (!Objects.equals(this.claveSeguro, other.claveSeguro)) {
            return false;
        }
        return true;
    }
    
    
    
}
