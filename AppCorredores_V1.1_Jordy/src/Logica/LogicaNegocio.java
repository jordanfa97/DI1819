/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Interfaz.DialogoMenu;
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
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordy
 */
public class LogicaNegocio {

    private List<Corredor> listaCorredores;
    private Corredor corredor;
    private FileReader fr = null;
    private BufferedReader br = null;
    private FileWriter fw = null;
    private PrintWriter pw = null;
    private File fichero;

    public LogicaNegocio() {
        listaCorredores = new ArrayList<Corredor>();
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

}
