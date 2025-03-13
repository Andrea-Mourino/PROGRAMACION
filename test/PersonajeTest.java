import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonajeTest {

    @Test
    @DisplayName("Numeros Positivos")
    void valoresPositivos() {
        Personaje p= new Personaje ();
        p.setVidas(1000);
        int danho = 100;
        assertEquals (900, p.perderVidas (danho));

    }
    @Test
    @DisplayName("Numeros Negativos")
    void numeroNegativo() {
        Personaje p = new Personaje();
        p.setVidas(1000);
        int danho= -100;
        assertEquals(1000, p.perderVidas(danho));
    }

    @Test
    @DisplayName("Daño > Vida")
    void danhMayor(){
        Personaje p = new Personaje();
        p.setVidas(1000);
        int danho2= 1100;
        int danho = 1000;
        assertEquals(1000, p.perderVidas(danho));
    }
}
