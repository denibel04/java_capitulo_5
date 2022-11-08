/**
 * Capítulo 5
 * Ejercicio 65: Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir la altura total y la fila en la que debe
 * aparecer el palito horizontal (contando desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito horizontal debe ser
 * mayor que 1 y menor que la altura total. Si el usuario introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio65 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura total de la A: ");
        int altura = sc.nextInt();



        if (altura<3) {
            System.out.print("Error. La altura tiene que ser mayor a 3.");
        } else {
            System.out.print("Introduce la fila en la que debe aparecer el palito horizontal: ");
            int palito = sc.nextInt();
            if (palito < 2 || palito > altura) {
                System.out.print("Error. El palito tiene que estar minimo en la segunda fila y ser menor que la altura total.");
            } else {
                for (int i=1; i<=altura; i++) { //contador para la altura
                    if (i==palito) {
                        for (int j=1; j<=altura-i; j++) { //imprime espacios
                            System.out.print(" ");
                        }
                        for (int j=1; j<i*2; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    } else {
                        for (int j=1; j<=altura-i; j++) { //imprime espacios
                            System.out.print(" ");
                        }
                        for (int k=1; k<=i*2-1; k++) {
                            System.out.print("*"); // imprime el borde
                            for (int l=1; k<=(i*2-1)-2; k++) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                }
            }
        }
        sc.close();


    }
}
