/**
 * Capítulo 5
 * Ejercicio 43: Escribe un programa que permita partir un número introducido por teclado en dos partes. Las posiciones se cuentan de izquierda
 * a derecha empezando por el 1. Suponemos que el usuario introduce correctamente los datos, es decir, el número introducido tiene dos dígitos
 * como mínimo y la posición en la que se parte el número está entre 2 y la longitud del número. No se permite en este ejercicio el uso de funciones
 * de manejo de String (por ej. para extraer subcadenas dentro de una cadena).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio43 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = sc.nextLong();
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int posicion = sc.nextInt();
        sc.close();

        // Definicion de variables
        int j = 0; // cuenta los digitos que tiene el numero introducido
        long numPartido1 = 0;
        long numPartido2 = 0;

        // Para que se lean las posicicones de izquierda a derecha, es necesario voltear el número:
        long volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
            j++;
        }

        // Parte derecha
        for (int i = 1; i<posicion; i++) {
            numPartido1 = (numPartido1 * 10) + (volteado % 10);
            volteado /= 10; }

        // Parte izquierda
        for (int i = posicion; i<=j; i++) {
            numPartido2 = (numPartido2 * 10) + (volteado % 10);
            volteado /= 10; }
        System.out.printf("Los números partidos son el %d y el %d", numPartido1, numPartido2);

    }
}