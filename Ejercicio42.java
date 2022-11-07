/**
 * Capítulo 5
 * Ejercicio 42: Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los 5 números consecutivos
 * a partir del número introducido. Al lado de cada número se debe indicar si se trata de un primo o no.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio42 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor introduzca un número entero: ");
        int num = sc.nextInt();
        for (int i = num; i<=num+5; i++) {
            System.out.print(i);

            // PARA COMPROBAR SI ES PRIMO :
            boolean esprimo = true;
            int k = 2; // contador de veces que es divisible
            int j = 1; // contador que va dividiendo
            while (esprimo && j<=i/2) {
                if ((i%j)==0) {
                    k--;
                }
                if (k==0){ // es decir, si se ha podido dividir entre más de dos números
                    esprimo = false;
                }
                j++;
            } if (esprimo==true) {
                System.out.println(" es primo");
            } else {
                System.out.println(" no es primo");
            }
        }
        sc.close();
    }
}
