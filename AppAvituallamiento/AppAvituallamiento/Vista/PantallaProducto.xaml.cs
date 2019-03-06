using AppAvituallamiento.Controlador;
using AppAvituallamiento.Modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace AppAvituallamiento.Vista
{
    /// <summary>
    /// Lógica de interacción para PantallaProducto.xaml
    /// </summary>
    public partial class PantallaProducto : Window
    {
        public Producto producto { get; set; }
        private LogicaNegocio logicaNegocio;
        public ObservableCollection<String> listaMateriales { get; set; }
        private int posicion;
        private Boolean modificar;

        //constructor para crear producto
        public PantallaProducto(LogicaNegocio LogicaNegocio)
        {
            InitializeComponent();
            this.logicaNegocio = LogicaNegocio;
            listaMateriales = new ObservableCollection<string>();
            listaMateriales.Add("comida");
            listaMateriales.Add("bebida");
            listaMateriales.Add("material sanitario");
            producto = new Producto();
            this.DataContext = this;
            modificar = false;
        }

        //Constructor para modificar producto
        public PantallaProducto(LogicaNegocio logicaNegocio, Producto productoModificar, int posicion)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            this.producto = productoModificar;
            this.posicion = posicion;
            listaMateriales = new ObservableCollection<string>();
            listaMateriales.Add("Comida");
            listaMateriales.Add("Bebida");
            listaMateriales.Add("Material sanitario");
            this.DataContext = this;
            modificar = true;

        }


        private void btnAceptar_Click(object sender, RoutedEventArgs e)
        {
            if (modificar)
            {
                logicaNegocio.modificarProducto(producto, posicion);
            }
            else
            {
                logicaNegocio.aniadirProducto(producto);
                MessageBox.Show("Producto añadido");

            }
            this.Close();
        }

        private void btnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
