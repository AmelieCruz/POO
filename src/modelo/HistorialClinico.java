/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que almacena los datos de interés para el Medico sobre un Paciente
 * @author andre
 */
public class HistorialClinico implements Serializable{
    char sexo;
    String tipoSangre;
    double estatura;
    double peso;
    ArrayList<String> enfermHereditarias;
    ArrayList<String> padecimientos;
    ArrayList<String> alergias;

    public HistorialClinico(char sexo, String tipoSangre, double estatura, double peso, ArrayList<String> enfermHereditarias, ArrayList<String> padecimientos, ArrayList<String> alergias) {
        this.sexo = sexo;
        this.tipoSangre = tipoSangre;
        this.estatura = estatura;
        this.peso = peso;
        this.enfermHereditarias = enfermHereditarias;
        this.padecimientos = padecimientos;
        this.alergias = alergias;
    }

    public HistorialClinico(char sexo, String tipoSangre, double estatura, double peso) {
        this.sexo = sexo;
        this.tipoSangre = tipoSangre;
        this.estatura = estatura;
        this.peso = peso;
        padecimientos = new ArrayList<>();
        enfermHereditarias = new ArrayList<>();
        alergias = new ArrayList<>();
    }

    public HistorialClinico() {
        padecimientos = new ArrayList<>();
        enfermHereditarias = new ArrayList<>();
        alergias = new ArrayList<>();
    }
    
    

    public char getSexo() {
        return sexo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public ArrayList<String> getEnfermHereditarias() {
        return enfermHereditarias;
    }

    public ArrayList<String> getPadecimientos() {
        return padecimientos;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEnfermHereditarias(ArrayList<String> enfermHereditarias) {
        this.enfermHereditarias = enfermHereditarias;
    }

    public void setPadecimientos(ArrayList<String> padecimientos) {
        this.padecimientos = padecimientos;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }
    /**
    * metodo que añade alguna alergia al HistorialClinico del Paciente
     * @param alergia
    */
    public void agregarAlergia(String alergia){
        alergias.add(alergia);
    }
    /**
    * metodo que añade algun padecimiento al HistorialClinico del Paciente
     * @param padecimiento
    */
    public void agregarPadecimiento(String padecimiento){
        padecimientos.add(padecimiento);
    }

    @Override
    public String toString() {
        return "Sexo: " + sexo + "\nTipo de sangre: " + tipoSangre + "\nEstatura: " + estatura + "\nPeso: " + peso + "\nEnfermHereditarias: " + enfermHereditarias + "\nPadecimientos: " + padecimientos + "\nAlergias: " + alergias ;
    }
    
}
