using AppAvituallamiento.Controlador;
using AppAvituallamiento.Vista;
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

namespace AppAvituallamiento
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private LogicaNegocio logicaNegocio;
        private PantallaAvituallamiento pantallaAvituallamiento;
        private PantallaCarrera pantallaCarrera;

        public MainWindow()
        {
            InitializeComponent();
            logicaNegocio = new LogicaNegocio();
        }

        private void btnAvituallamiento_Click(object sender, RoutedEventArgs e)
        {
            pantallaAvituallamiento = new PantallaAvituallamiento(logicaNegocio);
            pantallaAvituallamiento.ShowDialog();
        }

        private void btnSalir_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void btnCarrera_Click(object sender, RoutedEventArgs e)
        {
            pantallaCarrera = new PantallaCarrera(logicaNegocio);
            pantallaCarrera.ShowDialog();
        }
    }
}
