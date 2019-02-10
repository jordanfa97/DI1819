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

namespace Avituallamiento
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private LogicaNegocio logicaNegocio; 
        public MainWindow()
        {
            InitializeComponent();
            logicaNegocio = new LogicaNegocio();
            dataGrid.DataContext = logicaNegocio;
        }

        private void btnCrear_Click(object sender, RoutedEventArgs e)
        {
            PantallaProducto pantallaProducto = new PantallaProducto (logicaNegocio);
            pantallaProducto.ShowDialog();
            
        }

        private void btnPrueba_Click(object sender, RoutedEventArgs e)
        {
            Prueba prueba = new Prueba(logicaNegocio);
            prueba.ShowDialog();
        }

      

       
    }
}
