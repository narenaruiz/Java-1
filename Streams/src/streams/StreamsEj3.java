/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author rafae
 */
public class StreamsEj3 {

    public static void main(String[] args) {
        //lectura/escritura sin autoclosable    
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            //Intentar abrir los archivos
            fin = new FileInputStream("origen.txt");
            fout = new FileOutputStream("destino.txt");
            //escribo cabecera 
            String cabecera="cabecera de prueba";
            fout.write(cabecera.getBytes());
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error de E/S: " + exc);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException exc) {
                System.out.println("Error al cerrar el archivo de entrada.");
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException exc) {
                System.out.println("Error al cerrar el archivo de salida.");
            }
        }

    }

}
