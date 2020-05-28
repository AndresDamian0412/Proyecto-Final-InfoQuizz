/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Modificaciones {
    private static Pregunta[] viejoArch;
    private static int Posicion;
    private static int PregEnArch;
    private static final int tamañopregunta = 1200;
    private static RandomAccessFile flujo;
    private static File prgs;
    
    private static void setNumPreg()throws IOException{ //me dice cuantas preguntas hay en el archivo para el tamaño de array
        prgs = new File("Preguntas.dat");
        flujo = new RandomAccessFile(prgs,"rw");
        
        PregEnArch=(int)Math.ceil((double)flujo.length()/(double)tamañopregunta);
    }
    public static void cierraFlujo() throws IOException{ //solo cierra el flujo
        flujo.close();
    }
    public static boolean llenaArray(int modi)throws IOException{ //me llena un array de preguntas menos la que voy a modificar
        setNumPreg();
        if(modi>=0 &&modi<=PregEnArch){
            Posicion=modi-1;
            viejoArch = new Pregunta[PregEnArch];
            for (int i=0; i<=PregEnArch;i++){
                try{
                if(i!=Posicion){
                    flujo.seek(i*1200);
                    System.out.println("Estoy aqui"+i);
                    viejoArch[i]=new Pregunta(flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),
                            flujo.readBoolean(),flujo.readUTF(),flujo.readBoolean(),flujo.readUTF(),flujo.readBoolean());     
                }else if(i==Posicion){
                    flujo.readUTF();
                    flujo.readUTF();
                    flujo.readUTF();
                    flujo.readUTF();
                    flujo.readBoolean();
                    flujo.readUTF();
                    flujo.readBoolean();
                    flujo.readUTF();
                    flujo.readBoolean();
                }
                }catch (EOFException e){
                    System.out.println("Tengo la exceocion "+e+"linea"+i);
                }
            }
            System.out.println("Termine ciclo for");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "La posicion de pregunta es incorrecta:/");
            return false;
        }
        
    }
    public static void llenaVacio(Pregunta modif) throws IOException{ //llena el espacio vacio con la pregunta modificada 
        viejoArch[getPosicion()]= modif;
        borraAnterior();
    }
    private static void borraAnterior()throws IOException { //borra el archivo de preguntas
        prgs.delete();
    }
    public static void guardaCambios() throws IOException{ //usando el array de preguntas, crea un nuevo archivo con 
                                                           //todas las preguntas que ya tenia y la que se modifico
        File prgsnuevo = new File("Preguntas.dat");
        RandomAccessFile flujon = new RandomAccessFile(prgsnuevo,"rw");
        for(int i=0;i<PregEnArch;i++){
            flujon.seek(i*1200);
            flujon.writeUTF(viejoArch[i].getTema());
            flujon.writeUTF(viejoArch[i].getSubt());
            flujon.writeUTF(viejoArch[i].getpregunta());
            flujon.writeUTF(viejoArch[i].getRes1());
            flujon.writeBoolean(viejoArch[i].isBres1());
            flujon.writeUTF(viejoArch[i].getRes2());
            flujon.writeBoolean(viejoArch[i].isBres2());
            flujon.writeUTF(viejoArch[i].getRes3());
            flujon.writeBoolean(viejoArch[i].isBres3());
        }
        for(int j=0;j<viejoArch.length;j++){ //vacia el array para que no haya problemas si se modifica mas de una pregunta
            viejoArch[j]=null;
        }
        flujon.close();
    }
    private static int getPosicion(){
        return Posicion;
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
