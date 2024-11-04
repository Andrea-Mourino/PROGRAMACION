import java.util.Scanner;
/**
 * Realizar o programa que pida un número e como resultado nos de o factorial no número (n!).
 * @author Andrea Mouriño
 * @version 1.1
 */

public class Factorial {
    public static void main(String[] args) {
        int numero;
        int factorial=1;
        System.out.println("mete el numero del que quieras saber su Factorial: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        for (int i=1; i<=numero; i++)
        {
            factorial=factorial*i;
        }
        System.out.println("o Factorial do numero " + numero + " es de: " + factorial + ".");
    }
}

