/**
 * Capítulo 5
 * Ejercicio 8: Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del que quiera mostrar la tabla de multiplicar");
        int num = sc.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.printf("%d × %d = %d\n", num, i, num*i);
        }
        sc.close();
    }
}
