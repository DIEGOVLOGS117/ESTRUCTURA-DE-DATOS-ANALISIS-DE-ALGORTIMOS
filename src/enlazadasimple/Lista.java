package enlazadasimple;

public class Lista {
    
    private Nodo cabeza;
    public int tamaño;
    private Nodo cola;
    
    public Lista() {
        this.cabeza = null; // aqui la lista esta vacia / si se pierde cabeza se pierde todo 
        this.tamaño = 0;
        this.cola = null;
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
    
    // primera opcion 
    public void eliminarInicioElemento() {  // es para Ahorrar memoria borrando copias ya realizadas
        Nodo inicio = cabeza;
        cabeza = cabeza.siguiente;
        inicio.siguiente = null; // rompe enlace
        tamaño--;
        
    }
    
    /* este es el metodo 2 public void eliminarNodoInicio (){
    cabeza = cabeza.siguiente;
    tamaño --; */

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
/*     public boolean verificadorPromax(){
        
        if (cabeza == null) 
    }
    */
    
    
    public void eliminarFinalElemento(){

        
        
        
    }
    
}