import java.util.Scanner;
import java.util.Random;

public class juegopapelpiedraotiejera {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Random random= new Random();

        String[] manos= {"Piedra", "Papel", "Tijera"};
        boolean JugarOtravez= true;
        int NumeroRandom= (int) (Math.random()* manos.length);
        System.out.println(NumeroRandom + "Tu turno: ");

        while (JugarOtravez){
            System.out.println("Elije entre estas opciones: ");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");

            int eleccionUsuario = scan.nextInt();
            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                System.out.println("Elección no válida. Intenta de nuevo.");
                continue;
            }
            // Convertir la elección del usuario a índice de arreglo (0, 1, 2)
            int indiceUsuario = eleccionUsuario - 1;
            System.out.println("Tú elegiste: " + opciones[indiceUsuario]);

            // Elección de la computadora
            int indiceComputadora = random.nextInt(3);
            System.out.println("La computadora eligió: " + opciones[indiceComputadora]);

            // Determinar el resultado
            if (indiceUsuario == indiceComputadora) {
                System.out.println("¡Es un empate!");
            } else if ((indiceUsuario == 0 && indiceComputadora == 2) || // Piedra vence a Tijera
                    (indiceUsuario == 1 && indiceComputadora == 0) || // Papel vence a Piedra
                    (indiceUsuario == 2 && indiceComputadora == 1)) { // Tijera vence a Papel
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Perdiste!");
            }

            // Preguntar si quiere jugar de nuevo
            System.out.print("¿Quieres jugar otra vez? (s/n): ");
            char respuesta = scan.next().toLowerCase().charAt(0);
            JugarOtravez = (respuesta == 's');
        }

        System.out.println("¡Gracias por jugar! Hasta la próxima.");
        break;

        }

    }

