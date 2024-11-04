import java.util.Scanner;

/**
 * Realizar unha función que mostre a área dun cubo segundo se lle especifique. Para distinguir o caso se lle pasará a opción cun número 1 (área) ou 2 (volume). Ademáis, hai que pasarlle a lonxitude do lado.
 * @author Andrea Mouriño
 * @version 1.1
 */

public class AreaCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int area= 0;
        int volume= 0;

        for (int i= 0; i<area; i++) {
            System.out.println("Ingresa a area del cubo: " + area);
            area = sc.nextInt();
        }

        for (int j= 0; j<volume; j++) {
            System.out.println("Ingresa el volumen del cubo: " + volume);
            volume = sc.nextInt();
        }

    }
}
