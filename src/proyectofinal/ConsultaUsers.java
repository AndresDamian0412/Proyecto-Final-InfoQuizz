/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author andre
 */
public class ConsultaUsers extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaUsers
     */
    public ConsultaUsers() {
        initComponents();
        Toolkit mipantalla5 = Toolkit.getDefaultToolkit();
        setSize(1017,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla5.getImage("src/proyectofinal/preview.jpeg");
        setIconImage(Icono);
        setResizable(false);
        back.setVisible(false); //hace invisible el boton back
        contenedorpts.setEditable(false); // no permite que se escriba dentro del text area
        
        //Objeto jPanel con color VistaColor
        jpColor jpVista6 = new jpColor();
        jpVista6.setSize(this.getSize());       //diseño del frame
        jpVista6.setVistaColor(153,206,195,0,0,0);
        panelconsultall.add(jpVista6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelconsultall = new javax.swing.JPanel();
        muestraptsusers = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenedorpts = new javax.swing.JTextArea();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        muestraptsusers.setText("Mostrar");
        muestraptsusers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muestraptsusersMouseClicked(evt);
            }
        });

        contenedorpts.setColumns(20);
        contenedorpts.setRows(5);
        jScrollPane2.setViewportView(contenedorpts);

        back.setText("Regresar");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelconsultallLayout = new javax.swing.GroupLayout(panelconsultall);
        panelconsultall.setLayout(panelconsultallLayout);
        panelconsultallLayout.setHorizontalGroup(
            panelconsultallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconsultallLayout.createSequentialGroup()
                .addGroup(panelconsultallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelconsultallLayout.createSequentialGroup()
                        .addGap(791, 791, 791)
                        .addComponent(back)
                        .addGap(18, 18, 18)
                        .addComponent(muestraptsusers))
                    .addGroup(panelconsultallLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelconsultallLayout.setVerticalGroup(
            panelconsultallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconsultallLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelconsultallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestraptsusers)
                    .addComponent(back))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(panelconsultall, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void muestraptsusersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muestraptsusersMouseClicked
        //boton que ayuda a mostrar todas las preguntas
        try {
            // TODO add your handling code here:
            File archlect = new File("Usuarios.dat"); //crea un objeto de tipo file con la direccion del archivo de usuarios
            RandomAccessFile entrada = new RandomAccessFile(archlect,"r"); // crea el flujo de solo lectura
            int Numuser = (int)Math.ceil((double)entrada.length()/100); //obtiene el numero de usuarios
            String usuario; // variables que guardan los datos de cada usuario
            float puntaje;
            for (int i=0; i <= Numuser ; i++){ // ciclo para leer todas las preguntas
                puntaje = 0;
                
                entrada.seek(i*100); // se posiciona en cada inicio de pregunta
                usuario = entrada.readUTF(); // guarda usuario
                entrada.readUTF();
                puntaje = entrada.readFloat(); // guarda puntaje
                
                contenedorpts.append("Usuario "+(i+1)+"\n"); // escribe un numero de usuario leido
                contenedorpts.append(usuario+"\n"); // imprime usuario
                contenedorpts.append(puntaje+"\n"); // imprime puntaje
                contenedorpts.append("\n");
                contenedorpts.append("*****************************************"); // detalle de vista
                contenedorpts.append("\n");
            }
        } catch (FileNotFoundException ex) {

        }catch(IOException e){

        }
        back.setVisible(true); // hace visible el boton back
        muestraptsusers.setEnabled(false); // desactiva el boton mostrar preguntas
    }//GEN-LAST:event_muestraptsusersMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:

        PantPrincipalAdmin p = new PantPrincipalAdmin(); // crea un objeto de tipo pantalla usuario
        p.setVisible(true); // hace visible el frame
        this.dispose(); // cierra el frame
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
            java.util.logging.Logger.getLogger(ConsultaUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextArea contenedorpts;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton muestraptsusers;
    private javax.swing.JPanel panelconsultall;
    // End of variables declaration//GEN-END:variables
}
