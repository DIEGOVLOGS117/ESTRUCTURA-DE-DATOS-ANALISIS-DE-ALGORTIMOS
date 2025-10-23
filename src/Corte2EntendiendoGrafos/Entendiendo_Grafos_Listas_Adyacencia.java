package Corte2EntendiendoGrafos;

import java.util.LinkedList;
import java.util.Queue;

public class Entendiendo_Grafos_Listas_Adyacencia {
    
    protected LinkedList<Integer>[] adj;
    protected int V; // numero de vertices
    protected int A; // numero de aristas

    public Entendiendo_Grafos_Listas_Adyacencia(int nodos) {
        this.V = nodos;
        this.A = 0;
        this.adj = new LinkedList[nodos];
        for(int v = 0; v < V; v++){
            adj[v] = new LinkedList<>();
        }
}
    
    public void agregarArista(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        A++;
    }

    public void imprimirGrafo(){
        
    for(int v = 0; v < V; v++) {
        
    System.out.print("Row "+ v +": ");
    for(int w = 0; w < adj[v].size(); w++) {
        
    System.out.print(adj[v].get(w) + " ");
    
    }

    System.out.println("");
}
    
}    
    
    public void recorridoEnAnchuraBFS(int s) { // s = vértice de inicio
        
    boolean[] visited = new boolean[V]; // arreglo para marcar vértices visitados
    Queue<Integer> q = new LinkedList<>(); // cola para el recorrido BFS

    // Marcar el vértice inicial como visitado y agregarlo a la cola
    visited[s] = true;
    q.offer(s);

    // Mientras la cola no esté vacía, seguimos recorriendo
    while (!q.isEmpty()) {
        // Sacamos (atendemos) el primer vértice de la cola
        int u = q.poll();
        System.out.print(u + " "); // mostramos el vértice actual

        // Recorremos todos los vecinos (adyacentes) de u
        for (int v : adj[u]) {
            // Si el vecino no ha sido visitado
            if (!visited[v]) {
                visited[v] = true; // lo marcamos como visitado
                q.offer(v);        // lo agregamos a la cola para procesarlo después
            }
        }
    }  

}   
    
}