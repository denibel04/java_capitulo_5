/**
 * Capítulo 5
 * Ejercicio 32: Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares. Los dígitos pares
 * se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir números largos.
 *
 * → @author Denisa Ramona Belean
 * https://github.com/denibel04 ☆
 */

import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definimos las variables y pedimos el número
        int i=0;
        int sumaPares = 0;
        System.out.println("Introduce un número");
        long num = sc.nextInt();
        System.out.print("Los números pares son: ");
        sc.close();

        // Como nos pide de izquierda a derecha, hay que voltear el número:
        long volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
        }

        // Comprobamos si cada dígito es par:
        while (volteado > 0) {
            if ((volteado % 10)%2 == 0) {
                System.out.print(volteado % 10 + " ");
                sumaPares += volteado%10;
            }
            volteado /= 10;
        }

        System.out.print("\nEn total, esos números suman " + sumaPares);
    }
}
