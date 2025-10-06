package Taller2_EDA.Punto1ListasSimplesEjem1;

public class MainEnlazadaSimplesPunto1Ejem1 {

    public static void main(String[] args) {

        // === Prueba 1: Insertar y eliminar duplicados ===
        
        ListaPunto1Ejem1 lista2 = new ListaPunto1Ejem1();
        
        System.out.println("=== PRUEBA 1: Lista Con Valores Duplicados Consecutivos ===");

        ListaPunto1Ejem1 lista1 = new ListaPunto1Ejem1();
        lista1.insertarNodoFinal(3);
        lista1.insertarNodoFinal(3);
        lista1.insertarNodoFinal(3);
        lista1.insertarNodoFinal(6);

        System.out.println("Lista Original De Prueba 1: ");
        lista1.imprimirListaPunto1Ejem1();

        System.out.println("Eliminando Duplicados De Prueba 1: ");
        lista1.eliminarNodosDobles();

        System.out.println("Lista Despues De Eliminar Duplicados:");
        lista1.imprimirListaPunto1Ejem1();

        // === Prueba 2: Otra lista con duplicados dispersos ===
        System.out.println("\n=== PRUEBA 2 ===");

        lista2.insertarNodoFinal(1);
        lista2.insertarNodoFinal(1);
        lista2.insertarNodoFinal(6);
        lista2.insertarNodoFinal(6);
        lista2.insertarNodoFinal(9);

        System.out.println("Lista Original De Prueba 2: ");
        lista2.imprimirListaPunto1Ejem1();

        System.out.println("Eliminando duplicados De Prueba 2: ");
        lista2.eliminarNodosDobles();

        System.out.println("Lista Despues De Eliminar Duplicados:");
        lista2.imprimirListaPunto1Ejem1();
    }
}