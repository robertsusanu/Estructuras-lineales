import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilaTest {

    ListaSE<Integer> lista = new ListaSE<>();
    Pila<Integer> pila = new Pila<>(lista);

    @Test
    void push() {
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila);
    }

    @Test
    void pop() {
        pila.pop();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila);
        System.out.println(pila.pop());
    }

    @Test
    void testToString() {
        pila.push(1);
        pila.push(2);
        System.out.println(pila);
    }

    @Test
    void testgetTamaño(){
        pila.push(1);
        System.out.println(pila.getTamaño());
        pila.push(2);
        System.out.println(pila.getTamaño());
    }

}