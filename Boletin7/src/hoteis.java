import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.h;

/**
hoteis cuatro pisos y seis habitaciones
 Rexistre usuario nome
 deixar habitacion
 habitacions valeiras (libres)
@author Andrea Mouriño
@version 1.0
        **/

public class hoteis {
    public static void main(String[] args) {
        String hotel [][]= new String[4][6];

        /**
         Tambien se puede hacer asi
         int[] pisos = {1, 2, 3, 4, 5, 6,
                1, 2, 3, 4, 5, 6,
                1, 2, 3, 4, 5, 6,
                1, 2, 3, 4, 5, 6};
        */
    }

    static void registraUsuario(String hotel[][], String cliente, int habitacion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        cliente = sc.nextLine(); //no es in porque el usuario no ingresa un numero si no una palabra

        for (int i = 0; i < hotel.length; i++) {
            if (i < 0) {
                i++;
                System.out.println("Esto es la cantidad de Usuarios registrados: ");

            }
        }
    }

    static void dejarHabitacion(String habitacion[][], String personafuera) {
        for (int i = 0; i<habitacion.length; i++) {
            i--;
        }
    }
}

