import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Pon una contraseña");
        String contrasena= scan.next();
        boolean comprobante=comproba(contrasena);
    }


    public static boolean comproba (String contrasena) {
        boolean comprobante=true, compMinus=false, compMaxus=false, compNum=false;
        if (8 <= contrasena.length()) {
            System.out.println("Longitud correcta");
        }
        else {
            System.out.println("Incorrecto. Tiene que tener minimo 8 caracteres");
            comprobante=false;
        }

        for (int i=0; i<contrasena.length(); i++) {
            if (Character.isLowerCase(contrasena.charAt(i))) {
                System.out.println("Si tiene minuscula :)");
                compMinus=true;
                break;
            }
        }

        for (int i=0; i<contrasena.length(); i++) {
            if (Character.isUpperCase(contrasena.charAt(i))) {
                System.out.println("Si tiene mayuscula :)");
                compMaxus=true;
                break;
            }
        }

        for (int i=0; i<contrasena.length(); i++) {
            if (Character.isDigit(contrasena.charAt(i))) {
                System.out.println("Si tiene numeros :)");
                compNum=true;
                break;
            }
        }
        if(comprobante==true && compMinus==true && compMaxus==true && compNum==true) {
            System.out.println("La contraseña esta correcta");
            return true;
        }


        if(compMinus==false) {
            System.out.println("Esta mal, le falta una minuscula");
        }
        if(compMaxus==false) {
            System.out.println("Esta mal, le falta una mayuscula");
        }
        if(compNum==false) {
            System.out.println("Esta mal, le falta un digito");
        }

        return false;

    }

}
