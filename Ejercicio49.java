/**
 * Capítulo 5
 * Ejercicio 49: Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos introducidos por teclado.
 * El programa terminará cuando el usuario introduzca un número primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe
 * indicar también cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio49 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        boolean esprimo = false;
        // Definición de variables
        int j = 0; // contador de veces que es divisible
        int i = 1; // contador que va dividiendo
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        int k = 0; // suma los números que se van introduciendo

        do { // Pide números hasta que se introduzca un primo
            int num = sc.nextInt();
            while (i<=num/2) {
                if ((num%i)==0) {
                    j++;
                }
                i++;
            }
            if (j<=2){
                esprimo = true;
            } else {
                k++;
                // Reinicia los contadores
                j = 0;
                i = 1;
                // Guarda el máximo
                if (num>max) {
                    max = num;
                }
                // Guarda el mínimo
                if (num<min) {
                    min = num;
                }
                // Suma los números para hacer la media después:
                suma = suma +  num;
            }
        } while (!esprimo);

        sc.close();

        System.out.printf("Has introducido %d números no primos.\nMáximo: %d\nMínimo: %d\nMedia: %.2f", k, max, min, (float)suma/(float)k);
    }
}
