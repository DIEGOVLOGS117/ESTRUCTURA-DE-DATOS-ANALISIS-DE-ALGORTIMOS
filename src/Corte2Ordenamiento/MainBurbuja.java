package Corte2Ordenamiento;

public class MainBurbuja {

    public static void main(String[] args) {
        
        Burbuja burbugud = new Burbuja();
        
        int [] vector = {4,10,45,39,23,100,1};
        System.out.println("Vector Original ");
        burbugud.imprimirVector(vector);
        
        System.out.println();
        
        System.out.println("Vector Ordenado Por Burbuja ");
        burbugud.burbuja(vector);
        burbugud.imprimirVector(vector);
        
        System.out.println();
        
        System.out.println("Vector Ordenado Por El Otro Metodo Llamado Ordenamiento Por Seleccion ");
        burbugud.ordenaditoDeLaOtraFormaSeleccion(vector);
        burbugud.imprimirVector(vector);
        
        
        
        
        
        
    }
    
}