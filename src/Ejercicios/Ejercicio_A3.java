package Ejercicios;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_A3 {

    /*
     * Ejercicio propuesto A.3: Crea un programa que pida al usuario el nombre de un fichero de texto y muestre en pantalla la cantidad de líneas de texto que contiene.
     * */


    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("Ejercicio A3 - Hecho por Rubén del Pino Castellanos");

        Scanner entrada = new Scanner (System.in);

        System.out.println("Dime el nombre del archivo a leer : ");

        String nombreFichero = entrada.nextLine();

        int contadorLineas = 0;

        BufferedReader br = new BufferedReader(new FileReader("src/Ejercicios/"+nombreFichero));
        try {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contadorLineas++;
            }
            System.out.println("Líneas totales : " + contadorLineas);

        } catch (FileNotFoundException FNFE){
            System.out.println("Error: Fichero no encontrado");
        }


    }


}