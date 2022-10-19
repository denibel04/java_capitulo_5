/**
 * Capítulo 5
 * Ejercicio 10: Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
 * A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir
 * los datos cuando meta un número negativo.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la media de un conjunto de números positivos.\nParará cuando introduzca uno negativo.");
        System.out.println("Comienza a introducir números");
        double num = sc.nextDouble();
        double i = 1;
        double suma = 0;
        while (num>=0) {
            suma = suma + num;
            i++;
            System.out.println("Introduzca otro número");
            num = sc.nextDouble();
        }
        System.out.println("La media de los números introducidos es " + suma/i);
        sc.close();
    }
}
