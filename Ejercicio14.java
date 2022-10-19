/**
 * Capítulo 5
 * Ejercicio 14: Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        int base = sc.nextInt();
        System.out.println("Introduce el exponente");
        int exponente = sc.nextInt();
        int num = 1;
        for (int i=1; i<=exponente; i++) {
            if (exponente == 0){
                num = 0;
            } else {
                num = base * num;
            }
        }
        System.out.printf("%d elevado a %d es igual a %d", base, exponente, num);
        sc.close();
    }
}
