/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.Serializable;

/**
 *
 * @author andre
 */
public class Pregunta implements Serializable {
    
    String pregunta;
    String res1;
    String res2;
    String res3;
    
    public Pregunta(String preg, String r1, String r2, String r3){
        this.pregunta = preg;
        this.res1 = r1;
        this.res2 = r2;
        this.res3 = r3;
    }
    
    
    public int getTamaño(){
        return 0; // recordar modificar QUITAR
    }
    
    public String getpregunta(){
        return pregunta;
    }
    
    public String getRes1(){
        return res1;
    }
    
    public String getRes2(){
        return res2;
    }
    
    public String getRes3(){
        return res3;
    }
}
