package proyectofinal;
import java.io.*;

public class AltaUsuario {
    RandomAccessFile users;
    
    public AltaUsuario(){
        try{
            users = new RandomAccessFile("Usuarios","rw");
        } catch(IOException e){
            
        }
    }
    
    public int getFinal() throws IOException{
        
        return 0;
    }
    
    //constructor de clase
    
    
    
}
