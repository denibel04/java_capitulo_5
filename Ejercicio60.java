/**
 * Capítulo 5
 * Ejercicio 60: Escribe un programa que pinte por pantalla un par de calcetines, de los que se ponen al lado del árbol de Navidad para que Papá Noel
 * deje sus regalos. El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o igual a 4. Observa que la talla de
 * los calcetines y la distancia que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio60 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de los calcetines: ");
        int altura = sc.nextInt();
        sc.close();

        for (int i = 0; i<altura-2; i++) {
            System.out.println("***     ***");
        }
        for (int i= 0; i<2; i++)
            System.out.println("******  ******");
    }
}
