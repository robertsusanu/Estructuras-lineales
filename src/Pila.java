public class Pila<T> {
    private ListaSE<T> Lista;
    private ElementoSE<T> cima;
    private int tamaño;

    public Pila(ListaSE<T> lista) {
        this.Lista = lista;
        this.cima = null;
        this.tamaño = 0;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void push(T dato) {
        ElementoSE<T> nuevo = new ElementoSE(dato);
        if (this.cima == null) {
            this.cima = nuevo;
            tamaño++;
        }else{
            ElementoSE<T> aux = this.cima;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            tamaño++;
        }
    }

    public T pop() {
        if (this.cima == null) {
            System.out.println("No hay elementos en la pila");
        }else{
            ElementoSE<T> aux = this.cima;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            return aux.getDato();
        }
        return null;
    }

    public String toString() {
        String temporal = " ";
        ElementoSE<T> aux = this.cima;
        while(aux.getSiguiente() != null){
            temporal += aux.getDato() + ", ";
            aux = aux.getSiguiente();
        }
        temporal += aux.getDato();
        return temporal + " ";
    }
}
