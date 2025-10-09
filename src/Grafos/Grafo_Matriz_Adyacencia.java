package Grafos;

import java.util.LinkedList;

public class Grafo_Matriz_Adyacencia {

    private int V;
    private int A;   // esta clase será para un grafo no dirigido
    private LinkedList<Integer>[] adj;

    // Constructor
    public Grafo_Matriz_Adyacencia(int nodos) {
        this.V = nodos;
        this.A = 0;
        this.adj = new LinkedList[nodos];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    // Método para agregar arista
    public void agregarArista(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        A++;
    }

    // Método para imprimir el grafo como lista de adyacencia
    public void imprimirGrafo() {
        for (int v = 0; v < V; v++) {
            System.out.print("Row " + v + ": ");
            for (int w = 0; w < adj[v].size(); w++) {
                System.out.print(adj[v].get(w) + " ");
            }
            System.out.println();
        }
    }
}