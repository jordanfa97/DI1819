/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.*;
import modelo.Corredor;

/**
 *
 * @author Jordy
 */
public class LogicaNegocio {

    private List<Corredor> listaCorredores;

    public LogicaNegocio() {
        listaCorredores = new ArrayList<Corredor>();
    }

    public void darAlta(Corredor corredor) {
        listaCorredores.add(corredor);
        mostrarCorredores();
    }

    public List<Corredor> mostrarCorredores() {
        if (listaCorredores.size() == 0) {
        } else {
            for (Corredor c : listaCorredores) {

                System.out.println(c);
            }
        }
        return listaCorredores;

    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    @Override
    public String toString() {
        return "LogicaNegocio{" + "listaCorredores=" + listaCorredores + '}';
    }

}
