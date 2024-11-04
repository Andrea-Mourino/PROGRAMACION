import java.util.Scanner;

/**
 * Deseñar a función eco() a que se lle pasa como parámetro un número n e mostra por pantalla n veces a mensaxe “Ecoo…”
 * @author Andrea Mouriño
 * @version 1.1
 */

public class Eco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
            System.out.println("Ingresar numero y el eco lo va a repetir: ");
            num = sc.nextInt(); //esto sirve para que el escaner lea el nmumero que ingreso
            eco (num); //esto es para que el eco se repita el numero de veces dependiendo el NUMERO que ingrese

    }
    static void eco(int veces) {
        for (int i= 0; i<veces; i++) {
            System.out.println("Eco...");
        }

    }
}
