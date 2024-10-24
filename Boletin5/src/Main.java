//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

/**
 * Calcular a cantidade de números negativos, positivos e ceros que hai nun grupo de 10 números enteiros.
 * @author Andrea Mouriño
 * @version 1.1
 */

public class Main {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese 10 números enteros
        System.out.println("Ingrese 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            int j = sc.nextInt(); // Leer el número ingresado por el usuario

            // Clasificar el número en positivo, negativo o cero
            if (j > 0) {
                positivos++;
            }
            else if (j < 0) {
                negativos++;
            }
            else {
                ceros++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
