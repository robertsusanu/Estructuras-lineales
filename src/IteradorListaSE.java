public class IteradorListaSE<T> implements Iterador<T> {
    private ListaSE<T> Lista;
    private Elemento<T> actual;

    public IteradorListaSE(ListaSE<T> lista) {
        this.Lista = lista;
        this.actual = lista.cabeza;
    }

    @Override
    public boolean hasNext() {
        if(Lista.cabeza.getSiguiente() == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public T next() {
        T temporal = Lista.cabeza.getDato();
        actual = Lista.cabeza.getSiguiente();
        return temporal;
    }

    @Override
    public void delete(){
        if(Lista.cabeza != null) {
            Lista.cabeza.setSiguiente(null);
            while(Lista.cabeza.getSiguiente() != null){
                Lista.cabeza = Lista.cabeza.getSiguiente();
                Lista.cabeza.setSiguiente(null);
            }
            Lista.numElementos--;
        }
    }

    public String toString(){
        return Lista.toString();
    }
}
