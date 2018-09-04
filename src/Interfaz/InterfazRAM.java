/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import clases.Ram_clase;
import clases.Ventana_grafico;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.jmx.CpuTimerMBean;
import prueba.MainFrame;

/**
 *
 * @author franco
 */
public class InterfazRAM extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCpu
     */
    public InterfazRAM() throws SigarException {
        initComponents();
        Ram_clase ram = new Ram_clase();
        refresh(ram);
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
        jLabel1 = new javax.swing.JLabel();
        Volver_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total_lbl = new javax.swing.JLabel();
        libre_lbl = new javax.swing.JLabel();
        usada_lbl = new javax.swing.JLabel();
        porcentaje_lbl = new javax.swing.JLabel();
        refresh_btn = new javax.swing.JButton();
        PanelG = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 2, 24)); // NOI18N
        jLabel1.setText("RAM Info ");

        Volver_btn.setFont(new java.awt.Font("Noto Sans", 3, 24)); // NOI18N
        Volver_btn.setText("←");
        Volver_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 2, 18)); // NOI18N
        jLabel2.setText("Total:");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 2, 18)); // NOI18N
        jLabel3.setText("Free:");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 2, 18)); // NOI18N
        jLabel4.setText("Used: ");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 2, 18)); // NOI18N
        jLabel5.setText("Percentage used: ");

        total_lbl.setFont(new java.awt.Font("Noto Sans", 2, 14)); // NOI18N
        total_lbl.setText("...........................");

        libre_lbl.setFont(new java.awt.Font("Noto Sans", 2, 14)); // NOI18N
        libre_lbl.setText("...........................");

        usada_lbl.setFont(new java.awt.Font("Noto Sans", 2, 14)); // NOI18N
        usada_lbl.setText("...........................");

        porcentaje_lbl.setFont(new java.awt.Font("Noto Sans", 2, 14)); // NOI18N
        porcentaje_lbl.setText("...........................");

        refresh_btn.setFont(new java.awt.Font("Noto Sans", 2, 18)); // NOI18N
        refresh_btn.setText("Refresh");
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnRefresh_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGLayout = new javax.swing.GroupLayout(PanelG);
        PanelG.setLayout(PanelGLayout);
        PanelGLayout.setHorizontalGroup(
            PanelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        PanelGLayout.setVerticalGroup(
            PanelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(porcentaje_lbl)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(total_lbl)
                                    .addComponent(usada_lbl)
                                    .addComponent(libre_lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(PanelG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Volver_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Volver_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(total_lbl))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(libre_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usada_lbl)
                            .addComponent(jLabel4))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(porcentaje_lbl))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Volver_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_btnActionPerformed
        // TODO add your handling code here:
        MainFrame main = new MainFrame();
        this.setVisible(false);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Volver_btnActionPerformed

    private void refresh_btnRefresh_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnRefresh_ActionPerformed
        // TODO add your handling code here:
        refresh(new Ram_clase());
    }//GEN-LAST:event_refresh_btnRefresh_ActionPerformed

    private void refresh(Ram_clase ram){
        double porcentaje = (ram.getPorcentaje_usado());
        PanelG.add(new Ventana_grafico("usado","libre", (float) porcentaje , "RAM"));
        
        total_lbl.setText(ram.getTotal());
        libre_lbl.setText(ram.getLibre());
        //String cores = Integer.toString(Cpu_clase.getCores());
        usada_lbl.setText(ram.getUsada());
        porcentaje_lbl.setText(ram.getPorcentaje_usado() + "%");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazRAM().setVisible(true);
                } catch (SigarException ex) {
                    Logger.getLogger(InterfazRAM.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelG;
    private javax.swing.JButton Volver_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel libre_lbl;
    private javax.swing.JLabel porcentaje_lbl;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JLabel total_lbl;
    private javax.swing.JLabel usada_lbl;
    // End of variables declaration//GEN-END:variables
}
