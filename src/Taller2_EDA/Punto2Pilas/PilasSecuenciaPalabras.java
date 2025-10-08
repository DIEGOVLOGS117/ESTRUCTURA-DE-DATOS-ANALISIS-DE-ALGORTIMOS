package Taller2_EDA.Punto2Pilas;

import java.util.Stack;

public class PilasSecuenciaPalabras {
    
    protected NodoSecuenciaPalabras cima;
    protected int tamanho;

    public PilasSecuenciaPalabras() {
        this.cima = null;
        this.tamanho = 0;
    }

    public PilasSecuenciaPalabras(NodoSecuenciaPalabras cima, int tamanho) {
        this.cima = cima;
        this.tamanho = tamanho;
    }
        
    public boolean validarPilaVaciaSecuenciaPalabras(){
        if(tamanho == 0 || cima == null){
            System.out.println("Su Pila Esta Vacia ");
            return true;
        } else{
            System.out.println("Su Pila No Esta Vacia ");
            return false;
        }  
    }
    
    public void pushSecuenciaPalabras(String palabra){
        NodoSecuenciaPalabras nuevo = new NodoSecuenciaPalabras(palabra);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        tamanho++;
        System.out.println("Se Ingreso La Palabra: " + palabra + " A La Pila");        
}
    
    
    
}