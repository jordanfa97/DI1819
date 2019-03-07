using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppAvituallamiento.Modelo
{
    public class Avituallamiento : INotifyPropertyChanged, ICloneable
    {

        private String nombreCarrera;
        private int km;
        private Persona personaContacto;
        public ObservableCollection<Producto> listaProductos { get; set; }


        //constructor
        public Avituallamiento(String nombreCarrera, int km, Persona personaContacto)
        {
            this.nombreCarrera = nombreCarrera;
            this.km = km;
            this.personaContacto = personaContacto;
            this.listaProductos = new ObservableCollection<Producto>();
        }
        public Avituallamiento() { }

        //getter y setter
        public String NombreCarrera
        {
            get
            {
                return nombreCarrera;
            }
            set
            {
                this.nombreCarrera = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("NombreCarrera"));
            }
        }
        public int Km
        {
            get
            {
                return km;
            }
            set
            {
                this.km = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Km"));
            }
        }
        public Persona PersonaContacto
        {
            get
            {
                return personaContacto;
            }
            set
            {
                this.personaContacto = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("PersonaContacto"));
            }
        }
        public ObservableCollection<Producto> ListaProductos { get; set; }


        //tostring
        public override string ToString()
        {

            return "Nombre Carrera: " + nombreCarrera + "\nPunto kilométrico: " + km + "\nPersona de contacto: " + personaContacto + "\nProductos: " + listaProductos;
        }

        public event PropertyChangedEventHandler PropertyChanged;

        public object Clone()
        {
            return this.MemberwiseClone();
        }

    }
}
