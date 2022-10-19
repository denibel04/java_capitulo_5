/**
 * Capítulo 5
 * Ejercicio 11: Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa que muestre en tres columnas, el cuadrado y el cubo de los 5 siguientes números enteros al que se introduzca");
        System.out.println("Introduzca el número: ");
        int num = sc.nextInt();
        System.out.printf("%-8s %-10s %s\n", "número", "cuadrado", "cubo");
        for (int i= num; i<num+5; i++) {
            System.out.printf("%6d %10d %6d\n", i, i * i, i * i * i);
        }
        sc.close();
    }
}