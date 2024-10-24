import java.util.Scanner;

/**
 * Programa y solicitar notas (imprimir la media)
 * @author Andrea Mouriño
 * @version 1.1
 */

public class NotasMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumaNotas= 0.0, nota= 0.0;
        int cantidade= 0;
        do {
            System.out.println("introduce tu nota para la media, para salir -1: ");
            nota = sc.nextDouble(); //porque notas es double
            if (nota != -1) {
                sumaNotas= sumaNotas + nota;
                cantidade++;
            }
        } while(nota!=-1);

        System.out.println("su media es de: " + sumaNotas/cantidade);

    }
}
