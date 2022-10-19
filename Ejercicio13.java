/**
 * Capítulo 5
 * Ejercicio 13: Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
 * y cuántos son negativos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        for (int i = 0; i<10; i++) {
            System.out.print("Introduzca un número:");
            int num = sc.nextInt();
            if (num>0) {
                positivos++;
            } else if (num<0) {
                negativos++;
            } else {
                cero++;
            }
        }
        System.out.printf("Ha introducido %d números positivos %d números negativos y %d ceros", positivos, negativos, cero);
        sc.close();
    }
}
