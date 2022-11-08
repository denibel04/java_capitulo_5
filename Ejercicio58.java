/**
 * Capítulo 5
 * Ejercicio 58: Realiza un programa que calcule la media de los dígitos que contiene un número entero introducido por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio58 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        long num = sc.nextLong();
        sc.close();

        // Definicion de variables
        long suma = 0;
        int i = 0;

        while (num>0) {
            suma = suma + num%10;
            num /= 10;
            i++;
        }

        System.out.printf("La media de sus dígitos es : %.2f", (float)(suma) / (float)(i));
    }
}
