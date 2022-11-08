/**
 * Capítulo 5
 * Ejercicio 52: Realiza un programa que sea capaz de desplazar todos los dígitos de un número de derecha a izquierda una posición. El dígito
 * de más a la izquierda, pasaría a dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se queda igual.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio52 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long aux = num;
        int i = 0;
        long primero = 0;
        // Cuenta la longitud del número
        while (aux>0) {
            aux /= 10;
            i++;
        }
        aux = num;
        // Guarda el primer dígito del número
        for (int j = 1; j<=i; j++) {
            aux /= 10;
            if (j==i-1) {
                primero = aux%10;
            }
        }
        long num2 = (long)(num - (primero * Math.pow(10, i-1)));
        System.out.print((num2)*10 + primero);

        sc.close();
    }
}