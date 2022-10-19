/**
 * Capítulo 5
 * Ejercicio 7: Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento,
 * esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacion = 0210;
        int i = 4; // contador de intentos
        do {
            System.out.printf("Introduzca la combinación de la caja fuerte. Tiene %d intentos\n", i);
            int intento = sc.nextInt();
            if (intento != combinacion) {
                System.out.println("Lo siento, esa no es la combinación");
            } else if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                System.exit(0); // para finalizar el programa (si no sigue pidiendo datos)
            }
            i = i-1;
        } while (i>0);
        if (i==0) {
            System.out.printf("Ha agotado los intentos");
        }
        sc.close();
    }
}
