/**
 * Capítulo 5
 * Ejercicio 37: Realiza un conversor del sistema decimal al sistema de “palotes”.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio37 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos el número
        System.out.println("Introduzca el número entero que quiera pasar a sistema de 'palotes'");
        int num = sc.nextInt();
        System.out.printf("El número %d en sistema de 'palotes' es: ", num);
        sc.close();

        // Volteamos el número:
        long volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
        }

        // Imprimimos palitos en función de cada dígito
        for (int j=0; volteado>0; j++) {
            for (int i = 0; i<volteado%10; i++) {
                System.out.print("|");
            }
            volteado /= 10;
            if (volteado>0) {
                System.out.print(" - ");
            }
        }
    }
}
