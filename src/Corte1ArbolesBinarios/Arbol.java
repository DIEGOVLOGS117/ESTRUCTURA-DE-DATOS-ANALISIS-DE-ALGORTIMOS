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
            System.out.println(" Hola Mundo ");
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
        System.out.println("El Nodo De La Raiz Insertado: " + datoRecibido);
        return;
    }
    Nodo actual = raiz; // empezamos desde la raíz
    while (true) { // while
        if (datoRecibido < actual.getDato()) {
            // Si es menor, va a la izquierda
            if (actual.getHijoIzq() == null) {
                actual.setHijoIzq(nuevo);
                tamanio++;
                System.out.println("Se Insertó: " + datoRecibido + " A La Izquierda De " + actual.getDato() + " Porque Es Menor");
                return;
            } else {
                actual = actual.getHijoIzq();
            }
        } else {
            // Si es mayor o igual, va a la derecha
            if (actual.getHijoDerech() == null) {
                actual.setHijoDerech(nuevo);
                tamanio++;
                System.out.println("Se Inserto: " + datoRecibido + " A la Derecha De " + actual.getDato() + " Porque Es Mayor O Igual");
                return;
            } else {
                actual = actual.getHijoDerech();
            }
        }
    }
}
    
    public boolean buscarNoditoGud(int dato) {
    Nodo actual = raiz;
    while (actual != null) {
        if (dato == actual.getDato()) {
            System.out.println("Dato Encontrado: " + dato);
            return true;
        } else if (dato < actual.getDato()) {
            actual = actual.getHijoIzq();
        } else {
            actual = actual.getHijoDerech();
        }
    }
    System.out.println("Dato No Encontrado: " + dato);
    return false;
}
    // recorrer el arbol en desorden es decir  (izquierda - raiz - derecha)
    public void inordenGud(Nodo nodo){
        if(nodo != null){ // diferente de null el nodo
            inordenGud(nodo.getHijoIzq());
            System.out.println(nodo.getDato() + " ");
            inordenGud(nodo.getHijoDerech());
         }   
    }
    // recorre el arbol en orden es decir (raiz- izquierda - derecha)
    public void preOrdenGud(Nodo nodo){
        if(nodo != null){
            System.out.println( nodo.getHijoIzq()+ " ");
            preOrdenGud(nodo.getHijoIzq());
            preOrdenGud(nodo.getHijoDerech());
        }
 
    }
    
    public int contarNodosGud(Nodo nodo) {
        if (nodo == null) 
        return 0;
     return 1 + contarNodosGud(nodo.getHijoIzq()) + contarNodosGud(nodo.getHijoDerech());
}
    // forma de insertar recursivamente
    
    public void insertarArbolRecursive(int datoRecibido){
        raiz = insertarRecusive(raiz, datoRecibido);     /// la raiz sera igual al valor que ingrese en mi metodo
        /// de tipo Nodo el metodo insertarRecusive
        tamanio++;
} 
   private Nodo insertarRecusive(Nodo raiz, int dato){
    if (raiz == null) {
        return new Nodo(dato);  // Caso base: crea nuevo nodo
    }

    if (dato < raiz.getDato()) {
        raiz.setHijoIzq(insertarRecusive(raiz.getHijoIzq(), dato));  // Inserta en la izquierda
    } else {
        raiz.setHijoDerech(insertarRecusive(raiz.getHijoDerech(), dato));  // Inserta en la derecha
    }

    return raiz;  // Retorna el nodo actualizado
}

   

    
    
    
    
}