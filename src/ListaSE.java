public class ListaSE<T> implements Lista<T> {
    protected Elemento<T> cabeza;
    protected int numElementos;

    public ListaSE() {
        cabeza = null;
        numElementos = 0;
    }

    @Override
    public boolean add(T elemento) {
        Elemento<T> temporal = new Elemento<>(elemento);
        if(this.cabeza == null){
            this.cabeza = temporal;
        }else{
            Elemento<T> aux = this.cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(temporal);
            numElementos++;
        }
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if(cabeza == null){
            System.out.println("Lista vacia");
            return false;
        }else if(cabeza.getDato() == elemento){
            cabeza = cabeza.getSiguiente();
            numElementos--;
        }else{
            Elemento<T> aux = this.cabeza;
            while(aux.getSiguiente() != null && aux.getSiguiente().getDato() != elemento){
                aux = aux.getSiguiente();
                if(aux.getSiguiente() == null){
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    numElementos--;
                    return true;
                }else{
                    System.out.println("El elemento" + elemento + " no se encuentra en la lista" );
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public Iterador<T> getIterador(){
        return new IteradorListaSE<>(this);
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }

    public String toString(){
        String temporal = " ";
        temporal = cabeza.toString();
        while(cabeza.getSiguiente() != null){
            temporal = temporal + " " + cabeza.getSiguiente().toString();
            cabeza = cabeza.getSiguiente();
        }
    return temporal;
    }
}
