package proyectofinal;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    private static int posicionuser;
    
    public Menu() {
        // diseño predefinido de cada frame
        initComponents();
        Toolkit mipantalla2 = Toolkit.getDefaultToolkit();
        setSize(1017,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla2.getImage("src/proyectofinal/imagenes/preview.jpeg");
        setIconImage(Icono);
        setResizable(false);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(back, "src/proyectofinal/imagenes/atrasportada.png"); //ajusta imagen a una etiqueta
        // hace invisible el panel login
       
        //Objeto jPanel con color VistaColor
        //jpColor jpVista = new jpColor();
        //jpVista.setSize(this.getSize());  // color degradado de los frame
        //jpVista.setVistaColor(153,206,195,0,0,0);
        //panelmenu.add(jpVista);
         
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmenu = new javax.swing.JPanel();
        msj1 = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        nuevouserbtn = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        lblusername = new javax.swing.JLabel();
        newUsername = new javax.swing.JTextField();
        newpass = new javax.swing.JPasswordField();
        lblpass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelmenu.setBackground(new java.awt.Color(153, 206, 153));
        panelmenu.setToolTipText("");

        msj1.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 18)); // NOI18N
        msj1.setText("Por favor, elija uno de los siguientes para iniciar sesión ;)");

        bienvenida.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 48)); // NOI18N
        bienvenida.setText("BIENVENIDOS");

        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        nuevouserbtn.setBackground(new java.awt.Color(0, 51, 255));
        nuevouserbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nuevouserbtn.setForeground(new java.awt.Color(255, 255, 255));
        nuevouserbtn.setText("Nuevo usuario");
        nuevouserbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevouserbtnMouseClicked(evt);
            }
        });
        nuevouserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevouserbtnActionPerformed(evt);
            }
        });

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

        lblusername.setBackground(new java.awt.Color(255, 255, 255));
        lblusername.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        lblusername.setText("Nombre de usuario:");
        lblusername.setAutoscrolls(true);
        lblusername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        newUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newUsernameFocusGained(evt);
            }
        });

        newpass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newpassFocusGained(evt);
            }
        });

        lblpass1.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        lblpass1.setText("Contraseña:");
        lblpass1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmenuLayout.createSequentialGroup()
                        .addComponent(btnlogin)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmenuLayout.createSequentialGroup()
                        .addComponent(nuevouserbtn)
                        .addGap(360, 360, 360))))
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(msj1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(lblpass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelmenuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelmenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newUsername)))))
                .addContainerGap(157, Short.MAX_VALUE))
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
                .addGap(88, 88, 88)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusername)
                    .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpass1))
                .addGap(18, 18, 18)
                .addComponent(btnlogin)
                .addGap(18, 18, 18)
                .addComponent(nuevouserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
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

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        // TODO add your handling code here:
        //acciones del boton entrar 
        String user; // 
        user = newUsername.getText().trim(); // en la variable usuario se guarda lo que se ingrese aal textfield
        char[]arrayclave = newpass.getPassword(); // el campo de contraseña regresa un array 
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
                setNumerouser(AccesoAleatorioU.posicionUserypass(user, clavereal));                                                // regresa 1 y nos da acceso a pantalla de usuario
                PantPrincipalUser p1 = new PantPrincipalUser(); // crea objeto de clase pantalla usuario
                p1.setVisible(true); // hace visible el frame
                this.dispose(); // cierra el frame actual
                // si no lo encuentra busca en archivo usuario
            }else if(user.equalsIgnoreCase("Andres Martinez")&&clave.equalsIgnoreCase("19690068")){
                PantPrincipalAdmin pmenu = new PantPrincipalAdmin();
                pmenu.setVisible(true);  // comprobacion para admin, aun falta crear archivo
                this.dispose(); // cierra el frame actual
            }else if(user.equalsIgnoreCase("Dafne Salinas")&&clave.equalsIgnoreCase("19690066")){
                PantPrincipalAdmin pmenu = new PantPrincipalAdmin();
                pmenu.setVisible(true);  // comprobacion para admin, aun falta crear archivo
                this.dispose(); // cierra el frame actual
            }else if(user.equalsIgnoreCase("Ernesto Moctezuma")&&clave.equalsIgnoreCase("19690217")){
                PantPrincipalAdmin pmenu = new PantPrincipalAdmin();
                pmenu.setVisible(true);  // comprobacion para admin, aun falta crear archivo
                this.dispose(); // cierra el frame actual
            }
            else{
                JOptionPane.showMessageDialog(null, "¡Usuario o contraseña incorrectos!"); //
            }
            AccesoAleatorioU.cierraflujo(); // cierra el flujo
            
        }catch(IOException e){
            
        }
        
       
    }//GEN-LAST:event_btnloginMouseClicked

    private void nuevouserbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevouserbtnMouseClicked
        // TODO add your handling code here:
        Altauser a1 = new Altauser(); // crea objeto de clase Alta user
        a1.setVisible(true); //hace visible el frame 
        a1.setResizable(false); // no permite agrandarlo
        dispose(); // cierra este frame
    }//GEN-LAST:event_nuevouserbtnMouseClicked

    private void nuevouserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevouserbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevouserbtnActionPerformed

    private void newUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newUsernameFocusGained
        // TODO add your handling code here:
        newUsername.selectAll();
    }//GEN-LAST:event_newUsernameFocusGained

    private void newpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpassFocusGained
        // TODO add your handling code here:
        newpass.selectAll();
    }//GEN-LAST:event_newpassFocusGained

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Portada p2 = new Portada(); // Crea un objeto de tipo portada
        p2.setVisible(true); // hace visible el frame
        p2.setResizable(false); // impide que se agrande el tamaño
        this.dispose(); // cierra el frame actual
    }//GEN-LAST:event_backMouseClicked

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
    private javax.swing.JLabel back;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel lblpass1;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel msj1;
    private javax.swing.JTextField newUsername;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JButton nuevouserbtn;
    private javax.swing.JPanel panelmenu;
    // End of variables declaration//GEN-END:variables

    public static int getNumerouser(){
        return posicionuser;
    }
    private void setNumerouser(int posicion){
        this.posicionuser = posicion;
    }
}
