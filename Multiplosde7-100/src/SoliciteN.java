import java.util.Scanner;

/**
 * Hacer un bucle con numeros primos entre N
 * @author Andrea Mouriño
 * @version 1.1
 */

public class SoliciteN {
    public static void main(String[] args) {
        int n;
        boolean primo=true;
            Scanner sc = new Scanner(System.in);
            n= sc.nextInt();
            for (int i=2; i<=n; i++) //Todos los numeros entre 1 y N que vamos a ver si son divisibles
            {
            for(int j=2; j<i; j++) //Los numeros por los que dividimos
            {
                if (i%j==0) { //Es ver si i es divisible entre j
                    primo=false;
                }
            }
                if(primo==true)
                {System.out.println(i);}
                    primo=true;
        }
    }
}
