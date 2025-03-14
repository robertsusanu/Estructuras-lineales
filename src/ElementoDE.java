public class ElementoDE<T> {
    private T dato;
    private ElementoDE<T> siguiente;
    private ElementoDE<T> anterior;

    public ElementoDE(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }

    public ElementoDE<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(ElementoDE<T> siguiente) {
        this.siguiente = siguiente;
    }

    public ElementoDE<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(ElementoDE<T> anterior) {
        this.anterior = anterior;
    }

    public String toString() {
        return dato.toString();
    }
}
