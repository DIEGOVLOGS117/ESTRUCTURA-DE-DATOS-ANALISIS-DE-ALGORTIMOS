package Corte1ArbolesBinarios;

public class Nodo {

    private int dato;
    private Nodo hijoIzq;
    private Nodo hijoDerech;

    public Nodo() {
        this.hijoIzq = null;
        this.hijoDerech = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.hijoIzq = null;
        this.hijoDerech = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDerech() {
        return hijoDerech;
    }

    public void setHijoDerech(Nodo hijoDerech) {
        this.hijoDerech = hijoDerech;
    }
}