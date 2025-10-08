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
    
    public String popSecuenciaPalabras(){
        if(validarPilaVaciaSecuenciaPalabras()){
            System.out.println("La Pila Esta Vacia. No Se Pueden Sacar Elementos.");
            return null;
        } 
        NodoSecuenciaPalabras aux = cima;
        cima = cima.getSiguiente();
        tamanho--;
        System.out.println("Se Saco: " + aux.getDato() + " De La Pila");
        return aux.getDato();  
    }
    
    public void peek(){
        if(validarPilaVaciaSecuenciaPalabras()){
            System.out.println("No Hay Elementos En La Pila, No Se Puede Sacar Copia De La Pila");
        }else{
            System.out.println("La Cima De La Pila Es: " + cima.getDato());
        }
    }
    
    public static String invertirPalabra(String palabra) {
    return new StringBuilder(palabra).reverse().toString();
}

    public static String revertirOrdenPalabras(String frase) {
    if (frase == null || frase.trim().isEmpty()) {
        System.out.println("La frase está vacía");
        return frase;
    }

    System.out.println("Frase Original: " + frase);

    String[] palabras = frase.trim().split("\\s+");
    StringBuilder resultado = new StringBuilder();

    for (int i = 0; i < palabras.length; i++) {
        resultado.append(invertirPalabra(palabras[i]));
        if (i < palabras.length - 1) {
            resultado.append(" ");
        }
    }

    System.out.println("Frase Modificada: " + resultado.toString());
    return resultado.toString();
}
  
}