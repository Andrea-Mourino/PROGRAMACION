import java.util.Scanner;

public class algoritmo {
    public static void main(String[] args) {
        int [] pila;
        int cabeza =-1;
        pila= new int[5];
        cabeza= apilar (pila, cabeza, num:5);
        cabeza= apilar (pila, cabeza, num:6);
        cabeza= apilar (pila, cabeza, num:10);
        cabeza= apilar (pila, cabeza, num:15);
        cabeza= apilar (pila, cabeza, num:20);
        cabeza= apilar (pila, cabeza, num:30);

    }
    public static void apilar (int [] pila, int cab, int num){
        if (cab<pila.length) {
            pila[cab + 1] = num;
            cab ++;
            System.out.println("Numero" + num + "apilado");
        }
        else {
            System.out.println("A pila está desbordada, non se almacena o número");
        }
        return cab;
    }
    public static void mostrarPila (int [] pila, int cab) {
        if (cab>=0) {
            for (int i=0; i <=cab; i++)
                System.out.println("0 número da pila é: " + pila[i]);
        }
        else {
            System.out.println("Pila valeria");
        }
    }
}
