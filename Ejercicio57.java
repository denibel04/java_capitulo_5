/**
 * Capítulo 5
 * Ejercicio 57: Realiza un programa que pinte un triángulo hueco tal como se muestra en los ejemplos. El usuario debe introducir
 * la altura de la figura.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio57 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();
        sc.close();

        for (int i = 0; i<altura; i++) {
            if (i == 0 || i == altura-1) {
                for (int j = 1; j<=i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j<altura-i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j = 0; j<i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k<altura-i-2; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
