public class ListaBasica<T> implements Lista<T> {
    private int Tamano_max;
    protected int num_elementos;
    protected T[] elementos;

    public ListaBasica(int max){
        this.Tamano_max = max;
        this.num_elementos = 0;
        this.elementos = (T[]) new Object[max];
    }

    @Override
    public boolean add(T elemento) {
        if(this.getNumElementos() < Tamano_max) {
            elementos[num_elementos] = elemento;
            num_elementos++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean delete(T elemento) {
        if(this.getNumElementos() == 0) {
            return false;
        }else{
            for(int i = 0; i<num_elementos; i++){
                if(this.elementos[i] == elemento) {
                    for(int j = i; j<num_elementos; j++){
                        this.elementos[j] = this.elementos[j+1];
                    }
                    num_elementos--;
                }
            }
            return true;
        }
    }

    @Override
    public Iterador<T> getIterador() {
        return new IteradorBasico<>(this);
    }

    @Override
    public int getNumElementos() {
        return num_elementos;
    }

    public String toString(){
        String temporal = "";
        for(int i = 0; i < num_elementos; i++){
            temporal = temporal  + this.elementos[i].toString()+ ", ";
        }
        return temporal;
    }
}
