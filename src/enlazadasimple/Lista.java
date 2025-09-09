package enlazadasimple;

public class Lista {

    private Nodo cabeza;
    private Nodo cola;
    public int tamaño;

    public Lista() {
        this.cabeza = null;
        this.cola = null;
        this.tamaño = 0;
    }

    public void InsertarNodo(int dato) {
        Nodo nodoIni = new Nodo(dato);
        nodoIni.siguiente = cabeza;
        cabeza = nodoIni;
        if (cola == null) {
            cola = nodoIni;
        }
        tamaño++;
    }

    public void InsertarNodoFinal(int dato) {
        Nodo nodoFin = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nodoFin;
            cola = nodoFin;
        } else {
            cola.siguiente = nodoFin;
            cola = nodoFin;
        }
        tamaño++;
    }

    public void InsertarEnIndice(int dato, int idx) {
        if (idx < 0 || idx > tamaño) {
            System.out.println("Índice fuera de rango");
            return;
        }

        if (idx == 0) {
            InsertarNodo(dato);
            return;
        }

        Nodo nodoIndice = new Nodo(dato);
        Nodo nodoRecorre = cabeza;
        int cont = 0;

        while (cont < idx - 1) {
            nodoRecorre = nodoRecorre.siguiente;
            cont++;
        }

        nodoIndice.siguiente = nodoRecorre.siguiente;
        nodoRecorre.siguiente = nodoIndice;

        if (nodoIndice.siguiente == null) {
            cola = nodoIndice;
        }

        tamaño++;
    }

    public void imprimirLista() {
        Nodo nodoRecorre = cabeza;
        while (nodoRecorre != null) {
            System.out.print(nodoRecorre.dato + " -> ");
            nodoRecorre = nodoRecorre.siguiente;
        }
        System.out.println("null");
    }
}
