/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestionCarrera;
import Modelo.Carrera;
import java.io.Serializable;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author Jordy
 */
public class CuestionarioAltaCarreras extends javax.swing.JDialog implements Serializable {

    /**
     * Creates new form CuestionarioAltaCarreras
     */
    private GestionCarrera gc;
    private Carrera carreraNueva;
    private Carrera carreraModificar;

    public CuestionarioAltaCarreras(java.awt.Dialog parent, boolean modal, GestionCarrera gc) {
        super(parent, modal);
        this.gc = gc;
        initComponents();
        setLocationRelativeTo(this);
        validarFormularioCarreras();
    }

    public CuestionarioAltaCarreras(java.awt.Dialog parent, boolean modal, Carrera carreraModificar) {
        super(parent, modal);
        this.carreraModificar = carreraModificar;
        initComponents();
        jTextFieldNombreCarrera.setText(this.carreraModificar.getNombreCarrera());
        jTextFieldLugar.setText(this.carreraModificar.getLugarCarrera());
        jTextFieldNumeroParticipantes.setText(Integer.toString(this.carreraModificar.getNumeroParticipantes()));
        jTextFieldPrecio.setText(Double.toString(this.carreraModificar.getPrecio()));
        jDateChooserFecha.setDate(this.carreraModificar.getFechaCarrera());
        jButtonEnviarCarreras.setEnabled(false);
        validarFormularioCarreras();
    }

    public void validarFormularioCarreras() {
        ValidationGroup group = validationPanelAltaCarrrera.getValidationGroup();
        group.add(jTextFieldNombreCarrera, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldLugar, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldNumeroParticipantes, StringValidators.REQUIRE_VALID_INTEGER);
        group.add(jTextFieldPrecio, StringValidators.REQUIRE_VALID_INTEGER);
        //group.add(jDateChooserFecha, StringValidators.);

        validationPanelAltaCarrrera.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (validationPanelAltaCarrrera.getProblem() == null) {
                    jButtonEnviarCarreras.setEnabled(true);
                } else {
                    jButtonEnviarCarreras.setEnabled(false);
                }
            }
        });
    }

    private void limpiarPantalla() {
        jTextFieldNombreCarrera.setText("");
        jTextFieldLugar.setText("");
        jTextFieldNumeroParticipantes.setText("");
        jTextFieldPrecio.setText("");
        jDateChooserFecha.setDate(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTituloCuestionarioCarreras = new javax.swing.JLabel();
        jLabelNombreCarrera = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelLugar = new javax.swing.JLabel();
        jLabelNumeroParticipantes = new javax.swing.JLabel();
        jTextFieldNombreCarrera = new javax.swing.JTextField();
        jTextFieldLugar = new javax.swing.JTextField();
        jTextFieldNumeroParticipantes = new javax.swing.JTextField();
        jButtonEnviarCarreras = new javax.swing.JButton();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        validationPanelAltaCarrrera = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabelTituloCuestionarioCarreras.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabelTituloCuestionarioCarreras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloCuestionarioCarreras.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jLabelTituloCuestionarioCarreras.text")); // NOI18N

        jLabelNombreCarrera.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabelNombreCarrera.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jLabelNombreCarrera.text")); // NOI18N

        jLabelFecha.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabelFecha.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jLabelFecha.text")); // NOI18N

        jLabelLugar.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabelLugar.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jLabelLugar.text")); // NOI18N

        jLabelNumeroParticipantes.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabelNumeroParticipantes.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jLabelNumeroParticipantes.text")); // NOI18N

        jTextFieldNombreCarrera.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jTextFieldNombreCarrera.text")); // NOI18N

        jTextFieldLugar.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jTextFieldLugar.text")); // NOI18N

        jTextFieldNumeroParticipantes.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jTextFieldNumeroParticipantes.text")); // NOI18N
        jTextFieldNumeroParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroParticipantesActionPerformed(evt);
            }
        });

        jButtonEnviarCarreras.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jButtonEnviarCarreras.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jButtonEnviarCarreras.text")); // NOI18N
        jButtonEnviarCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarCarrerasActionPerformed(evt);
            }
        });

        jTextFieldPrecio.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jTextFieldPrecio.text")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(CuestionarioAltaCarreras.class, "CuestionarioAltaCarreras.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validationPanelAltaCarrrera, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloCuestionarioCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonEnviarCarreras)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelLugar)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNombreCarrera)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelFecha)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNumeroParticipantes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumeroParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloCuestionarioCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validationPanelAltaCarrrera, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreCarrera))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFecha)
                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLugar))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroParticipantes)
                    .addComponent(jTextFieldNumeroParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButtonEnviarCarreras)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarCarrerasActionPerformed
        if (jDateChooserFecha.getDate() == null || jDateChooserFecha.getDate().before(new Date())) {
            JOptionPane.showMessageDialog(this, "La fecha no puede estar vacía  o no puede ser anterior a la de hoy", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String nombreCarrera = jTextFieldNombreCarrera.getText();
            Date fechaCarrera = jDateChooserFecha.getDate();
            String lugarCarrera = jTextFieldLugar.getText();
            int precioCarrera = Integer.valueOf(jTextFieldPrecio.getText());
            int numeroParticipantes = Integer.parseInt(jTextFieldNumeroParticipantes.getText());

            carreraNueva = new Carrera(nombreCarrera, fechaCarrera, lugarCarrera, numeroParticipantes, precioCarrera);

            if (carreraModificar == null) {
                gc.anadirCarrera(nombreCarrera, fechaCarrera, lugarCarrera, numeroParticipantes, precioCarrera);
                JOptionPane.showMessageDialog(this, "Carrera dada de alta", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                carreraModificar.setNombreCarrera(nombreCarrera);
                carreraModificar.setLugarCarrera(lugarCarrera);
                carreraModificar.setNumeroParticipantes(numeroParticipantes);
                carreraModificar.setPrecio(precioCarrera);
                carreraModificar.setFechaCarrera(fechaCarrera);
            }
            limpiarPantalla();
            dispose();
        }
    }//GEN-LAST:event_jButtonEnviarCarrerasActionPerformed

    private void jTextFieldNumeroParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroParticipantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroParticipantesActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviarCarreras;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelNombreCarrera;
    private javax.swing.JLabel jLabelNumeroParticipantes;
    private javax.swing.JLabel jLabelTituloCuestionarioCarreras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldNombreCarrera;
    private javax.swing.JTextField jTextFieldNumeroParticipantes;
    private javax.swing.JTextField jTextFieldPrecio;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanelAltaCarrrera;
    // End of variables declaration//GEN-END:variables
}