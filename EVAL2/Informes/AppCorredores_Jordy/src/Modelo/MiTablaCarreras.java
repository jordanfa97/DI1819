package Modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jordy
 */
public class MiTablaCarreras extends AbstractTableModel implements Serializable {

    private final String[] columnas = {"Nombre carrera", "Fecha", "Lugar", "Número participantes", "Precio", "Estado"};
    private List<Carrera> listaCarrerasTabla;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public MiTablaCarreras(List<Carrera> listaCarreras) {
        this.listaCarrerasTabla = listaCarreras;
    }

    @Override
    //indicamos cuantas filas va a tener la tabla que, obviamente, será el taño de la lista.
    public int getRowCount() {
        return listaCarrerasTabla.size();
    }

    @Override
    //indicamos el número de columnas que tendrá la tabla, tamaño del array que hayamos creado.
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaCarrerasTabla.get(rowIndex).getNombreCarrera();
            case 1:
                String fecha = sdf.format(listaCarrerasTabla.get(rowIndex).getFechaCarrera());
                return fecha;
            case 2:
                return listaCarrerasTabla.get(rowIndex).getLugarCarrera();
            case 3:
                return listaCarrerasTabla.get(rowIndex).getNumeroParticipantes();
            case 4:
                return listaCarrerasTabla.get(rowIndex).getPrecio();
            case 5:
                if (listaCarrerasTabla.get(rowIndex).isFinalizada()) {
                    return "Finalizada";
                }
                return "Pendiente";
        }
        return null;
    }
}
