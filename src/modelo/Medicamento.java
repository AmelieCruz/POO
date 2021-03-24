/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 * Clase que representa cada Medicamento con el que cuenta la Clinica
 * @author andre
 */
public class Medicamento implements Serializable{
    String sustacia;
    String presentacion;
    double precio;

    public Medicamento() {
    }

    public Medicamento(String sustacia, String presentacion, double precio) {
        this.sustacia = sustacia;
        this.presentacion = presentacion;
        this.precio = precio;
    }

    public String getSustacia() {
        return sustacia;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setSustacia(String sustacia) {
        this.sustacia = sustacia;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sustacia:" + sustacia + "\tPresentacion=" + presentacion + "\tPrecio=" + precio;
    }
    
    
    
}
