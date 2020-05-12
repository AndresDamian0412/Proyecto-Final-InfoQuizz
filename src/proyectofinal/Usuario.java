/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author andre
 */
public class Usuario {
    String Username;
    String Password;
    float Puntaje;
    
    public Usuario(String user, String pass){
        this.Username =user;
        this.Password = pass;
        this.Puntaje = 0;
    }
    public Usuario(String user, String pass, float punt){
        this.Username =user;
        this.Password = pass;
        this.Puntaje = punt;
    }
    
    public String getUser(){
        return Username;
    }
    
    public String getPass(){
        return Password;
    }
    
    public float getPuntaje(){
        return Puntaje;
    }
    
    public int getTamUser(){
        return (((Username.length())*2)+((Password.length())*2)+8);
    }
}