import java.util.Scanner;

/**
 * Codifica un programa que solicite un número e, visualice a táboa de multiplicar dese número. O programa rematara cando prememos o cero.
 * @author Andrea Mouriño
 * @version 1.1
 */

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, n2;
        int seguir=1;
        int veces=1;
        System.out.println("dime un numero para que te muestre su tabla de multiplicar: ");
        Scanner sc = new Scanner(System.in);
        numero= sc.nextInt();
        while (seguir!=0){
            n2=veces*numero;
            veces++;
            System.out.println(n2);
            System.out.println("para seguir salir pulse 0, para seguir cualquier otro numero: ");
            seguir= sc.nextInt();
        }

    }
}
