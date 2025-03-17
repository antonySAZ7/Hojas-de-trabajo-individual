/**
 * Implementación de un Árbol Binario de Búsqueda (BST).
 * Código generado con asistencia de GPT-4 (ChatGPT, OpenAI).
 * Fecha de generación: [Fecha en que lo generaste].
 * 
 * Referencia: ChatGPT (2025). "Implementación de Árboles Binarios de Búsqueda en Java."
 * OpenAI. https://openai.com/
 */

public class BinarySearchTree<K extends Comparable<K>, V> {
    private Node root;
    
    class Node{
        K key;
        V value;
        Node left, right;
        
        
        public Node(K key, V value){
            this.key = key;
            this.value = value;
            
        }


    }
    public void insert(K key, V value) {
        root = insertRec(root, key, value);
    }

    private Node insertRec(Node root, K key, V value) {
        if (root == null) return new Node(key, value);
        if (key.compareTo(root.key) < 0)
            root.left = insertRec(root.left, key, value);
        else
            root.right = insertRec(root.right, key, value);
        return root;
    }

    public V search(K key) {
        return searchRec(root, key);
    }

    private V searchRec(Node root, K key) {
        if (root == null) return null;
        if (key.equals(root.key)) return root.value;
        return key.compareTo(root.key) < 0 ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.value);
            inOrderRec(root.right);
        }
    }
}
    


