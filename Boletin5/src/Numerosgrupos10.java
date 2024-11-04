import java.util.Scanner;
/**
 * Codificar o programa que solicite 10 números por consola e calcule a súa suma. Si o usuario introduce en calquera momento o número 999, deixa de solicitar máis números e presenta o valor da súma acadada ata ese momento.
 * @author Andrea Mouriño
 * @version 1.1
 */

public class Numerosgrupos10 {
    public static void main(String[] args) {
        int numero;
        int negativo=0; int positivo=0; int cero=0;
        System.out.println("introduce 10 numeros enteros: ");
        for(int i=0; i<10; i++)
        {
            Scanner sc = new Scanner(System.in);
            numero= sc.nextInt();
            if (numero<0)negativo++;
            if (numero>0)positivo++;
            if (numero==0) cero++;
        }
        System.out.println("hay " + positivo + " numeros positivos, " + negativo + " numeros negativos y " + cero + " ceros.");
    }
}

