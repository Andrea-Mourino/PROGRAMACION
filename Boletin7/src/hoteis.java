import java.util.Scanner;

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
        registraUsuario (hotel, cliente:"Pepe Gomez", habitacion:23);
        registraUsuario (hotel, cliente:"Amalia Sanz", habitacion:23);
        ocupacionHabitacion(hotel);
        /**

         int[] pisos = {1, 2, 3, 4, 5, 6,
                1, 2, 3, 4, 5, 6,
                1, 2, 3, 4, 5, 6,
                1, 2, 3, 4, 5, 6};
        */
    }

    public static boolean registraUsuario(String hotel[][], String cliente, int habitacion) {
        int i = (habitacion/10) -1; //i representa a planta onde se situa a habitacion
        int j=(habitacion%10) -1; //j representa a habitacion dentro da planta
        if (hotel [i][j] !=null) {
            System.out.println("A habitacion" + habitacion + "está ocupada. Tentao nunha habitacion balerira");
            return false;
        }

        else {
            hotel[i][j] = cliente;
            return true;
        }

        /**
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        cliente = sc.nextLine(); //no es in porque el usuario no ingresa un numero si no una palabra

        for (int i = 0; i < hotel.length; i++) {
            if (i < 0) {
                i++;
                System.out.println("Esto es la cantidad de Usuarios registrados: ");
            }
        }
        */
    }

    public static void ocupacionHabitacion(String habitacion[][]) {
        for (int i = habitacion.length-1; i>=0; i--) {
            System.out.println("");
            System.out.println("Pranta" + (i+1) + ": ");
            for (int  j=0; j<habitacion[i].length; j++) {
                if (habitacion[i][j] == null) System.out.println("Valeria ");
                else System.out.print(habitacion[i][j] + " ");
            }
        }
    }
}

