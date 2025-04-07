
package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.VectorHeap;
import src.Paciente;


public class VectorHeapTest {

    @Test
    public void testAniadorYRemover(){
        VectorHeap<Paciente> heap = new VectorHeap<>();
        heap.add(new Paciente("Juan", "Fiebre", "C"));
        heap.add(new Paciente("Maria", "Tos", "A"));    
        heap.add(new Paciente("Pedro", "Dolor de cabeza", "B"));

        assertEquals("Maria", heap.remove().getNombre());
        assertEquals("Pedro", heap.remove().getNombre());
        assertEquals("Juan", heap.remove().getNombre());

    }


    @Test
    public void testEstaVacio(){
        VectorHeap<Paciente> heap = new VectorHeap<>();
        assertTrue(heap.isEmpty());
        heap.add(new Paciente("Juan", "Fiebre", "C"));
        assertFalse(heap.isEmpty());
       
    }

    @Test
    public void testPeek(){
        VectorHeap<Paciente> heap = new VectorHeap<>(); 
        heap.add(new Paciente("Juan", "Fiebre", "C"));
        heap.add(new Paciente("Maria", "Tos", "A"));
        heap.add(new Paciente("Pedro", "Dolor de cabeza", "B"));

        assertEquals("Maria", heap.peek().getNombre());
    }
    

}
