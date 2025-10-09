package Grafos;

import java.util.LinkedList;

public class Grafo_Matriz_Adyacencia {
    
    private int V;
    private int A;   // esta clase sera para un grafo no drigido
    private int [] [] matrizAdyacencia;
    private LinkedList<Integer> [] [] adj;

    //truco rafael control tab para moverse entre ventanas
    
    public Grafo_Matriz_Adyacencia(int nodos) {
        this.V = nodos;
        this.A = 0;
        this.matrizAdyacencia = new int [nodos];
        this.adj = new LinkedList[nodos];
        for(int v = 0; v < V; v++){
            adj[v] = new LinkedList<>();
        }
    }
    
    public void agregarArista(int u, int v){
        matrizAdyacencia [u] [v] = 1; // conectando u con v
        matrizAdyacencia [v] [u] = 1;
        A++;
    }
    
    public void imprimirGrafo(){
        for(int v = 0; v < V; v++){
            System.out.println("Fila " + v + ":");
            for ( int w = 0; w < v; w++){
                System.out.println( matrizAdyacencia [v] [w] + " ");
            }
            System.out.println("");
        }  
}
    public void agregarArista2(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        A++;
    }
    
    
    
}