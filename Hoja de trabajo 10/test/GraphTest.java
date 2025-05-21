

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {
    
    @Test
    public void testAddAndRemoveEdge() {
        Grafo g = new Grafo();
        g.addEdge(0, 4, 5); 
        int[][] result = g.floydWarshall();
        assertEquals(5, result[0][4]); 

        g.removeEdge(0, 4); 
        result = g.floydWarshall();
        assertTrue(result[0][4] > 5); 
    }

    @Test
    public void testFloydWarshall() {
        Grafo g = new Grafo();
        int[][] result = g.floydWarshall();

        assertEquals(3, result[0][1]); 
        assertEquals(4, result[0][2]); 
        assertEquals(6, result[0][3]); 
        assertEquals(9, result[0][4]);
    }

    @Test
    public void testGetCentroGrafo() {
        Grafo g = new Grafo();
        assertEquals(0, g.getCentroGrafo()); 
    }
}

