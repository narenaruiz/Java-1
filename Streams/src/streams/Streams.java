/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author rafa
 */
public class Streams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
//lectura y escritura con try with resources - autoclosable
        try (FileInputStream fin = new FileInputStream("origen.txt");
                FileOutputStream fout = new FileOutputStream("destino.txt")) {
            do {
                //read devuelve un entero perteneciente al código
                //ascii del byte leído
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1); //Cuando i es igual a -1, se ha 
            //alcanzado el final del archivo EOF
        } catch (IOException exc) {
            System.out.println("Error al leer el archivo");
            System.out.println(exc.getMessage());
        }
    }
}
