package Corte2EntendiendoGrafos;

import java.util.LinkedList;

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
    
    
    
    
    
    
    
}