import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaSETest {

    ListaSE lista = new ListaSE();

    @Test
    void add() {
        lista.add(1);
        System.out.println(lista);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);
    }

    @Test
    void delete() {
        lista.delete(1);
        lista.add(1);
        lista.delete(1);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);
        lista.delete(2);
        lista.delete(7);
        System.out.println(lista);
    }

    @Test
    void getIterador() {
        lista.getIterador();
    }

    @Test
    void getNumElementos() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.getNumElementos());
    }

    @Test
    void testToString() {
        lista.add(1);
        lista.add(2);
        System.out.println(lista.toString());
    }
}