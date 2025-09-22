package Ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ejercicio_A2 {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        /*
        *
        * Ejercicio propuesto A.2: Crea un programa que pida al usuario el nombre de un fichero de texto y muestre to_do su contenido en pantalla.
        * Tras cada 24 líneas, deberá hacer una pausa hasta que el usuario pulse Intro.
        *
        * */

        System.out.println("Ejercicio A2 - Hecho por Rubén del Pino Castellanos");

        Scanner entrada = new Scanner (System.in);

        System.out.println("Dime el nombre del archivo a leer : ");

        String nombreFichero = entrada.nextLine();

        int contador = 1;

        try {

            BufferedReader br = new BufferedReader (new FileReader ("src/Ejercicios/"+ nombreFichero));

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;

                if (contador == 25) {
                    contador = 1;
                    System.out.println("Presione enter para continuar");
                    entrada.nextLine();
                }
            }
            System.out.println("[+] Fin del archivo [+]");

        } catch (FileNotFoundException FNFE){
            System.out.println("No se puede leer el archivo. O el archivo no existe.");
        }

    }

}
