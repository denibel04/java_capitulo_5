/**
 * Capítulo 5
 * Ejercicio 61: Escribe un programa que pinte por pantalla la letra V. El ancho del palo de la V es siempre de 3 asteriscos. El usuario debe
 * introducir la altura. La altura mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa debe mostrar un mensaje de error.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio61 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la V: ");
        int altura = sc.nextInt();
        sc.close();

        for (int i = 0; i<altura; i++) {
            if (i == altura-1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < altura - i; j++) {
                    System.out.print("*****");
                }
                System.out.println("");
            } else {
                for (int j = 0; j<i; j++) {
                    System.out.print(" ");
                }
                System.out.print("***");
                for (int k = 0; k<(altura-i-2)*2+1; k++) {
                    System.out.print(" ");

                }
                System.out.println("***");
            }

        }

    }
}
