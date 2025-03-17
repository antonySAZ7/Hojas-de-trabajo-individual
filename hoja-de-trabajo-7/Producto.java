
import java.util.*;

public class Producto{
    String sku;
    String nombre;
    String descripcion;
    Map<String, Integer> tallas;


    // esta clase represeta el objeto modelo de un producto en si.

    private Map<String, Integer> tallasNumeros(String tallastexto){
        Map<String, Integer> tallasliberia = new HashMap<>();
        String [] tallasSepardas = tallastexto.split("\\|");
        for(String talla : tallasSepardas){
            String[] separada = talla.split(":");
            if(separada.length == 2){
                tallasliberia.put(separada[0], Integer.parseInt(separada[1]));
            }
        }
        return tallasliberia;

    }

    public Producto(String sku, String nombre, String descripcion, String tallastexto) {
        this.sku = sku;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tallas = tallasNumeros(tallastexto);
    }

    public String toString(){
        return "Sku: " + sku + " Nombre: " + nombre + " Descripcion: " + descripcion + " Tallas: " + tallas;
    }

    


}