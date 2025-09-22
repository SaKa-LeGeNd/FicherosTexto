package Ejercicios;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_A5 {

    /*
    * Ejercicio propuesto A.5: Crea un programa que pida al usuario el nombre de un fichero de texto,
    * guarde todas sus líneas en un array y las vuelque a un nuevo fichero llamado "salida.txt", en orden contrario (de la última a la primera).
    *
    * */


    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("Ejercicio A5 - Hecho por Rubén del Pino Castellanos");

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

            /*
            * fichero.write(Arrays.toString(codigosFichero));
            * fichero.newLine();
            * */


        } catch (FileNotFoundException FNFE) {
            System.out.println("Error: Fichero no encontrado");
        }

        try{

            BufferedWriter fichero = new BufferedWriter(new FileWriter("src/Ejercicios/Salida.txt"));

            for (int i = 0; i < codigosFichero.length; i++) {
                System.out.println(codigosFichero[i]);
                fichero.write(codigosFichero[i]);
                fichero.newLine();
            }

        } catch (FileNotFoundException FNFE){
            System.out.println("Error: Fichero no encontrado");
        }

    }

}
