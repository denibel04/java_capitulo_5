/**
 * Capítulo 5
 * Ejercicio 48: Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un número entero introducido
 * por teclado. El orden es el que se muestra en los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio48 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        long num = sc.nextLong();
        long aux = num;
        boolean coincide = false;
        sc.close();

        System.out.print("Dígitos que aparecen en el número: ");
        for (int i = 0; i<=9; i++) {
            while (aux>0 && coincide==false) {
                if (i==aux%10) {
                System.out.print(i + " ");
                coincide = true;
                }
                aux /= 10;
            }
            coincide = false;
            aux = num;
        }


        System.out.print("\nDígitos que no aparecen: ");
        for (int i = 0; i<=9; i++) {
            while (aux>0 && coincide==false) {
                if (i==aux%10) {
                    coincide = true;
                }
                aux /= 10;
            }
            if (coincide == false){
                System.out.print(i + " ");
            }
            coincide = false;
            aux = num;
        }


    }
}
