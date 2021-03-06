/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author andre
 */
public class PantPrincipalAdmin extends javax.swing.JFrame {
    /**
     * Creates new form PantPrincipalAdmin
     */
    public PantPrincipalAdmin() {
        initComponents();
        Toolkit mipantalla3 = Toolkit.getDefaultToolkit();
        setSize(1017,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla3.getImage("src/proyectofinal/imagenes/preview.jpeg");
        setIconImage(Icono);
        setResizable(false);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelmodif, "src/proyectofinal/imagenes/lapizicono.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelconsultas, "src/proyectofinal/imagenes/interrogacion.png");
        
        //Objeto jPanel con color VistaColor
        jpColor jpVista = new jpColor();
        jpVista.setSize(this.getSize());
        jpVista.setVistaColor(153,206,195,0,0,0);
        jpaneladmin.add(jpVista);
        
        btnnewask.setVisible(false);
        seeAll.setVisible(false);
        modifp.setVisible(false);
        eliminapreg.setVisible(false);
        
        btnInfo.setVisible(false);
        btnPuntaje.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaneladmin = new javax.swing.JPanel();
        jLabelconsultas = new javax.swing.JLabel();
        jLabelmodif = new javax.swing.JLabel();
        btnConsultas = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        backmenu = new javax.swing.JButton();
        btnnewask = new javax.swing.JButton();
        seeAll = new javax.swing.JButton();
        modifp = new javax.swing.JButton();
        btnPuntaje = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        eliminapreg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelconsultas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelmodif.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnConsultas.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        btnConsultas.setText("Consultas");
        btnConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultasMouseClicked(evt);
            }
        });

        btnModif.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        btnModif.setText("Modificaciones");
        btnModif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifMouseClicked(evt);
            }
        });

        backmenu.setText("Regresar a Login");
        backmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmenuMouseClicked(evt);
            }
        });
        backmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backmenuActionPerformed(evt);
            }
        });

        btnnewask.setText("Nueva");
        btnnewask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnewaskMouseClicked(evt);
            }
        });

        seeAll.setText("Mostrar todo");
        seeAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seeAllMouseClicked(evt);
            }
        });

        modifp.setText("Modificar pregunta");
        modifp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifpMouseClicked(evt);
            }
        });

        btnPuntaje.setText("Puntajes");
        btnPuntaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPuntajeMouseClicked(evt);
            }
        });

        btnInfo.setText("Informacion");
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMouseClicked(evt);
            }
        });

        eliminapreg.setText("Eliminar pregunta");
        eliminapreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminapregMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneladminLayout = new javax.swing.GroupLayout(jpaneladmin);
        jpaneladmin.setLayout(jpaneladminLayout);
        jpaneladminLayout.setHorizontalGroup(
            jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneladminLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backmenu)
                    .addGroup(jpaneladminLayout.createSequentialGroup()
                        .addGroup(jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpaneladminLayout.createSequentialGroup()
                                .addComponent(jLabelmodif, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btnnewask)
                                .addGap(18, 18, 18)
                                .addComponent(seeAll)
                                .addGap(18, 18, 18)
                                .addComponent(modifp)
                                .addGap(18, 18, 18)
                                .addComponent(eliminapreg))
                            .addGroup(jpaneladminLayout.createSequentialGroup()
                                .addComponent(jLabelconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpaneladminLayout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpaneladminLayout.createSequentialGroup()
                                        .addGap(226, 226, 226)
                                        .addComponent(btnPuntaje)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnInfo)))))
                        .addGap(84, 84, 84)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaneladminLayout.createSequentialGroup()
                    .addContainerGap(361, Short.MAX_VALUE)
                    .addComponent(btnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(171, 171, 171)))
        );
        jpaneladminLayout.setVerticalGroup(
            jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneladminLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaneladminLayout.createSequentialGroup()
                        .addComponent(jLabelmodif, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaneladminLayout.createSequentialGroup()
                        .addGroup(jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnewask)
                            .addComponent(seeAll)
                            .addComponent(modifp)
                            .addComponent(eliminapreg))
                        .addGap(74, 74, 74)
                        .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPuntaje)
                            .addComponent(btnInfo))
                        .addGap(36, 36, 36)
                        .addComponent(backmenu)
                        .addGap(54, 54, 54))))
            .addGroup(jpaneladminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpaneladminLayout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(btnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaneladmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaneladmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backmenuMouseClicked
        // TODO add your handling code here:
        Menu m5 = new Menu();
        m5.setVisible(true);
        m5.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_backmenuMouseClicked

    private void btnModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifMouseClicked
        // TODO add your handling code here:
        btnnewask.setVisible(true);
        seeAll.setVisible(true);
        modifp.setVisible(true);
        eliminapreg.setVisible(true);
    }//GEN-LAST:event_btnModifMouseClicked

    private void btnnewaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewaskMouseClicked
        // TODO add your handling code here:
        CamposPreg np = new CamposPreg();
        np.setVisible(true);
        this.dispose();
           
    }//GEN-LAST:event_btnnewaskMouseClicked

    private void seeAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeAllMouseClicked
        // TODO add your handling code here:
        ConsultAll c1 = new ConsultAll();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_seeAllMouseClicked

    private void modifpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifpMouseClicked
        // TODO add your handling code here:
        Modifpreg mp1 = new Modifpreg();
        mp1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modifpMouseClicked

    private void backmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backmenuActionPerformed

    private void btnConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseClicked
        // TODO add your handling code here:
        btnInfo.setVisible(true);
        btnPuntaje.setVisible(true);
    }//GEN-LAST:event_btnConsultasMouseClicked

    private void btnPuntajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuntajeMouseClicked
        // TODO add your handling code here:
        ConsultaUsers c1 = new ConsultaUsers();
        c1.setVisible(true);
        this. dispose();
    }//GEN-LAST:event_btnPuntajeMouseClicked

    private void btnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseClicked
        // TODO add your handling code here:
        ConsultaInfoUsers ciu= new ConsultaInfoUsers();
        ciu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInfoMouseClicked

    private void eliminapregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminapregMouseClicked
        // TODO add your handling code here:
        BorraPreg bp = new BorraPreg();
        bp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eliminapregMouseClicked

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
            java.util.logging.Logger.getLogger(PantPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backmenu;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnModif;
    private javax.swing.JButton btnPuntaje;
    private javax.swing.JButton btnnewask;
    private javax.swing.JButton eliminapreg;
    private javax.swing.JLabel jLabelconsultas;
    private javax.swing.JLabel jLabelmodif;
    private javax.swing.JPanel jpaneladmin;
    private javax.swing.JButton modifp;
    private javax.swing.JButton seeAll;
    // End of variables declaration//GEN-END:variables
}
