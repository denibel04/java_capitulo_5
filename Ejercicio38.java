/**
 * Capítulo 5
 * Ejercicio 38: Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. Elprograma debe pedir la altura. Se debe comprobar
 * que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio38 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura del reloj de arena");
        int altura = sc.nextInt();
        sc.close();
            System.out.println("El reloj de arena de altura " + altura + " es:");

        // Definición de variables
        int i = 0;
        int espDelante = 0;

        if (altura%2==0 || altura<3) {
            System.out.println("Error. La altura debe ser un número impar mayor o igual a 3");
        } else {
            // Mitad de arriba
            while (i<altura/2+1) {
                for (int j = 0; j<espDelante; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j<altura-espDelante*2; j++) {
                    System.out.print("*");
                }
                if (i<=altura/2) {
                    System.out.print("*");
                }
                i++;
                espDelante++;
                System.out.println("");
            }
            // Mitad de abajo
            espDelante = altura/2-1;
            i = 1;
            while (i<=altura/2) {
                for (int j = 0; j<espDelante; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j<altura-espDelante*2; j++) {
                    System.out.print("*");
                }
                i++;
                espDelante--;
                System.out.println("");
            }
        }
    }
}
