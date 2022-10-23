/**
 * Capítulo 5
 * Ejercicio 27: Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio27 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        int suma  = 0;
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        System.out.printf("Los múltiplos de 3 comprendidos entre el 1 y %d son: ", num);
        for (int i = 1; i<=num; i++) {
            if (i%3 == 0) {
                System.out.print(i + " ");
                j++;
                suma = suma + i;
            }
        }
        System.out.printf("\nSon %d múltiplos, que sumados hacen %d", j, suma);
        sc.close();
    }
}
