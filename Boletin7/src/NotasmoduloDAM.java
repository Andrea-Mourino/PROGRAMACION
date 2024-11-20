import java.util.Scanner;

/**Carga un array de tipo int, coas notas do módulo de programación, dos 30 alumnos da clase de DAM .
- Visualiza o numero de 	aprobados e o de suspensos.
- Calcula e visualiza a nota media da clase.
- Visualiza a nota mais alta.
 @author Andrea Mouriño
 @version 1.0
**/


public class NotasmoduloDAM {
    public static void main(String[] args) {
        int numeroAprobados =0, numeroSuspensos=0;
        int[] notas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                2, 3, 4, 5, 6, 7, 8, 9, 10, 1,
                3, 4, 5, 6, 7, 8, 9, 10, 1, 2};

        for(int i=0; i<notas.length; i++){

            if(notas[i]<5){
               numeroSuspensos++;
            }
        }

        for(int j=0; j)

    }
}
