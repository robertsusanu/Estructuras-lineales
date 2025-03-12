import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaBasicaTest {
    ListaBasica<Integer> lista = new ListaBasica<Integer>(5);

    @Test
    void add() {
        lista.add(1);
        System.out.println(lista);
        lista.add(2);
        System.out.println(lista);
        lista.add(3);
        System.out.println(lista);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        System.out.println(lista);
    }

    @Test
    void delete() {
        lista.delete(1);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.delete(2);
        System.out.println(lista);
    }

    @Test
    void getIterador() {
        lista.getIterador();
        System.out.println(lista);
    }

    @Test
    void getNumElementos() {
        System.out.println(lista.getNumElementos());
    }

    @Test
    void testToString() {
        lista.toString();
    }
}
