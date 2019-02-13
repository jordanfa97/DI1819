using Avituallamiento.Modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Avituallamiento.Controlador
{
    public class LogicaNegocio
    {
        //La lista debe ser observable para que se aprecien los cambios en listas, combos, etc
        public ObservableCollection<Producto> listaProductos { get; set; }

        public LogicaNegocio()
        {
            listaProductos = new ObservableCollection<Producto>();

        }
        public void aniadirProducto(Producto producto)
        {
            listaProductos.Add(producto);
        }

        //Hay que pasarle el producto y la posicion en la lista
        public void modificarProducto(Producto producto, int posicion)
        {
            listaProductos[posicion] = producto;
        }

        public void borrarProducto(Producto producto)
        {
            listaProductos.Remove(producto);
        }

    }
}
