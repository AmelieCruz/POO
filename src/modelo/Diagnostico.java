/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 * Clase que almacena el Diagnóstico que hace un Doctor en una Cita para un Paciente
 * @author andre
 */
public class Diagnostico implements Serializable{
    private String [] sintomas;
    private String padecimiento;

    public Diagnostico(String[] sintomas, String padecimiento) {
        this.sintomas = sintomas;
        this.padecimiento = padecimiento;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    @Override
    public String toString() {
        String contenido = "Sintomas: ";
        for(String s:sintomas){
            contenido +=s+"\n";
        }
        return contenido+ "\nPadecimiento: " + padecimiento;
    }
    
}
