/**
 * Capítulo 5
 * Ejercicio 9: Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * Este ejercicio es equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba
 * limitado a números de 5 dígitos como máximo. En esta ocasión, hay que realizar el ejercicio utilizando
 * bucles; de esta manera, la única limitación en el número de dígitos la establece el tipo de dato que se
 * utilice (int o long).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del que quiera saber cuántos dígitos tiene");
        long num = sc.nextLong();
        int numDigitos = 1;
        while (num>10) {
            num = num / 10;
            numDigitos++;
        }
        System.out.printf("El número tiene %d dígitos.", numDigitos);
        sc.close();
    }
}
