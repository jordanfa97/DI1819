/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.*;

/**
 *
 * @author Jordy
 */
public class LookAndFeel extends javax.swing.JDialog {

    public LookAndFeel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //Cambiar apariencia (Look and Feel)
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        //recorremos los distintos laf del combo y nos devuelve su nombre
        for (UIManager.LookAndFeelInfo lfi : UIManager.getInstalledLookAndFeels()) {
            dcm.addElement(lfi.getName());
        }
        jComboBoxLookAndFeel.setModel(dcm);//para que rellene el combo de todos los looksandfeels que hay disponibles en el sitema
        this.setLocationRelativeTo(null);
        setTitle("Look And Feel");
        this.setSize(641, 300);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLook = new javax.swing.JPanel();
        jComboBoxLookAndFeel = new javax.swing.JComboBox<>();
        jLabelSeleccionLookAndFeel = new javax.swing.JLabel();
        jLabelImagenIcono = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxLookAndFeel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLookAndFeelActionPerformed(evt);
            }
        });

        jLabelSeleccionLookAndFeel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSeleccionLookAndFeel.setText(org.openide.util.NbBundle.getMessage(LookAndFeel.class, "LookAndFeel.SeleccionLookAndFeel.text")); // NOI18N
        jLabelSeleccionLookAndFeel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSeleccionLookAndFeel.setName("SeleccionLookAndFeel"); // NOI18N

        jLabelImagenIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/look-n-feel-icon.png"))); // NOI18N
        jLabelImagenIcono.setText(org.openide.util.NbBundle.getMessage(LookAndFeel.class, "LookAndFeel.jLabelImagenIcono.text")); // NOI18N

        jButtonAceptar.setText(org.openide.util.NbBundle.getMessage(LookAndFeel.class, "LookAndFeel.jButtonAceptar.text")); // NOI18N
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLookLayout = new javax.swing.GroupLayout(jPanelLook);
        jPanelLook.setLayout(jPanelLookLayout);
        jPanelLookLayout.setHorizontalGroup(
            jPanelLookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLookLayout.createSequentialGroup()
                .addGroup(jPanelLookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLookLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAceptar))
                    .addGroup(jPanelLookLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabelImagenIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74)
                        .addGroup(jPanelLookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxLookAndFeel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSeleccionLookAndFeel, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))))
                .addGap(74, 74, 74))
        );
        jPanelLookLayout.setVerticalGroup(
            jPanelLookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLookLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelLookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagenIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addGroup(jPanelLookLayout.createSequentialGroup()
                        .addComponent(jLabelSeleccionLookAndFeel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(jComboBoxLookAndFeel)
                        .addGap(30, 30, 30)))
                .addGap(26, 26, 26)
                .addComponent(jButtonAceptar)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Cambiar apariencia (Look and Feel)
     *
     * @param evt
     */
    private void jComboBoxLookAndFeelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLookAndFeelActionPerformed
        try {
            //seleccionamos el laf por indice del array del combo
            UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[jComboBoxLookAndFeel.getSelectedIndex()].getClassName());
            SwingUtilities.updateComponentTreeUI(this);//para que se carguen los laf en las demas pantallas
            SwingUtilities.updateComponentTreeUI(this.getParent());//Para que se carguen los laf en la pantalla principal

        } catch (Throwable e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error estableciendo Look And Feel");
        }


    }//GEN-LAST:event_jComboBoxLookAndFeelActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JComboBox<String> jComboBoxLookAndFeel;
    private javax.swing.JLabel jLabelImagenIcono;
    private javax.swing.JLabel jLabelSeleccionLookAndFeel;
    private javax.swing.JPanel jPanelLook;
    // End of variables declaration//GEN-END:variables
}
