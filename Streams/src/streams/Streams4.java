/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafae
 */
public class Streams4 {

    public static void main(String[] args) {
        try {
            leerCharStreams();
            escribirCharStreams();
            int []a={5,4,3,2};
            a[1]=5;
            pruebaArray(a);
        } catch (IOException ex) {
            Logger.getLogger(Streams4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void leerCharStreams() throws IOException {
        // Define el archivo a usar
        File entrada = new File("origen.txt");
        // Instancia un FileReader que se encargará de leer del archivo
        FileReader lector = new FileReader(entrada);
        // Declara una variable que contendrá el caracter a leer
        int unCaracter;
        // Lee el archivo e iprime el caracter leído
        while ((unCaracter = lector.read()) != -1) {
            System.out.print((char) unCaracter);
        }
        lector.close();// Cierra el archivo 
    }

    public static void escribirCharStreams() throws IOException {
        File archivoSalida = new File("destino.txt");
        // Instancia un FileWriter que se encargara de escribir
        FileWriter escritor = new FileWriter(archivoSalida);
        // Construye una cadena de caracteres a ser guardada en el archivo
        String info = "Soy la informacion!";
        // Escribe el archivo con la informacion
        for (int i = 0; i < info.length(); i++) {
            escritor.write(info.charAt(i));
        }
        // Cierra el stream
        escritor.close();
        // Informa que el archivo ha sido escrito
        System.out.println("El archivo ha sido escrito...");
    }

    public static void lecturaBufferedReader() throws IOException {
        // Instancia un objeto File de entrada
        File archivoEntrada = new File("fuenteBuffer.txt");
        // Construye un BufferedReader
        BufferedReader lectorMejorado
                = new BufferedReader(new FileReader(archivoEntrada));

        // Defino variables
        boolean eof = false;
        String lineaLeida = "";
        String[] broken_text = null;

        // Lee el archivoEntrada de forma eficiente 
        //e imprime los datos en pantalla
        while (!eof) {
            // Lee una linea entera
            lineaLeida = lectorMejorado.readLine();
            //una vez leída la línea la podemos partir con el método split,
            //suele ser muy útil
            broken_text = lineaLeida.split(" ");
            // Imprime la linea en pantalla
            if (lineaLeida != null) {
                System.out.println(lineaLeida);
            } // Si llego al final del archivo, termina la ejecución
            else {
                eof = true;
            }
        }        // Cierra el FileReader
        lectorMejorado.close();
    }

    public static void escrituraBufferedWriter() throws IOException {
        File archivoSalida = new File("destinoBuffer.txt");

        // Define el contenido a grabar en el archivo
        String linea1 = "Soy la línea #1";
        String linea2 = "Yo soy la línea #2!";
        String linea3 = "Y yo la línea #3!!!";

        // Construye un BufferedWriter
        BufferedWriter escritorMejorado = 
                new BufferedWriter(new FileWriter(archivoSalida));
        // Si quisieramos escribir un fichero en el que tiene contenido 
        //y no borrar éste, de manera que escribamos a continuación lo podemos 
        //hacer con el siguiente flag a true
        //BufferedWriter escritorMejorado =
        //new BufferedWriter( new FileWriter(archivoSalida,true) );

        // Escribe el archivo de salida a traves del BufferedWriter
        escritorMejorado.write(linea1, 0, linea1.length());
       //El método denominado newLine() que se utiliza para escribir en el stream la 
       //representación de una nueva línea, es decir la tecla “enter”, entendiendo 
        //que cada sistema operativo puede representarla con distintos caracteres.
        escritorMejorado.newLine();
        escritorMejorado.write(linea2, 0, linea2.length());
        escritorMejorado.newLine();
        escritorMejorado.write(linea3, 0, linea3.length());
        // Cierra el BufferedWriter
        escritorMejorado.close();
    }
    public static void pruebaArray(int [] array){
        System.out.println("prueba array");
        for (int i=0;i<array.length;i++){
        System.out.println(array[i]);
        }
    }
}
