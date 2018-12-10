/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModels;

import Modelo.Corredor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jordy
 */
public class TableModelCorredor extends AbstractTableModel {

    private final List<Corredor> listaCorredores;
    private final String[] columnas = {"Nombre", "DNI", "DIRECCIÓN", "TELÉFONO", "FECHA NACIMIENTO"};

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
            case 2:
                return listaCorredores.get(rowIndex).getDireccion();
            case 3:
                return listaCorredores.get(rowIndex).getTelefono();
            case 4:
                return listaCorredores.get(rowIndex).getFechaNac();
        }
        return null;
    }

}
