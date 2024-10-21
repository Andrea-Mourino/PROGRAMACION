import java.util.Scanner;

/**
Utilizar el switch para colocar las respectivas notas con su nombre
@author Andrea Mouriño
@version 1.1
**/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota = scan.nextInt();

        switch (nota) {
        case 0,1,2,3,4:
            System.out.println("Insuficiente");
            break;

        case 5:
            System.out.println("Suficiente");
            break;

        case 6:
            System.out.println("Bien");
            break;

        case 7,8:
            System.out.println("Notable");
            break;

        case 9,10:
            System.out.println("Sobresaliente");
            break;

        case -1:
             System.out.println("Bobo o q");
             break;
        }
//Dado o mes que nos devolte o número de dias

        System.out.println("Teclea o mes (1-12): ");
        int mes = scan.nextInt();
        int dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                System.out.println("Erro: valor de mes incorrecto.");
                yield -1;
            }

        };
        if (dias != -1) {
            System.out.println("O numero de dias do mes" +mes+ "é: " +dias);
            yield -1;

            }
        }

    }
