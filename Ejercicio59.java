/**
 * Capítulo 5
 * Ejercicio 59: Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe introducir la altura. En esa altura
 * va incluida la estrella y el tronco. Suponemos que el usuario introduce una altura mayor o igual a 4.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio59 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del arbolito de navidad (mínimo 4): ");
        int tam = sc.nextInt();
        tam = tam-2; // Quita a la altura de la pirámide el tronquito y la estrella

        // Imprime la estrella
        for (int i= 1; i<tam; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        // Imprime el árbol
        for (int i=1; i<=tam-1; i++) {
            for (int j=1; j<=tam-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i*2-1; k++) {
                System.out.print("^");
                for (int l=1; k<=(i*2-1)-2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i=1; i<=tam*2-1; i++) {
            System.out.print("^");
        }

        // Imprime el tronco
        System.out.println("");
        for (int i= 1; i<tam; i++) {
            System.out.print(" ");
        }
        System.out.println("Y");

        sc.close();
    }
}
