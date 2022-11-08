/**
 * Capítulo 5
 * Ejercicio 55: Realiza un programa que sea capaz de desplazar todos los dígitos de un número de izquierda a derecha una posición. El
 * dígito de más a la derecha, pasaría a dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se queda igual.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio55 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long aux = num;
        int i = 0;
        long ultimo = 0;
        // Cuenta la longitud del número
        while (aux>0) {
            if (i==0) {
                ultimo = aux%10;
            }
            aux /= 10;
            i++;
        }

        long num2 = (long)((num - ultimo)/10);
        System.out.print((long)(ultimo * Math.pow(10, i-1) + num2));

        sc.close();
    }
}
