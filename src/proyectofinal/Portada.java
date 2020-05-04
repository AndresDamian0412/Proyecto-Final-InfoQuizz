package proyectofinal;

import java.awt.Image;
import java.awt.Toolkit;

public class Portada extends javax.swing.JFrame {

    public Portada() {
        initComponents();
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        setSize(1070,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla.getImage("src/proyectofinal/imagenes/preview.jpeg");
        setIconImage(Icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulotec = new javax.swing.JLabel();
        logotecnm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titulocampus = new javax.swing.JLabel();
        lema = new javax.swing.JLabel();
        botonmenu = new javax.swing.JButton();
        nomproyecto = new javax.swing.JLabel();
        autor1 = new javax.swing.JLabel();
        autor3 = new javax.swing.JLabel();
        autor2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Archivero");
        setBackground(new java.awt.Color(131, 220, 131));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titulotec.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        titulotec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulotec.setText("TECNOLÓGICO NACIONAL DE MÉXICO");

        logotecnm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/imagenes/logo tecnm.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/imagenes/logotec.png"))); // NOI18N

        titulocampus.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        titulocampus.setText("CAMPUS CD. VALLES");

        lema.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 24)); // NOI18N
        lema.setText("\"Programando el presente para ejecutar el futuro\"");

        botonmenu.setBackground(new java.awt.Color(153, 206, 153));
        botonmenu.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        botonmenu.setText("Menu");
        botonmenu.setToolTipText("");
        botonmenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonmenuMouseClicked(evt);
            }
        });
        botonmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmenuActionPerformed(evt);
            }
        });

        nomproyecto.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 24)); // NOI18N
        nomproyecto.setText("PROYECTO ARCHIVERO");

        autor1.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 24)); // NOI18N
        autor1.setText("Dafne Guadalupe Hernadez Salinas");

        autor3.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 24)); // NOI18N
        autor3.setText("Jose Ernesto Moctezuma Morales");

        autor2.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 24)); // NOI18N
        autor2.setText("Andrés Martínez Damián");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logotecnm, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(titulotec, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(titulocampus)
                                .addGap(198, 198, 198)))
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nomproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(351, 351, 351))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lema, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autor3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autor2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autor1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(424, 424, 424))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(logotecnm)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(titulotec, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulocampus)))
                .addGap(18, 18, 18)
                .addComponent(nomproyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lema)
                .addGap(18, 18, 18)
                .addComponent(autor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autor3)
                .addGap(18, 18, 18)
                .addComponent(botonmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmenuActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_botonmenuActionPerformed

    private void botonmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonmenuMouseClicked
Menu m1= new Menu();
m1.setVisible(true);
m1.setResizable(false);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_botonmenuMouseClicked

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
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autor1;
    private javax.swing.JLabel autor2;
    private javax.swing.JLabel autor3;
    private javax.swing.JButton botonmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lema;
    private javax.swing.JLabel logotecnm;
    private javax.swing.JLabel nomproyecto;
    private javax.swing.JLabel titulocampus;
    private javax.swing.JLabel titulotec;
    // End of variables declaration//GEN-END:variables
}
