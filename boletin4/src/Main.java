import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        String vendas;
            System.out.println("Teclea as vendas aunais ");

        int produtos;
            produtos = scan.nextInt(); //esto sirve para coger un valor y guardarlo una variable

        if (produtos<=100) {
            System.out.println("Baixo");
        }
        if (produtos>100 && produtos<=500) {
            System.out.println("Medio");
        }
        if (produtos>500 && produtos<=1000) {
            System.out.println("Alto");
        }
        if (produtos>1000) {
            System.out.println("Primeira necesidade");
        }



    }
}