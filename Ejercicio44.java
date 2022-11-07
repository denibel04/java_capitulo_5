/**
 * Capítulo 5
 * Ejercicio 44: Escribe un programa que sea capaz de insertar un dígito dentro de un número indicando la posición. El nuevo dígito se colocará
 * en la posición indicada y el resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos. Se recomienda usar long en lugar de int ya que el primero admite números
 * más largos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio44 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = sc.nextLong();
        System.out.print("Introduzca la posición en la que quiera añadir un número: ");
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
            volteado /= 10; }
        // Introduce el nuevo dígito
        nuevoNum = (nuevoNum * 10) + digito;
        // Continua recomponiendo el número
        while (volteado>0) {
            nuevoNum = (nuevoNum * 10) + (volteado % 10);
            volteado /= 10; }
        System.out.print("El número resultante es " + nuevoNum);
    }
}
