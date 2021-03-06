﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppAvituallamiento.Modelo
{
    public class Producto : INotifyPropertyChanged, ICloneable, IDataErrorInfo
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
                this.material = value;
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

        //si se produce un cambio en los objetos deben de avisar los objetos que hubo un cambio en ellos con éste evento
        public event PropertyChangedEventHandler PropertyChanged;



        public object Clone()
        {
            return this.MemberwiseClone();  //devolvemos un clon del objeto pero seran dos objetos diferentes
        }

        public string this[string columnName]
        {
            get
            {
                string resultado = "";

                if (columnName == "Nombre")
                {
                    if (string.IsNullOrEmpty(nombre))
                    {
                        resultado = "Nombre vacío";
                    }
                }
                if (columnName == "Precio")
                {
                    if ((precio == 0) && (precio > 0))
                    {
                        resultado = "El precio tiene que ser mayor que 0";
                    }
                }
               
                if (columnName == "Material")
                {
                    if (string.IsNullOrEmpty(material))
                    {
                        resultado = "Tipo vacío";
                    }
                }
                return resultado;
            }
        }


        public string Error
        {
            get { return ""; }
        }
    }
}
