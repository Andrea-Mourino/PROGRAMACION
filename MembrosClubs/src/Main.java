//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Membros[] = new String[20];
        //mostrar los null
        String VisualizarMembros; //Crear un novo String para los nuevos Miembros que se agreguen
        int i = (Membros/10)-1;
        int j = (Membros%10)-1;
        if (Membros[i][j] != null) {

            return false;

        } else {
            Membros[i][j] = VisualizarMembros;

            return true;
        }
    }

    public static boolean EngadirSocio (String Membros[20], String VisualizarMembros){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar o seu nome: "); //Pedir a un socio que introduzca su nombre e que o garde na primeira posicion valeira da taboa

        String NovoNomeMembro (Membros[0][0]);

    }

    public static boolean EliminarSocio(String Membros[]){
        for (int i = Membros.length - 1; i >= 0; i--) {
            System.out.println("");
            System.out.println("El miembro" + (i + 1) + " esta eliminado: ");
            for (int j = 0; j < Membros[i].length; j++) {
                if (Membros[i][j] == null) System.out.println("Valeria ") {
                    return true;
                }
                else System.out.print(Membros[i][j] + " ") {
                    return false;
                }
            }

            String Terminado;
            System.out.println("Para terminar o programa escriba Terminado" + Terminado );


        }
    }
}