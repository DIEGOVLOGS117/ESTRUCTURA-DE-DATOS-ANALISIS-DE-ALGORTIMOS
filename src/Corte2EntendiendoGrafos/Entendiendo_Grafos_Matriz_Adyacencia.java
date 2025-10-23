package Corte2EntendiendoGrafos;

public class Entendiendo_Grafos_Matriz_Adyacencia {
    
    protected int V; // numero de vertices
    protected int A; // numero de aristas
    protected int [][] matrizAdyacencia;

    public Entendiendo_Grafos_Matriz_Adyacencia(int nodos) {
        this.V = nodos; // asignamos vertices a el parametro del constructor nodos
        this.A = 0;
        this.matrizAdyacencia = new int [nodos][nodos];
    }
    
// Método para agregar una arista (conexión) entre dos vértices del grafo
    public void agregarAristasGrafos(int u, int v) {
    // Marcamos que hay una conexión de u → v
    matrizAdyacencia[u][v] = 1; // Para grafos dirigidos solo usarías esta línea

    // Marcamos que también hay una conexión de v → u
    // (esto hace que el grafo sea no dirigido, o sea, doble sentido)
    matrizAdyacencia[v][u] = 1;

    // Aumentamos el contador de aristas (número total de conexiones)
    A++;
}

public void imprimirGrafo() {
    System.out.println("==== Impresion De Grafo ====");
    for (int v = 0; v < V; v++) {
        System.out.print("["); // abre el corchete de la fila

        for (int w = 0; w < V; w++) {
            System.out.print(matrizAdyacencia[v][w]);
            if (w < V - 1) {
                System.out.print(", "); // agrega coma y espacio entre elementos
            }
        }

        System.out.println("]"); // cierra el corchete al final de la fila
    }
}


    
}