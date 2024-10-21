import java.util.Scanner;

/**
 * Convierte el numero introducido de 0 a 99 en su equivalente en letra
 * @version 1.1
 * @author Andrea Mouriño
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();
        //int unidades = valor/10;
        //int decimales = valor%10;

        switch (valor) {
            case 1:
                System.out.println("uno");
                break;

            case 2:
                System.out.println("dos");
                break;

            case 3:
                System.out.println("tres");
                break;

            case 4:
                System.out.println("cuatro");
                break;

            case 5:
                System.out.println("cinco");
                break;

            case 6:
                System.out.println("seis");
                break;

            case 7:
                System.out.println("siete");
                break;

            case 8:
                System.out.println("ocho");
                break;

            case 9:
                System.out.println("nueve");
                break;

            case 10:
                System.out.println("diez");
                break;

        }

        /* switch (decimales) {
            case 1:
                System.out.println("ocho");
                break;

            case 2:
                System.out.println("siete");
                break;

            }

       System.out.println(unidades + "y" + decimales);
*/


    }
}


