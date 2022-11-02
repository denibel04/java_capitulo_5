/**
 * Capítulo 5
 * Ejercicio 34: Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los dígitos pares y los
 * impares. Se van comprobando los dígitos de la siguiente manera: primer dígito del primer número, primer dígito del segundo número,
 * segundo dígito del primer número, segundo dígito del segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al menos un dígito par y uno impar.
 * Usa long en lugar de int donde sea necesario para admitir números largos.
 *
 * → @author Denisa Ramona Belean
 * https://github.com/denibel04 ☆
 */

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definimos las variables y pedimos los datos
        int i=0;
        long numPar = 0;
        long numImpar = 0;
        System.out.println("Este programa mezcla dos números separando los dígitos pares de los impares. Deben ser igual de largos.\nIntroduce el primer número");
        long num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        long num2 = sc.nextInt();
        sc.close();

        // Para contar los digitos de izquierda a derecha, hay que voltear:
        long volteado1 = 0;
        while (num1 > 0) {
            volteado1 = (volteado1 * 10) + (num1 % 10);
            num1 /= 10;
        }
        long volteado2 = 0;
        while (num2 > 0) {
            volteado2 = (volteado2 * 10) + (num2 % 10);
            num2 /= 10;
        }

        // Comprobamos si el digito es par o impar y los guardamos en el nuevo numero mezclado:
        while (volteado1 > 0 && volteado2 > 0) {
            if ((volteado1 % 10)%2 == 0) {
                numPar = numPar*10 + (volteado1 % 10);
            } else {
                numImpar = numImpar*10 + (volteado1%10);
            }
            if ((volteado2 % 10)%2 == 0) {
                numPar = numPar*10 + (volteado2 % 10);
            } else {
                numImpar = numImpar*10 + (volteado2%10);
            }
            volteado1 /= 10;
            volteado2 /= 10;
        }

        // Mostramos los resultados por pantalla:
        System.out.println("El número formado por los dígitos pares es " + numPar);
        System.out.println("El número formado por los dígitos impares es " + numImpar);
    }
}
