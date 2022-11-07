/**
 * Capítulo 5
 * Ejercicio 45: Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo. Las posiciones se cuentan
 * de izquierda a derecha empezando por el 1. Se recomienda usar long en lugar de int ya que el primero admite números más largos. Suponemos
 * que el usuario introduce correctamente los datos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio45 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = sc.nextLong();
        System.out.print("Introduzca la posición en la que quiera cambiar el número: ");
        int posicion = sc.nextInt();
        System.out.print("Introduzca el nuevo dígito: ");
        int digito = sc.nextInt();
        sc.close();

        // Definicion de variables
        long nuevoNum = 0;
        int j = 0;

        // Para que se lean las posicicones de izquierda a derecha, es necesario voltear el número:
        long volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
            j++;
        }

        // Recompone el número
        for (int i = 1; i<posicion; i++) {
            nuevoNum = (nuevoNum * 10) + (volteado % 10);
            volteado /= 10;
            if (i==posicion-1){
            nuevoNum = (nuevoNum * 10) + digito; // cambia el digito
            volteado /=10;
            }
        }

        // Continua recomponiendo el número
        while (volteado>0) {
            nuevoNum = (nuevoNum * 10) + (volteado % 10);
            volteado /= 10; }
        System.out.print("El número resultante es " + nuevoNum);
        sc.close();
    }
}
