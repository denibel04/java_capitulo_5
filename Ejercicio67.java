/**
 * Capítulo 5
 * Ejercicio 67: Realiza un programa que pinte una escalera que va descendiendo de izquierda a derecha. El programa pedirá el número de escalones
 * y la altura de cada escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio67 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de escalones: ");
        int num = sc.nextInt();
        System.out.print("Introduzca la altura de cada escalón: ");
        int altura = sc.nextInt();
        sc.close();

        for (int i = 0; i<num; i++) {
            for (int k = 0; k<altura; k++) {
                for (int j = 0; j<=i; j++) {
                    System.out.print("****");
                }
                System.out.println("");
            }
        }
    }
}
