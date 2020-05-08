/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.RandomAccessFile;
import java.io.*;

/**
 *
 * @author andre
 */
public class AccesoAleatorioP {
    private static RandomAccessFile flujop;
    private static int numpreguntas;
    private static final int tamañopreg = 200;
    
    public static void creaArchPreg(File arch) throws IOException{
        flujop = new RandomAccessFile(arch,"rw");
        numpreguntas = (int)Math.ceil((double)flujop.length()/(double)tamañopreg);
    }
    
    public static void cierraflujo() throws IOException{
        flujop.close();
    }
    
    public static boolean setPregunta(int i, Pregunta ask)throws IOException{
        
        if(i>=0 && i<=getNumeroDePreguntas()){
            if(ask.getTamaño()>tamañopreg){
                System.out.println("La pregunta es demasiado grande");
                
            }else{
                flujop.seek(i*tamañopreg);
                flujop.writeUTF(ask.getpregunta());
                flujop.writeUTF(ask.getRes1());
                flujop.writeUTF(ask.getRes2());
                flujop.writeUTF(ask.getRes3());
                return true;
            }
        }else{
            System.out.println("Numero de pregunta fuera de limites");
        }
        return false;
    }
    
    public static void añadePreg(Pregunta ask) throws IOException{
        if(setPregunta(numpreguntas,ask)){
            numpreguntas++;
        }
    }
    
    public static int getNumeroDePreguntas(){
        return 0;
    }
}
