package enlazadasimple;

public class Lista {
    
    private Nodo cabeza;

    public Lista(Nodo cabeza) {
        this.cabeza = null; // si se pierde cabeza se pierde todo 
    }
       
    public void insertarNodoInicio(int dato){
    Nodo nodoIni = new Nodo (dato);
    nodoIni.siguiente = cabeza;
    cabeza = nodoIni;
    }     
    
    public void NuevosNodos(int dato){
        Nodo noditonext = new Nodo (dato);
       
        
        
    }   
    
            
            
}

