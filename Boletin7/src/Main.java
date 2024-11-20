//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

/**
Realiza un programa que cree un array chamado “numeros” con 6 numeros aleatorios dun rango de 1 a 50 .Seguidamente visualiza o array o revés (0 primeiro elemento visualizaráse o último e asi sucesivamente)
@author Andrea Mouriño
@version 1.0
 */

public class Main {
    public static void main(String[] args) {
       int[] numeros= new int[6]; //Es para declarar la matriz
        Random random = new Random();


        // Llenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1; // Genera números entre 1 y 50
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mostrar el array al revés
        System.out.println("Array al revés:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}