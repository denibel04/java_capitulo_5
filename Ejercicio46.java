/**
 * Capítulo 5
 * Ejercicio 46: Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. Se debe pedir al usuario la anchura y
 * la altura. Hay que comprobar que tanto la anchura como la altura sean mayores o iguales que 2, en caso contrario se debe mostrar un
 * mensaje de error.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio46 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del rectángulo (como mínimo dos): ");
        int altura = sc.nextInt();
        System.out.print("Ahora introduzca el ancho (como mínimo 2): ");
        int ancho = sc.nextInt();
        sc.close();

        // Se comprueba que se hayan introducido bien los datos
        if (altura<2 && ancho<2) { //si los ha introducido mal: muestra el mensaje de error
            System.out.print("Error. Los datos mínimos para la altura y anchura es 2.");
        } else { // si los ha introducido bien: muestra el rectángulo
            for (int i = 1; i<=altura; i++) {
                if (i == 1 || i == altura) { // para el borde de arriba y abajo
                    for (int k = 1; k<=ancho; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                } else { // cuerpo del rectángulo
                    System.out.print("*");
                    for (int k = 1; k<=ancho-2; k++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }

            }
        }
    }
}
