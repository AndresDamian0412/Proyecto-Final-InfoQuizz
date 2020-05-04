package proyectofinal;
import java.io.*;
import javax.swing.*;

public class AltaUsuario {
    RandomAccessFile users;
    
    //constructor de clase
    public AltaUsuario(){
        try{
            users = new RandomAccessFile("Usuarios","rw");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null,"ERROR; No se pudo crear o encontrar el archivo");
        }
    }
    
    public long getFinal() throws IOException{
        if(users.length() !=0){
            users.seek(0);
            while(users.getFilePointer()< users.length()){
                users.readUTF();
                users.readUTF();
            }
        }
        return users.getFilePointer();
    }
    
    public boolean write(String nomuser, String password) throws IOException{
        users.seek(getFinal());
        users.writeUTF(nomuser);
        users.writeUTF(password);
        
        users.seek(0);
        String user, pass;
        while(users.getFilePointer()< users.length()){
            user = users.readUTF();
            pass = users.readUTF();
            if(user.equals(nomuser)&& pass.equals(password)){
                return true;   
            }
        }
        return false;
        
        
    }
    
    public boolean buscaUsuario(String usuario, String contraseña) throws IOException{
        users.seek(0);
        String user,pass;
        while(users.getFilePointer()<= users.length()){
            user = users.readUTF();
            pass = users.readUTF();
            if(user.equals(usuario)!= pass.equals(contraseña)){
                return false;   
            }
        }
        return true;
    }
    
}
