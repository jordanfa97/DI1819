using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppAvituallamiento.Modelo
{
    public class Persona : INotifyPropertyChanged
    {
        private String nombre;
        private String telefono;

        //constructor
        public Persona(String nombre, String telefono)
        {
            this.nombre = nombre;
            this.telefono = telefono;
        }
        public Persona() { }

        //getter y setter
        public String Nombre
        {
            get
            {
                return nombre;
            }
            set
            {
                this.nombre = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Nombre"));
            }
        }

        public String Telefono
        {
            get
            {
                return this.telefono;
            }
            set
            {
                this.telefono = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Telefono"));
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;

        //tostring
        public override string ToString()
        {
            return "Nombre: " + nombre + "\nTeléfono: " + telefono;
        }


    }
}
