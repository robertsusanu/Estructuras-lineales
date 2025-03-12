import org.junit.jupiter.api.Test;

class IteradorBasicoTest {

    ListaBasica<Integer> lista = new ListaBasica<Integer>(5);
    IteradorBasico<Integer> iterador = new IteradorBasico<>(lista);


    @Test
    void hasNext() {
        iterador.hasNext();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        iterador.hasNext();
        System.out.println(iterador.toString());
    }

    @Test
    void next() {
        lista.add(1);
        lista.add(2);
        iterador.next();
        System.out.println(iterador.toString());
    }

    @Test
    void delete() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        iterador.next();
        System.out.println(iterador.toString());
        iterador.delete();
        System.out.println(iterador.toString());
    }

    @Test
    void testToString() {
        System.out.println(iterador.toString());
    }
}