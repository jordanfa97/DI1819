using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppAvituallamiento.Modelo
{
    public class Carrera
    {
        public String Nombre { get; set; }
        public ObservableCollection<Avituallamiento> ListaAvituallamientos { get; set; }

        public Carrera()
        {
            ListaAvituallamientos = new ObservableCollection<Avituallamiento>();
        }

        public Carrera(String nombre)
        {
            this.Nombre = nombre;
            ListaAvituallamientos = new ObservableCollection<Avituallamiento>();
        }
       

        public override string ToString()
        {
            return Nombre;
        }
    }
}
