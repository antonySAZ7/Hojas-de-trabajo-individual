

public class Grafo{
    private final int INF =  Integer.MAX_VALUE/2;
    private int[][] matrizAdjacencia;
    private final int V = 5;

    public Grafo(){
        matrizAdjacencia = new int[][]{
            {0, 3, INF, 7, INF },
            {INF, 0, 1, INF, 8},
            {INF, INF, 0, 2, INF},
            {INF, INF, INF, 0, 3},
            {4, INF, INF, INF, 0}

        };
    }

    public void addEdge(int origem, int destino, int peso){
        matrizAdjacencia[origem][destino] = peso;
    }

    public void removeEdge(int origem, int destino){
        matrizAdjacencia[origem][destino] = INF;
    }

    public int[][] floydWarshall(){
        int[][] distancias = new int[V][V];

        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                distancias[i][j] = matrizAdjacencia[i][j];
            }
        }

        for(int k = 0; k < V; k++){
            for(int i = 0; i < V; i++){
                for(int j = 0; j < V; j++){
                    if(distancias[i][k] != INF && distancias[k][j] != INF &&
                        distancias[i][k] + distancias[k][j] < distancias[i][j]){
                        distancias[i][j] = distancias[i][k] + distancias[k][j];
                    }
                }
            }
        }

        return distancias;
    }


    public int getCentroGrafo(){
        int [][] distancias = floydWarshall();
        int centro = -1;
        int menorExcentricidade = INF;

        for(int i = 0; i < V; i++){
            int mayor = 0;
            for(int j = 0; j < V; j++){
                if(distancias[i][j] != INF){
                    mayor = Math.max(mayor, distancias[i][j]);
                }
            }
            if(mayor  < menorExcentricidade){
                menorExcentricidade = mayor;
                centro = i;
            }
        }

        return centro;


    }







}