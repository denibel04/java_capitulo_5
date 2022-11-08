/**
 * Capítulo 5
 * Ejercicio 66: La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal para desviar el tráfico hacia la derecha.
 * La señal es una doble flecha con el vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que debe ser un número
 * impar mayor o igual que 3. La distancia entre cada flecha de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
 * no es un número impar mayor o igual que 3, el programa debe mostrar un mensaje de error.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio66 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la señal: ");
        int tam = sc.nextInt();
        sc.close();

        if (tam%2==0 || tam<3) {
            System.out.print("Error. La altura introducida no es correcta debe ser un número impar mayor o igual que 3.");
        } else {
            for (int i = 0; i<tam/2+1; i++) {
                for (int j = 0; j<i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*    *");
            }
            for (int i=tam/2; i>0; i--) {
                for (int j = 1; j<i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*    *");
            }
        }
    }
}
