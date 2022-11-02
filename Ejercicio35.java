/**
 * Capítulo 5
 * Ejercicio 35: Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe comprobar que la
 * altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 *
 * → @author Denisa Ramona Belean
 * https://github.com/denibel04 ☆
 */

import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la X");
        int altura = sc.nextInt();
        sc.close();
        System.out.println("La X de altura " + altura + " es:");

        // Definición de variables
        int i = 0;
        int espDelante = 0;
        int espMedio = altura-2;

        if (altura%2==0 || altura<3) {
            System.out.println("Error. La altura debe ser un número impar mayor o igual a 3");
        } else {
            // Mitad de arriba
            while (i<altura/2+1) {
                for (int j = 0; j<espDelante; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j<espMedio; j++) {
                    System.out.print(" ");
                }
                if (i<altura/2) {
                    System.out.println("*");
                }
                i++;
                espDelante++;
                espMedio -= 2;
            }
            // Mitad de abajo
            espMedio = 1;
            espDelante = altura/2-1;
            i = 1;
            System.out.println("");
            while (i<=altura/2) {
                for (int j = 0; j<espDelante; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j<espMedio; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                i++;
                espDelante--;
                espMedio+=2;
            }
        }
    }
}
