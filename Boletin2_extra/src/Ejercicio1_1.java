import java.util.Scanner;

/**
 * Es poder ingresar un valor y hacer un descuento de ese valor
 * @author Andrea Mouriño
 * @version 1.1
 */

public class Ejercicio1_1 {
    public static void main(String[] args) {

        Scanner compra = new Scanner(System.in);
        System.out.println("Ingresar en euros");
        double precio = compra.nextDouble();
        System.out.println("Ingrese en euros el descuento");
        double precio_en_descuento = compra.nextDouble();
        double precio_imprimir = 100-(precio_en_descuento/precio*100);
        System.out.println("El porcentaje de descuento es: " + precio_imprimir + "%");

        if (precio_en_descuento > precio) {
            System.out.println("Bobo o k");
        }
    }
}


