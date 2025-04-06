import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> {

    protected ArrayList<E> data; 


    public VectorHeap() {
        data = new ArrayList<>(); 
        data.add(null);
    }

    private int hijoIzquierdo(int pos) {
        return 2 * pos; 
    }

    private int hijoDerecho(int pos) {
        return 2 * pos +1; 
    }

    public int size(){
        return data.size() -1; 
    }

    public E peek(){
        return data.get(1);
    }


    private void percolateUp(int pos){
        while(pos > 1){
            int padre = pos/ 2; 
            E valor = data.get(pos);
            E padreValor = data.get(padre);
            if(valor.compareTo(padreValor) <0){
                data.set(pos, padreValor); 
                data.set(padre, valor);
                pos = padre;
            } else{
                break; 
            }
        }
    }

    private void percolateDown(int pos){
        int hijo;
        E valor = data.get(pos);
        while((hijo = hijoIzquierdo(pos)) <= size()){
            int derecho = hijoDerecho(pos);
            if(derecho <= size() && data.get(derecho).compareTo(data.get(hijo))<0){
                hijo = derecho; 
            }
            if (data.get(hijo).compareTo(valor) <0){
                data.set(pos, data.get(hijo));
                pos = hijo;
            }else{
                break;
            }
        }
        data.set(pos, valor);
    }

    public void add(E value) {
        data.add(value); 
        percolateUp(data.size() - 1);
    }

    public E remove() {
        if (size() ==0) {
            return null; 
        }
        E valormin = data.get(1); 
        E ultimoValor = data.remove(data.size() - 1);
        if (size() >0){
            data.set(1, ultimoValor);
            percolateDown(1);
        }
        
        return valormin; 
    }

    public  boolean isEmpty() {
        return size()==0; 
    }   




    









}

