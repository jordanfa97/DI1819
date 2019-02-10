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
        public ObservableCollection<Producto> listaProductos { get; set; }

        public LogicaNegocio()
        {
            listaProductos = new ObservableCollection<Producto>();
            
        }
        public void aniadirProducto(Producto producto)
        {
            listaProductos.Add(producto);
        }

        public void modificarProducto(Producto producto, int posicion)
        {
            listaProductos[posicion] = producto;
        }

    }
}
