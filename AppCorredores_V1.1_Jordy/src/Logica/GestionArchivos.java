/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.openide.util.Exceptions;

/**
 *
 * @author Jordy
 */
public class GestionArchivos implements Serializable {

    public GestionArchivos() {
    }

    public static void guardarInstancia(LogicaNegocio ln) {

        File archivo = new File("gestion_corredores.dat");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(ln);
        } catch (IOException e) {
            Exceptions.printStackTrace(e);
        }
    }

    public static LogicaNegocio cargarInstancia() {

        File archivo = new File("gestion_corredores.dat");
        LogicaNegocio logicaAplicacion = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            logicaAplicacion = (LogicaNegocio) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            Exceptions.printStackTrace(e);
        }
        return logicaAplicacion;
    }

}
