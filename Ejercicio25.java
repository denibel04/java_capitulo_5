/**
 * Capítulo 5
 * Ejercicio 25: Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio25 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para darle la vuelta");
        int num = sc.nextInt();
        int volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
        }
        System.out.printf("El número introducido del revés es %d", volteado);
        sc.close();
    }
}
