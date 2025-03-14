public class IteradorListaDE<T> implements Iterador<T>{
    private ListaDE<T> lista;
    private ElementoDE<T> actual;

    public IteradorListaDE(ListaDE<T> lista){
        this.lista = lista;
        this.actual = lista.cabeza;
    }

    @Override
    public boolean hasNext() {
        if(lista.cabeza.getSiguiente() == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public T next() {
        T temporal = lista.cabeza.getDato();
        actual = lista.cabeza.getSiguiente();
        return temporal;
    }

    @Override
    public void delete(){
        if(lista.cabeza != null){
            lista.cabeza.setSiguiente(null);
        }while(lista.cabeza.getSiguiente() != null){
            lista.cabeza = lista.cabeza.getSiguiente();
            lista.cabeza.setSiguiente(null);
        }
        lista.numElementos--;
    }

    public String toString(){
        return lista.toString();
    }
}

