/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Calendar;
import controlador.Factory;

/**
 * Entidad que gestiona a los pacientes y sus citas, es capaz de agregar nuevos
 * pacientes y crearles un nuevo HistorialClinico
 * @author andre
 */
public class Enfermera extends Trabajador implements Serializable{
    String area;
    public Enfermera(String area, String userName, String horarioTrabajo, String nombre, String apellidoPaterno
            , String apellidoMaterno, Calendar fechaNacimiento, String Domicilio
            , String[] telefono) {
        super(userName, horarioTrabajo, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, Domicilio, telefono);
    }
    
    public Enfermera() {
    }

    @Override
    public String toString() {
        return "Enfermera: " + super.toString(true)+"\n Area:" + area ;
    }
    /**
    *metodo que agrega un paciente a el sistema, este paciente se envía a Factory para su manejo
     * @param paciente
    */
    public void registrarPaciente(Paciente paciente){
        Factory.agregar(paciente);
    }
    /**
    * metodo que relaciona un HistorialClinico con su paciente
     * @param paciente
     * @param historial
    */
    public void registrarHistorial(Paciente paciente, HistorialClinico historial){
        paciente.setHistorial(historial);
        Factory.getPacientes().remove(paciente);
        Factory.agregar(paciente);
        
    }
    
    /**
    * metodo sobrecargado comprueba si hay horario con el medico y si lo hay crea una cita 
    * para el paciente
     * @param paciente
     * @param especialidad
     * @param fecha
     * @return cita
    */
    public Cita crearCita(Paciente paciente, String especialidad, Calendar fecha){
        for(Medico med: Factory.getMedicos()){
            if(especialidad.equals("general")){
                return this.crearCita(paciente, med, fecha);
            }else if(med.getEspecialidad().equals(especialidad)){
                if(med.revisarDisponibilidad(fecha)){
                   return this.crearCita(paciente, med, fecha);
                }
            }
        }
        return null;
    }
     public Cita crearCita(Paciente paciente, Medico medico, Calendar fecha){
        if(medico.revisarDisponibilidad(fecha)){
           Cita cita = new Cita(fecha, paciente, medico);
           medico.getCitas().add(cita);
           paciente.getCitas().add(cita);
           Factory.actualizarInfo(medico);
           Factory.actualizarInfo(paciente);
           return cita;
        }
        return null;
    }
    
}
