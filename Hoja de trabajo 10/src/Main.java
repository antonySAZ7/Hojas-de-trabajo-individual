


public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        String[] ciudades = {
            "Ciudad de Guatemala", // A
            "Zacapa",              // B
            "Chiquimula",          // C
            "Quetzaltenango",      // D
            "Coban"                // E
        };

        int[][] distancias = grafo.floydWarshall();

        System.out.println("Matriz de distancias mas cortas de Floyd-Warshall:\n");

        for (int i = 0; i < distancias.length; i++) {
            for (int j = 0; j < distancias[i].length; j++) {
                if (distancias[i][j] == Integer.MAX_VALUE)
                    System.out.print("INF\t");
                else
                    System.out.print(distancias[i][j] + "\t");
            }
            System.out.println();
        }

        int centro = grafo.getCentroGrafo();
        System.out.println("\nCentro del grafo: " + ciudades[centro] + " (Nodo " + (char) ('A' + centro) + ")");
    }



    
}
