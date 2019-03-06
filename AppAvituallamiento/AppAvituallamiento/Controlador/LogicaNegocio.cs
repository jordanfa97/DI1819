using AppAvituallamiento.Modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppAvituallamiento.Controlador
{
    public class LogicaNegocio
    {
        //La lista debe ser observable para que se aprecien los cambios en listas, combos, etc
        public ObservableCollection<Producto> listaProductos { get; set; }
        public ObservableCollection<Carrera> listaCarreras { get; set; }
        public ObservableCollection<Avituallamiento> listaAvituallamientos { get; set; }

        public LogicaNegocio()
        {
            listaProductos = new ObservableCollection<Producto>();
            listaProductos.Add(new Producto("pruebaP","kj",23));
            listaCarreras = new ObservableCollection<Carrera>();
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
            listaAvituallamientos.Add(new Avituallamiento("pepe",5,new Persona("prueba","iu")));
            listaAvituallamientos.Add(new Avituallamiento("pepa", 5, new Persona("prueba", "iu")));
        }

        public void aniadirCarrera(Carrera carrera)
        {
            listaCarreras.Add(carrera);
        }

        public void aniadirProducto(Producto producto)
        {
            listaProductos.Add(producto);
        }
        public void aniadirAvituallamiento(Avituallamiento avituallamiento)
        {
            listaAvituallamientos.Add(avituallamiento);
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
