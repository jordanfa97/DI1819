/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Jordy
 */
public class Cronometro_Jordy extends javax.swing.JPanel implements Serializable {

    private InterfaceCronometro interfaceCronometro;
    private Timer timer;
    private int dorsal;
    private int tiempo;
    private int minutos = 0;
    private int segundos = 0;
    private int centesimas = 0;
    private boolean corriendo;
    private String tiempoFormateado = String.format("%02d : %02d : %02d", minutos, segundos, centesimas);

    public Cronometro_Jordy() {
        initComponents();
        jLabelCronometro.setText(tiempoFormateado);
        Font fuente = new Font("Algerian", Font.BOLD, 36);
        this.setFont(fuente);
    }

    public void start() {
        segundos = 0;
        segundos = 0;
        centesimas = 0;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                centesimas++;
                if (centesimas == 100) {
                    segundos++;
                    centesimas = 0;
                }
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                }
                if (minutos == 60) {
                    minutos = 0;
                }
                tiempoFormateado = String.format("%02d : %02d : %02d", minutos, segundos, centesimas);
                jLabelCronometro.setText(tiempoFormateado);
            }
        }, 0, 10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCronometro = new javax.swing.JLabel();
        jButtonStart = new javax.swing.JButton();
        jButtonShoot = new javax.swing.JButton();
        jButtonStop = new javax.swing.JButton();

        jLabelCronometro.setBackground(new java.awt.Color(102, 204, 255));
        jLabelCronometro.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabelCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCronometro.setBorder(new javax.swing.border.MatteBorder(null));
        jLabelCronometro.setName("numerosCrono"); // NOI18N

        jButtonStart.setText("START");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jButtonShoot.setText("SHOOT");
        jButtonShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShootActionPerformed(evt);
            }
        });

        jButtonStop.setText("STOP");
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        if (corriendo) {
            timer.cancel();
        }
        corriendo = true;
        start();
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed
        timer.cancel();
    }//GEN-LAST:event_jButtonStopActionPerformed

    private void jButtonShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShootActionPerformed
        interfaceCronometro.ejecutar(dorsal, tiempo);
    }//GEN-LAST:event_jButtonShootActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonShoot;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JLabel jLabelCronometro;
    // End of variables declaration//GEN-END:variables
}
