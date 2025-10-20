package Grafos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Grafos {
    
    private int V;  // Número de vértices
    private int A;  // Número de aristas
    private int[][] matrizAdyacencia;  // Matriz de adyacencia
    
    public Grafos(int nodos) {
        this.V = nodos;
        this.A = 0;
        this.matrizAdyacencia = new int[nodos][nodos];
    }
    
    public void agregarArista(int u, int v) {
        matrizAdyacencia[u][v] = 1;
        matrizAdyacencia[v][u] = 1; // Grafo no dirigido
        A++;
    }
    
    public void imprimirGrafo() {
        for (int v = 0; v < V; v++) {
            System.out.print("\tFila " + v + ": ");
            for (int w = 0; w < V; w++) {
                System.out.print(matrizAdyacencia[v][w] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Recorrido en anchura (BFS) sobre el grafo
    public void imprimirEnAnchura(int inicio) {
        if (matrizAdyacencia == null) {
            System.out.println("El grafo está vacío");
            return;
        }
        
        boolean[] visitado = new boolean[V];  // Arreglo para marcar los vértices visitados
        Queue<Integer> cola = new LinkedList<>();  // Cola para el recorrido BFS
        
        // Comienza desde el vértice 'inicio'
        cola.add(inicio);
        visitado[inicio] = true;
        
        while (!cola.isEmpty()) {
            int nodo = cola.poll();
            System.out.print(nodo + " ");  // Imprime el vértice actual
            
            // Añade a la cola todos los vértices adyacentes no visitados
            for (int i = 0; i < V; i++) {
                if (matrizAdyacencia[nodo][i] == 1 && !visitado[i]) {
                    cola.add(i);
                    visitado[i] = true;
                }
            }
        }
        System.out.println();
    }
    
    public void recorrerEnAnchura(){ // pasar parametro para que indique donde inicie para el recorrido
        if(matrizAdyacencia == null){
            System.out.println("El Grafo Esta Vacio ");
            return;
        }
        boolean [] nodosVisitados = new boolean[V];
        
        
        
        
        
       Queue <Integer> colagud = new LinkedList<>();
      
       colagud.add(5);   
    }
    
    
//    public void imprimirEnAnchura(int inicio){ //inici desde donde quiero arrancar a leer 
//
//           Queue<Integer> cola = new LinkedList<> (); // hago una cola de nodos 
//           
//           boolean [] visitado = new boolean [V];//creo un boleano donde todos losdatos seran falsos 
//           visitado[inicio]= true;//hago que los datos sean verdaderos 
//           cola.offer(inicio);//agrego elementos a mi cola 
//           
//           while (!cola.isEmpty()){
//               int u = cola.poll();
//               System.out.println(u + " ");
//               
//               for(int v : adj[u]){
//                   if(!visitado[v]){
//                       visitado[v] = true;
//                       cola.offer(v);
//                   }
//               }
//               }
//           
//    }
               


    
    
    
    
    public void enProfundidadGud(){
        
        boolean [] visited = new boolean [V];
        Stack<Integer> pilitaRecorridos = new Stack<>(); // 
        
        
        
        
        
        
        
        // por cualquier esquina 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}