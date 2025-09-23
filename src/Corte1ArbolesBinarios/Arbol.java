package Corte1ArbolesBinarios;

public class Arbol {
    
    private Nodo raiz;
    private int tamanio;

    public Arbol() {
        this.tamanio = 0;
    }

    public Arbol(Nodo raiz, int tamanio) {
        this.raiz = raiz;
        this.tamanio = tamanio;
    }

    public boolean vacioArbolitogud(){
        if (raiz == null) {
            System.out.println(" Su Arbol Esta Vacio ");      
            return true;
        } else{
            System.out.println(" Su Arbol No Esta Vacio ");
            return false;
        }
        
        
        
        
    }
    
    
    
    
    
    
}