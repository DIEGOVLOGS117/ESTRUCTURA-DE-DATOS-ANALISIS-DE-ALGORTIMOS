package EnlazadasDobles;

public class Lista2 {
    
    private Nodo2 cabeza,cola;
    private int tamanho = 0;

    public Lista2() {
        this.cabeza = null;  // si pierdo cola se pierde la lista
        this.cola = null;
        this.tamanho = 0;
    }

    public int getTamanho() { // aaa
        return tamanho;
    }
    
    public boolean estaVacia(){
        if(cabeza == null){
            System.out.println(" LE FALTA CABEZA ");
            return true;
        }
        else {
            return false;
        }
    }  
    // agregar elementos al inicio y al final 
    
    public void imprimirListaIniAFin() {
    Nodo2 nodoRecorre = cabeza;
        System.out.println(" Cabeza -> ");
        while(nodoRecorre != null) {
            System.out.println(nodoRecorre.dato + "->");
            nodoRecorre = nodoRecorre.siguiente;
        }
        System.out.println(" FINAL FINAL REAL MADRID GANA LA 16 CHAMPIONS ");
} 
    public void imprimirListaFinAIni(){
        Nodo2 nodoRecorre = cabeza;
        
        System.out.println(" Final -> ");
        while(nodoRecorre != null){
            System.out.println(nodoRecorre.dato + " -> ");
            nodoRecorre = nodoRecorre.anterior;
        }
        System.out.println(" INICIO ");         
    }
    
//    public void InsertarNodito(int dato, int posicion){  // argumento de posicion pero que lo ingrese en una sola posicion
//        
//        if(posicion == 0 || posicion >= tamanho){
//        System.out.println("Eror al ingresar datos su posicion es invalida");
//        return;
//        }
//        
//        Nodo2 nodoIndice = new Nodo2(dato);
//        Nodo2 nodoRecorre = cabeza;  
//        
//        int cont = 0;
           
    public void InsertarNodoInicio(int dato){   // metodo de la profe 
    Nodo2 nuevo = new Nodo2(dato);
    if(estaVacia()){
        cola = nuevo;
    } else{
        cabeza.anterior = nuevo;
    }    
    nuevo.siguiente = cabeza;
    nuevo.anterior = null;
    cabeza = nuevo;
    tamanho++;  
    }
    
    public void insetarNodoFin(int dato){
     
        Nodo2 nuevo = new Nodo2(dato);      
        if(cola == null){
            cabeza = nuevo;
        }else{
        cola.siguiente = nuevo;
        nuevo.anterior = cola;
      }
      cola = nuevo;
      tamanho++;

    }
 
    public void InsertNodoIndice(int dato){ // qe pasa si tengo una lista de millones de elementos y quiero ingresar a lo ultimos dos elementos de dicha lista.
        
    }
   
} 