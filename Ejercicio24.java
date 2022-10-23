/**
 * Capítulo 5
 * Ejercicio 24: Escribe un programa que lea un número n e imprima una pirámide de números son n filas como en la siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio24 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de la pirámide");
        int tam = sc.nextInt();
        sc.close();
        System.out.printf("La pirámide de altura %d es \n", tam);
        for (int i = 1; i<=tam; i++) {
            for (int j=1; j<=tam-i; j++) { //imprime espacios
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) { // imprime los números incrementandose
                System.out.print(k);
            }
            for (int l=i-1; l>=1; l--) { // imprime  los numeros decreciendo
                System.out.print(l);
            }
            System.out.println("");
        }
    }
}