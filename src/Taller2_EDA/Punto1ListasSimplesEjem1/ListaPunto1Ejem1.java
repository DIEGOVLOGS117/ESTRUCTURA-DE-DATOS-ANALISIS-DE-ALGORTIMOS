package Taller2_EDA.Punto1ListasSimplesEjem1;

public class ListaPunto1Ejem1 {

    protected NodoPunto1Ejem1 cabeza;
    protected int tamanhoSimple;

    public ListaPunto1Ejem1() {
        this.cabeza = null;
        this.tamanhoSimple = 0;
    }

    public void insertarNodoInicio(int dato) {
        NodoPunto1Ejem1 nodito_Inicial = new NodoPunto1Ejem1(dato);
        nodito_Inicial.siguiente = cabeza;
        cabeza = nodito_Inicial;
        tamanhoSimple++;
    }

    public void insertarNodoFinal(int dato) {
        NodoPunto1Ejem1 nodito_Final = new NodoPunto1Ejem1(dato);
        if (cabeza == null) {
            cabeza = nodito_Final;
        } else {
            NodoPunto1Ejem1 nodoRecorre = cabeza;
            while (nodoRecorre.siguiente != null) {
                nodoRecorre = nodoRecorre.siguiente;
            }
            nodoRecorre.siguiente = nodito_Final;
        }
        tamanhoSimple++;
    }

    public void insertarNodoIndice(int dato, int posicion) {
        NodoPunto1Ejem1 nodoIndice = new NodoPunto1Ejem1(dato);
        if (posicion == 0) {
            insertarNodoInicio(dato);
            return;
        }
        NodoPunto1Ejem1 nodoRecorre = cabeza;
        int cont = 0;
        while (cont < (posicion - 1) && nodoRecorre != null) {
            nodoRecorre = nodoRecorre.siguiente;
            cont++;
        }
        if (nodoRecorre != null) {
            nodoIndice.siguiente = nodoRecorre.siguiente;
            nodoRecorre.siguiente = nodoIndice;
            tamanhoSimple++;
        }
    }

    public void imprimirListaPunto1Ejem1() {
        NodoPunto1Ejem1 nodoRecorre = cabeza;
        while (nodoRecorre != null) {
            System.out.print(nodoRecorre.dato + " -> ");
            nodoRecorre = nodoRecorre.siguiente;
        }
        System.out.println("NULL");
    }

    public void eliminarNodoInicio() {
        if (cabeza != null) {
            NodoPunto1Ejem1 inicio = cabeza;
            cabeza = inicio.siguiente;
            inicio.siguiente = null; // rompe enlace
            tamanhoSimple--; // actualizar tamaño
        }
    }

    public int getTamanhoSimple() {
        return tamanhoSimple;
    }

    public void eliminarNodoFinal() {
        if (cabeza == null) {
            return;
        }
        if (cabeza.siguiente == null) {
            cabeza = null;
        } else {
            NodoPunto1Ejem1 nodoRecorre = cabeza;
            while (nodoRecorre.siguiente.siguiente != null) {
                nodoRecorre = nodoRecorre.siguiente;
            }
            nodoRecorre.siguiente = null;
        }
        tamanhoSimple--;
    }
    
    public void eliminarNodoIndice(int idx){
        NodoPunto1Ejem1 nodoRecorre = cabeza;
        
        int cont = 0;
        
        while(cont < (idx - 1) && nodoRecorre.siguiente.siguiente != null){
            nodoRecorre = nodoRecorre.siguiente;
            cont++;
        }
        NodoPunto1Ejem1 auxi = nodoRecorre.siguiente;
        nodoRecorre.siguiente = auxi.siguiente;
        auxi.siguiente = null;
        tamanhoSimple--;  
}
    
    public int buscarNodo(int idx) {
    NodoPunto1Ejem1 nodoRecorre = cabeza;
    int cont = 0;
    while (cont < idx && nodoRecorre != null) {
        nodoRecorre = nodoRecorre.siguiente;
        cont++;
    }
    if (nodoRecorre != null) {
        System.out.println("El Dato: " + idx + " Esta En La Lista");
        return nodoRecorre.dato;
    } else {
        System.out.println("El Dato: " + idx + " No Fue Encontrado En La Lista ");
        return 0;
    }
}

    public boolean estaListaVacia(){
        if(cabeza == null){
            System.out.println(" Su Lista Esta Vacia");
            return true;
        }
        System.out.println("Su Lista No Esta Vacia");
        return false;
}
      
    public void eliminarNodosDobles() {
    if (estaListaVacia()) {
        System.out.println("La Lista Esta Vacia. No Hay Nodos Para Eliminar.");
        return;
    }
    NodoPunto1Ejem1 actual = cabeza;
    int eliminados = 0;
    while (actual != null && actual.siguiente != null) {
        if (actual.dato == actual.siguiente.dato) {
            // Duplicado encontrado: eliminar siguiente nodo
            NodoPunto1Ejem1 nodoDuplicado = actual.siguiente;
            actual.siguiente = nodoDuplicado.siguiente;
            nodoDuplicado.siguiente = null; 
            tamanhoSimple--;
            eliminados++;
        } else {
            // Avanzar si no es duplicado
            actual = actual.siguiente;
        }
    }
    if (eliminados == 0) {
        System.out.println("No Se Encontraron Duplicados Para Eliminar.");
    } else {
        System.out.println("Se Eliminaron " + eliminados + " Nodos Duplicados De La Lista.");
    }
}
   
    
}