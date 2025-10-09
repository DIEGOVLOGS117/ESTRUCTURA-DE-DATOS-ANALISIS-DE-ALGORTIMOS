package Grafos;


public class MainGrafos {
    
    public static void main(String[] args) {
        
        Grafos rcraft = new Grafos(4);

        rcraft.agregarArista(0, 1);//agrego los nodos y sus respetivas conexiones 
        rcraft.agregarArista(1, 2);
        rcraft.agregarArista(2, 3);
        rcraft.agregarArista(3, 0);
        rcraft.imprimirGrafo();
        
    } 
    
}