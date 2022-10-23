/**
 * Capítulo 5
 * Ejercicio 29: Escribe un programa que muestre por pantalla todos los números enteros positivos menores a uno leído por teclado
 * que no sean divisibles entre otro también leído de igual forma.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio29 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número positivo para imprimir todos los números positivos menores");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el número cuyos múltiplos no quiera mostrar");
        int num2 = sc.nextInt();
        System.out.printf("Los números enteros positivos menores a %d, no divisibles entre %d, son: ", num1, num2);
        for (int i = num1; i>=0; i--) {
            if (i%num2 != 0) {
            System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
