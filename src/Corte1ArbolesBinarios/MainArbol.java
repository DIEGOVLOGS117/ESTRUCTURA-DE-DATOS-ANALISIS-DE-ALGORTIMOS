package Corte1ArbolesBinarios;

public class MainArbol {
    
    public static void main(String[] args) {
        
        Arbol arbolitogud = new Arbol();

        // Verificar si el árbol está vacío
        arbolitogud.vacioArbolitogud();

        // Insertar nodos en el árbol (forma iterativa)
        arbolitogud.insertarNodo(43);
        arbolitogud.insertarNodo(10);
        arbolitogud.insertarNodo(8);
        arbolitogud.insertarNodo(54);
        arbolitogud.insertarNodo(15);
        arbolitogud.insertarNodo(50);
        arbolitogud.insertarNodo(53);

        // También puedes probar la inserción recursiva:
        // arbolitogud.insertarArbolRecursive(43);
        // arbolitogud.insertarArbolRecursive(10);
        // arbolitogud.insertarArbolRecursive(8);
        // arbolitogud.insertarArbolRecursive(54);
        // arbolitogud.insertarArbolRecursive(15);
        // arbolitogud.insertarArbolRecursive(50);
        // arbolitogud.insertarArbolRecursive(53);

        System.out.println();
        System.out.println("================================================");

        // Buscar un nodo existente y uno inexistente
        arbolitogud.buscarNoditoGud(15);
        arbolitogud.buscarNoditoGud(100);

        System.out.println();

        System.out.println("================================================");
        
        // Recorrido Inorden
        System.out.println("Recorrido Inorden (Izquierda - Raiz - Derecha):");
        arbolitogud.inordenGud(arbolitogud.getRaiz());

        System.out.println();

        System.out.println("================================================");
        
        // Recorrido Preorden
        System.out.println("Recorrido Preorden (Raiz - Izquierda - Derecha):");
        arbolitogud.preOrdenGud(arbolitogud.getRaiz());

        System.out.println("================================================");

        System.out.println();

        System.out.println("================================================");

        // Recorrido Postorden
        System.out.println("Recorrido Postorden (Izquierda - Derecha - Raiz):");
        arbolitogud.postOrdenGud(arbolitogud.getRaiz());

        System.out.println();
        
        System.out.println("================================================");

        // Contar total de nodos
        int totalNodos = arbolitogud.contarNodosGud(arbolitogud.getRaiz());
        System.out.println("Total De Nodos En El Arbol: " + totalNodos);
    }
}