import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorListaSETest {

    ListaSE<Integer> lista = new ListaSE<>();
    IteradorListaSE<Integer> iterador = new IteradorListaSE<>(lista);

    @Test
    void hasNext() {
        lista.add(1);
        lista.add(2);
        iterador.hasNext();
        iterador.next();
        iterador.hasNext();
    }

    @Test
    void next() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        iterador.next();
    }

    @Test
    void delete() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        iterador.next();
        iterador.delete();
        System.out.println(lista);
    }

    @Test
    void testToString() {
        lista.add(1);
        lista.add(2);
        System.out.println(iterador.toString());
    }
}