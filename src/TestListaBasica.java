public class TestListaBasica {
    public static void main(String[] args) {

        ListaBasica<Integer> lista = new ListaBasica<Integer>(10);

        lista.add(1);
        System.out.println(lista);
        lista.add(2);
        System.out.println(lista);
        lista.add(3);
        System.out.println(lista);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        System.out.println(lista);

        System.out.println(lista.getNumElementos());

        lista.delete(2);
        System.out.println(lista);

        lista.delete(6);
        System.out.println(lista);


    }
}
