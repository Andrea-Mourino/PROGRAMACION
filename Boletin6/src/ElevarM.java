import java.util.Scanner;

/**
 * Escribe a función que resolva o resultado de elevar n veces o número m (mn) de forma recursiva.
 * @author Andrea Mouriño
 * @version 1.1
 */

public class ElevarM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicame la base:"); //es para mostrar al usuario (es opcional)
        int m = sc.nextInt(); //es para que el usuario indique el numero
        System.out.println("Indicame el exponente:");
        int m2 = sc.nextInt(); //es para que indiques el numero elevado
        int resultado = elevarNumero(m,m2); //es para que indiques a funcion de elevar numero
        System.out.println(resultado);

    }

    static int elevarNumero(int m, int m2) { //el estatic es para mantenerlo estatico
        if (m2==0) { //el m2 seria el numero elevado al m
            return 1; //es para devolverme el uno
        }
        return m * elevarNumero(m,m2-1);
    }

}
