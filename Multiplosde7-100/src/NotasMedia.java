import java.util.Scanner;

/**
 * Programa y solicitar notas (imprimir la media)
 * @author Andrea Mouriño
 * @version 1.1
 */

public class NotasMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota,suma,numero,media;
        suma=0;
        numero=0;
        do {
            System.out.println("introduce tu nota para la media, para salir -1: ");
            nota = sc.nextInt();
            suma=suma+nota;
            numero++;
        }

        while(nota!=-1);

        media=suma/numero;
        System.out.println("su media es de: " + media);

    }
}