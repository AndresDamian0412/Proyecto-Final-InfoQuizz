/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.RandomAccessFile;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class AccesoAleatorioP {
    private static RandomAccessFile flujop;
    private static int numpreguntas;
    private static final int tamañopreg = 1200;
    
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
                JOptionPane.showMessageDialog(null, "La pregunta es demasiado grande:(");
                
            }else{
                flujop.seek(i*tamañopreg);
                flujop.writeUTF(ask.getTema());
                flujop.writeUTF(ask.getSubt());
                flujop.writeUTF(ask.getpregunta());
                flujop.writeUTF(ask.getRes1());
                flujop.writeBoolean(ask.isBres1());
                flujop.writeUTF(ask.getRes2());
                flujop.writeBoolean(ask.isBres2());
                flujop.writeUTF(ask.getRes3());
                flujop.writeBoolean(ask.isBres3());
                return true;
            }
        }else{
            JOptionPane.showMessageDialog(null,"Numero de pregunta fuera de limites");
        }
        return false;
    }
    
    public static void añadePreg(Pregunta ask) throws IOException{
        if(setPregunta(numpreguntas,ask)){
            numpreguntas++;
        }
    }
    
    public static int getNumeroDePreguntas(){
        return numpreguntas;
    }
    
    public static Pregunta getPregunta(int i)throws IOException{
        if(i>=0 && i<getNumeroDePreguntas()){
            flujop.seek(i*tamañopreg);
            return new Pregunta(flujop.readUTF(),flujop.readUTF(),flujop.readUTF(),flujop.readUTF(),flujop.readBoolean(),flujop.readUTF(),flujop.readBoolean(),flujop.readUTF(),flujop.readBoolean());
            
        }else{
            JOptionPane.showMessageDialog(null,"Posicion de pregunta inválida");
            return null;
        }
    }
    
    public static int buscaPreg(String search)throws IOException{
        String pregbus;
        if(search == null){
            return -1;
        }
        for(int i=0; i<getNumeroDePreguntas();i++){
            flujop.seek(i*tamañopreg);
            pregbus = getPregunta(i).getpregunta();
            if(pregbus.equalsIgnoreCase(search))
                return i;
        }
        return -1;
    }
}
