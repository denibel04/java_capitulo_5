/**
 * Capítulo 5
 * Ejercicio 19:Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El carácter con el
 * que se pinta la pirámide también se debe pedir por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una pirámide por pantalla. Introduzca el carácter de relleno que desee:");
        String simbolo = sc.next();
        System.out.println("Ingresa la altura de la pirámide");
        int tam = sc.nextInt();
        System.out.println("La pirámide de altura " + tam + " es:");
        for (int i=1; i<=tam; i++) { //contador para la altura
            for (int j=1; j<=tam-i; j++) { //imprime espacios
                System.out.print(" ");
            }
            for (int k=1; k<=i*2-1; k++) { //imprime el caracter de relleno
                System.out.print(simbolo);
            }
            System.out.println("");
        }
        sc.close();
    }
}
