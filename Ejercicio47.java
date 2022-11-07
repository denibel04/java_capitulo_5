/**
 * Capítulo 5
 * Ejercicio 47: Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado realizar un programa que pinte un 8
 * por pantalla usando la letra M. Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5. Si el número
 * introducido no es correcto, el programa deberá mostrar un mensaje de error. A continuación se muestran algunos ejemplos. La anchura
 * de la figura siempre será de 6 caracteres.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio47 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del 8: ");
        int altura = sc.nextInt();
        int ancho = 6; // el ancho viene dado por el enunciado
        sc.close();

        // Se comprueba que se haya introducido bien la altura
        if ((altura<5) && (altura%2==0)) { // si la ha introducido mal: muestra el mensaje de error
            System.out.print("Error. Tiene que ser un número impar mayor o igual a 5.");
        } else { // si los ha introducido bien: muestra el 8
            for (int i = 1; i<=altura; i++) {
                if (i == 1 || i == altura/2+1 || i == altura) { // para el borde de arriba y abajo
                    for (int k = 1; k<=ancho; k++) {
                        System.out.print("M");
                    }
                    System.out.println("");
                } else { // cuerpo del rectángulo
                    System.out.print("M");
                    for (int k = 1; k<=ancho-2; k++) {
                        System.out.print(" ");
                    }
                    System.out.println("M");
                }
            }
        }
    }
}
