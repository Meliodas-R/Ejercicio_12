package ejercicio_12;

import java.util.Scanner;

/**
 * 12. Recoger por teclado una palabra o frase que introduzca el usuario y
 * contar el número de vocales que contiene. Mostrar por pantalla el resultado.
 *
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int contador = 0;

        System.out.print("Introduzca una frase: ");
        cadena = teclado.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            //Comprobamos si el caracter es una vocal
            if (cadena.charAt(i) == 'a'
                    || cadena.charAt(i) == 'e'
                    || cadena.charAt(i) == 'i'
                    || cadena.charAt(i) == 'o'
                    || cadena.charAt(i) == 'u') {
                contador++;
            }
        }

        System.out.println("'" + cadena + "'" + " contiene " + contador + " vocales.");
    }

}
