//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

/**
 * Hacer un bucle con multiplos de 7
 * @author Andrea Mouriño
 * @version 1.1
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        for (int i = 7; i < 100; i= i + 7) { //hice i= i + 7 para no poner i++ y hacerlo mas rapido
            System.out.println("Hello Kitty esta contando " + i + " manzanas");

        }

    }
}