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
    /// Lógica de interacción para PantallaCarrera.xaml
    /// </summary>
    public partial class PantallaCarrera : Window
    {
        private LogicaNegocio logicaNegocio;
        private Carrera carrera { get; set; }
        private Avituallamiento avituallamiento { get; set; }

        public PantallaCarrera(LogicaNegocio logicaNegocio)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            dataGridAvituallamiento.DataContext =logicaNegocio;
         
        }
    }
}
