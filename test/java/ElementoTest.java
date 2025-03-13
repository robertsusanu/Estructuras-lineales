import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementoTest {

    Elemento<Integer> e = new Elemento<>(6);
    ListaSE<Integer> lista = new ListaSE<>();

    @Test
    void getDato() {
        e.getDato();
    }

    @Test
    void setDato() {
        e.setDato(7);
    }

    @Test
    void getSiguiente() {
        lista.add(1);
        lista.add(2);
        e.getSiguiente();
    }

    @Test
    void setSiguiente() {
    }

    @Test
    void testToString() {
        System.out.println(e.toString());
    }
}