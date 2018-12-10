/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModels;

/**
 *
 *
 * @author Jordy
 */
import Modelo.Participante;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelParticipantes extends AbstractTableModel {

    private final List<Participante> listaParticipantes;

    private final String[] columnas = {"DNI", "NOMBRE", "DORSAL", "TIEMPO LLEGADA"};

    public TableModelParticipantes(List<Participante> listaParticipantes) {

        this.listaParticipantes = listaParticipantes;

    }

    /**
     * Devuelve el número de filas que tendrá nuestra tabla. Depende del tamaño
     * de la lista.
     *
     * @return listaParticipantes.size
     */
    @Override
    public int getRowCount() { //2. devuelve cuantas filas tiene la tabla (tantas como participantes haya)
        return listaParticipantes.size();
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
     * ({"Dorsal","Corredor", etc}). El núm de llamadas a este método depende de
     * lo que haya devuelto en "getRowCount" y "getColumnCount". Sacamos los
     * datos de la lista de participantes
     *
     * @param rowIndex
     * @param columnIndex
     * @return listaParticipantes.get(rowIndex) (Dorsal, corredor y
     * tiempoLlegada) y listaParticipantes.get(rowIndex) (dorsal, corredor,
     * tiempoLlegada).
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {//dame el valor en la columna tal, en la fila cual

        switch (columnIndex) {
            case 0:
                return listaParticipantes.get(rowIndex).getDni();
            case 1:
                return listaParticipantes.get(rowIndex).getNombre();
            case 2:
                return listaParticipantes.get(rowIndex).getDorsal();
            case 3:
                return listaParticipantes.get(rowIndex).getTiempoLlegada();
        }
        return null;
    }
}
