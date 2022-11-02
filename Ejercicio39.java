/**
 * Capítulo 5
 * Ejercicio 39: Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los números desde
 * el 1 al número introducido junto con su factorial.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio39 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número hasta el que quiera mostrar su factorial");
        int num = sc.nextInt();
        if (num<0) {
            System.out.print("Error. El número tiene que ser positivo");
        } else {
            System.out.printf("Los factoriales del 1 hasta el %d son:\n", num);
            for (int j=1; j<=num; j++) {
                int fact = j;
                for (int i=1; i<j; i++) {
                    fact = fact * i; }
                System.out.println(j + "! = " + fact);
            }
        }
        sc.close();
    }
}
