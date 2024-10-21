//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

/**
 * Es para mostrar si un número es positivo o no
 * @author Andrea Mouriño
 * @verson 1.1
 **/


public class Ejercicio1 {
    public static void main(String[] args) {
        //ejercicio 1
        int numero;
        Scanner sc;
        sc = new Scanner (System.in);
        System.out.println("Imprime un numero por teclado");
        numero = sc.nextInt();
        if (numero>0) {
            System.out.println("0 numero" + numero + "é positivo");
        }

    }


}