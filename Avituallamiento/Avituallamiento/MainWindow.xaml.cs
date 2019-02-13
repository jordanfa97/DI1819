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
using System.Windows.Navigation;
using System.Windows.Shapes;
using Avituallamiento.Vista;
using Avituallamiento.Controlador;
using Avituallamiento.Modelo;

namespace Avituallamiento
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private LogicaNegocio logicaNegocio;
        private Producto producto;
        private PantallaProducto pantallaProducto;

        public MainWindow()
        {
            InitializeComponent();
            logicaNegocio = new LogicaNegocio();
            dataGrid.DataContext = logicaNegocio;
        }

        private void btnCrear_Click(object sender, RoutedEventArgs e)
        {
            pantallaProducto = new PantallaProducto(logicaNegocio);
            pantallaProducto.ShowDialog();

        }

        private void btnPrueba_Click(object sender, RoutedEventArgs e)
        {
            Prueba prueba = new Prueba(logicaNegocio);
            prueba.ShowDialog();
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
                Producto producto = (Producto)dataGrid.SelectedItem;//tenemos el producto seleccionado
                logicaNegocio.borrarProducto(producto);
                MessageBox.Show("Se ha borrado el producto correctamente");
            }
            else
            {
                MessageBox.Show("ERROR!! Debes seleccionar un producto");
            }
        }




    }
}
