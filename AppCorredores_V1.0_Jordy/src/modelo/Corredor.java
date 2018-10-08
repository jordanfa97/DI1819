/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Jordy
 */
public class Corredor implements Comparable<Corredor> {

    private String nombre;
    private String dni;
    private Date fechaNac;
    private String direccion;
    private int telefono;

    public Corredor(String nombre, String dni, Date fechaNac, String direccion, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Corredor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Corredor{" + "nombre=" + nombre + ", dni=" + dni + ", fechaNac=" + fechaNac + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    @Override
    public int compareTo(Corredor o) {
        if (this.fechaNac.before(o.getFechaNac())) {
            return -1;
        }
        if (this.fechaNac.after(o.getFechaNac())) {
            return 1;
        }
        return 0;
    }
    
    //tambien se puede hacer:
    /*public int compareTo(Corredor t1, Corredor t2) {
        return t1.fechaNac.compareTo(t2.fechaNac);
    } */

}
