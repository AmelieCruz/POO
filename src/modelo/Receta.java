/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import controlador.Archivo;
import controlador.Factory;
import java.io.Serializable;
/**
 * Clase que representa la Receta que emite el Medico en una Cita para un Paciente
 * @author andre
 */
public class Receta implements Serializable{
    private String tratamiento;
    private Medicamento[] medicamentos;
    private Calendar terminoTratamiento;
    private Cita cita;

    public Receta(String tratamiento, Medicamento[] medicamentos, Calendar terminoTratamiento, Cita cita) {
        this.tratamiento = tratamiento;
        this.medicamentos = medicamentos;
        this.terminoTratamiento = terminoTratamiento;
        this.cita = cita;
    }
    public String getTratamiento() {
        return tratamiento;
    }

    public Medicamento[] getMedicamentos() {
        return medicamentos;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setMedicamentos(Medicamento[] medicamentos) {
        this.medicamentos = medicamentos;
    }
    public void setTerminoTratamiento(Calendar terminoTratamiento) {
        this.terminoTratamiento = terminoTratamiento;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        String mensaje= "Tratamiento: " + tratamiento+"\nMedicamentos: " ;
        for(Medicamento med: medicamentos){
            mensaje += "\n"+med;
        }
        mensaje+="\nTermino del tratamiento: " + formato.format(terminoTratamiento.getTime());
        return mensaje;
    }
    /**
     * METODO QUE IMPRIME LA RECETA EN UN ARCHIVO Y DEVUELVE UN STRING CON TODOS LOS ATRIBUTOS DE LA RECETA
     * @return CADENA CON LA REPRESENTACION DE LA RECETA
     */
    public String imprimirReceta(){
        Archivo archivo = new Archivo("receta"+cita.getPaciente().getApellidoPaterno()+cita.getPaciente().getApellidoMaterno()
                +cita.getPaciente().getNombre()+Factory.FORMATO_FECHA.format(cita.getFecha().getTime())+".txt");
        archivo.escribirArchivo(cita.toString(true));
        return cita.toString(true);
    }
}
