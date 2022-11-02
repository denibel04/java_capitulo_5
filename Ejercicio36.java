/**
 * Capítulo 5
 * Ejercicio 36: Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números capicúa se leen igual hacia
 * delante y hacia atrás. El programa debe aceptar números de cualquier longitud siempre que lo permita el tipo, en caso contrario el ejercicio
 * no se dará por bueno. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 *
 * → @author Denisa Ramona Belean
 * https://github.com/denibel04 ☆
 */

import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos el número
        System.out.println("Introduzca el número que quiera saber si es capicúo");
        long num = sc.nextLong();
        long aux = num;
        sc.close();
        // Volteamos el número
        long volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
        }
        // Comprobamos si el número es igual del derecho y del revés
        if (aux == volteado) {
            System.out.println(aux + " es capicúo");
        } else {
            System.out.println(aux + " no es capicúo");
        }
    }
}
