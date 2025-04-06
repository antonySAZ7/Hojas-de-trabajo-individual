import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> {

    protected ArrayList<E> data; 


    public VectorHeap() {
        data = new ArrayList<>(); 
    }

    private int hijoIzquierdo(int pos) {
        return 2 * pos + 1; 
    }

    private int hijoDerecho(int pos) {
        return 2 * pos + 2; 
    }

    public int size(){
        return data.size(); 
    }

    public E peek(){
        return data.get(0);
    }


    private void percolateUp(int pos){
        while(pos > 0){
            int padre = (pos - 1) / 2; 
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
        while((hijo = hijoIzquierdo(pos)) <  data.size()){
            int derecho = hijoDerecho(pos);
            if(derecho < data.size() && data.get(derecho).compareTo(data.get(hijo)) < 0){
                hijo = derecho; 
            }
            if (data.get(hijo).compareTo(valor) <0){
                data.set(pos, data.get(hijo));
                pos = hijo;
            }else{
                break;
            }
        }
    }

    public void add(E value) {
        data.add(value); 
        percolateUp(data.size() - 1);
    }

    public E remove() {
        if (data.isEmpty()) {
            return null; 
        }
        E valormin = data.get(0); 
        E ultimoValor = data.remove(data.size() - 1);
        if (!data.isEmpty()){
            data.set(0, ultimoValor);
            percolateDown(0);
        }
        
        return valormin; 
    }

    public  boolean isEmpty() {
        return data.isEmpty(); 
    }   

    


    









}

