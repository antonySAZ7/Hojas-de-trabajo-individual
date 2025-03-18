
import main.BinarySearchTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
// clase de los junits
public class BinarySearchTreeTest {

    @Test
    void testInsertAndSearch() {
        BinarySearchTree<String, String> tree = new BinarySearchTree<>();
        tree.insert("123", "Producto A");
        tree.insert("456", "Producto B");
        tree.insert("789", "Producto C");

        assertEquals("Producto A", tree.search("123"));
        assertEquals("Producto B", tree.search("456"));
        assertEquals("Producto C", tree.search("789"));
        assertNull(tree.search("000"));
    }

    @Test
    void testInsertDuplicate() {
        BinarySearchTree<String, String> tree = new BinarySearchTree<>();
        tree.insert("123", "Producto A");
        tree.insert("123", "Producto A - Actualizado");

        assertEquals("Producto A - Actualizado", tree.search("123"));
    }

    void testInOrderTraversal() {
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        tree.insert(2, "B");
        tree.insert(1, "A");
        tree.insert(3, "C");
    
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    
        tree.inOrder();
    
        String expectedOutput = "A\nB\nC\n";
        String actualOutput = outContent.toString().trim(); // 🔥 
    
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSearchNonExistentKey() {
        BinarySearchTree<String, String> tree = new BinarySearchTree<>();
        tree.insert("123", "Producto A");
        tree.insert("456", "Producto B");

        assertNull(tree.search("789")); 
    }

    @Test
    void testInsertNullKey() {
        BinarySearchTree<String, String> tree = new BinarySearchTree<>();
        assertThrows(NullPointerException.class, () -> {
            tree.insert(null, "Producto Nulo");
        });
    }
}
