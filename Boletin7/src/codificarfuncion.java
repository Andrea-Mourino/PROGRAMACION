/**
 Codificar unha función que faga unha copia dunha matríz, pasada como parámetro, e devolte a copia da matríz.
 @author Andrea Mouriño
 @version 1.0
 **/

public class codificarfuncion {
    public static void main (String [] args) {
        int lista[]= new int [10];
        for (int i=0; i<lista.length; i++) {
            lista [i] = i*2;
        }
        int [] novaLista = copiarLista (lista);
        for (int elemento : novaLista) {
            System.out.println(elemento);
        }
    }

    public static int [] copiarLista(int [] listaACopiar){
        int[] novaLista;
        novaLista = new int [listaACopiar.length];
        for (int i=0; i<novaLista.length; i++) {
            novaLista[i] = listaACopiar[i];
        }
        return novaLista;
    }
}




