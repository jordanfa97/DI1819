package ejer1_modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Leer {

    //leer cadenas por teclado
    public static String leerCadena() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        try {
            String cadena = bf.readLine();
            return cadena;
        } catch (IOException ex) {
            System.out.println("Error al introducir el dato");
            return null;
        }
    }

    public static int leerInt() {

        String cadena;
        int num;
        cadena = leerCadena();

        try {
            do {
                if (cadena.matches("[a-zA-Z]")) {
                    System.out.println("incorrecto");
                    System.out.println("introduce numero: ");
                    cadena = leerCadena();
                }
            } while (cadena.matches("[a-zA-Z]"));
            num = Integer.parseInt(cadena);//convertimos  el string en int
            return num;
        } catch (NumberFormatException ex) {
            System.out.println("Error al introducir el dato");
            return 0;
        }

    }

    public static double leerDouble() {

        String cadena;
        double num;
        cadena = leerCadena();

        try {

            num = Double.parseDouble(cadena);//convertimos  el string en double
            return num;
        } catch (NumberFormatException ex) {
            System.out.println("Error al introducir el dato");
            return 0;
        }
    }

    public static short leerShort() {

        String cadena;
        short num;
        cadena = leerCadena();

        try {

            num = Short.parseShort(cadena);//convertimos  el string en double
            return num;
        } catch (NumberFormatException ex) {
            System.out.println("Error al introducir el dato");
            return 0;
        }

    }

    public static long leerLong() {

        String cadena;
        long num;
        cadena = leerCadena();

        try {

            num = Long.parseLong(cadena);//convertimos  el string en short
            return num;
        } catch (NumberFormatException ex) {
            System.out.println("Error al introducir el dato");
            return 0;
        }
    }

    public static float leerFloat() {

        String cadena;
        float num;
        cadena = leerCadena();

        try {

            num = Float.parseFloat(cadena);//convertimos  el string en short
            return num;
        } catch (NumberFormatException ex) {
            System.out.println("Error al introducir el dato");
            return 0;
        }
    }

    public static char leerCaracter() {
        char c = '\0';
        try {
            //evitando el problema que el INTRO quede en el buffer
            //opcion 1

            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            c = (char) br.read();
            int n = System.in.available();
            is.skip(n);
            //opcion 2
/* ***************************
 c= (char) is.read(); //pero queda el "\n" o INTRO
 // limpiar el INTRO del buffer del flujo de entrada

 int n= System.in.available(); //num bytes que quedan en el buffer
 is.skip(n); //skip(n) hace que se salten los n bytes del buffer limpiandolo
 *************** */
        } catch (IOException e) {
            e.printStackTrace();
        }
        return c;
    }
}
