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
      
    // metodo secuencial para ingreso
    
    public void insertadoSecuenGud(int dato){ // este metodo crea el nodo  y si este esta vacio lo asigna como raiz
        Nodo nuevo = new Nodo (dato);
        if(vacioArbolitogud()){
            raiz = nuevo;
            tamanio++;
            System.out.println(" El Nodo Raiz Ingresado: " + dato);
        } else {
           insertarEnNivelGud(raiz, nuevo);
        }            
   }
    
    public void insertarEnNivelGud(Nodo actual, Nodo nuevo){
        if(actual.getHijoIzq() == null){
            actual.setHijoIzq(nuevo);
            tamanio++;
            System.out.println(" Insertado " + nuevo.getDato() + " A La Izquierda De " + actual.getDato());
        } else if (actual.getHijoDerech() == null){
              actual.setHijoDerech(nuevo);
              tamanio++;
            System.out.println(" Insertado " + nuevo.getDato() + " A La Derecha De " + actual.getDato());
        } else{
             insertarEnNivelGud(actual.getHijoIzq(), nuevo);
        }   
        
    }
    
    public void recorridoPreorden(Nodo nodo) { //  Recorrido Preorden (Raíz → Izquierda → Derecha)
    if (nodo != null) { 
        System.out.print(nodo.getDato() + " ");
        recorridoPreorden(nodo.getHijoIzq());
        recorridoPreorden(nodo.getHijoDerech());
    }
}

    public void imprimirPreorden() { // imprimir la preorden
    recorridoPreorden(raiz);
    System.out.println();
}

    

    
}