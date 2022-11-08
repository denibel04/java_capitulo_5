/**
 * Capítulo 5
 * Ejercicio 50: Una empresa de cartelería nos ha encargado un programa para realizar uno de sus diseños. Debido a los acontecimientos que han
 * tenido lugar en Cataluña durante el 2018, han recibido muchos pedidos del cartel que muestra el número 155. Realiza un programa que pinte el
 * número 155 mediante asteriscos. Al usuario se le pedirán dos datos, la altura del cartel y el número de espacios que habrá entre los números.
 * La altura mínima es 5. La anchura de los números siempre es la misma. La parte superior de los cincos también es siempre igual. La parte
 * inferior del 5 sí que varía en función de la altura.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio50 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura (5 como mínimo): ");
        int altura = sc.nextInt();
        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int espacio = sc.nextInt();
        sc.close();

        for (int i = 1; i<=altura; i++) {
            if (i==1 || i==3 || i==altura) { // Para la primera, tercera y ultima fila, pues son iguales
                System.out.print("*");
                for (int k = 1; k <=espacio; k++) {
                    System.out.print(" ");
                }
                System.out.print("****");
                for (int k = 1; k <=espacio; k++) {
                    System.out.print(" ");
                }
                System.out.println("****");
            } else if (i == 2) { // Para la segunda fila
                System.out.print("*");
                for (int k = 1; k <=espacio; k++) {
                    System.out.print(" ");
                }
                System.out.print("*   ");
                for (int k = 1; k <=espacio; k++) {
                    System.out.print(" ");
                }
                System.out.println("*   ");
            } else { // Para el cuerpo del 5, que es el que cambia de tamaño
                System.out.print("*");
                for (int k = 1; k <=espacio; k++) {
                    System.out.print(" ");
                }
                System.out.print("   *");
                for (int k = 1; k <=espacio; k++) {
                    System.out.print(" "); }
                System.out.println("   *");
            }
        }
    }
}
