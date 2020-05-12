/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class AccesoAleatorioU {
    private static RandomAccessFile flujou;
    private static int Numusuarios;
    private static final int Tamañouser = 100;
    
    public static void creaArchUser(File archivo) throws IOException {
        flujou = new RandomAccessFile(archivo,"rw");
        Numusuarios = (int)Math.ceil((double)flujou.length()/(double)Tamañouser);
    }
    
    public static void cierraflujo()throws IOException{
        flujou.close();
    }
    
    public static boolean setUsuario(int i, Usuario u)throws IOException{
        if(i>=0 && i<getNumerodeUsers()){
            if(u.getTamUser()>Tamañouser){
                JOptionPane.showMessageDialog(null, "Tamaño de usuario demasiado grande");
            }else{
                flujou.seek(i*Tamañouser);
                flujou.writeUTF(u.getUser());
                flujou.writeUTF(u.getPass());
                flujou.writeFloat(u.getPuntaje());
                return true;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Posicion de Usuario fuera de limites");
        }
        return false;
    }
    
    public static void añadeUsuario(Usuario u)throws IOException{
        if(setUsuario(Numusuarios,u)){
            Numusuarios++;
        }
    }
        
    public static int getNumerodeUsers(){
        return Numusuarios;
    }
    
    public static Usuario getUsuario(int i)throws IOException{
        if(i>=0 && i<getNumerodeUsers()){
            flujou.seek(i*Tamañouser);
            return new Usuario(flujou.readUTF(),flujou.readUTF(),flujou.readFloat());
            
        }else{
            JOptionPane.showMessageDialog(null,"Posicion de usuario inválida");
            return null;
        }
    }
    
    public static int buscaUser(String search)throws IOException{
        String userbus;
        if(search == null){
            return -1;
        }
        for(int i=0; i<getNumerodeUsers();i++){
            flujou.seek(i*Tamañouser);
            userbus = getUsuario(i).getUser();
            if(userbus.equalsIgnoreCase(search))
                return i;
        }
        return -1;
    }
}
