package Corte1PilaYCola;

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
        return tamanho == 0 || cima == null; // verificar 
    }
    // PUSH ES PARA AGREGAR ELEMENTOS
   public void push(int dato){
       Nodo nuevo = new Nodo(dato); 
       nuevo.siguiente = cima;
       cima = nuevo;
       tamanho++;
       System.out.println("Se Ingreso El Elemento: " + dato + "A La Pila");
   }
    // POP ES PARA ELIMINAR ELEMENTOS
   public int pop (){
       if(validarPilaVacia()){
            System.out.println("La Pila Esta Vacia");
            break;
       }
       Nodo aux = cima;
       cima = cima.siguiente;
       tamanho--;
       System.out.println(" Se Saco: " + aux.dato + " De La Pila " );
       return aux.dato;
   }
   
    // mostrar elemento  empty y el picky trae la cima sin eliminarla 

    
    
}