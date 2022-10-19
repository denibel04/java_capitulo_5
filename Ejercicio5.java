/**
 * Capítulo 5
 * Ejercicio 5: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle while.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio5 {
    public static void main (String[] args) {
        int i = 360;
        while (i>=160) {
            System.out.printf(i + " ");
            i = i-20;
        }
    }
}