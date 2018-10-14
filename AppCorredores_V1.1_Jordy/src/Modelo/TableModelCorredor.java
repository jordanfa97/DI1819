/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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

    //Este método se llamará una vez por cada una de las celdas que tenga la tabla
    //Evidentemente el número de llamadas a este método depende de lo que haya
    //devuelto la clase en getRowCount y getColumnCount.
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
