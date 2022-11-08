/**
 * Capítulo 5
 * Ejercicio 62: Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9. Los números de la mala suerte son el
 * resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un número es afortunado si contiene más números de la suerte que de la mala suerte. Realiza
 * un programa que diga si un número introducido por el usuario es afortunado o no.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio62 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número que quiera saber si es afortunado: ");
        long num = sc.nextLong();
        long aux = num;
        sc.close();

        // Definicion de variables
        int buenaSuerte = 0;
        int malaSuerte = 0;

        while (num>0) {
            if (num%10 == 3 || num%10 == 7 || num%10 == 8 || num%10 == 9) {
                buenaSuerte++;
            } else {
                malaSuerte++;
            }
            num /= 10;
        }

        if (buenaSuerte>malaSuerte) {
            System.out.printf("El %d es afortunado", aux);
        } else {
            System.out.printf("El %d no es afortunado", aux);
        }
    }
}
