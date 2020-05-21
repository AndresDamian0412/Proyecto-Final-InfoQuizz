/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
                                                                                   //esta clase es igual a la de preguntas
import java.io.File;                                                                //solo se cambia el nombre de las variables
import java.io.IOException;                                                     // y algunas funcionalidades
import java.io.RandomAccessFile;   //paquetes importados
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class AccesoAleatorioU {
    private static RandomAccessFile flujou;
    private static int Numusuarios;          //atributos de la clase
    private static final int Tamañouser = 100; // tamaño de usuario en el archivo
    
    public static void creaArchUser(File archivo) throws IOException {
        flujou = new RandomAccessFile(archivo,"rw"); // se crea flujo
        Numusuarios = (int)Math.ceil((double)flujou.length()/(double)Tamañouser); // regresa numero de usuarios en el archivo
    }
    
    public static void cierraflujo()throws IOException{ // cierra flujo
        flujou.close();
    }
    
    public static boolean setUsuario(int i, Usuario u)throws IOException{ // escribe usuario
        if(i>=0 && i<=getNumerodeUsers()){ //revisa que la posicion este dentro del archivo
            if(u.getTamUser()>Tamañouser){ // revisa que el tamaño sea apropiado, si lo es, pasa al else
                JOptionPane.showMessageDialog(null, "Tamaño de usuario demasiado grande");
            }else{ // escribe en el archivo
                flujou.seek(i*Tamañouser);
                flujou.writeUTF(u.getUser()); //escribe usuario
                flujou.writeUTF(u.getPass()); //escribe contraseña
                flujou.writeFloat(u.getPuntaje()); //Escribe puntaje
                return true; // si todo va bien, regresa verdadero igual que la clase anterior
            }
        }else{
            JOptionPane.showMessageDialog(null, "Posicion de Usuario fuera de limites");
        }
        return false;
    }
    
    public static void añadeUsuario(Usuario u)throws IOException{
        if(setUsuario(Numusuarios,u)){ // si se agrega el usuario bien, regresa verdadero e incrementa el numero de usuarios en el archivo
            Numusuarios++;
        }
    }
        
    public static int getNumerodeUsers(){
        return Numusuarios;        // solo regresa el numero de usaurios en el archivo
    }
    
    public static Usuario getUsuario(int i)throws IOException{ //regresa informacion de un usuario en especifico para conusultas
        if(i>=0 && i<getNumerodeUsers()){ //si esta dentro del rango sigue con su trabajo
            flujou.seek(i*Tamañouser); // se posiciona en la posicion que busca
            return new Usuario(flujou.readUTF(),flujou.readUTF(),flujou.readFloat()); // regresa el usuario de esa posicion en el archivo
            
        }else{
            JOptionPane.showMessageDialog(null,"Posicion de usuario inválida");
            return null;
        }
    }
    
    public static Usuario getUsuarioypass(int i)throws IOException{ //esta funcion sirve para la comprobacion del login
        if(i>=0 && i<getNumerodeUsers()){ // si esta dentro del rango sigue su trabajo 
            flujou.seek(i*Tamañouser); // se posiciona en la posicion del usuario
            return new Usuario(flujou.readUTF(),flujou.readUTF()); // regresa unicamente el usuario y contraseña segun el archivo
            
        }else{
            JOptionPane.showMessageDialog(null,"Posicion de usuario inválida");
            return null;
        }
    }
    
    public static int buscaUser(String search)throws IOException{ //sirve para buscar un usuario y saber su posicion
        String userbus;
        if(search == null){ //comprueba que la busqueda no este vacia
            return -1; 
        }
        for(int i=0; i<getNumerodeUsers();i++){ // recorre todo el archivo y si encuentra lo que se busca regresa la posicion para obtener ese archivo
            flujou.seek(i*Tamañouser);
            userbus = getUsuario(i).getUser();
            if(userbus.equalsIgnoreCase(search))
                return i;
        }
        return -1;
    }
    
     public static int buscaUserypass(String user, String pss)throws IOException{ // Busca el usuario y contraseña para el login
        String userbus, passuser;  //estas dos variables se usan para comprobaciones con lo que se manda y con lo que se encuentra en el archivo
        if(user == null||pss == null){ // si son vacios no hace la busqueda y regresa -1
            return -1;
        }
        for(int i=0; i<getNumerodeUsers();i++){ //sirve para recorrer el archivo
            flujou.seek(i*Tamañouser); 
            userbus = getUsuario(i).getUser(); //se usa el getter de usuario para el objeto usuario que regresa la funcion getUsuario
            passuser = getUsuario(i).getPass(); // hace lo mismo que el anterior solo que recibe la contraseña
            if(userbus.equalsIgnoreCase(user)&& passuser.equals(pss)) // si son iguales regresa 1, si no, sigue el ciclo hasta recorrer todo el archivo
                return 1;
        }
        return -1;
    }
     public static int posicionUserypass(String user, String pss)throws IOException{ // Busca el usuario y contraseña para el login
        String userbus, passuser;  //estas dos variables se usan para comprobaciones con lo que se manda y con lo que se encuentra en el archivo
        if(user == null||pss == null){ // si son vacios no hace la busqueda y regresa -1
            return -1;
        }
        for(int i=0; i<getNumerodeUsers();i++){ //sirve para recorrer el archivo
            flujou.seek(i*Tamañouser); 
            userbus = getUsuario(i).getUser(); //se usa el getter de usuario para el objeto usuario que regresa la funcion getUsuario
            passuser = getUsuario(i).getPass(); // hace lo mismo que el anterior solo que recibe la contraseña
            if(userbus.equalsIgnoreCase(user)&& passuser.equals(pss)) // si son iguales regresa 1, si no, sigue el ciclo hasta recorrer todo el archivo
                return i;
        }
        return -1;
    }
}
