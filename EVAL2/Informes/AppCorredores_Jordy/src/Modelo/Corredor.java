package Modelo;

/**
 *
 * @author Jordy
 */
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Corredor implements Serializable {

    private String nombre, apellido, direccion, dni;
    private Date fNac, actual;
    private int telefono;

    public Corredor(String nombre, String apellido, String direccion, String dni, Date fechaNac, int telefono) {
        if (dni == null) {
            throw new IllegalArgumentException("El dni no puede estar vacío."); //no permite crear corredores sin dni para que no falle luego a la hora de compara.
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.fNac = fechaNac;
        this.telefono = telefono;

    }

    public Corredor(String dni) {
        this.dni = dni;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getfNac() {
        return fNac;
    }

    public void setfNac(Date fNac) {
        this.fNac = fNac;
    }

    public Date getActual() {
        return actual;
    }

    public void setActual(Date actual) {
        this.actual = actual;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni == null) {
            throw new IllegalArgumentException("El dni no puede estar vacío.");
        }
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Corredor{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", dni=" + dni + ", fNac=" + fNac + ", telefono=" + telefono;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Corredor other = (Corredor) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }



}
