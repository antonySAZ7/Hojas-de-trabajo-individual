
package main;
// es la clase main, la que se encarga de ejecutar el programa
public class Principal {
    public static void main(String[] args) {
        BinarySearchTree<String, Producto> skuTree = new BinarySearchTree<>();
        BinarySearchTree<String, Producto> nameTree = new BinarySearchTree<>();


        int contador = 0; 
        while(contador<1){
            System.out.println("Bienvenido al sistema de inventario");
            System.out.println("1. Cargar productos");
            System.out.println("2. Buscar producto por SKU");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción: ");
            int opcion = Integer.parseInt(System.console().readLine());
            switch(opcion){
                case 1:
                    LectorCSV.cargarProducto("productos.csv", skuTree, nameTree);
                    break;
                case 2:
                    System.out.println("Ingrese el SKU del producto a buscar: ");
                    String sku = System.console().readLine();
                    Producto producto = skuTree.search(sku);
                    if(producto != null){
                        System.out.println("Producto encontrado: " + producto);
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto a buscar: ");
                    String nombre = System.console().readLine();
                    Producto producto2 = nameTree.search(nombre);
                    if(producto2 != null){
                        System.out.println("Producto encontrado: " + producto2);
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("byeeeee");
                    contador = 1;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        }
        
    }
    
}
