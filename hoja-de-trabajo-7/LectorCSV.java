import java.io.*;
import java.util.*;

public class LectorCSV {
    
    public static void cargarProducto(String archivo, BinarySearchTree<String, Producto> skuTree, BinarySearchTree<String, Producto> nameTree){
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] values = linea.split(",");
                if(values.length ==4){

                    Producto producto = new Producto(values[0], values[1], values[2], values[3]);
                    skuTree.insert(producto.sku, producto);
                    nameTree.insert(producto.nombre, producto);
            }}
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
