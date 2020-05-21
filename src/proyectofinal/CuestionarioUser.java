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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class CuestionarioUser extends javax.swing.JFrame {
    private static int[]numeros;
    private static int i=0;
    private static int pregenArch;
    private static int correctas=0;
    private static int salida=0;
    private static int nf=0;
    
    /**
     * Creates new form CuestionarioUser
     */
    public CuestionarioUser() throws IOException {
        initComponents();
        Toolkit mipantalla5 = Toolkit.getDefaultToolkit();
        setSize(1017,575);
        setLocationRelativeTo(null);
        setTitle("InfoQuizz");
        Image Icono = mipantalla5.getImage("src/proyectofinal/preview.jpeg");
        setIconImage(Icono);
        setResizable(false);
        
        //Objeto jPanel con color VistaColor
        jpColor jpVista6 = new jpColor();
        jpVista6.setSize(this.getSize());       //diseño del frame
        jpVista6.setVistaColor(153,206,195,0,0,0);
        jPanel1.add(jpVista6);
        
         //hace los textfields no modificables
        txtTema.setEditable(false);
        txtSubt.setEditable(false);
        txtPregunta.setEditable(false);
        txtIncisoa.setEditable(false);
        txtIncisob.setEditable(false);
        txtIncisoc.setEditable(false);
        
        btnSiguiente.setVisible(false);
        setPregenArch();
        llenaArray();
        JOptionPane.showMessageDialog(null, "**Si marcas dos casillas la respuesta\n se considerará erronea**");
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
        jPanel2 = new javax.swing.JPanel();
        txtTema = new javax.swing.JTextField();
        txtSubt = new javax.swing.JTextField();
        scrollpreg = new javax.swing.JScrollPane();
        txtPregunta = new javax.swing.JTextField();
        scrollincia = new javax.swing.JScrollPane();
        txtIncisoa = new javax.swing.JTextField();
        scrollincib = new javax.swing.JScrollPane();
        txtIncisob = new javax.swing.JTextField();
        scrollincic = new javax.swing.JScrollPane();
        txtIncisoc = new javax.swing.JTextField();
        checkA = new javax.swing.JCheckBox();
        checkB = new javax.swing.JCheckBox();
        checkC = new javax.swing.JCheckBox();
        lbladver = new javax.swing.JLabel();
        lbladver1 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnMuestraprimera = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        lblCuest = new javax.swing.JLabel();
        progresocuest = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        txtTema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTema.setText("TEMA");
        txtTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemaActionPerformed(evt);
            }
        });

        txtSubt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubt.setText("SUBTEMA");
        txtSubt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtActionPerformed(evt);
            }
        });

        txtPregunta.setText("Pregunta");
        scrollpreg.setViewportView(txtPregunta);

        txtIncisoa.setText("Inciso");
        scrollincia.setViewportView(txtIncisoa);

        txtIncisob.setText("Inciso");
        scrollincib.setViewportView(txtIncisob);

        txtIncisoc.setText("Inciso");
        scrollincic.setViewportView(txtIncisoc);

        lbladver.setText("Marque solo una casilla**");

        lbladver1.setText("Seleccione la respuesta correcta*");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        btnMuestraprimera.setText("Comienza");
        btnMuestraprimera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMuestraprimeraMouseClicked(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtSubt, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladver, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(scrollpreg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbladver1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMuestraprimera)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(scrollincic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                                        .addComponent(scrollincib, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollincia, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(44, 44, 44)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkA, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkC, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(btnSiguiente)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSubt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollpreg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollincia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkA))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollincib, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkB))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkC)
                    .addComponent(scrollincic, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladver1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSiguiente)
                        .addComponent(btnMuestraprimera)
                        .addComponent(cancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbladver)
                .addContainerGap())
        );

        lblCuest.setBackground(new java.awt.Color(255, 255, 255));
        lblCuest.setFont(new java.awt.Font("NSimSun", 3, 24)); // NOI18N
        lblCuest.setForeground(new java.awt.Color(255, 255, 255));
        lblCuest.setText("CUESTIONARIO");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Progreso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCuest, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(progresocuest, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCuest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progresocuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemaActionPerformed

    private void txtSubtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtActionPerformed

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        // TODO add your handling code here:
        boolean alto=false;
        double porcentaje;
        porcentaje = (100/pregenArch);
        salida++;
        cambio();
        alto=cambio();
            
        if(comprueba(numeros[i])){
            if(progresocuest.getValue()<=100){
            progresocuest.setValue(progresocuest.getValue()+(int)(Math.ceil(porcentaje)));
            }
            correctas++;
        }
        limpiaCampos();
        i++;
        if(alto!=true)
        muestraPreg(numeros[i]);
       
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnMuestraprimeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuestraprimeraMouseClicked
        // TODO add your handling code here:
        btnMuestraprimera.setVisible(false);
        btnSiguiente.setVisible(true);
        muestraPreg(numeros[i]);
    }//GEN-LAST:event_btnMuestraprimeraMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        // TODO add your handling code here:
        int res=0;
        res = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere cancelar el cuestionario?"+"\n"+"Si sale ahora, todos su progreso se perderá");
        if(res==0){
            Menu mq = new Menu();
            mq.setVisible(true);
            this.dispose();
        }else{
            return;
        }
    }//GEN-LAST:event_cancelarMouseClicked

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
            java.util.logging.Logger.getLogger(CuestionarioUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuestionarioUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuestionarioUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuestionarioUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CuestionarioUser().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CuestionarioUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMuestraprimera;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton cancelar;
    private static javax.swing.JCheckBox checkA;
    private static javax.swing.JCheckBox checkB;
    private static javax.swing.JCheckBox checkC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCuest;
    private javax.swing.JLabel lbladver;
    private javax.swing.JLabel lbladver1;
    private javax.swing.JProgressBar progresocuest;
    private javax.swing.JScrollPane scrollincia;
    private javax.swing.JScrollPane scrollincib;
    private javax.swing.JScrollPane scrollincic;
    private javax.swing.JScrollPane scrollpreg;
    private static javax.swing.JTextField txtIncisoa;
    private static javax.swing.JTextField txtIncisob;
    private static javax.swing.JTextField txtIncisoc;
    private static javax.swing.JTextField txtPregunta;
    private static javax.swing.JTextField txtSubt;
    private static javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables

    private static void limpiaCampos(){
        txtTema.setText("");
        txtSubt.setText("");
        txtPregunta.setText("");
        txtIncisoa.setText("");
        txtIncisob.setText("");
        txtIncisoc.setText("");
        checkA.setSelected(false);
        checkB.setSelected(false);
        checkC.setSelected(false);
    }
    public static void muestraPreg(int i){
        try {
            File prg = new File("Preguntas.dat"); //archivo de preguntas
            RandomAccessFile flujopreguntas = new RandomAccessFile(prg,"r"); //randomaccessfile de solo lectura
            
            flujopreguntas.seek(i*1200);
            txtTema.setText(flujopreguntas.readUTF());
            txtSubt.setText(flujopreguntas.readUTF());
            txtPregunta.setText(flujopreguntas.readUTF());
            txtIncisoa.setText(flujopreguntas.readUTF());
            flujopreguntas.readBoolean(); //salta el booleano
            txtIncisob.setText(flujopreguntas.readUTF());
            flujopreguntas.readBoolean();//salta el booleano
            txtIncisoc.setText(flujopreguntas.readUTF());
            flujopreguntas.readBoolean();
            flujopreguntas.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CuestionarioUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CuestionarioUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean comprueba(int i){
        try {
            File preg = new File("Preguntas.dat");
            RandomAccessFile entrada = new RandomAccessFile(preg,"r");
            boolean rc1,rc2,rc3,rl1,rl2,rl3;
            rc1=false; rc2=false; rc3=false; rl1=false; rl2=false; rl3=false;
            entrada.seek(i*1200);
            entrada.readUTF();
            entrada.readUTF();
            entrada.readUTF();
            entrada.readUTF();
            rc1 = entrada.readBoolean();
            entrada.readUTF();
            rc2 = entrada.readBoolean();
            entrada.readUTF();
            rc3 = entrada.readBoolean();
            entrada.close();
            if(checkA.isSelected()==true){rl1=true;}else{rl1=false;}
            if(checkB.isSelected()==true){rl2=true;}else{rl2=false;}
            if(checkC.isSelected()==true){rl3=true;}else{rl3=false;}
            if(rc1 == rl1){
                if(rc2 == rl2){
                    if(rc3 == rl3){
                        return true;
                    }
                }
                return false;
            }
            return false;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CuestionarioUser.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "El archivo no esta en la ubicacion correcta");
            } catch (IOException ex) {
                Logger.getLogger(CuestionarioUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
    }
    
    private static void llenaArray() throws IOException{
        
        int i = 0,cantidad = pregenArch, rango=pregenArch;
        numeros= new int[cantidad];
        numeros[i] = (int)(Math.random()*rango);
        for(i=1;i<cantidad;i++){
            numeros[i]=(int)(Math.random()*rango);
            for(int j=0;j<i;j++){
                if(numeros[i]==numeros[j])
                    i--;
            }
        }
    }
    
    private static void setPregenArch() throws IOException{
        File preguntas = new File("Preguntas.dat");
        RandomAccessFile flujopreguntas = new RandomAccessFile(preguntas,"r");
        pregenArch = (int)Math.ceil((flujopreguntas.length()/(double)1200)); //me dice el numero de preguntas en el archivo
        flujopreguntas.close();
    }
    
    private boolean cambio(){
        if (salida>=pregenArch){
            if(nf<1){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CuestionarioUser.class.getName()).log(Level.SEVERE, null, ex);
                }
                Resultados res=new Resultados();
                res.setVisible(true);
                this.dispose();
                nf++;
            }
            
            return true;
        }
        return false;
    }
    public static float getCorrectas(){
        return (float)correctas;
    }
    public static float getPregenArch(){
        return (float)pregenArch;
    }
    
    public static void setInicializadores(int a, int b, int c, int d){
        correctas = a;
        salida = b;
        nf = c;
        i = d;
    }
}
