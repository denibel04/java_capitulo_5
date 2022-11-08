/**
 * Capítulo 5
 * Ejercicio 64: Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres de ancho por 3 de alto y, a continuación, un
 * menú que permita agrandarlo, achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda, se incrementa en 1 tanto su anchura
 * como su altura. Cuando se achica, se decrementa en 1 su anchura y altura. Por último, cuando se cambia la orientación, los valores de anchura
 * y altura se intercambian. El valor mínimo de la altura o la anchura es 2.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio64 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 3;
        int ancho = 6;
        int opcion = 0;
        int aux = 0;

        do {
            // Pinta el rectángulo
            for (int i = 1; i<=altura; i++) {
                if (i == 1 || i == altura) { // para el borde de arriba y abajo
                    for (int k = 1; k<=ancho; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                } else { // cuerpo del rectángulo
                    System.out.print("*");
                    for (int k = 1; k<=ancho-2; k++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }

            // Muestra las opciones por pantalla
            System.out.print("1. Agrandar\n2.Achicar\n3.Rotar\n4.Salir\nIntroduzca lo que quiera hacer: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    altura++;
                    ancho++;
                    break;
                case 2:
                    if (ancho==2 || altura ==2) {
                        System.out.println("Error. Ya ha alcanzado el tamaño mínimo.");
                    } else {
                        altura--;
                        ancho--;
                    } break;
                case 3:
                    aux = altura;
                    altura = ancho;
                    ancho = aux;
                    break;
                default:
                    System.out.print("Error. Introduzca una opcion correcta: ");
                    opcion = sc.nextInt();
                    break;
                case 4:
            }

        } while (opcion != 4);

        sc.close();
    }
}
