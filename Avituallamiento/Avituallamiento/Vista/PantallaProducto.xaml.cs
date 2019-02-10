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
using Avituallamiento.Modelo;
using System.Collections.ObjectModel;
using Avituallamiento.Controlador;
namespace Avituallamiento.Vista
{
    /// <summary>
    /// Lógica de interacción para PantallaProducto.xaml
    /// </summary>
    public partial class PantallaProducto : Window
    {
        public Producto producto { get; set; }
        private LogicaNegocio logicaNegocio;
        public ObservableCollection<String> tipoMaterial { get; set; }

        public PantallaProducto(LogicaNegocio LogicaNegocio)
        {
            InitializeComponent();
            this.logicaNegocio = LogicaNegocio;
            tipoMaterial = new ObservableCollection<string>();
            tipoMaterial.Add("comida");
            tipoMaterial.Add("bebida");
            tipoMaterial.Add("material sanitario");
            producto=new Producto();
            this.DataContext = this;
           
        }

        private void btnAceptar_Click(object sender, RoutedEventArgs e)
        {

            logicaNegocio.aniadirProducto(producto);
            MessageBox.Show("Producto añadido");
            this.Close();
        }

        private void btnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
