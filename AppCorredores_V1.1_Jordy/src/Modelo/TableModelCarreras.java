/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 *
 *
 * @author Jordy
 */
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelCarreras extends AbstractTableModel {

    private final List<Carrera> listaCarreras;

    private final String[] columnas = {"NOMBRE CARRERA", "FECHA", "LUGAR", "MAX CORREDORES"};

    public TableModelCarreras(List<Carrera> listaCarreras) {

        this.listaCarreras = listaCarreras;

    }

    /**
     * Devuelve el número de filas que tendrá nuestra tabla. Depende del tamaño
     * de la lista.
     *
     * @return listaCarreras.size
     */
    @Override
    public int getRowCount() {
        return listaCarreras.size();
    }

    /**
     * Método que devuelve el número de columnas
     *
     * @return columnas.lengh
     */
    @Override
    public int getColumnCount() { //3. cuantas columnas tengo? estan definidas arriba 
        return columnas.length;//entonces con el .lenght nos devuelve las q hay
    }

    /**
     * Devuelve la columna correspondiente al índice
     *
     * @param column
     * @return columnas[column]
     */
    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    /**
     * Método que se llama 1 vez por cada una de las celdas que tenga la tabla
     * ({"Nombre","Lugar", etc}). El núm de llamadas a este método depende de lo
     * que haya devuelto en "getRowCount" y "getColumnCount". Sacamos los datos
     * de la lista de carreras
     *
     * @param rowIndex
     * @param columnIndex
     * @return listaCarreras.get(rowIndex) (nombre, lugar, fecha, etc) y
     * listaCorredores.get(rowIndex) (dorsal, corredor, tiempo).
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {//dame el valor en la columna tal, en la fila cual

        switch (columnIndex) {
            case 0:
                return listaCarreras.get(rowIndex).getNombreCarrera();
            case 1:
                return listaCarreras.get(rowIndex).getFechaCarrera();
            case 2:
                return listaCarreras.get(rowIndex).getLugar();
            case 3:
                return listaCarreras.get(rowIndex).getNumMaxCorredores();
            /* case 4:
                return listaCarreras.get(rowIndex).getListaParticipantes().size();*/
 /* case 4:
                return listaCarreras.get(rowIndex).getListaParticipantes().get(rowIndex).getDorsal();
            case 5:
                return listaCarreras.get(rowIndex).getListaParticipantes().get(rowIndex).getCorredor();
            case 6:
                return listaCarreras.get(rowIndex).getListaParticipantes().get(rowIndex).getTiempoLlegada();*/
        }
        return null;
    }
}
