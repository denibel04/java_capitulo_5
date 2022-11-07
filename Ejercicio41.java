/**
 * Capítulo 5
 * Ejercicio 41: Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número. Se recomienda
 * usar long en lugar de int ya que el primero admite números más largos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio41 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor introduzca un número entero positivo: ");
        long num = sc.nextInt();
        sc.close();

        // Definimos las variables
        int contPares = 0;
        int contImpares = 0;

        // Comprueba cada dígito si es par o impar
        while (num > 0) {
            if ((num%10) % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
            num /= 10;
        }
        System.out.printf("El número introducido tiene %d dígitos pares y %d dígitos impares", contPares, contImpares);
    }
}
