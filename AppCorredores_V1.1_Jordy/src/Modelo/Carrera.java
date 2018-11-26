/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Jordy
 */
public class Carrera {

    private String nombreCarrera = "";
    private Date fechaCarrera;
    private String lugar;
    private int numMaxCorredores;
    private List<Participante> listaParticipantes;

    public Carrera(String nombreCarrera, Date fechaCarrera, String lugar, int numMaxCorredores, List<Participante> listaParticipantes) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugar = lugar;
        this.numMaxCorredores = numMaxCorredores;
        this.listaParticipantes = listaParticipantes;
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

    @Override
    public String toString() {
        return nombreCarrera + ", " + fechaCarrera + ", " + lugar + ", " + numMaxCorredores;
    }

}
