import java.util.Scanner;

/**
 * Deseña un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado. Asegúrate que estes valores sexan positivos, para eso valida os datos.
 * @author Andrea Mouriño
 * @version 1.1
 */

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base=0;
        int altura=0;

        do {
            System.out.print("Introduce a base do rectángulo (valor positivo): ");
            if (scan.hasNextDouble()) {
                base = scan.nextInt();
                if (base <= 0) {
                    System.out.println("Erro: A base debe ser un valor positivo.");
                }
            } else {
                System.out.println("Erro: Debes introducir un número válido.");
                scan.next(); // Limpa a entrada incorrecta
            }
        } while (base <= 0);

        // Solicitar e validar a altura
        do {
            System.out.print("Introduce a altura do rectángulo (valor positivo): ");
            if (scan.hasNextDouble()) {
                altura = scan.nextInt();
                if (altura <= 0) {
                    System.out.println("Erro: A altura debe ser un valor positivo.");
                }
            } else {
                System.out.println("Erro: Debes introducir un número válido.");
                scan.next(); // Limpa a entrada incorrecta
            }
        } while (altura <= 0);

        // Calcular a área do rectángulo
        double area = base * altura;
        System.out.println("A área do rectángulo é: " + area);

        scan.close();
    }
}
