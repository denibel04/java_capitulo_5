/**
 * Capítulo 5
 * Ejercicio 51: El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que encuentre). Realiza un
 * programa que muestre un número antes y después de haber sido comido por el gusano. Si el animalito no se ha comido ningún dígito, el
 * programa debe indicarlo.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio51 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        long num = sc.nextLong();
        sc.close();

        // Definicion de variables
        long aux = 0;
        int j = 0; // contador de números que se come el gusanito

        // Gusano que se come los números con forma de rosquilla:
        while (num>0) {
            if (num%10 == 0 || num%10 == 8) {
                j++;
            } else {
                aux = aux*10 + num%10;
            }
            num /= 10;
        }

        // Voltea el número
        long volteado = 0;
        while (aux > 0) {
            volteado = (volteado * 10) + (aux % 10);
            aux /= 10;
        }

        // Muestra por pantalla el resultado
        if (j==0) {
            System.out.print("El gusanito numérico no se ha comido ningún número :(");
        } else {
            System.out.print("Después de haber sido comido por el gusanito numérico se queda en: " + volteado);
        }

    }
}
