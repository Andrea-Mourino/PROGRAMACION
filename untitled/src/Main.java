//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

/**
 * Funcion que recibe dos parametros,una tabla y un valor
 * @author Andrea Mouriño
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        int[] numeros = {24, 45, 32, 12, 30, 27};
        int indice = ObtenerIndiceLista (numeros, 24);
        System.out.println(indice);
    }

    static int ObtenerIndiceLista(int[] listaNumeros, int numeros) {
        int indiceElemento = 0;
        for (int i = 0; i < listaNumeros.length; i++) {
            if(listaNumeros[i]==numeros) {
                indiceElemento = i;
            break;
        }
        else {
            return(-1);
        }
    }
        return indiceElemento;
    }
}