import java.util.Scanner;

/**
 * Es para comprobar si el valor es mayor, menor o igual que cero
 * @author Andrea Mouriño
 * @version 1.1
 **/

public class Ejercicio3 {
    public static void main(String[] args) {
        //ejercicio 3
        Scanner scan = new Scanner (System.in);
        System.out.println("Imprime un numero por teclado: ");
        int n1;
        n1 = scan.nextInt();
                if (n1 > 0) {
                    System.out.println("0 numero " + n1 + " é positivo");
                }
                if (n1 < 0) {
                    System.out.println("0 numero " + n1 + " é negativo");
                }
                if (n1 == 0) {
                    System.out.println("0 numero " + n1 + " é cero");
                }
        scan.close();
                }
    }

