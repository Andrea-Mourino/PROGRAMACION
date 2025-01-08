//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        char caracter;
        caracter = 'a';
        caracter = 97; //esto es el decimanl de la letra 'a'
        caracter= 936;
        caracter= '\u03A9'; //el unicode para caracteres que no están en teclado
        System.out.println(caracter);

        for (int i=65; i<123; i++) {
            caracter= (char) i;
            System.out.println(caracter);
        }

        System.out.println(Character.isDigit(caracter)); //esto sirve para que vea si el texto es un digito o una letra y te devuelve un boolean (trueo o false)
        System.out.println(Character.isLetter(caracter));
        System.out.println(Character.isSpaceChar(caracter)); //si es un espacio unicode
        System.out.println(Character.isWhitespace(caracter)); //si hay un espacio en blanco y lo cuenta
        System.out.println(Character.isLowerCase(caracter)); //si hay minuscula
        System.out.println(Character.toUpperCase(caracter)); //si hay mayuscula
    }
}