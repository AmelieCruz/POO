/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Factory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 * Clase que relaciona a un Paciente con un Medico, tambien guarda el Diagnostico y Tratamiento
 * hechos por el doctor y la Receta que este emite, cuenta con una fecha con hora como 
 * identificador en conjunto con el Medico y Paciente
 * @author andre
 */
public class Cita implements Serializable{
    private Calendar fecha;
    Paciente paciente;
    Medico medico;
    ArrayList<Receta> receta;
    Diagnostico diagnostico;

    public Cita(Calendar fecha, Paciente paciente, Medico medico) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
        receta = new ArrayList<>();
    }

    public Cita(){
        receta = new ArrayList<>();
    }

    public Calendar getFecha() {
        return fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }
    

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void aniadirReceta(Receta receta) {
        this.receta.add(receta);
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<Receta> getReceta() {
        return receta;
    }

    @Override
    public String toString() {
        
        String contenido = paciente +""+ medico + "\nFecha: ";
        if(fecha != null){
                contenido += Factory.FORMATO_FECHA.format(fecha.getTime()) + "\nHora: " + Factory.FORMATO_HORA.format(fecha.getTime());
        }
        return contenido;
    }
    public String toString(boolean opc) {
        
        String contenido = paciente +"\n"+ medico + "\nFecha: ";
        if(fecha != null){
                contenido += Factory.FORMATO_FECHA.format(fecha.getTime()) + "\nHora: " + Factory.FORMATO_HORA.format(fecha.getTime());
                        }
                contenido += "\nDiagnostico: " + diagnostico;
        int i = 0;
        for(Receta recet: receta){
            i++;
            contenido += "\nReceta no."+Integer.toString(i)+recet;
        }
        return contenido;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setReceta(ArrayList<Receta> receta) {
        this.receta = receta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Cita other = (Cita) obj;
        if(this.fecha!=null && other.fecha!=null){
            if (!Objects.equals(this.fecha.get(Calendar.DAY_OF_YEAR), other.fecha.get(Calendar.DAY_OF_YEAR))) {
                return false;
            }
            if (!Objects.equals(this.fecha.get(Calendar.YEAR), other.fecha.get(Calendar.YEAR))) {
                return false;
            }
        }
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        return Objects.equals(this.medico, other.medico);
    }

    
    
}
