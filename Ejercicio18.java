/**
 * Capítulo 5
 * Ejercicio 18: Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por
 * teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando
 * de 7 en 7.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int n1 = sc.nextInt();
        int n2;
        do {
            System.out.println("Introduce el segundo número");
            n2 = sc.nextInt();
            if (n1 == n2) {
                System.out.println("Error. Deben ser números distintos");
            }
        } while (n1==n2);
        sc.close();

        // Si el primer número es mayor que el segundo, se intercambian los valores:
        if (n1>n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }
        System.out.println("Los números comprendidos entre los dos números anteriores incrementados de 7 en 7 son:");
        for (int i=n1; i<=n2; i+=7) {
            System.out.print(i + " ");
        }
    }
}
