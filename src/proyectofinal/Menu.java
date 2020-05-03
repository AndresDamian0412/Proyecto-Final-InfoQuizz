package proyectofinal;

import java.awt.Image;
import java.awt.Toolkit;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        Toolkit mipantalla2 = Toolkit.getDefaultToolkit();
        setSize(1017,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla2.getImage("src/proyectofinal/imagenes/logoiq.png");
        setIconImage(Icono);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(back, "src/proyectofinal/imagenes/back.png");
        Login.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmenu = new javax.swing.JPanel();
        botonuser = new javax.swing.JButton();
        nuevouserbtn = new javax.swing.JButton();
        msj1 = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        lblpswrd = new javax.swing.JLabel();
        nomUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        atrasmenu = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelmenu.setBackground(new java.awt.Color(153, 206, 195));
        panelmenu.setToolTipText("");

        botonuser.setBackground(new java.awt.Color(255, 91, 25));
        botonuser.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonuser.setText("Usuario");
        botonuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonuserMouseClicked(evt);
            }
        });
        botonuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonuserActionPerformed(evt);
            }
        });

        nuevouserbtn.setBackground(new java.awt.Color(228, 240, 59));
        nuevouserbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nuevouserbtn.setText("Nuevo Usuario");
        nuevouserbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevouserbtnMouseClicked(evt);
            }
        });

        msj1.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 18)); // NOI18N
        msj1.setText("Por favor, eliga uno de los siguientes para iniciar sesión ;)");

        bienvenida.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 48)); // NOI18N
        bienvenida.setText("BIENVENIDOS");

        Login.setBackground(new java.awt.Color(101, 98, 150));
        Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbluser.setFont(new java.awt.Font("Arial Unicode MS", 3, 14)); // NOI18N
        lbluser.setText("Usuario: ");

        lblpswrd.setFont(new java.awt.Font("Arial Unicode MS", 3, 14)); // NOI18N
        lblpswrd.setText("Contraseña: ");

        btnlogin.setText("Entrar");

        atrasmenu.setText("Atrás");
        atrasmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasmenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbluser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblpswrd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnlogin)
                        .addGap(18, 18, 18)
                        .addComponent(atrasmenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin)
                    .addComponent(atrasmenu))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(msj1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(botonuser, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(nuevouserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        panelmenuLayout.setVerticalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msj1)
                .addGap(44, 44, 44)
                .addComponent(botonuser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nuevouserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonuserActionPerformed

    private void botonuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonuserMouseClicked
botonuser.setVisible(false);
nuevouserbtn.setVisible(false);
Login.setVisible(true);
        
    }//GEN-LAST:event_botonuserMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Portada p2 = new Portada();
        p2.setVisible(true);
        p2.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void atrasmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasmenuMouseClicked
        // TODO add your handling code here:
        Menu m2 = new Menu();
        m2.setVisible(true);
        m2.setResizable(false);
        dispose();
        
    }//GEN-LAST:event_atrasmenuMouseClicked

    private void nuevouserbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevouserbtnMouseClicked
        Altauser a1 = new Altauser();
        a1.setVisible(true);
        a1.setResizable(false);
    }//GEN-LAST:event_nuevouserbtnMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Login;
    private javax.swing.JButton atrasmenu;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton botonuser;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel lblpswrd;
    private javax.swing.JLabel lbluser;
    private javax.swing.JLabel msj1;
    private javax.swing.JTextField nomUser;
    private javax.swing.JButton nuevouserbtn;
    private javax.swing.JPanel panelmenu;
    private javax.swing.JPasswordField passwordUser;
    // End of variables declaration//GEN-END:variables
}
