/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.RandomAccessFile;
import java.io.*;                       //se importan los paquetes
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class AccesoAleatorioP { //clase que permite el flujo entre el archivo de preguntas y el programa
    private static RandomAccessFile flujop;     //Se declara el objeto de tipo aleatorio
    private static int numpreguntas;            //Esta variable nos ayuda a saber cuantas preguntas hay
    private static final int tamañopreg = 1200;  // Este es el tamaño predefinido para cada pregunta
    
    public static void creaArchPreg(File arch) throws IOException{
        flujop = new RandomAccessFile(arch,"rw");                       //clase que crea el flujo y nos dice el numero de preguntas en el archivo
        numpreguntas = (int)Math.ceil((double)flujop.length()/(double)tamañopreg); // Al dividir la longitud entre el tamaño se obtiene el aproximado
    }                                                                    //del numero de preguntas, y math ceil nos redondea al numero cercano hacia arriba
    
    public static void cierraflujo() throws IOException{ //esta funcion unicamente cierra el flujo
        flujop.close();    
    }
    
    public static boolean setPregunta(int i, Pregunta ask)throws IOException{ // esta funcion nos ayuda a escribir la pregunta en el archivo
                                                                            //despues de unas comprobaciones, recibe un objeto pregunta y un entero posicion
        if(i>=0 && i<=getNumeroDePreguntas()){ 
            if(ask.getTamaño()>tamañopreg){  //si el tamaño de la pregunta que queremos guardar es correcto se pasa al else
                JOptionPane.showMessageDialog(null, "La pregunta es demasiado grande:(");
                
            }else{ // aquí se escribe usando los getters del objeto
                flujop.seek(i*tamañopreg); // se posiciona en el ultimo lugar del archivo
                flujop.writeUTF(ask.getTema()); // Escribe tema
                flujop.writeUTF(ask.getSubt()); // Escribe subtema
                flujop.writeUTF(ask.getpregunta()); // Escribe pregunta
                flujop.writeUTF(ask.getRes1()); //Escribe un inciso
                flujop.writeBoolean(ask.isBres1()); //Escribe si es cierto o no
                flujop.writeUTF(ask.getRes2()); //Escribe un inciso
                flujop.writeBoolean(ask.isBres2());//Escribe si es cierto o no
                flujop.writeUTF(ask.getRes3());//Escribe un inciso
                flujop.writeBoolean(ask.isBres3());//Escribe si es cierto o no
                return true; //Si todo sale bien, regresa verdadero, mas adelante se ve porque
            }
        }else{
            JOptionPane.showMessageDialog(null,"Numero de pregunta fuera de limites");
        }
        return false;
    }
    
    public static void añadePreg(Pregunta ask) throws IOException{ // si se añaden preguntas seguidas sin cerrar el programa esto nos ayuda
        if(setPregunta(numpreguntas,ask)){ // si la funcion de escribir funciona, se incrementa el numero de preguntas
            numpreguntas++;
        }
    }
    
    public static int getNumeroDePreguntas(){
        return numpreguntas;                    //unicamente regresa el numero de preguntas que hay 
    }
    
    public static Pregunta getPregunta(int i)throws IOException{ // Este metodo nos ayuda a regresar una pregunta en especifico aunque aun esta en desarrollo
        if(i>=0 && i<getNumeroDePreguntas()){ //valida que este dentro del rango apropiado
            flujop.seek(i*tamañopreg); // se posiciona en el lugar que se solicita
            return new Pregunta(flujop.readUTF(),flujop.readUTF(),flujop.readUTF(),flujop.readUTF(),flujop.readBoolean(),flujop.readUTF(),flujop.readBoolean(),flujop.readUTF(),flujop.readBoolean());
            
        }else{
            JOptionPane.showMessageDialog(null,"Posicion de pregunta inválida");
            return null;
        }
    }
    
    public static int buscaPreg(String search)throws IOException{ // Esta nos ayuda a buscar una pregunta para el apartado de modificaciones
        String pregbus; // sirve para buscar pregunta en el archivo
        if(search == null){
            return -1;
        }
        for(int i=0; i<getNumeroDePreguntas();i++){
            flujop.seek(i*tamañopreg);                          //aun en desarrollo
            pregbus = getPregunta(i).getpregunta();
            if(pregbus.equalsIgnoreCase(search))
                return i;
        }
        return -1;
    }
}
