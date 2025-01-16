//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] edades;
        edades = new int [5];
        edades [0] = 31;
        edades [1] = 23;
        edades [2] = 56;
        edades [3] =12;
        edades [4] = 32;
        System.out.println(edades [3]);
        String [] nomes = {"Manuel", "Jose", "Rosa", "Ana"};
        System.out.println(nomes [3]);
        int minimo = edades [0];
        for (int i=1; i < edades.length; i++)
            if (minimo > edades [i]) minimo = edades [i];

        System.out.println("0 valor minimo de edades é: " + minimo);

        minimo= edades [0];
        for (int edad: edades) {
            if (minimo > edad) minimo = edad;
        }

        System.out.println("0 valor minimo de edades é: " + minimo);

    }
}