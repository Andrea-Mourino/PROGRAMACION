//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

/**
 * Es calcular el aera de un triangulo y un cuadrado (Tarea 1,2) <br>
 * Es ingresar una cantidad de dinero y que me devuelva el cambio (Tarea 3). <br>
 * Es sumar dos valores entre ellos (Tarea 4).
 * @author Andrea Mouriño
 * @versiom 1.1
 */

public class Main {
    public static void main(String[] args) {

// tarea 1
        double baseT, alturaT, areaT;
        baseT = 4;
        alturaT = 3;
        areaT = baseT * alturaT / 2;
        System.out.println("El area del triangulo es " + areaT);


// tarea 2
        double ladoC, areaC ;
        ladoC = 3;
        areaC = ladoC * ladoC;
        System.out.println("El area del cuadrado es " + areaC);


// tarea 3
        double cambio, euros, dolares;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("Rate de cambio?");
        cambio = entradaTeclado.nextDouble();
        System.out.println("Cantidad de euros? ");
        euros = entradaTeclado.nextDouble();
        dolares = euros / cambio;
        System.out.println(dolares +" Dolares de cambio, por "+ euros+ " Euros.");


// tarea 4
        double num1, num2, resultadoS;
        Scanner eligeNumero;
        eligeNumero = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1 = eligeNumero.nextDouble();
        num2 = eligeNumero.nextDouble();
        System.out.println("Introduce el segundo numero");
        resultadoS = num1 + num2;
    }
}