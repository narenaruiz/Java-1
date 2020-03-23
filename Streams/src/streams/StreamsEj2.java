/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author rafa
 */
public class StreamsEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
//lectura con try with resources - autoclosable
        try (FileInputStream fin = new FileInputStream("origen.txt")) {
//Leer bytes hasta que se encuentre el EOF (end of file)
//EOF es una marca para determinar el final de un archivo, es decir -1
            do {
                i = fin.read();
                if (i != -1) {
                    //System.out.print((char) i);
                    System.out.println("este es el entero leído sin convertir"+i);
                }
            } while (i != -1); //Cuando i es igual a -1, se ha 
            //alcanzado el final del archivo EOF
        } catch (IOException exc) {
            System.out.println("Error al leer el archivo");
            System.out.println(exc.getMessage());
        }
    }
}
