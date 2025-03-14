import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaTest {

    Cola<Integer> cola = new Cola<>();

    @Test
    void getContador() {
        cola.enqueue(1);
        cola.enqueue(2);
        System.out.println(cola.getContador());
    }

    @Test
    void enqueue() {
        cola.enqueue(1);
        cola.enqueue(2);
        System.out.println(cola.toString());
    }

    @Test
    void dequeue() {
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        cola.dequeue();
    }

    @Test
    void testToString() {
        cola.enqueue(1);
        System.out.println(cola.toString());
    }
}