
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Contactos {
        static String ruta="H:/agenda.txt";
        static FileWriter escribe;
        static File archivo = new File(ruta);
        static BufferedWriter bw;
    public static void annadir(String nombre, String email, String telefono){
        try {
            escribe = new FileWriter (archivo, true);
            bw=new BufferedWriter(escribe);
            escribe.write(nombre);
            escribe.append(",");
            escribe.write(telefono);
            escribe.append(",");
            escribe.write(email);            
            bw.newLine();
            bw.close();
            escribe.close();
        } catch (IOException ex) {
            Logger.getLogger(Contactos.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
}
