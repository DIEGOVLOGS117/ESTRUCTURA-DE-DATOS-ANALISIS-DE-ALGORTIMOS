package Grafos;


public class MainGrafos {
    
    public static void main(String[] args) {
        
        Grafos rcraft = new Grafos(7);

        rcraft.agregarArista(0, 1);//agrego los nodos y sus respetivas conexiones 
        rcraft.agregarArista(1, 2);
        rcraft.agregarArista(2, 3);
        rcraft.agregarArista(3, 0);
        rcraft.agregarArista(3, 4); // cuando hay unos es que hay un enlace
        rcraft.imprimirEnAnchura(0);
        rcraft.imprimirGrafo();
        
    } 
    
}