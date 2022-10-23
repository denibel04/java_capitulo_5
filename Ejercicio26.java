/**
 * Capítulo 5
 * Ejercicio 26: Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición
 * (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio26 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        System.out.println("Introduce un dígito para saber la posición o posiciones que ocupa en el número anterior");
        int digito = sc.nextInt();
        System.out.print("La posición o posiciones que ocupa son: ");
        sc.close();

        // Como nos pide de izquierda a derecha, hay que voltear el número:
        int volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
        }
        while (volteado > 0) {
            if ((volteado % 10) == digito) {
                System.out.print(i + " ");
                }
            volteado /= 10;
            i++;
            }
    }
}
