/**
 * Capítulo 5
 * Ejercicio 69: Realiza un programa que pinte una pirámide maya. Por los lados, se trata de una pirámide normal y corriente. Por el centro
 * se van pintando líneas de asteriscos de forma alterna (empezando por la superior): la primera se pinta, la segunda no, la tercera sí, la
 * cuarta no, etc. La terraza de la pirámide siempre tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide normal
 * tienen 4 asteriscos. El programa pedirá la altura. Se supone que el usuario introducirá un número entero mayor o igual a 3; no es necesario
 * comprobar los datos de entrada.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio69 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide maya: ");
        int tam = sc.nextInt();


        for (int i=1; i<=tam; i++) { // contador para la altura
            for (int j=1; j<=tam-i; j++) { // imprime espacios
                System.out.print(" ");
            }
            for (int j=1; j<=3; j++) {
                if (j == 1 || j == 3) {
                    for (int k=1; k<=i; k++) { // bordes
                        System.out.print("*");
                    }
                } else  {
                    if (i%2==0) { // relleno. depende de la fila para hacer las ventanas de la piramide maya o no
                        System.out.print("    ");
                    } else {
                        System.out.print("****");
                    }
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
