/**
Inserte o caracter entre cada letra da cadea. Ex: separar e ‘,’ debería devolver s,e,p,a,r,a,r
Reemplace tódolos espazos polo caracter. Ex: ‘meu arquivo de texto.txt’ e ‘\_’ debería devoltar ‘meu\_arquivo\_de\_texto.txt’
Reemplace tódolos díxitos na cadea polo caracter. Ex: súa clave é: 1540 e ‘X’ debería devotar súa clave é: XXXX
Inserte o caracter cada 3 díxitos na cadea. Ex. 2552552550 e ‘.’ debería devoltar 255.255.255.0

 @author Andrea Mouriño
 @version 1.0
*/


package org.example;

public class Boletin8_2_ej2 {
    public static void main(String[] args) {
        String cadea="Galicia esta en españa y estamos en 2025";
        String conComas= comas(cadea);
        System.out.println(conComas);
        String sinEspacios= espacios(conComas);
        System.out.println(sinEspacios);
        String sinNumeros= numeros(sinEspacios);
        System.out.println(sinNumeros);
        String conPuntos=puntos(sinNumeros);
        System.out.println(conPuntos);
    }
    public static String comas(String cadea){
        String cadeaNueva="";
        for(int i=0;i<cadea.length();i++){
            cadeaNueva =cadeaNueva + cadea.charAt(i);
            if(Character.isLetter(cadea.charAt(i))) {
                if(i!=cadea.length()-1) {
                    cadeaNueva=cadeaNueva+",";
                }
            }

        }
        return cadeaNueva;
    }
    public static String espacios(String cadea){
        return cadea.replace(" ", "\\_");
    }
    public static String numeros(String cadea){
        String cadeaNueva="";
        for(int i=0;i<cadea.length();i++){
            if(Character.isDigit(cadea.charAt(i))) {
                cadeaNueva=cadeaNueva+"X";
            }
            else {
                cadeaNueva =cadeaNueva + cadea.charAt(i);
            }
        }
        return cadeaNueva;
    }
    public static String puntos(String cadea){
        String cadeaNueva="";
        int contador=0;
        int lenght=cadea.length();
        for(int i=0;i<lenght;i++){
            cadeaNueva =cadeaNueva + cadea.charAt(i);
            contador++;
            if(contador==3){
                cadeaNueva=cadeaNueva+".";
                contador=0;
            }
        }
        return cadeaNueva;
    }


}