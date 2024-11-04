public class SaldoTrabajadores {

/**
*Codifica un programa que lea o soldo de cada un dos traballadores dunha empresa e obteña o número deles que ganan entre 1000 e 1750 €, ámbolos dous incluídos e, a porcentaxe de traballadores que ganan menos de 1000 €. Tendo en conta que non se coñece con antelación o numero de traballadores da empresa e non se admiten os soldos negativos (utiliza como condición de fin un soldo 0).
* @author Andrea Mouriño
* @version 1.1
*/
public class soldotraballadores {
    public static void main(String[] args) {
        int soldo;
        int menosde1000=0;  int sueldomedio=0; int nsoldos=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el soldo del traballador(pon 0 para terminar la operacion): ");
        soldo = sc.nextInt();
        while (soldo!=0) {
            if (soldo < 0) System.out.println("no se permiten sueldos negativos");
            else {
                if (soldo < 1000) menosde1000++;
                if (soldo >= 1000 & soldo <= 1750) sueldomedio++;
                nsoldos++;
            }
            System.out.println("introduce el soldo del traballador(pon 0 para terminar la operacion): ");
            soldo = sc.nextInt();
        }
        int porcentaje= menosde1000*100/nsoldos;
        System.out.println("Hay " + sueldomedio + " trabajadores que cobran entre 1000 y 1750 y un " + porcentaje + "% que cobran menos de 1000.");
    }
}


