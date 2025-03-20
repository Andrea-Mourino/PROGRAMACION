public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dragon Ball");
        Personaje personaje1 = new Personaje ();
        Personaje personaje2 = new Personaje ("Goku");
        int una_variable = personaje1.perderVidas(15);
        if (una_variable == 985) {
            System.out.println("OK");
        } else {
            System.out.println("FALLO");
        }
        System.out.println("Hola " + personaje1.nome);
        System.out.println("Vidas personaje1: " + personaje1.getVidas());
        System.out.println("Vidas personaje1: " + una_variable);

        //test1
        personaje1.setVidas(1000);
        int danho2= -100;
        int respuesta_esperada2 =0;
        int vidas_restantes2= personaje1.perderVidas(2);
        if (vidas_restantes2 == respuesta_esperada2) {
            System.out.println("2: OK");
        } else {
            System.out.println("2: FALLO");
        }

        //test3
        personaje1.setVidas(1000);
        int danho3= -100;
        int respuesta_esperada3= personaje1.getVidas();
        int vidas_restantes3 = personaje1.perderVidas( 3);
        if (vidas_restantes3 == respuesta_esperada3) {
            System.out.println("3: OK");
        } else {
            System.out.println("3: FALLO");
        }

        //test4
        personaje1.setVidas(1000);
        int danho4= -1000;
        int respuesta_esperada4 = 0;
        int vidas_restante4 = personaje1.perderVidas(danho4);
        if ( vidas_restante4 == respuesta_esperada4) {
            System.out.println("4: OK");
        } else {
            System.out.println("4: FALLO");
        }
//prueba de commit
    }
}

