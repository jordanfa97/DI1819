/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import ejer1_modelo.Leer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Corredor;
import utilidades.Utils;
import static utilidades.Utils.sdf;

/**
 *
 * @author Jordy
 */
public class GestionCorredores {

    private Corredor corredor;
    private FileReader fr = null;
    private BufferedReader br = null;
    private FileWriter fw = null;
    private PrintWriter pw = null;
    private File fichero;
    private Set<Corredor> corredores = new HashSet<Corredor>();

    public void mostrarMenu() {

        System.out.println("/////MENU/////");
        System.out.println("1 - Dar alta Corredores");
        System.out.println("2 - Mostrar Corredores Ordenador por nacimiento");
        System.out.println("3 - Modificar Corredor");
        System.out.println("4 - Borrar corredor");
        System.out.println("5 - guardar coleccion");
        System.out.println("6 - Salir");
        System.out.print("Selecciona opción: ");

    }

    public void gestionMenu() {

        int opcion;

        do {
            mostrarMenu();
            opcion = Leer.leerInt();

            switch (opcion) {
                case 1:
                    DarAltaCorredor();
                    System.out.println("");
                    break;
                case 2:
                    mostrarCorredores();
                    System.out.println("");
                    break;
                case 3:
                    modificarCorredor();
                    System.out.println("");
                    break;
                case 4:
                    borrarCorredor();
                    System.out.println("");
                    break;
                case 5:
                    guardarColeccion();
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Hasta otra...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Error! el valor entre 1 y 6");
            }
        } while (opcion != 6);

    }

    public void DarAltaCorredor() {

        System.out.println("Introduce numero de corredores");
        int num;
        num = Leer.leerInt();
        String linea = null;
        String fechaNacGrabar = null;

        for (int i = 0; i < num; i++) {
            String nombre;
            do {
                System.out.println("Introduce nombre");
                nombre = Leer.leerCadena();
                if (nombre.matches("[0-9]+")) {
                    System.out.println("nombre no valido");
                }
            } while (nombre.matches("[0-9]+"));

            String dni;
            do {
                System.out.println("Introduce dni");
                dni = Leer.leerCadena();
                if (dni.matches("[a-zA-Z]+")) {
                    System.out.println("dni no valido");
                }
            } while (dni.matches("[a-zA-Z]+") || dni.length() < 8 || dni.length() > 9);

            Date fechaNac = null;
            do {
                System.out.println("Introduce fecha Nacimiento");
                try {
                    fechaNac = Utils.sdf.parse(Leer.leerCadena());
                    fechaNacGrabar = Utils.sdf.format(fechaNac);
                } catch (ParseException ex) {
                    System.out.println("Error!, introduce formato correcto");
                }
            } while (fechaNac == null);

            String direccion;
            do {
                System.out.println("Introduce direccion");
                direccion = Leer.leerCadena();
                if (direccion.matches("[0-9]+")) {
                    System.out.println("dni no valido");
                }
            } while (direccion.matches("[0-9]+"));

            System.out.println("Introduce telefono");
            int telefono = Leer.leerInt();
            corredor = new Corredor(nombre, dni, fechaNac, direccion, telefono);
            linea = nombre + "," + dni + "," + fechaNacGrabar + "," + direccion + "," + telefono + "\n";
            corredores.add(corredor);
            System.out.println("Corredor creado");
        }

    }

    public void cargarColeccion() {

        fichero = new File("corredores_consola.csv");
        try {

            //leemos el CSV 
            fr = new FileReader(fichero);
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
                Date fechaNac = Utils.sdf.parse(tokens.nextToken());
                String direccion = tokens.nextToken();
                int telefono = Integer.parseInt(tokens.nextToken().trim());
                corredor = new Corredor(nombre, dni, fechaNac, direccion, telefono);

                //creamos el objeto corredor con todos sus atributos
                //cargamos la coleccion corredores con los objetos corredor
                corredores.add(corredor);
                linea = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("error el fichero no existe");
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

    public void mostrarCorredores() {
        cargarColeccion();
        //mostramos la coleccion con el Iterator o con for-each  
        /* Iterator it = corredores.iterator();           
            while (it.hasNext()) {
                System.out.println(it.next());
            }*/
        List<Corredor> listaCorredores = new ArrayList<Corredor>(corredores);
        Collections.sort(listaCorredores);

        for (Corredor c : listaCorredores) {
            System.out.println(c);
        }
        System.out.println("Fin de fichero");
    }

    public void modificarCorredor() {

        System.out.println("Introduzca nombre corredor a buscar: ");
        String nombreABuscar = Leer.leerCadena();
        boolean lecturaObjColeccion = false;

        /* también con un for normal..
        for (int i = 0; i < luchadores.size(); i++) {
            if (luchadores.get(i).getNombre().equalsIgnoreCase(nombreABuscar)) {
                lecturaObjColeccion = true;
                System.out.println(luchadores.get(i).toString());
            }
        }   */
        for (Corredor c : corredores) {
            if (c.getNombre().equalsIgnoreCase(nombreABuscar)) {
                lecturaObjColeccion = true;
                System.out.println("Introduce nombre");
                String nombre = Leer.leerCadena();
                c.setNombre(nombre);
                System.out.println("Introduce dni");
                String dni = Leer.leerCadena();
                c.setDni(dni);
                Date fechaNac = null;
                do {
                    System.out.println("Introduce fecha Nacimiento");
                    try {
                        fechaNac = Utils.sdf.parse(Leer.leerCadena());
                        c.setFechaNac(fechaNac);
                    } catch (ParseException ex) {
                        System.out.println("Error!, introduce formato correcto");
                    }
                } while (fechaNac == null);
                System.out.println("Introduce direccion");
                String direccion = Leer.leerCadena();
                c.setDireccion(direccion);
                System.out.println("Introduce telefono");
                int telefono = Leer.leerInt();
                c.setDireccion(direccion);
            }
        }
        if (lecturaObjColeccion == false) {
            System.out.println("No se ha encontrado al corredor");
        }
        System.out.println("Fin de modificacion");

    }

    public void borrarCorredor() {
        System.out.println("Introduzca nombre corredor a borrar: ");
        String nombreABuscar = Leer.leerCadena();
        boolean busquedaObj = false;

        Iterator it = corredores.iterator();
        while (it.hasNext()) {
            corredor = (Corredor) it.next();
            if (corredor.getNombre().equalsIgnoreCase(nombreABuscar)) {
                it.remove();
                busquedaObj = true;
                break;
            }
        }

        if (busquedaObj == false) {
            System.out.println("No se ha encontrado al corredor");
        } else {
            System.out.println("Corredor eliminado");
        }

    }

    public void guardarColeccion() {

        try {
            fw = new FileWriter("corredores_consola.csv");
            pw = new PrintWriter(fw);
            for (Corredor c : corredores) {
                pw.write(c.getNombre() + ",");
                pw.write(c.getDni() + ",");
                pw.write(Utils.sdf.format(c.getFechaNac()) + ",");
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
