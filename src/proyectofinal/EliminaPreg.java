/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class EliminaPreg {
    private static Pregunta[]viejoArch;
    private static int NumeroPregs;
    private static RandomAccessFile flujop;
    private static int tamañopregunta;
    private static File pregs;
    
    private static void setNumeroPregs() throws FileNotFoundException, IOException{
        pregs = new File("Preguntas.dat");
        flujop = new RandomAccessFile(pregs,"rw");
        NumeroPregs=(int)Math.ceil((double)flujop.length()/(double)tamañopregunta);
    }
    public static void llenaArray(int borra) throws IOException{
        setNumeroPregs();
        borra = borra-1;
        if(borra>=0 && borra<=NumeroPregs){
           viejoArch= new Pregunta[(NumeroPregs)-1];
           for (int i=1; i<(viejoArch.length)+1;i++){
               flujop.seek((i-1)*1200);
               if((i-1)!=borra){
                   viejoArch[i-1]= new Pregunta(flujop.readUTF(),flujop.readUTF(),flujop.readUTF(),flujop.readUTF(),
                            flujop.readBoolean(),flujop.readUTF(),flujop.readBoolean(),flujop.readUTF(),flujop.readBoolean()); 
               
               }else{
                   i--;
               }
           } 
        }else{
            JOptionPane.showMessageDialog(null, "Pregunta fuera de límites");
        }
    }
    
}
