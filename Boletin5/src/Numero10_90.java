import java.util.Scanner;

/**
 * Realiza un programa que calcule a suma e o produto dos números comprendidos entre 10 e 90.
 * @author Andrea Mouriño
 * @version 1.1
 */

public class Numero10_90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int suma= 0;
        long produto= 0; //long para evitar desbordamiento al tener mas bits que int

        for (int i= 10; i <= 90; i++) { //aqui estoy diciendo que el valor i puede ser igual a 10 y menos que 90 que sume uno
            suma += i;        // Sumamos el número actual
            produto *= i;    // Multiplicamos el número actual
        }
        System.out.println("La suma de los números entre 10 y 90 es: " + suma);
        System.out.println("El producto de los números entre 10 y 90 es: " + produto);
    }
}