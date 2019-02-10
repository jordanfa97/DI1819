using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Avituallamiento.Modelo
{
    public class Producto : INotifyPropertyChanged
    {
        private String nombre;
        private String material;
        private double precio;

        //constructores
        public Producto()
        { }

        public Producto(String nombre, String material, double precio)
        {
            this.nombre = nombre;
            this.material = material;
            this.precio = precio;
        }

        //getter y setter
        public String Nombre
        {
            get
            {
                return this.nombre;
            }
            set
            {
                this.nombre = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Nombre"));
            }
        }

        public String Material
        {
            get
            {
                return this.material;
            }
            set
            {
                this.material= value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Material"));
            }
        }

        public double Precio
        {
            get
            {
                return this.precio;
            }
            set
            {
                this.precio = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Precio"));
            }
        }
        //tostring
        public override string ToString()
        {
            return "Nombre: " + Nombre + "\nTipo material: " + Material + "\nPrecio: " + Precio;
        }


        public event PropertyChangedEventHandler PropertyChanged;
    }
}
