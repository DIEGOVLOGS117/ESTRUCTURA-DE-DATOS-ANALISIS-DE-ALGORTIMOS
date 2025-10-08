package Taller2_EDA.Punto2Pilas;

public class NodoSecuenciaPalabras {
 
    protected String dato;
    protected NodoSecuenciaPalabras siguiente;

    public NodoSecuenciaPalabras(String dato, NodoSecuenciaPalabras siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoSecuenciaPalabras(String dato) {
        this.dato = dato;
        this.siguiente = null;
}

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoSecuenciaPalabras getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSecuenciaPalabras siguiente) {
        this.siguiente = siguiente;
    }
      
    
}