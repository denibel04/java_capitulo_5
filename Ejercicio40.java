/**
 * Capítulo 5
 * Ejercicio 40: Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos. El programa debe pedir la altura.
 * Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio40 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del rombo: ");
        int altura = sc.nextInt();
        sc.close();
        if (altura%2==0 || altura<3) {
            System.out.println("Error, debe introducir un número impar mayor o igual a 3");
        } else {
            // PARTE DE ARRIBA
            for (int i = 1; i <= altura / 2 + 1; i++) { //contador para la altura
                for (int j = 1; j <=altura/2+1-i; j++) { //imprime espacios
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*"); // imprime el borde
                    for (; k <= (i * 2 - 1) - 2; k++) { // imprime los espacios para que sea hueco (a la cantidad de relleno se le quitan los dos caracteres que hacen el borde)
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            // PARTE DE ABAJO
            for (int i = 1; i <= altura / 2; i++) { //contador para la altura
                for (int j = 1; j <= i; j++) { //imprime espacios
                    System.out.print(" ");
                }
                for (int k = 1; k <= altura-i*2; k++) {
                    System.out.print("*"); // imprime el borde
                    for (; k <=(altura-i*2) - 2; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

        }
    }
}
