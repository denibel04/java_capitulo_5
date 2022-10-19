/**
 * Capítulo 5
 * Ejercicio 16: Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número que quieras saber si es primo");
        int n = sc.nextInt();
        boolean esprimo = true;
        int j = 2; // contador de veces que es divisible
        int i = 1; // contador que va dividiendo
        while (esprimo && i<=n/2) {
            if ((n%i)==0) {
                j--;
            }
            if (j==0){ // es decir, si se ha podido dividir entre más de dos números
                esprimo = false;
            }
            i++;
        } if (esprimo==true) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }
        sc.close();
    }
}
