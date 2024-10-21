import java.util.Scanner;

/**
 * Es para restar y sumar decimales
 * @author Andrea Mouriño
 * @version 1.1
 **/

public class Ejercicio2 {
    public static void main(String[] args) {
        //ejercicio 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero (short): ");
        short num1 = scanner.nextShort();
        System.out.println("Introduce el segundo numero (short): ");
        short num2 = scanner.nextShort();
        if (num1 >= num2) {
            short resta = (short) +(num1 - num2);
            System.out.println("La resta es: " + resta);
            short suma = (short) + (num1 + num2);
            System.out.println("La suma es: " + suma);
        scanner.close();
        }
    }
}


