package Ejercicios;/*

Ejercicio propuesto A.1: Crea un programa que pida frases al usuario y las guarde en un fichero de texto, cada frase en una línea.

* */


import java.io.*;
import java.util.Scanner;

public class Ejercicio_A1 {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        System.out.println("Ejercicio A1 - Hecho por Rubén del Pino Castellanos");

        File ficherosTexto = new File("C:\\Users\\RubéndelPinoC\\Desktop\\Acceso a datos\\Trimestre I\\FicherosTexto\\FicherosTexto\\Ejercicio_A1.txt");

        Scanner leer = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            System.out.println("Dime una frase para guardar en el fichero de texto [+] Ejercicio_A1.txt [+] ");

            String frase = leer.nextLine();

            try {

                BufferedWriter fichero = new BufferedWriter(new FileWriter(ficherosTexto, true));
                fichero.write(frase);
                fichero.newLine();
                //fichero.close();

                System.out.println("");
                System.out.println("¿Quieres añadir otra frase? (S/N)");
                String opcion = leer.nextLine();
                if (opcion.equals("S") || opcion.equals("s")) {
                    fichero.write(frase);
                    fichero.newLine();
                    continuar = true;
                } else if (opcion.equals("N") || opcion.equals("n")) {
                    continuar = false;
                    System.out.println("");
                    System.out.println("De acuerdo saliendo del programa.");
                    System.out.println("");
                    fichero.close();

                }
            }catch(FileNotFoundException FNFE){
                System.out.println("No existe el fichero");
            } catch(IOException ioException){
                System.out.println("Error al cargar el fichero " +ioException.getMessage());
            }

        }



        // Mostramos el contenido del fichero linea por linea

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(ficherosTexto));
            String linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
        }   catch (IOException ioException) {

            System.out.println("Error al cargar el fichero");

        }


    }

}