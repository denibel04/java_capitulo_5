/**
 * Capítulo 5
 * Ejercicio 68: Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es
 * par y se le resta 1 si es impar. Usa long en lugar de int donde sea necesario para admitir números largos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio68 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número que quiera dislocar: ");
        long num = sc.nextLong();
        sc.close();
        System.out.printf("Dislocando el %d sale el ", num);
        // Para que se lean las posicicones de izquierda a derecha, es necesario voltear el número:
        long volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
        }
        int i = 0;
        while (volteado>0) {
            if (i==0) {
                if ((volteado % 10) % 2 == 0) {
                    System.out.print(volteado % 10 + 1);
                } else if (volteado % 10 != 1) {
                    System.out.print(volteado % 10 - 1);
                }
            } else {
                    if ((volteado%10)%2==0) {
                        System.out.print(volteado%10+1);
                    } else {
                        System.out.print(volteado%10-1);
                    }
                }
            volteado/=10;
            i++;
        }
    }
}
