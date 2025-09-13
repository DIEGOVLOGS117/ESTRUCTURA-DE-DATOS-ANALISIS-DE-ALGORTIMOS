package Corte1TiposDeMemoria;

public class MainMemoriaEstatica {
     
    public static void main(String[] args) {
        
        GestorEdades gestor = new GestorEdades();
        gestor.cargarEdades();
        gestor.mostrarEdades("Edades ingresadas:");
        gestor.ordenarEdades();
        gestor.mostrarEdades("Edades ordenadas:");
         
    }
    
}