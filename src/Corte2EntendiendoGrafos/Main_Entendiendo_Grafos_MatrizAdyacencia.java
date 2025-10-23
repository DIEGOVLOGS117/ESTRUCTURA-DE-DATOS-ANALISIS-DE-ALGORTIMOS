package Corte2EntendiendoGrafos;

public class Main_Entendiendo_Grafos_MatrizAdyacencia {
    
    public static void main(String[] args) {
        
        Entendiendo_Grafos_Matriz_Adyacencia grafitos = new Entendiendo_Grafos_Matriz_Adyacencia(4);
        
        grafitos.agregarAristasGrafos(0, 1);
        grafitos.agregarAristasGrafos(1, 2);
        grafitos.agregarAristasGrafos(2, 3);
        grafitos.agregarAristasGrafos(3, 0);
         
        grafitos.imprimirGrafo();
        
        
    }
    
}