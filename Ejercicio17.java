/**
 * Capítulo 5
 * Ejercicio 17: Realiza un programa que sume los 100 números siguientes a un número entero y positivo
 * introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        do {
            System.out.println("Introduce un número entero para sumar los 100 siguientes");
            num = sc.nextInt();
            if (num<0) {
                System.out.println("Error. Introduzca un número positivo");
            }
        } while (num<0);
        for (int i=num; i<=num+100; i++) {
            suma = suma + i;
        }
        System.out.println("La suma de los 100 números siguientes al número introducido es " + suma);
        sc.close();
    }
}
