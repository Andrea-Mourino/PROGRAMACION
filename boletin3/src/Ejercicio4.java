import java.util.Scanner;

/**
 * Es para comparar un peso con otro y ver quien pesa más
 * @author Andrea Mouriño
 * @version 1.1
 **/

public class Ejercicio4 {
    public static void main (String[] args) {
        //ejercicio 4
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclea un numero");
        String nombre1 = "My Melody";
        String nombre2 = "Hello Kitty";
        int peso1;
        int peso2;
        peso1 = scan.nextInt();
        System.out.println("Teclea otro numero"); //esto es para indicar que el usuario tiene que introducir otro valor
        peso2 = scan.nextInt();
            if (peso1 > peso2) {
            System.out.println(nombre1 + " pesa " + peso1 + " y pesa más que " + nombre2);
        }
            else {
                System.out.println(nombre2 + " pesa " + peso2 + " y pesa más que " + nombre1);
            }
    }
}
