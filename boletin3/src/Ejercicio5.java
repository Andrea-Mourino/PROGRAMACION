import java.util.Scanner;

/**
 * Es ver cual valor es mayor entre ellos
 * @author Andrea Mouriño
 * @version 1.1
 **/

public class Ejercicio5 {
    public static void main (String[] args) {
        //ejercicio5
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclea un numero");
        String nombre1 = "Hello Kitty";
        String nombre2 = "My Melody";
        String nombre3 = "Kuromi";
        int valor1 = 23; //tal vez deba de implementar un valor numerico
        int valor2 = 4;
        int valor3 = 32;

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println(nombre1 + " tiene como valor " + valor1);
        }

        else if (valor2 > valor3) {
            System.out.println(nombre2 + " tiene como valor " + valor2);
        }

        else {
            System.out.println(nombre3 + " tiene como valor " + valor3);
        }

    }
}
