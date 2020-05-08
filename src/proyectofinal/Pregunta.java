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
