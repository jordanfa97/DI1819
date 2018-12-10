/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Utilidades.Fechas;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jordy
 */
public class Carrera implements Serializable {

    private String nombreCarrera;
    private Date fechaCarrera;
    private String lugar;
    private int numMaxCorredores;
    private List<Participante> listaParticipantes;
    private boolean finalizada;

    public Carrera() {
    }

    public Carrera(String nombreCarrera, Date fechaCarrera, String lugar, int numMaxCorredores, boolean finalizada) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugar = lugar;
        this.numMaxCorredores = numMaxCorredores;
        this.finalizada = finalizada;
        listaParticipantes = new ArrayList<>();
        this.finalizada = false;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumMaxCorredores() {
        return numMaxCorredores;
    }

    public void setNumMaxCorredores(int numMaxCorredores) {
        this.numMaxCorredores = numMaxCorredores;
    }

    public List<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(List<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", fechaCarrera=" + Fechas.sdf.format(fechaCarrera) + ", lugar=" + lugar + ", numMaxCorredores=" + numMaxCorredores + ", listaParticipantes=" + listaParticipantes + ", finalizada=" + finalizada + '}';
    }

}
