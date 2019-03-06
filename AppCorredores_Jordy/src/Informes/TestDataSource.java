/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informes;

import Controlador.GestionCarrera;
import Modelo.Carrera;
import Vista.ListadoCarreras;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import org.openide.util.Exceptions;

/**
 *
 * @author Jordy
 */
public class TestDataSource {

    public static List<Carrera> listaCarreras() {//metodo llamado "listCarreras"

        /*Esta clase devuelve la lista de carreras para el modo "Preview".
        En el informe se van a mostrar carreras. Tendremos que configurar el
        IReport para que sea capaz de acceder al método de esta clase que 
        hace que devuelva una lista de objetos en nuestro programa (carreras)*/
        //Tenemos que añadir las librerias "JasperReports y HSQLDB" 
        //y poner el JDK 1.7 (MUY IMPORTANTE)
        GestionCarrera gc = new GestionCarrera();
        List<Carrera> listaCarreras = new ArrayList<>();
        List<Carrera> listaCarrerasSin = new ArrayList<>();
        try {
            listaCarreras = gc.listaCarreraInforme("datosCarrera.data");
            for (int i = 0; i < listaCarreras.size(); i++) {
                if(!listaCarreras.get(i).isFinalizada()){
                    listaCarrerasSin.add(listaCarreras.get(i));
                }
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } catch (ClassNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
        return listaCarrerasSin;

    }

}
