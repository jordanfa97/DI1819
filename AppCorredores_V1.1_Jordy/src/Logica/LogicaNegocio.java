/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Interfaz.DialogoMenu;
import Modelo.Carrera;
import Utilidades.Fechas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Corredor;
import Modelo.Participante;
import java.awt.Component;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordy
 */
public class LogicaNegocio implements Serializable {

    private List<Carrera> listaCarreras;
    private List<Participante> listaParticipantes;
    private List<Corredor> listaCorredores;
    private Corredor corredor;
    private transient Timer timer;
    private int minutosGuardado;
    private FileReader fr = null;
    private BufferedReader br = null;
    private FileWriter fw = null;
    private PrintWriter pw = null;
    private File fichero;

    public LogicaNegocio() {
        listaCorredores = new ArrayList<Corredor>();
        listaCarreras = new ArrayList<Carrera>();
        this.minutosGuardado = 15;

    }

    public int getMinutosGuardado() {
        return minutosGuardado;
    }

    public void setMinutosGuardado(int minutosGuardado) {
        this.minutosGuardado = minutosGuardado;
        this.guardarAutomaticamente();
    }

    public void darAlta(Corredor corredor) {
        listaCorredores.add(corredor);
    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public List<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(List<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public void cargarColeccion() {

        try {
            //leemos el CSV 
            fr = new FileReader("corredores.csv");
            br = new BufferedReader(fr);

            //bucle lee lineas y va tokenizando
            String linea = br.readLine();
            while (linea != null) {
                StringTokenizer tokens = new StringTokenizer(linea, ",");
                //creamos el objeto con la linea que se va tokenizar
                System.out.println("lista corredores: " + linea);
                System.out.println("");

                //creamos el objeto de la linea tokenizada
                //vamos añadiendo los tokens a las variables del objeto corredor
                String nombre = tokens.nextToken();
                String dni = tokens.nextToken();
                Date fechaNac = Fechas.sdf.parse(tokens.nextToken());
                String direccion = tokens.nextToken();
                int telefono = Integer.parseInt(tokens.nextToken().trim());
                corredor = new Corredor(nombre, dni, fechaNac, direccion, telefono);

                //creamos el objeto corredor con todos sus atributos
                //cargamos la coleccion corredores con los objetos corredor
                listaCorredores.add(corredor);
                linea = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            Component DialogoMenu = null;
            JOptionPane.showMessageDialog(DialogoMenu, "El archivo no existe", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            System.out.println("Error en la lectura");
        } catch (ParseException ex) {
            System.out.println("Error formatear fecha");
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException ex) {
                System.out.println("Error lectura");
            }
        }

    }

    public void guardarColeccion() {

        try {
            fichero = new File("corredores.csv");
            fw = new FileWriter(fichero);
            pw = new PrintWriter(fw);
            for (Corredor c : listaCorredores) {
                pw.write(c.getNombre() + ",");
                pw.write(c.getDni() + ",");
                pw.write(Fechas.sdf.format(c.getFechaNac()) + ",");
                pw.write(c.getDireccion() + ",");
                pw.write(c.getTelefono() + "\n");
                //pw.write(c.getDireccion() + System.lineSeparator());//System.lineSeparator()...si da problemas "\n"
            }
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            System.out.println("Error lectura");
        } finally {
            //flush para vaciar buffer y nos grabe sino puede darnos problemas
            pw.flush();
            pw.close();
        }

    }

    public void guardarDatos() {
        GestionArchivos.guardarInstancia(this);
    }

    private void guardarAutomaticamente() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                guardarDatos();
            }
        }, 0, minutosGuardado * 60 * 1000);

    }

    public void anhadirCorredor(Corredor corredor) {

        listaCorredores.add(corredor);
    }

    public void anhadirCarrera(Carrera carrera) {
        listaCarreras.add(carrera);
    }

    public void anhadirParticipante(Participante participante) {
        listaParticipantes.add(participante);
    }

    public void borrarParticipante(Participante participante) {
        if (listaParticipantes.contains(participante)) {
            listaParticipantes.remove(participante);
        }
    }

    public void borrarCorredor(Corredor corredor) {
        if (listaCorredores.contains(corredor)) {
            listaCorredores.remove(corredor);
        }
    }

    public void borrarCarrera(Carrera carrera) {
        if (listaCarreras.contains(carrera)) {
            listaCarreras.remove(carrera);
        }
    }

    public boolean anhadirCorredorAcarrera(Corredor corredor, Carrera carrera) {

        int nunDorsal = carrera.getListaParticipantes().size() + 1;
        int tiempo = 0;
        Participante participante = new Participante(nunDorsal, tiempo);

        carrera.getListaParticipantes().add(participante);

        return true;
    }

}
