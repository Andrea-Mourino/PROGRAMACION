/**
 Codificar unha función que faga unha copia dunha matríz, pasada como parámetro, e devolte a copia da matríz.
 @author Andrea Mouriño
 @version 1.0
 **/

public class codificarfuncion {
    public static int[][] copiarMatriz(int[][] matriz) {
        if (matriz == null) {

            return null; // Devolve null se a matriz orixinal é null.
        }

// Crear unha nova matriz coas mesmas dimensións que a orixinal.
        int[][] copia = new int[matriz.length][];
        for (int i; i < matriz.length; i++) {

// Copiar cada fila usando `clone` ou creando unha nova.
            copia[i] = matriz[i].length();
        }

        return copia;

    }

    public static void main (String[] args) {
        // Exemplo de uso:
        int [] [] matrizOrixinal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizCopia = copiarMatriz(matrizOrixinal);

        // Imprimir ambas matrices para comprobar que son independentes.
        System.out.println("Matriz Orixinal:");
        imprimirMatriz(matrizOrixinal);

        System.out.println("\nMatriz Copia:");
        imprimirMatriz(matrizCopia);

        // Modificar a copia para comprobar que non afecta á orixinal.
        matrizCopia[0][0] = 99;
        System.out.println("\nMatriz Orixinal despois de modificar a copia:");
        imprimirMatriz(matrizOrixinal);

        System.out.println("\nMatriz Copia despois de modificación:");
        imprimirMatriz(matrizCopia);
    }

    //metodo auxiliar da matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}




