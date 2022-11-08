/**
 * Capítulo 5
 * Ejercicio 63: Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos, una al lado de la otra y separadas por un espacio en su base.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio63 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la primera pirámide: ");
        int alt1 = sc.nextInt();
        System.out.print("Introduce la altura de la segunda pirámide: ");
        int alt2 = sc.nextInt();
        sc.close();

        int altMaxima = Math.max(alt1, alt2);
        int cont1 = 1;
        int cont2 = 1;

        for (int i = altMaxima; i>0; i--) {
            // Pirámide 1
            if (i>alt1) {
                for (int j = 0; j < alt1 * 2 ; j++) {
                    System.out.print(" ");
                }
            }else {
                for (int j=1; j<=alt1-cont1; j++) { //imprime espacios por delante
                    System.out.print(" ");
                }
                for (int j=1; j<=cont1*2-1; j++) { //imprime el caracter de relleno
                    System.out.print("*");
                }
                for (int j = 0; j < (alt1*2-1) - (alt1-cont1) - (cont1*2-1) + 1; j++) {
                    System.out.print(" ");
                }
                cont1++;
            }
            // Pirámide 1
            if (i>alt2) {
                for (int j = 0; j < alt2 * 2 +6; j++) {
                    System.out.print(" ");
                }
            }else {
                for (int j = 1; j <= alt2 - cont2; j++) { //imprime espacios
                    System.out.print(" ");
                }
                for (int j = 1; j <= cont2 * 2 - 1; j++) { //imprime el caracter de relleno
                    System.out.print("*");
                }
                cont2++;
            }
            System.out.println("");
        }
    }
}
