package enlazadasimple;

public class Lista {
    
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null; // aqui la lista esta vacia / si se pierde cabeza se pierde todo 
    }
       
    public void insertarNodoInicio(int dato){  // ingresamos el primer dato
    Nodo nodoIni = new Nodo (dato);
    nodoIni.siguiente = cabeza;
    cabeza = nodoIni;
    }     
    
    public void insertarNodoFinal(int dato) {
    
    Nodo nodoFin = new Nodo(dato);    
    Nodo nodoRecorre = cabeza;
    
    while(nodoRecorre.siguiente != null){
        nodoRecorre = nodoRecorre.siguiente;
    }
        nodoRecorre.siguiente = nodoFin;     
    }   

    
       /*
/ nodo que este entre el inicio y final
    
    public void middle(int dato) {
   */     
        
 
    public void imprimirLista(){
        Nodo nodoRecorre = cabeza;
    while (nodoRecorre != null){
        System.out.println(nodoRecorre.dato + "->");
        nodoRecorre = nodoRecorre.siguiente;
    }
        System.out.println("NULL");       
        
    }

    public void inserIndice(int dato, int idx){
        Nodo nodoIndice = new Nodo (dato);
        Nodo nodoRecorre = cabeza;
        
        int cont = 0;
        
        
        
    }
    
    
    
}