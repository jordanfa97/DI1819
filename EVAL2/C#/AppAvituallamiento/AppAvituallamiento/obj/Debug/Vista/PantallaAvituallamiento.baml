   M S B A M L   `   `   `  ����  AppAvituallamiento6    0AppAvituallamiento.Vista.PantallaAvituallamiento   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  PantallaAvituallamiento��5   	   $	��577��6)   $	��548��66   .��5      � -   5         �Name$
 grid��5      $��	0,0,11,11q�6   .+�5   
   �� -   5         ��Name$ labelCarrera��5      $��Carrera��6&   $
��Left=�68   $��
10,144,0,0q�6S   $	��Top=�6g   $��92��6   �� 5   
   -   5        $ labelPersona��5      $��Persona de contacto:��6&   $
��Left=�6E   $��	10,56,0,0q�6`   $	��Top=�6s   $	��131��6�   �� 5   
   -   5        $ labelKilometro��5      $��	Kilometro��6(   $
��Left=�6<   $��
10,196,0,0q�6W   $	��Top=�6k   $��92��6�   �� 5	   
   -   5         ��Name$ 	tbCarrera��5	      $
��Left=�6%   $��23��6t   $��131,147,0,0q�6�    �� TextWrapping$
 Wrap=�6�   $	��Top=�6�   $	��387��6�   ��6@   ��  �� Path$# avituallamiento.NombreCarrera�6�   �� 5
   
   -   5        $ tbKilometro��5
      $
��Left=�6'   $��23��6B   $��131,199,0,0q�6N   $
 Wrap=�6c   $	��Top=�6�   $	��140��6�   ��6w   �� $ avituallamiento.Km�6�   �� 5   
   -   5        $ tbNombre��5      $
��Left=�6%   $��23��6e   $��
131,99,0,0q�6q   $
 Wrap=�6�   $	��Top=�6�   $	��140��6�    J� RenderTransformOrigin$ 0.509,-0.087&�6�   ��6@   �� $ persona.Nombre�6�   �� 5   
   -   5        $ labelTitulo��5      $��AVITUALLAMIENTO��6%   $��Center=�6?   $��184,10,174,0q�6\   $	��Top=�6r    � Cursor$ No��6�   $��18(�6�   $��Stencil)�6�   $	��170��6�   �� 5   
   -	   5        $ labelNombre��5      $��Nombre��6%   $
��Left=�66   $��	10,96,0,0q�6Q   $	��Top=�6d   $��92��6|   �� 5   
   -
   5        $ labelTelefono��5      $��Telefono��6'   $
��Left=�6:   $��
309,99,0,0q�6U   $	��Top=�6i   �� 5   
   -   5        $ 
tbTelefono��5      $
��Left=�6M   $��23��6h   $��
398,99,0,0q�6t   $
 Wrap=�6�   $	��Top=�6�   $	��120��6�   ��6&   �� $ persona.Telefono�6�   �� 5   
   -   5         ��Name$ btnCrear��5      $��Crear producto��6#   $
��Left=�6<   $��430,498,0,0q�6W   $	��Top=�6l   $��88��6�   6�   &   System.Windows.Controls.DataGrid  5   
   -   5        	  Name$	 dataGrid��5      $��10,275,10,0q�6Q   $	��Top=�6f   $	��218��6~   
   AutoGenerateColumns
 .     
IsReadOnly . ��6%   �� $ listaProductos�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 65   �� *Nombre+  5      $ Material��6%    67   �� *
Material+  5      $ Precio��6%    65   �� *Precio+5      �� 5   
   -   5        $ labelMaterial��5      $��Material disp:��6'   $
��Left=�6@   $��
10,244,0,0q�6[   $	��Top=�6o   $��92��6�   �� 5   
   -   5        $ btnModificar��5      $��	Modificar��6'   $
��Left=�6;   $��343,498,0,0q�6V   $	��Top=�6k   $��69��6�   6�   �� 5   
   -   5        $ btnEliminar��5      $��Eliminar��6&   $
��Left=�69   $��242,498,0,0q�6T   $	��Top=�6i   $��75��6�   $ 
1.467,1.35&�6�   6�   �� 5   
   -   5        $ 	btnCerrar��5      $��Cerrar��6$   $
��Left=�65   $��
10,498,0,0q�6P   $	��Top=�6d   $��75��6|   6�   �� 5   
   -   5        $ 	btnCrear1��5      $��Crear��6$   $
��Left=�64   $��131,498,0,0q�6O   $	��Top=�6d   $��75��6|   6�   5      5      