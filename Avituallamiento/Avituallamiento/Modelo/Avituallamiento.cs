using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Avituallamiento.Modelo
{
   public class Avituallamiento
    {

        private String nombreCarrera;
        private int km;
        private Persona personaContacto;
        private List<Producto> listaProductos;


        //constructor
        public Avituallamiento(String nombreCarrera, int km, Persona personaContacto)
        {
            this.nombreCarrera = nombreCarrera;
            this.km = km;
            this.personaContacto = personaContacto;
            this.listaProductos = new List<Producto>();
        }

        //getter y setter
        public String NombreCarrera { get; set; }
        public int Km { get; set; }
        public Persona PersonaContacto { get; set; }
        public List<Producto> ListaProductos { get; set; }


        //tostring
        public override string ToString()
        {

            return "Nombre Carrera: " + nombreCarrera + "\nPunto kilométrico: " + km + "\nPersona de contacto: " + personaContacto + "\nProductos: " + listaProductos;
        }
    }
}
