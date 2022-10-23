/**
 * Capítulo 5
 * Ejercicio 23: Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere
 * el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los números introducidos y la media.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio23 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // definimos las variables que necesitaremos
        int n;
        int sumaInt = 0;
        int i = 0; //contador de números introducidos
        System.out.println("Este programa pedirá números hasta que la suma de todos los que introduzca supero los 10000.\nDespués imprimirá la suma de ellos, la cantidad de números que ha introducido y la media");
        do {
            System.out.print("Introduzca un número: ");
            n = sc.nextInt();
            sumaInt += n;
            i++;
        } while (sumaInt<=10000);
        System.out.printf("Ha introducido %d números. La suma de todos es %d y la media es " + sumaInt/i, i, sumaInt);
        sc.close();
    }
}
