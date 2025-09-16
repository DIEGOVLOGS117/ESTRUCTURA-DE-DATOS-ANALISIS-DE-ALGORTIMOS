package Corte1PilaYCola;

public class Cola {
    
    private Nodo primerNodito;
    private Nodo ultimoNodito;

    public Cola() {
        this.primerNodito = null; // inicializados en vacios los nodos del inicio y final
        this.ultimoNodito = null;
    }

    public Cola(Nodo primerNodito, Nodo ultimoNodito) {
        this.primerNodito = primerNodito;  
        this.ultimoNodito = ultimoNodito;
    }
    
    // verificación si la cola esta vacia
    public boolean validarVacio(){
        return primerNodito == null;
    }
    
    // encolar significa agregar nodo al final
    
    public void encolar(int dato){
        
        Nodo nuevo = new Nodo(dato, null);  
        
        // validacion si esta vacia
        
        if(validarVacio()){
            
            primerNodito = nuevo;
            ultimoNodito = nuevo; 
        } else {
            // enlazar ultimo nodo con el nuevo
            ultimoNodito.siguiente = nuevo;
            // actualizar el nodo ultimo
            ultimoNodito = nuevo; 
        }
            
        
        
        
        
    }
    
    
    
    
    
}