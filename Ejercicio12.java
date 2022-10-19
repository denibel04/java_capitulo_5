/**
 * Capítulo 5
 * Ejercicio 12: Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El
 * primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…
 * El número n se debe introducir por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números de la sucesión de Fibonacci quiere mostrar?");
        int tope = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int aux = 1;
        System.out.print("0 ");
        for (int i=0; i<tope-1; i++) {
            System.out.print(aux + " ");
            aux = n1 + n2;
            n1 = n2;
            n2 = aux;
        }
        sc.close();
    }
}
