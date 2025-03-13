public class Elemento<T> {
    private T dato;
    private Elemento<T> siguiente;

    public Elemento(T elemento){
        this.dato = elemento;
    }

    public T getDato(){
        return dato;
    }
    public void setDato(T elemento){
        this.dato = elemento;
    }

    public Elemento<T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Elemento<T> siguiente){
        this.siguiente = siguiente;
    }

    public String toString(){
        return dato.toString();
    }
}
