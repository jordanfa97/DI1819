/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Jordy
 */
public class Participante extends Corredor implements Serializable {

    private int dorsal;
    private double tiempoLlegada;

    public Participante(int dorsal, double tiempoLlegada) {
        this.dorsal = dorsal;
        this.tiempoLlegada = tiempoLlegada;
    }

    public Participante(int dorsal, double tiempoLlegada, String nombre, String dni, Date fechaNac, String direccion, int telefono) {
        super(nombre, dni, fechaNac, direccion, telefono);
        this.dorsal = dorsal;
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public double getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(double tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    @Override
    public String toString() {
        return super.getNombre() + "Participante{" + "dorsal=" + dorsal + ", tiempoLlegada=" + tiempoLlegada + '}';
    }

}
