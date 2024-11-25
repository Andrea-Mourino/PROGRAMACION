public class pedazotabla {
    public static void main(String[] args) {
        int[] tabla = {5, 7, 9, 15, 25, 90, 101};

        int UnaParte = tabla.length /2 ;

        System.out.println("La mitad de la tabla es:");
        for (int i = 0; i < UnaParte; i++) {
            System.out.println(tabla[i]);
        }
    }
}
