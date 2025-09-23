package Corte1ArbolesBinarios;
    
public class Nodo {
    
    public int dato;
    public Nodo siguiente;
    public Nodo hijoIzq;
    public Nodo hijoDerech;
    
    public Nodo() {
        this.siguiente = null;
        this.hijoIzq = null; 
        this.hijoDerech = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}