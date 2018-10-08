/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jordy
 */
public class TableModelCorredor extends AbstractTableModel {

    private final List<Corredor> listaCorredores;
    private final String[] columnas = {"Nombre", "DNI"};

    public TableModelCorredor(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    //Devuelve numero filas
    @Override
    public int getRowCount() {
        return listaCorredores.size();
    }

    //Devuelve nummero columnas
    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    //Se llama por cada celda de la tabla
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaCorredores.get(rowIndex).getNombre();
            case 1:
                return listaCorredores.get(rowIndex).getDni();
        }
        return null;
    }

}
