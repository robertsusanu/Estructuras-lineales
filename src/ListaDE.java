public class ListaDE<T> implements Lista<T> {
    protected ElementoDE<T> cabeza;
    protected ElementoDE<T> cola;
    protected int numElementos;

    public ListaDE() {
        this.numElementos = 0;
        this.cabeza = null;
        this.cola = null;
    }

    @Override
    public boolean add(T elemento) {
        ElementoDE<T> temporal = new ElementoDE(elemento);
        if (this.cabeza == null) {
            this.cabeza = temporal;
            this.cola = temporal;
            this.numElementos++;
            return true;
        }else{
            ElementoDE<T> aux = this.cabeza;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(temporal);
            this.numElementos++;
            return true;
        }
    }

    @Override
    public boolean delete(T elemento) {
        if (this.cabeza == null) {
            System.out.println("Lista vacia");
            return false;
        }else if(cabeza.getDato() == elemento){
            cabeza = this.cabeza.getSiguiente();
            this.numElementos--;
        }else{
            ElementoDE<T> aux = this.cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato() != elemento){
                aux = aux.getSiguiente();
                if(aux.getSiguiente() != null){
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    this.numElementos--;
                    return true;
                }else{
                    System.out.println("El elemento" + elemento + " no se encuentra en la lista");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public Iterador<T> getIterador() {
        return new IteradorListaDE<>(this);
    }

    @Override
    public int getNumElementos() {
        return this.numElementos;
    }
}


