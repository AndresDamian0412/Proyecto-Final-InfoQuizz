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
    public static boolean llenaArray(int borra) throws IOException{
        Pregunta pfalsa = new Pregunta("","","","",false,"",false,"",false);
        pfalsa=null;
        setNumeroPregs();
        borra = borra-1;
        if(borra>=0 && borra<=NumeroPregs){
           viejoArch= new Pregunta[NumeroPregs];
           for (int i=0; i<viejoArch.length;i++){
               flujop.seek(i*1200);
               if(i!=borra){
                   viejoArch[i]= new Pregunta(flujop.readUTF(),flujop.readUTF(),flujop.readUTF(),flujop.readUTF(),
                            flujop.readBoolean(),flujop.readUTF(),flujop.readBoolean(),flujop.readUTF(),flujop.readBoolean());         
               }else if(i==borra){
                   viejoArch[i]=pfalsa;
               }
           }
           return true;
        }else{
            JOptionPane.showMessageDialog(null, "Pregunta fuera de límites");
        }
        return false;
    }
    
    public static void cierraFlujo() throws IOException{
        flujop.close();
    }
    
    public static void borrayEscribe() throws FileNotFoundException, IOException{
        File pregs = new File("Preguntas.dat");
        pregs.delete();
        escribeNuevo();
        for(int j=0;j<viejoArch.length;j++){ //vacia el array para que no haya problemas si se modifica mas de una pregunta
            viejoArch[j]=null;
        }
    }
    
    private static void escribeNuevo() throws FileNotFoundException, IOException{
        File pregsnew = new File("Preguntas.dat");
        RandomAccessFile flujonew = new RandomAccessFile(pregsnew,"w");
        
        for(int i=0;i<=viejoArch.length;i++){
            if(viejoArch[i]!=null){
                flujonew.writeUTF(viejoArch[i].getTema());
                flujonew.writeUTF(viejoArch[i].getSubt());
                flujonew.writeUTF(viejoArch[i].getpregunta());
                flujonew.writeUTF(viejoArch[i].getRes1());
                flujonew.writeBoolean(viejoArch[i].isBres1());
                flujonew.writeUTF(viejoArch[i].getRes2());
                flujonew.writeBoolean(viejoArch[i].isBres2());
                flujonew.writeUTF(viejoArch[i].getRes3());
                flujonew.writeBoolean(viejoArch[i].isBres3());
            }
        }
        flujonew.close();
    }
    
     public static Pregunta muestraActual(int posi) throws FileNotFoundException, IOException{
        posi = posi-1;
        File pregs = new File("Preguntas.dat");
        RandomAccessFile flujol = new RandomAccessFile(pregs,"r");
        flujol.seek(posi*1200);
        Pregunta leida;
        leida= new Pregunta(flujol.readUTF(),flujol.readUTF(),flujol.readUTF(),flujol.readUTF(),flujol.readBoolean(),
                            flujol.readUTF(),flujol.readBoolean(),flujol.readUTF(),flujol.readBoolean());
        flujol.close();
        return leida;
        
    }
}
