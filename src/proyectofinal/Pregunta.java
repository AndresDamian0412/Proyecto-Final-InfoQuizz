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
    
    String Tema;
    String Subt;
    String pregunta;
    String res1;
    String res2;
    String res3;
    boolean bres1;
    boolean bres2;
    boolean bres3;
    
    public Pregunta(String tem, String subt,String preg, String r1,boolean br1, String r2, boolean br2, String r3, boolean br3){
        this.bres1 = br1;
        this.bres2 = br2;
        this.bres3 = br3;
        this.Tema = tem;
        this.Subt = subt;
        this.pregunta = preg;
        this.res1 = r1;
        this.res2 = r2;
        this.res3 = r3;
    }
    
    
    public int getTamaño(){
        int suma;
        suma = ((Tema.length())*2)+ ((Subt.length())*2)+((pregunta.length())*2)+ ((res1.length())*2)
                +((res2.length())*2)+((res3.length())*2)+12+3;
        return suma;
    }

    public String getTema() {
        return Tema;
    }

    public String getSubt() {
        return Subt;
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

    public boolean isBres1() {
        return bres1;
    }

    public boolean isBres2() {
        return bres2;
    }

    public boolean isBres3() {
        return bres3;
    }
}
