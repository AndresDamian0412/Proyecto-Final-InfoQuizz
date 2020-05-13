package proyectofinal;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        // diseño predefinido de cada frame
        initComponents();
        Toolkit mipantalla2 = Toolkit.getDefaultToolkit();
        setSize(1017,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla2.getImage("src/proyectofinal/imagenes/preview.jpeg");
        setIconImage(Icono);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(back, "src/proyectofinal/imagenes/atrasportada.png"); //ajusta imagen a una etiqueta
        Login.setVisible(false); // hace invisible el panel login
       
        //Objeto jPanel con color VistaColor
        jpColor jpVista = new jpColor();
        jpVista.setSize(this.getSize());  // color degradado de los frame
        jpVista.setVistaColor(153,206,195,0,0,0);
        panelmenu.add(jpVista);
         
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmenu = new javax.swing.JPanel();
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
        botonuser = new javax.swing.JButton();
        nuevouserbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelmenu.setBackground(new java.awt.Color(153, 206, 195));
        panelmenu.setToolTipText("");

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
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        atrasmenu.setText("Atrás");
        atrasmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasmenuMouseClicked(evt);
            }
        });
        atrasmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasmenuActionPerformed(evt);
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

        botonuser.setBackground(new java.awt.Color(204, 0, 0));
        botonuser.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        botonuser.setText("Usuario");
        botonuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonuserMouseClicked(evt);
            }
        });

        nuevouserbtn.setBackground(new java.awt.Color(0, 51, 255));
        nuevouserbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nuevouserbtn.setText("Nuevo Usuario");
        nuevouserbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevouserbtnMouseClicked(evt);
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
                        .addGap(339, 339, 339)
                        .addComponent(botonuser, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addGap(378, 378, 378)
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
                .addGap(33, 33, 33)
                .addComponent(botonuser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nuevouserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Portada p2 = new Portada(); // Crea un objeto de tipo portada
        p2.setVisible(true); // hace visible el frame
        p2.setResizable(false); // impide que se agrande el tamaño
        this.dispose(); // cierra el frame actual
    }//GEN-LAST:event_backMouseClicked

    private void atrasmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasmenuMouseClicked
        // TODO add your handling code here:
        Login.setVisible(false); // boton atras hace invisible el panel login
        botonuser.setVisible(true); // hace visible los botones usuario y nuevo usuario
        nuevouserbtn.setVisible(true);
        
    }//GEN-LAST:event_atrasmenuMouseClicked

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void atrasmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasmenuActionPerformed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        // TODO add your handling code here:
        //acciones del boton entrar 
        String user; // 
        user = nomUser.getText().trim(); // en la variable usuario se guarda lo que se ingrese aal textfield
        char[]arrayclave = passwordUser.getPassword(); // el campo de contraseña regresa un array 
        String clave = new String(arrayclave).trim(); // se guarda el array en una cadena para mejor manejo y se borran
                                                // espacios que pueda tener al inicio o al final
        String clavereal = user.concat(clave); // para mayor seguridad la clave incluye el nombre de usuario 
        if(user.isEmpty() || clave.isEmpty()){ // si estan vacios entra el return para que se reinicie
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            return;
        }
        // una vez comprobado que son correctos los datos inicia el flujo
        try{
            AccesoAleatorioU.creaArchUser(new File("Usuarios.dat")); // se llama al metodo para crear flujo
            if(AccesoAleatorioU.buscaUserypass(user, clavereal)==1){ // si el metodo encuentra el usuario con contraseña
                                                                // regresa 1 y nos da acceso a pantalla de usuario
                PantPrincipalUser p1 = new PantPrincipalUser(); // crea objeto de clase pantalla usuario
                p1.setVisible(true); // hace visible el frame
                this.dispose(); // cierra el frame actual
                // si no lo encuentra busca en archivo usuario
            }else if(user.equalsIgnoreCase("admin")&&clave.equalsIgnoreCase("password")){
                PantPrincipalAdmin pmenu = new PantPrincipalAdmin();
                pmenu.setVisible(true);  // comprobacion para admin, aun falta crear archivo
                this.dispose(); // cierra el frame actual
            }else{
                JOptionPane.showMessageDialog(null, "¡Usuario o contraseña incorrectos!"); //
            }
            AccesoAleatorioU.cierraflujo(); // cierra el flujo
            
        }catch(IOException e){
            
        }
        
       
    }//GEN-LAST:event_btnloginMouseClicked

    private void botonuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonuserMouseClicked
        // TODO add your handling code here:
        botonuser.setVisible(false); // boton user se hace invisible
        nuevouserbtn.setVisible(false); // boton nuevo usuario invisible
        Login.setVisible(true); // panel login visible
    }//GEN-LAST:event_botonuserMouseClicked

    private void nuevouserbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevouserbtnMouseClicked
        // TODO add your handling code here:
        Altauser a1 = new Altauser(); // crea objeto de clase Alta user
        a1.setVisible(true); //hace visible el frame 
        a1.setResizable(false); // no permite agrandarlo
        dispose(); // cierra este frame
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
