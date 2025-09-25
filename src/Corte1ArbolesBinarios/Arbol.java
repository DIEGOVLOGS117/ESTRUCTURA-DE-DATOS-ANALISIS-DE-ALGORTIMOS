package Corte1ArbolesBinarios;

public class Arbol {
    
    private Nodo raiz;
    private int tamanio;

    public Arbol() {
        this.raiz = null; // a pesar que ya lo haga java para acordarme.
        this.tamanio = 0;
    }

    public Arbol(Nodo raiz, int tamanio) {
        this.raiz = raiz;
        this.tamanio = tamanio;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public boolean vacioArbolitogud(){
        if (raiz == null || tamanio == 0) {
            System.out.println(" Su Arbol Esta Vacio ");      
            return true;
        } else{
            System.out.println(" Su Arbol No Esta Vacio ");
            return false;
        }  
    }
      
    // Recordatorio sobre niveles en árboles binarios de búsqueda:
    // Por ejemplo, con la lista [43, 10, 8, 54, 15, 50, 53]
    // Comenzamos con el primer número, 43, que es la raíz.
    // Para cada número siguiente, verificamos si es menor o mayor que el nodo actual:
    // - Si es menor, se inserta en el subárbol izquierdo.
    // - Si es mayor, se inserta en el subárbol derecho.
    // Este proceso se repite recursivamente hasta encontrar un lugar donde el hijo izquierdo o derecho sea null,
    // y ahí se inserta el nuevo nodo.
    // Se llama árbol binario porque cada nodo puede tener como máximo dos hijos.
    
    public void insertarNodo(int datoRecibido) {
    Nodo nuevo = new Nodo(datoRecibido); // nuevo nodo que recibe el entero datoRecibido
    if (raiz == null) {
        raiz = nuevo; // si la raiz es nula entonces le asignamos ese nodo creado
        tamanio++;
        System.out.println("El Nodo de la Raiz Insertado: " + datoRecibido);
        return;
    }
    Nodo actual = raiz; // empezamos desde la raíz
    while (true) { // while
        if (datoRecibido < actual.getDato()) {
            // Si es menor, va a la izquierda
            if (actual.getHijoIzq() == null) {
                actual.setHijoIzq(nuevo);
                tamanio++;
                System.out.println("Se Insertó: " + datoRecibido + " a la izquierda de " + actual.getDato() + " porque es menor");
                return;
            } else {
                actual = actual.getHijoIzq();
            }
        } else {
            // Si es mayor o igual, va a la derecha
            if (actual.getHijoDerech() == null) {
                actual.setHijoDerech(nuevo);
                tamanio++;
                System.out.println("Se Insertó: " + datoRecibido + " a la derecha de " + actual.getDato() + " porque es mayor o igual");
                return;
            } else {
                actual = actual.getHijoDerech();
            }
        }
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

    public void buscandoNodoGud(){
        
    }
    

    
}