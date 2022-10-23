/**
 * Capítulo 5
 * Ejercicio 28:
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio28 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Introduce el número del que quiera calcular el factorial");
        int num = sc.nextInt();
        if (num<0) {
            System.out.print("Error. El número tiene que ser positivo");
        } else {
            for (int i=1; i<=num; i++) {
                fact = fact * i; }
            System.out.println(num + "! = " + fact);
        }
        sc.close();
    }
}
