using AppAvituallamiento.Controlador;
using AppAvituallamiento.Modelo;
using System;
using System.Collections.Generic;
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
    /// Lógica de interacción para PantallaAvituallamiento.xaml
    /// </summary>
    public partial class PantallaAvituallamiento : Window
    {
        private Avituallamiento avituallamiento { get; set; }
        private LogicaNegocio logicaNegocio;
        private Producto producto { get; set; }
        private Persona persona { get; set; }
        private PantallaProducto pantallaProducto;

        public PantallaAvituallamiento(LogicaNegocio logicaNegocio)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            this.persona = new Persona();
            this.avituallamiento = new Avituallamiento();
            dataGrid.DataContext = logicaNegocio;
            tbNombre.DataContext = persona;
            tbTelefono.DataContext = persona;
            tbKilometro.DataContext = avituallamiento;
            tbNombre.DataContext = avituallamiento;
            // this.DataContext = this;
        }
        private void btnCrear_Click(object sender, RoutedEventArgs e)
        {
            pantallaProducto = new PantallaProducto(logicaNegocio);
            pantallaProducto.ShowDialog();

        }



        private void btnModificar_Click(object sender, RoutedEventArgs e)
        {
            //vamos a recoger el elemnto que seleccionamos en el datagrid
            if (dataGrid.SelectedIndex != -1)
            {
                producto = (Producto)dataGrid.SelectedItem;//seleccionamos el producto
                pantallaProducto = new PantallaProducto(logicaNegocio, (Producto)producto.Clone(), dataGrid.SelectedIndex);//le pasamos el producto CLONADO y la posicion
                pantallaProducto.ShowDialog();                                            //hay que castearlo pk clone devuelve object

            }
            else
            {
                MessageBox.Show("ERROR!! Debes seleccionar un producto");
            }
        }

        private void btnCerrar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void btnEliminar_Click(object sender, RoutedEventArgs e)
        {
            if (dataGrid.SelectedIndex != -1)
            {
                producto = (Producto)dataGrid.SelectedItem;//tenemos el producto seleccionado
                logicaNegocio.borrarProducto(producto);
                MessageBox.Show("Se ha borrado el producto correctamente");
            }
            else
            {
                MessageBox.Show("ERROR!! Debes seleccionar un producto");
            }
        }

        private void btnCrear1_Click(object sender, RoutedEventArgs e)
        {
            if (dataGrid.SelectedIndex != -1)
            {
                avituallamiento.listaProductos = logicaNegocio.listaProductos;
                logicaNegocio.listaAvituallamientos.Add(avituallamiento);
                MessageBox.Show("Se ha creado correctamente");
            }
            else
            {
                MessageBox.Show("ERROR!! Debes seleccionar un producto");
            }
        }
    }
}
