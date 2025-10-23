package Corte2EntendiendoGrafos;

public class Main_Entendiendo_Grafos_ListasAdyacencia {
    
    public static void main(String[] args) {
        
        Entendiendo_Grafos_Listas_Adyacencia graf = new Entendiendo_Grafos_Listas_Adyacencia(7);
        
        graf.agregarArista(0, 1);
        graf.agregarArista(0, 2);
        graf.agregarArista(2, 3);
        graf.agregarArista(1, 3);
        graf.agregarArista(1, 4);
        graf.agregarArista(3, 4);
        graf.agregarArista(3, 5);
        graf.agregarArista(5, 6);
        graf.agregarArista(0, 0);
        
        graf.imprimirGrafo();
        System.out.println("BFS");
        graf.recorridoEnAnchuraBFS(0);
        
        
        
        
    }
    
}