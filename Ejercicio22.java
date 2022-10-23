/**
 * Capítulo 5
 * Ejercicio 22: Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio22 {
    public static void main (String[] args) {
        System.out.print("Los números primos del 2 al 100 son : ");
        for (int i = 2; i <=100; i++) { // i es el contador de 2 a 100
            boolean esprimo = true;
            int j = 2; // contador de veces que es divisible
            int k = 1; // contador que va dividiendo
            while (esprimo && k <= i / 2) {
                if (i % k == 0) {
                    j--;
                }
                if (j == 0) { // es decir, si se ha podido dividir entre más de dos números
                    esprimo = false;
                }
                k++;
            }
            if (esprimo) {
                System.out.print(i + " ");
            }
        }
    }
}
