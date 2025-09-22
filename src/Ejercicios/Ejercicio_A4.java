package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_A4 {

    /*
    *
    * Ejercicio propuesto A.4: Crea un programa que pida al usuario el nombre de un fichero de texto, cuente cuántas líneas contiene,
    * cree un array y guarde todas ellas, para luego mostrarlas en pantalla en orden contrario (de la última a la primera).
    *
    * */

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("Ejercicio A4 - Hecho por Rubén del Pino Castellanos");

        Scanner entrada = new Scanner (System.in);

        System.out.println("Dime el nombre del archivo a leer : ");

        String nombreFichero = entrada.nextLine();

        int contadorLineas = 0;


        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Ejercicios/"+nombreFichero));


            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contadorLineas++;
            }
            System.out.println("Líneas totales : " + contadorLineas);
            System.out.println("");

        } catch (FileNotFoundException FNFE){
            System.out.println("Error: Fichero no encontrado");
        }

        String [] codigosFichero = new String[contadorLineas];

        try {

            BufferedReader br = new BufferedReader(new FileReader("src/Ejercicios/"+nombreFichero));

            String linea;
            while ((linea = br.readLine()) != null) {

                codigosFichero[contadorLineas-1] = linea; //Desde la ultima
                contadorLineas--;
            }

            System.out.println(Arrays.toString(codigosFichero));
        } catch (FileNotFoundException FNFE) {
            System.out.println("Error: Fichero no encontrado");
        }

    }

}

// Esta es la ultima línea