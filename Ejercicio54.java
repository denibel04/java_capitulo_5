/**
 * Capítulo 5
 * Ejercicio 54: Realiza un programa que pinte un triángulo hueco tal como se muestra en los ejemplos. El usuario debe introducir
 * la altura de la figura.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio54 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del triangulo rectángulo invertido: ");
        int altura = sc.nextInt();
        sc.close();

        for (int i = altura; i>=1; i--) {
            if (i == 1 || i == altura) {
                for (int j = 0; j<i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                System.out.print("*");
                for (int k = 0; k<i-2; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
