package Corte1Pila;

public class Pila {
    
    private Nodo cima; // cima es la nueva  cabeza
    private int tamanho; 

    public Pila() {
    this.cima = null;    
    this.tamanho = 0;
    }

    public Pila(Nodo cima, int tamanho) {
        this.cima = cima;
        this.tamanho = tamanho;
    }
    
    public boolean validarPilaVacia(){
        if (tamanho == 0 || cima == null){
            System.out.println(" La Pila Esta Vacia");
            return true;
        }else{
            System.out.println("La Pila No Esta Vacia");
            return false;
        }
    }
    // PUSH ES PARA AGREGAR ELEMENTOS
    public void push(int dato){
    Nodo nuevo = new Nodo(dato);
    nuevo.setSiguiente(cima);
    cima = nuevo;
    tamanho++;
    System.out.println("Se Ingreso El Elemento: " + dato + " A La Pila");
}
    // POP ES PARA ELIMINAR ELEMENTOS
    public int pop (){
    if(validarPilaVacia()){
        System.out.println("La Pila Esta Vacia. No Se Pueden Sacar Elementos.");
        return -1;
    }
    Nodo aux = cima;
    cima = cima.getSiguiente();
    tamanho--;
    System.out.println("Se Saco: " + aux.getDato() + " De La Pila");
    return aux.getDato();
}
   
    // mostrar elemento  empty y el picky trae la cima sin eliminarla 

    /* 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 key de github */
   
    public void peek(){
    if (validarPilaVacia()) {
        System.out.println("No Hay Elementos En La Pila");
    } else {
        System.out.println("La Cima Es: " + cima.getDato());
    }
}       
   
    public void eliminarPila(){
        while(!validarPilaVacia()){
            pop();
    }

}
    
}