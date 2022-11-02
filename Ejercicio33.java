/**
 * Capítulo 5
 * Ejercicio 33: Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. Fíjate que el
 * programa inserta un espacio y pintados dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
 *
 * → @author Denisa Ramona Belean
 * https://github.com/denibel04 ☆
 */

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos la altura
        System.out.println("Introduzca la altura de la U");
        int altura = sc.nextInt();
        System.out.println("La U de altura " + altura + " es:" );

        // Imprime la altura
        for (int i = 0; i<altura-1; i++) {
            System.out.print("*");
            for (int j = 0; j<altura-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Imprime la base con el espacio para simular curvatura
        System.out.print(" ");
        for (int i = 0; i<altura-2; i++) {
            System.out.print("*");
        }

        sc.close();
    }
}
