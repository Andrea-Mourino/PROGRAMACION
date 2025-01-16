/**
  Escribir funcións que dada unha cadena de caracteres:

  -Imprima os dous primeiros caracteres.

  -Imprima os tres últimos caracteres.

  -Imprima dita cadea cada dous caracteres. Ex.: recta debería imprimir rca

  -Imprima a cadea nun sentido e en sentido inverso. Ex: reflexo imprime reflexooxelfer.

 * @author Andrea Mouriño
 * @version1.0
 */

public class Main {
    public static void main(String[] args) {

        String nome= "Kuromi";

        if (nome.length() >=2) {
            System.out.println("Dos primeros caracteres: " + nome.substring(0,2));
        }

        if (nome.length() >=3) {
            System.out.println("Tres ultimos caracteres: " + nome.substring(nome.length() -3));
        }

        String resultado= new String();
        String str= new String();
        for (int i=0; i<nome.length(); i+=2) {
            resultado.append(str.charAt(i));
        }
        System.out.println("cadea cada dous caracteres: " + resultado);
    }
}