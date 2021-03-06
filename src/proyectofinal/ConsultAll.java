/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.*;

/**
 *
 * @author andre
 */
public class ConsultAll extends javax.swing.JFrame {

    /**
     * Creates new form ConsultAll
     */
    //esto es el diseño predefinido de cada pantalla
    public ConsultAll() {
        initComponents();
        Toolkit mipantalla5 = Toolkit.getDefaultToolkit();
        setSize(1017,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla5.getImage("src/proyectofinal/imagenes/preview.jpeg");
        setIconImage(Icono);
        setResizable(false);
        back.setVisible(false); //hace invisible el boton back
        contenedorpreg.setEditable(false); // no permite que se escriba dentro del text area
        
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
        muestrapregs = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenedorpreg = new javax.swing.JTextArea();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        muestrapregs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        muestrapregs.setText("Mostrar");
        muestrapregs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muestrapregsMouseClicked(evt);
            }
        });
        muestrapregs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muestrapregsActionPerformed(evt);
            }
        });

        contenedorpreg.setColumns(20);
        contenedorpreg.setRows(5);
        jScrollPane2.setViewportView(contenedorpreg);

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                        .addComponent(muestrapregs))
                    .addGroup(panelconsultallLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelconsultallLayout.setVerticalGroup(
            panelconsultallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconsultallLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelconsultallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrapregs)
                    .addComponent(back))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelconsultall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelconsultall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void muestrapregsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muestrapregsMouseClicked
        //boton que ayuda a mostrar todas las preguntas
        try {
            // TODO add your handling code here:
            File archlect = new File("Preguntas.dat"); //crea un objeto de tipo file con la direccion del archivo de preguntas
            RandomAccessFile entrada = new RandomAccessFile(archlect,"r"); // crea el flujo de solo lectura
            int Numpreg = (int)Math.ceil((double)entrada.length()/1200); //obtiene el numero de preguntas
            String tema,subt,preg,res1,res2,res3,c1,c2,c3; // variables que guardan los datos de cada pregunta
            boolean b1,b2,b3; // boleanos para ver cual es la correcta
            for (int i=0; i <= Numpreg ; i++){ // ciclo para leer todas las preguntas
                b1 = false; b2 = false; b3 = false; // siempre se inicializan en falso para que no se repitan los valores
                c1 = "Incorrecta"; c2 = "Incorrecta"; c3 = "Incorrecta"; // siempre son incorrectas por la misma razon anterior
                entrada.seek(i*1200); // se posiciona en cada inicio de pregunta
                tema = entrada.readUTF(); // guarda tema
                subt = entrada.readUTF(); // guarda subtema
                preg = entrada.readUTF(); // guarda pregunta
                res1 = entrada.readUTF(); // guarda inciso
                b1 = entrada.readBoolean(); // guarda booleano de inciso
                res2 = entrada.readUTF(); // guarda inciso
                b2 = entrada.readBoolean(); //guarda booleano de inciso
                res3 = entrada.readUTF(); // guarda inciso
                b3 = entrada.readBoolean(); // guarda booleano de inciso
                
                if(b1 == true)
                    c1 = "Correcta";
                if(b2 ==true)
                    c2 = "Correcta";  //comprueba cual es el booleano correcto
                if(b3 == true)
                    c3 = "Correcta";

                contenedorpreg.append("Pregunta "+(i+1)+"\n"); // escribe un numero de pregunta leido
                contenedorpreg.append(tema+"\n"); // imprime tema
                contenedorpreg.append(subt+"\n"); // imprime subtema
                contenedorpreg.append(preg+"\n"); // imprime pregunta
                contenedorpreg.append(res1+"-------"+c1+"\n"); // imprime respuesta y si es o no correcta
                contenedorpreg.append(res2+"-------"+c2+"\n"); // imprime respuesta y si es o no correcta
                contenedorpreg.append(res3+"-------"+c3+"\n"); // imprime respuesta y si es o no correcta
                contenedorpreg.append("\n"); 
                contenedorpreg.append("*****************************************"); // detalle de vista
                contenedorpreg.append("\n");
            }
        } catch (FileNotFoundException ex) {
        
        }catch(IOException e){
            
        }
        back.setVisible(true); // hace visible el boton back
        muestrapregs.setEnabled(false); // desactiva el boton mostrar preguntas
    }//GEN-LAST:event_muestrapregsMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        
        PantPrincipalAdmin p = new PantPrincipalAdmin(); // crea un objeto de tipo pantalla usuario
        p.setVisible(true); // hace visible el frame
        this.dispose(); // cierra el frame
    }//GEN-LAST:event_backMouseClicked

    private void muestrapregsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muestrapregsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muestrapregsActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextArea contenedorpreg;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton muestrapregs;
    private javax.swing.JPanel panelconsultall;
    // End of variables declaration//GEN-END:variables
}
