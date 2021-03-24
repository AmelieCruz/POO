/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Superclase en la que se definen los atributos principales de las entidades 
 * principales de la Clinica
 * @author andre
 */
public abstract class Persona implements Serializable{
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected Calendar fechaNacimiento;
    protected String Domicilio;
    protected String[] telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String Domicilio, String[] telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.Domicilio = Domicilio;
        this.telefono = telefono;
    }
    
    /**
     * metodo que retorna una cadena con el Nombre con apellidos de la persona
     * @return cadena con nombre en formato ApPat ApMat Nombre(s)
     */
    public String getNombreCompleto() {
        return apellidoPaterno + " "+ apellidoMaterno+" "+ nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String[] getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setTelefono(String[] telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        String mensaje;
        mensaje ="Nombre:" + this.getNombreCompleto() + "\n Fecha de nacimiento:" + formato.format(fechaNacimiento.getTime()) + "\n Domicilio:" + Domicilio + "\n Telefono:";
        for(String tel: telefono)
            mensaje+= " "+tel+ " ";
        return mensaje;
    }
    public String toString(boolean trabajador){
        return "Nombre:" + this.getNombreCompleto();
    }
    
}
