/**
 * Capítulo 5
 * Ejercicio 20: Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una pirámide por pantalla. Introduzca el carácter de relleno que desee:");
        String simbolo = sc.next();
        System.out.println("Ingresa la altura de la pirámide");
        int tam = sc.nextInt();
        System.out.println("La pirámide de altura " + tam + " es:");
        for (int i=1; i<=tam-1; i++) { //contador para la altura
            for (int j=1; j<=tam-i; j++) { //imprime espacios
                System.out.print(" ");
            }
            for (int k=1; k<=i*2-1; k++) {
                System.out.print(simbolo); // imprime el borde
                for (int l=1; k<=(i*2-1)-2; k++) { // imprime los espacios para que sea hueco (a la cantidad de relleno se le quitan los dos caracteres que hacen el borde)
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i=1; i<=tam*2-1; i++) {
                System.out.print(simbolo);
        }

        sc.close();
    }
}
