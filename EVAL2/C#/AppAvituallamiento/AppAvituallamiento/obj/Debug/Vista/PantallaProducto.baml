   M S B A M L   `   `   `  ����  AppAvituallamiento/    )AppAvituallamiento.Vista.PantallaProducto   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  PantallaProducto��5   	   $	��363��6"   $	��457��6/   .��5      �  J� RenderTransformOrigin$ 	0.49,0.49&�6   $��	10,0,12,9q�6-    � RowDefinitions 5   
   �� 5       � ColumnDefinitions 5	   
   �� 5
      .+�5   
   �� -   5         ��Name$ labelProducto��5      $��Producto��6'   $
��Left=�6:   $��
129,20,0,0q�6U   $	��Top=�6i   $��24(�6�   $��Stencil)�6�   �� 5   
   -   5        $ labelNombre��5      $��Nombre��6%   $
��Left=�66   $��	10,78,0,0q�6Q   $	��Top=�6d   $��76��6|   $ 0.539,0.731&�6�   �� 5   
   -   5        $ labelPrecio��5      $��Precio��6%   $
��Left=�66   $��
10,145,0,0q�6Q   $	��Top=�6e   $��76��6}   �� 5   
   -   5        $ 	labelTipo��5      $
��Tipo��6#   $
��Left=�62   $��
10,207,0,0q�6M   $	��Top=�6a   $��86��6y   �� 5   
   -   5         ��Name$ 
btnAceptar��5      $��Aceptar��6%   $
��Left=�67   $��344,291,0,0q�6R   $	��Top=�6g   $��75��6   6�   �� 5   
   -   5         ��Name$ tbNombre��5      $
��Left=�5   r   $��23��6�   $��
273,81,0,0q�6�    �� TextWrapping$
 Wrap=�6�   $	��Top=�6�   $	��146��6�   ��6   ��  �� Path$ producto.Nombre�	 �� NotifyOnValidationError	 . 
 �� ValidatesOnDataErrors
 . 6�   �� 5   
   -   5        $ tbPrecio��5      $
��Left=�5   r   $��23��6�   $��273,145,0,0q�6�   $
 Wrap=�6�   $	��Top=�6�   $	��146��6�   ��6   �� $ producto.Precio�	 . 
 . 6�   �� 5   
   -   5         ��Name$ comboTipoMaterial��5      $
��Left=�5   }   $��273,207,0,0q�6�   $	��Top=�6�   $	��146��6�   ��5   R   �� $ listaMateriales� �� SelectedItem 5      �� $ producto.Material�	 . 
 . 6�   �� 5   
   -	   5        $ btnCancelar��5      $��Cancelar��6&   $
��Left=�69   $��235,291,0,0q�6T   $	��Top=�6i   $��85��6�   6�   5      5      