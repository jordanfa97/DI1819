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
using Avituallamiento.Controlador;
using Avituallamiento.Modelo;
using System.Collections.ObjectModel;
namespace Avituallamiento
{
    /// <summary>
    /// Lógica de interacción para Prueba.xaml
    /// </summary>
    public partial class Prueba : Window
    {
        public Producto producto { get; set; }
        public ObservableCollection<String> tipoMaterial { get; set; }
        private LogicaNegocio logicaNegocio;
        public Prueba(LogicaNegocio logicaNegocio)
        {
            InitializeComponent();
            tipoMaterial = new ObservableCollection<string>();
            tipoMaterial.Add("comida");
            tipoMaterial.Add("bebida");
            tipoMaterial.Add("material sanitario");
            this.logicaNegocio = logicaNegocio;
            producto = new Producto();
            this.DataContext = this;

        }

        private void btnCrear_Click(object sender, RoutedEventArgs e)
        {
            logicaNegocio.aniadirProducto(producto);
            this.Close();
        }
    }
}
