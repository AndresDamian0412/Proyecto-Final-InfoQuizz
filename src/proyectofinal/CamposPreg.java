/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class CamposPreg extends javax.swing.JFrame {

    /**
     * Creates new form CamposPreg
     */
    public CamposPreg() {
        initComponents();
        Toolkit mipantalla4 = Toolkit.getDefaultToolkit();
        setSize(1017,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla4.getImage("src/proyectofinal/imagenes/preview.jpeg");
        setIconImage(Icono);
        setResizable(false);
        
        //Objeto jPanel con color VistaColor
        jpColor jpVista5 = new jpColor();
        jpVista5.setSize(this.getSize());
        jpVista5.setVistaColor(153,206,195,0,0,0);
        panelform.add(jpVista5);
        
        btnhecho.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelform = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbltema = new javax.swing.JLabel();
        temapreg = new javax.swing.JTextField();
        lblsubt = new javax.swing.JLabel();
        subtemapreg = new javax.swing.JTextField();
        lblPreg = new javax.swing.JLabel();
        lblres1 = new javax.swing.JLabel();
        res1 = new javax.swing.JTextField();
        lblres2 = new javax.swing.JLabel();
        res2 = new javax.swing.JTextField();
        lblres3 = new javax.swing.JLabel();
        res3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkres1 = new javax.swing.JCheckBox();
        checkres2 = new javax.swing.JCheckBox();
        checkres3 = new javax.swing.JCheckBox();
        cancel = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        preg = new javax.swing.JTextField();
        btnhecho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 206, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.lightGray));

        lbltema.setBackground(new java.awt.Color(197, 206, 213));
        lbltema.setForeground(new java.awt.Color(0, 0, 0));
        lbltema.setText("Tema");
        lbltema.setAutoscrolls(true);
        lbltema.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        temapreg.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        temapreg.setText("INGRESE EL TEMA AL CUAL PERTENECE LA PREGUNTA");
        temapreg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                temapregFocusGained(evt);
            }
        });

        lblsubt.setBackground(new java.awt.Color(197, 206, 213));
        lblsubt.setForeground(new java.awt.Color(0, 0, 0));
        lblsubt.setText("Subtema");
        lblsubt.setAutoscrolls(true);
        lblsubt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        subtemapreg.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        subtemapreg.setText("INGRESE EL SUBTEMA DE LA PREGUNTA");
        subtemapreg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                subtemapregFocusGained(evt);
            }
        });

        lblPreg.setBackground(new java.awt.Color(197, 206, 213));
        lblPreg.setForeground(new java.awt.Color(0, 0, 0));
        lblPreg.setText("Pregunta");
        lblPreg.setAutoscrolls(true);
        lblPreg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblres1.setBackground(new java.awt.Color(197, 206, 213));
        lblres1.setForeground(new java.awt.Color(0, 0, 0));
        lblres1.setText("Respuesta 1");
        lblres1.setAutoscrolls(true);
        lblres1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        res1.setText("INGRESE INCISO");
        res1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                res1FocusGained(evt);
            }
        });
        res1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res1ActionPerformed(evt);
            }
        });

        lblres2.setBackground(new java.awt.Color(197, 206, 213));
        lblres2.setForeground(new java.awt.Color(0, 0, 0));
        lblres2.setText("Respuesta 2");
        lblres2.setAutoscrolls(true);
        lblres2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        res2.setText("INGRESE INCISO");
        res2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                res2FocusGained(evt);
            }
        });

        lblres3.setBackground(new java.awt.Color(197, 206, 213));
        lblres3.setForeground(new java.awt.Color(0, 0, 0));
        lblres3.setText("Respuesta 3");
        lblres3.setAutoscrolls(true);
        lblres3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        res3.setText("INGRESE INCISO");
        res3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                res3FocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESE LOS DATOS CORRESPONDIENTES A SU NUEVA PREGUNTA ;)");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Marque únicamente la respuesta correcta*");

        cancel.setText("Cancelar");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        Save.setText("Guardar");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        preg.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        preg.setText("INGRESE LA PREGUNTA");
        preg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pregFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(preg);

        btnhecho.setText("Hecho");
        btnhecho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhechoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblres3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(res3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblres2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(res2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblres1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(res1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkres1)
                                    .addComponent(checkres2)
                                    .addComponent(checkres3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnhecho)
                                .addGap(18, 18, 18)
                                .addComponent(cancel)
                                .addGap(18, 18, 18)
                                .addComponent(Save)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbltema, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)
                                    .addComponent(temapreg, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblsubt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)
                                    .addComponent(subtemapreg, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(217, 217, 217)
                                        .addComponent(jScrollPane2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(485, 485, 485)))))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbltema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(temapreg, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblsubt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subtemapreg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblres1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkres1)
                    .addComponent(res1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblres2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(res2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkres2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblres3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(res3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkres3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(Save)
                    .addComponent(btnhecho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelformLayout = new javax.swing.GroupLayout(panelform);
        panelform.setLayout(panelformLayout);
        panelformLayout.setHorizontalGroup(
            panelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelformLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        panelformLayout.setVerticalGroup(
            panelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelformLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void res1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res1ActionPerformed

    private void temapregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_temapregFocusGained
        // TODO add your handling code here:
        temapreg.selectAll();
    }//GEN-LAST:event_temapregFocusGained

    private void subtemapregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subtemapregFocusGained
        // TODO add your handling code here:
        subtemapreg.selectAll();
    }//GEN-LAST:event_subtemapregFocusGained

    private void pregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pregFocusGained
        // TODO add your handling code here:
        preg.selectAll();
    }//GEN-LAST:event_pregFocusGained

    private void res1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_res1FocusGained
        // TODO add your handling code here:
        res1.selectAll();
    }//GEN-LAST:event_res1FocusGained

    private void res2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_res2FocusGained
        // TODO add your handling code here:
        res2.selectAll();
    }//GEN-LAST:event_res2FocusGained

    private void res3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_res3FocusGained
        // TODO add your handling code here:
        res3.selectAll();
    }//GEN-LAST:event_res3FocusGained

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
        PantPrincipalAdmin p3 = new PantPrincipalAdmin();
        p3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        String tema = temapreg.getText().trim();
        if(tema.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha ingresado el tema de la pregunta"); 
            return;
        }
        String subtema = subtemapreg.getText().trim();
        if(subtema.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha ingresado el subtema de la pregunta");
            return;
        }
        String prg = preg.getText().trim();
        if(prg.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha ingresado el cuerpo de la pregunta");
            return;
        }
        String r1 = res1.getText();
        if(r1.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha ingresado el inciso");
            return;
        }
        String r2 = res2.getText();
        if(r2.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha ingresado el inciso");
            return;
        }
        String r3 = res3.getText();
        if(r3.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha ingresado el inciso");
            return;
        }
        boolean bres1 = checkres1.isSelected();
        boolean bres2 = checkres2.isSelected();
        boolean bres3 = checkres3.isSelected();
        if(bres1 == false && bres2 == false &&bres3==false){
            JOptionPane.showMessageDialog(null, "No ha marcado la casilla de la pregunta correcta");
            return;
        }
        try{
            AccesoAleatorioP.creaArchPreg(new File ("Preguntas.dat"));
            AccesoAleatorioP.añadePreg(new Pregunta(tema,subtema,prg,r1,bres1,r2,bres2,r3,bres3));
            AccesoAleatorioP.cierraflujo();
            JOptionPane.showMessageDialog(null, "¡Pregunta agregada correctamente!");
            btnhecho.setVisible(true);
        }catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void btnhechoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhechoMouseClicked
        // TODO add your handling code here:
        PantPrincipalAdmin p4 = new PantPrincipalAdmin();
        p4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnhechoMouseClicked

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
            java.util.logging.Logger.getLogger(CamposPreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CamposPreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CamposPreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CamposPreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CamposPreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton btnhecho;
    private javax.swing.JButton cancel;
    private javax.swing.JCheckBox checkres1;
    private javax.swing.JCheckBox checkres2;
    private javax.swing.JCheckBox checkres3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPreg;
    private javax.swing.JLabel lblres1;
    private javax.swing.JLabel lblres2;
    private javax.swing.JLabel lblres3;
    private javax.swing.JLabel lblsubt;
    private javax.swing.JLabel lbltema;
    private javax.swing.JPanel panelform;
    private javax.swing.JTextField preg;
    private javax.swing.JTextField res1;
    private javax.swing.JTextField res2;
    private javax.swing.JTextField res3;
    private javax.swing.JTextField subtemapreg;
    private javax.swing.JTextField temapreg;
    // End of variables declaration//GEN-END:variables
}
