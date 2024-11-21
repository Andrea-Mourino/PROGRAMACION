public class mitadnumerotabla {
    public static void main(String[] args) {
// Definimos el array con los valores dados
        int[] tabla = {5, 7, 9, 15, 25, 90, 101};

// Calculamos la mitad del tamaño del array
        int mitad = tabla.length / 2;

// Mostramos los valores de la mitad del array
        System.out.println("La mitad de la tabla es:");
        for (int i = 0; i < mitad; i++) {
            System.out.println(tabla[i]);
        }
    }
}
