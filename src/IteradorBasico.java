public class IteradorBasico<T> implements Iterador<T> {
    private ListaBasica<T> Lista;
    private T actual;
    private int indice;

    public IteradorBasico(ListaBasica<T> lista) {
        indice = 0;
        this.Lista = lista;
        this.actual = lista.elementos[indice];
    }

    public boolean hasNext(){
        if(Lista.elementos[indice + 1] != null){
            return true;
        }else
            return false;
    }

    public T next(){ //Pasa al elemento siguiente y devuelve el anterior
        T temporal = this.actual;
        this.actual = Lista.elementos[indice + 1];
        return temporal;
    }

    public void delete(){ //Al borrar, luego hay que adelantar todos los datos
        if(Lista.elementos[indice] != null){
            Lista.elementos[indice] = null;
            while(Lista.elementos[indice + 1] != null) {
                Lista.elementos[indice] = Lista.elementos[indice + 1];
                indice++;
            }
            Lista.num_elementos--;
        }
    }

    public String toString(){
        return this.Lista.toString();
    }
}
