/**
 * Capítulo 5
 * Ejercicio 21: Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos
 * números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio21 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // definimos las variables que necesitaremos:
        int n;
        int maxPar = 0;
        int sumaImpares = 0;
        int numIntroducidos = 0;
        int contImpares = 0;
        System.out.println("Este programa calculará la media de los impares y el mayor de los pares introducidos. \nCuando quiera dejar de introducir números, introduzca un negativo. El 0 cuenta como positivo.");
        do {
           System.out.println("Introduce un número:");
           n = sc.nextInt();
           if (n>0) {
               numIntroducidos++;
               if ((n % 2) != 0) { // en caso de que sea impar:
                   sumaImpares += n;
                   contImpares++;
               } else if (n % 2 == 0) { // en caso de que sea par:
                   if (n > maxPar) {
                       maxPar = n;
                   }
               }
           }
        } while (n>=0);
        sc.close();
        // Mostramos el resultado por pantalla:
        System.out.printf("Ha introducido %d números. La media redondeada de los pares introducidos es " + sumaImpares/contImpares + ". El mayor número par es %d.", numIntroducidos, maxPar);
    }
}
