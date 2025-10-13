package Corte1ArbolesBinarios;

import java.util.Queue;
import java.util.LinkedList;

public class Arbol {
    
    protected Nodo raiz;
    protected int tamanio;

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
                System.out.println("Se Inserto: " + datoRecibido + " A La Izquierda De " + actual.getDato() + " Porque Es Menor");
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
    // buscar el nodo insertado   
    public void enAnchuraGud(Nodo nodo) {
    if (vacioArbolitogud()) {
        System.out.println("El árbol está vacío.");
        return;
    }

    Queue<Nodo> gudColaArbol = new LinkedList<>();
    gudColaArbol.add(nodo); // o también puedes usar this.raiz

    while (!gudColaArbol.isEmpty()) {
        Nodo nodito = gudColaArbol.poll();
        System.out.println(nodito.getDato());

        if (nodito.getHijoIzq() != null) {
            gudColaArbol.add(nodito.getHijoIzq());
        }

        if (nodito.getHijoDerech() != null) {
            gudColaArbol.add(nodito.getHijoDerech());
        }
    }
}
    // recorre el arbol en orden es decir (raiz- izquierda - derecha)
    public void preOrdenGud(Nodo nodo) {
    if (nodo != null) {
        System.out.println(nodo.getDato()); // impresion de la raiz
        preOrdenGud(nodo.getHijoIzq());
        preOrdenGud(nodo.getHijoDerech());
    }
}  
    // recorrer el arbol en desorden es decir  (izquierda - raiz - derecha)
    public void inordenGud(Nodo nodo){
        if(nodo != null){ // diferente de null el nodo
            inordenGud(nodo.getHijoIzq());
            System.out.println(nodo.getDato() + " ");
            inordenGud(nodo.getHijoDerech());
         }   
    }
    
    public void postOrdenGud(Nodo nodo){
        if(nodo != null){
            System.out.println(nodo.getDato());
        } 
        
    }
    
//    public int contarNodosGud(Nodo nodo) {
//        if (nodo == null) 
//        return 0;
//     return 1 + contarNodosGud(nodo.getHijoIzq()) + contarNodosGud(nodo.getHijoDerech());
//}

    public boolean buscarNoditoGud(int dato) {
        
    Nodo nodoActual = raiz; // Empezamos desde la raíz
    
    if (vacioArbolitogud()) {
        System.out.println("Su Arbol Esta Vacio No Contiene Datos");
        return false;
    }
    // Recorremos el árbol mientras el nodo actual no sea nulo
    while (nodoActual != null) { // el while para recorrer todo el arbol
        if (dato == nodoActual.getDato()) {
            System.out.println("El Dato Encontrado Es: " + dato);
            return true;
        } else if (dato < nodoActual.getDato()) {
            nodoActual = nodoActual.hijoIzq;
        } else {
            nodoActual = nodoActual.hijoDerech;
        }
    }
    System.out.println("Su Dato Ingresado: " + dato + " No Existe En El Arbol.");
    return false;
}
    
    public void eliminarNodoGud(int dato){
        if(vacioArbolitogud()){
            System.out.println("Su Arbol Esta Vacio No Podemos Eliminar Nodos");
        } else if (!buscarNoditoGud(dato)){
            System.out.println("El Nodo Ingresado " + dato + "No Existe En El Arbol");    
        } else{
            System.out.println("Dato Encontrado " + dato + "Existe En El Arbol");
        }
     
        }
        
    public void calculadingNivelyAltur(int numeritonodo){
        
        Nodo nodorecorrearbulgud = raiz;
        int contanivel = 0; // contador para el nviel
        
        if(vacioArbolitogud()){
            System.out.println("Su Arbol Esta Vacio ");
            return;
        } else{
            
            while(nodorecorrearbulgud != null){
                if(numeritonodo < nodorecorrearbulgud.getDato()){
                    System.out.println("Su Valor " + numeritonodo + " Esta En Su Arbol Posteriormente Se Procede A Calcular Nivel Y Altura");
                    
            }
                System.out.println("Su Valor " + numeritonodo + "No Esta En Su Arbol");
                
                
        }
    }
  
    }
       
    public void sumaElementosIzqyDerecha() {
    if (vacioArbolitogud()) {
        System.out.println("Su Árbol Está Vacío");
        return;
    }

    Nodo noditogud = raiz;

    int sumaIzquierda = sumaSubarbol(noditogud.getHijoIzq());

    int sumaDerecha = sumaSubarbol(noditogud.getHijoDerech());
    
    System.out.println("Suma De Elementos Del Subarbol Izquierdo: " + sumaIzquierda);
    System.out.println("Suma De Elementos Del Subarbol Derecho: " + sumaDerecha);
}
    
    public int sumaSubarbol(Nodo noditogud){
        if(noditogud == null)
            return 0;
        return noditogud.getDato() + sumaSubarbol(noditogud.getHijoIzq()) + sumaSubarbol(noditogud.getHijoDerech());
    }













}
    

/* public Nodo eliminarNodoGud(int dato, Nodo nodo) {
    if (nodo == null) return null;

    if (dato < nodo.dato) {
        nodo.izquierdo = eliminarNodoGud(dato, nodo.izquierdo);
    } else if (dato > nodo.dato) {
        nodo.derecho = eliminarNodoGud(dato, nodo.derecho);
    } else {
        // Caso 1: sin hijos
        if (nodo.izquierdo == null && nodo.derecho == null) {
            return null;
        }
        // Caso 2: un hijo
        else if (nodo.izquierdo == null) {
            return nodo.derecho;
        } else if (nodo.derecho == null) {
            return nodo.izquierdo;
        }
        // Caso 3: dos hijos
        Nodo sucesor = encontrarMinimo(nodo.derecho);
        nodo.dato = sucesor.dato;
        nodo.derecho = eliminarNodoGud(sucesor.dato, nodo.derecho);
    }

    return nodo;
}

private Nodo encontrarMinimo(Nodo nodo) {
    while (nodo.izquierdo != null) {
        nodo = nodo.izquierdo;
    }
    return nodo;
}
*/