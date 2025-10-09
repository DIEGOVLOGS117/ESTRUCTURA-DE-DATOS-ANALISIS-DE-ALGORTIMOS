package Grafos;

public class Main_Grafo_Matriz_Adyacencia {
    
    public static void main(String[] args) {
        
        Grafo_Matriz_Adyacencia rcraft = new Grafo_Matriz_Adyacencia(4);
        
        rcraft.agregarArista(0, 1);
        rcraft.agregarArista(1, 2);
        rcraft.agregarArista(2, 3);
        rcraft.agregarArista(3, 0);
        rcraft.imprimirGrafo();
        
        
        
    }
    
    
}