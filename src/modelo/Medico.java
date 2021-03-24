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

/**
 * Entidad que emite recetas y realiza la evaluacion de un Paciente
 * durante una Cita
 * @author andre
 */
public class Medico extends Trabajador implements Serializable{
    private String especialidad;
    private ArrayList<Cita> citas;

    public Medico(){
    }

    public Medico(String especialidad, String userName, String horario, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String Domicilio, String[] telefono) {
        super(userName, horario, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, Domicilio, telefono);
        this.especialidad = especialidad;
        this.citas = new ArrayList<>();
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public Calendar[] getHorario() {
        return horario;
    }
    

    public ArrayList<Cita> getCitas() {
        return citas;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }    
    /**
    * metodo que ayuda a la clase a encotrar una cita dando la fecha que tiene la cita
    * (fecha tipo Calendar, i.e, include dia-mes-anio-hora_del_dia-minutos)
    * @param citaBuscar
    * @return citaEncontrada
    */
    public Cita buscarCita(Calendar citaBuscar){
        for(Cita cita: citas){
            if(Factory.FORMATO_FECHA.format(cita.getFecha().getTime()).equals(Factory.FORMATO_FECHA.format(citaBuscar.getTime()))&&
                    Factory.FORMATO_HORA.format(cita.getFecha().getTime()).equals(Factory.FORMATO_HORA.format(citaBuscar.getTime()))
               ){
                return cita;
            }
        }
        return null;
    }
    public Cita buscarCita(Paciente pacienteCita){
        for(Cita cita :citas){
            if(cita.getPaciente()== pacienteCita) return cita;
        }
        return null;
    }
    /**
    *metodo sobrecargado que emite un diagnostico para la cita en la que se encuentra, ya sea 
    * por la fecha o por la Cita, tambien analiza si el padecimiento es alguna alergia la
    * aniade a el arreglo de alergias del paciente
     * @param fechaCita
     * @param sintomas
     * @param padecimientos
    */
    public void emiteDiagnostico(Calendar fechaCita, String[] sintomas, String padecimientos){
        this.emiteDiagnostico(this.buscarCita(fechaCita), sintomas, padecimientos);
    }
    /**
    *metodo sobrecargado que emite un diagnostico para la cita en la que se encuentra, ya sea 
    * por la fecha o por la Cita, tambien analiza si el padecimiento es alguna alergia la
    * aniade a el arreglo de alergias del paciente
     * @param cita
     * @param sintomas
     * @param padecimientos
    */
     public void emiteDiagnostico(Cita cita, String[] sintomas, String padecimientos){
        if(cita != null){
            if(cita.getPaciente() !=null){
                if(padecimientos.contains("alergia al ")){
                    String alergia = padecimientos.substring(11, padecimientos.length());
                    cita.getPaciente().getHistorial().agregarAlergia(alergia);
                }else if(padecimientos.contains("alergia a ")){
                    String alergia = padecimientos.substring(10, padecimientos.length());
                    cita.getPaciente().getHistorial().agregarAlergia(alergia);
                }else if(padecimientos.contains("alergia ")){
                    String alergia = padecimientos.substring(8, padecimientos.length());
                    cita.getPaciente().getHistorial().agregarAlergia(alergia);
                }else if(padecimientos.contains("alergias al ")){
                    String alergia = padecimientos.substring(12, padecimientos.length());
                    cita.getPaciente().getHistorial().agregarAlergia(alergia);
                }else if(padecimientos.contains("alergias a ")){
                    String alergia = padecimientos.substring(11, padecimientos.length());
                    cita.getPaciente().getHistorial().agregarAlergia(alergia);
                }else if(padecimientos.contains("alergias ")){
                    String alergia = padecimientos.substring(9, padecimientos.length());
                    cita.getPaciente().getHistorial().agregarAlergia(alergia);
                }
                
            }
            cita.setDiagnostico(new Diagnostico(sintomas, padecimientos));
            if(cita.getMedico().getCitas()!=null)
                if(cita.getMedico().getCitas().contains(cita))
                    cita.getMedico().getCitas().remove(cita);
            cita.getMedico().getCitas().add(cita);
            if(cita.getPaciente().getCitas()!=null)
                if(cita.getPaciente().getCitas().contains(cita))
                    cita.getPaciente().getCitas().remove(cita);
            cita.getPaciente().getCitas().add(cita);
            Factory.actualizarInfo(cita.getPaciente());
            Factory.actualizarInfo(cita.getMedico());
        }else{
            System.out.println("No existe la cita en el sistema");
        }
    }
     /**
    * metodo sobrecargado que emite una o varias Recetas para la cita en la que se encuentra, ya sea 
    * por la fecha o por la Cita, este metodo se puede mandar a llamar multiples veces para añadir mas 
    * de una receta a la cita, si el tratamiento dura mas de 20 dias aniade el padecimiento a el 
    * arreglo de padecimientos del paciente
     * @param fechaCita
     * @param tratamiento
     * @param terminoTratamiento
     * @param medicamentos
    */
    public void preescribeReceta(Calendar fechaCita, String tratamiento,Calendar terminoTratamiento, Medicamento[] medicamentos){
        this.preescribeReceta(this.buscarCita(fechaCita), tratamiento, terminoTratamiento, medicamentos);
    }
   
    public void preescribeReceta(Cita cita, String tratamiento,Calendar terminoTratamiento, Medicamento[] medicamentos){
        if(cita != null){
            if(cita.getPaciente() !=null){
                if(cita.getFecha().get(Calendar.YEAR) == terminoTratamiento.get(Calendar.YEAR))
                    if(cita.getFecha().get(Calendar.DAY_OF_YEAR)+19 < terminoTratamiento.get(Calendar.DAY_OF_YEAR))
                        if(!cita.getDiagnostico().getPadecimiento().toLowerCase().contains("alergia"))
                            cita.getPaciente().getHistorial().agregarPadecimiento(cita.getDiagnostico().getPadecimiento());
                
            }
            cita.aniadirReceta(new Receta(tratamiento, medicamentos, terminoTratamiento, cita));
            cita.getMedico().getCitas().remove(cita);
            cita.getMedico().getCitas().add(cita);
            cita.getPaciente().getCitas().remove(cita);
            cita.getPaciente().getCitas().add(cita);
            Factory.actualizarInfo(cita.getPaciente());
            Factory.actualizarInfo(cita.getMedico());
        }else{
            System.out.println("No existe la cita en el sistema");
        }
    }
    @Override
    public String toString() {
        return "\nMedico\n"+super.toString(true) + "\nEspecialidad: " + especialidad+"\n Horario: "+this.getHorarioString();
    }
    /**
     * 
     * @return cadena con 
     */
    public String toStringComplete(){
        return "Medico\n"+super.toString() + "\nEspecialidad: " + especialidad+"\n Horario: "+this.getHorarioString();
    }
    
    public boolean revisarDisponibilidad(Calendar hora){
        if(horario[0].get(Calendar.HOUR_OF_DAY)<=hora.get(Calendar.HOUR_OF_DAY) && horario[1].get(Calendar.HOUR_OF_DAY)>=hora.get(Calendar.HOUR_OF_DAY)){
            if(horario[0].get(Calendar.MINUTE)<=hora.get(Calendar.MINUTE)){
                if (horario[1].get(Calendar.MINUTE)>=hora.get(Calendar.MINUTE)) {
                    return true;
                }
            }
        }
        return false;
    }
}
