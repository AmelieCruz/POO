/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Factory;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author andre
 */
public abstract class Trabajador  extends Persona{
    String claveAcceso;
    String userName;
    Calendar[] horario;
    /**
     * El constructor recibe una cadena para el horario con formato "HH:mm-HH:mm" donde la primera 
     * hora es la hora de entrada y la segunda hora es la hora de salida
     *
     * @param userName 
     * @param horario 
     * @param nombre 
     * @param apellidoPaterno 
     * @param apellidoMaterno 
     * @param fechaNacimiento 
     * @param Domicilio 
     * @param telefono 
    */
    public Trabajador(String userName,String horario, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String Domicilio, String[] telefono) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, Domicilio, telefono);
        this.userName = userName;
        this.horario = new Calendar[2];
        this.horario[0] = Calendar.getInstance();
        this.horario[1] = Calendar.getInstance();
        this.horario[0].set(0, 0, 0, Integer.parseInt(horario.substring(0,2)), Integer.parseInt(horario.substring(3,5)));
        this.horario[1].set(0, 0, 0, Integer.parseInt(horario.substring(6,8)), Integer.parseInt(horario.substring(9,horario.length()-1)));
    }

    public Trabajador() {
    }
    /**
     * metodo que retorna el horario como una cadena de caracteres
     * @return 
     */
    public String getHorarioString() {
        return Factory.FORMATO_HORA.format(horario[0].getTime())+"-"+Factory.FORMATO_HORA.format(horario[1].getTime());
    }

    public void setHorario(String horario) {
        this.horario[0].set(0, 0, 0, Integer.parseInt(horario.substring(0,2)), Integer.parseInt(horario.substring(3,5)));
        this.horario[1].set(0, 0, 0, Integer.parseInt(horario.substring(6,8)), Integer.parseInt(horario.substring(9,horario.length()-1)));
    }
    

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.claveAcceso, other.claveAcceso)) {
            return false;
        }
        return Objects.equals(this.userName, other.userName);
    }

    @Override
    public String toString() {
        return super.toString() + "\nClave de acceso: " + claveAcceso + "\nUserName=" + userName + "\nHorario=" + this.getHorarioString() ;
    }
    
    
}
