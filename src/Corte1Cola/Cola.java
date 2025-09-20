package Corte1Cola;

public class Cola {
    
    private Nodo primerNodito; 
    private Nodo ultimoNodito;
    private int tamanho;

    public Cola() {
        this.primerNodito = null; // inicializados en vacíos los nodos del inicio y final
        this.ultimoNodito = null;
        this.tamanho = 0; // inicializamos el tamaño
    }

    public Cola(Nodo primerNodito, Nodo ultimoNodito, int tamanho) {
        this.primerNodito = primerNodito;  
        this.ultimoNodito = ultimoNodito;
        this.tamanho = tamanho;
    }
   
    public boolean validarVacioColita(){
        return tamanho == 0 || primerNodito == null; // siempre usar doble == para comparar  y el solo = es para asignar valor
    }
    
    /* El push lo usamos para encolar en resumen para agregar elementos al final */
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        
        if(validarVacioColita()){
            primerNodito = nuevo;
            ultimoNodito = nuevo;
        } else{
            ultimoNodito.setSiguiente(nuevo);
            ultimoNodito = nuevo;
        } tamanho++;  
    }
    // pop = desencolar (quitar elementos)    
    public int pop(){
        if(validarVacioColita()){
            System.out.println("Cola Vacia, No Se Pueden Quitar Elementos");
            return -1;
        } else{
        
            Nodo aux = primerNodito; // Guardamos el nodo del frente
            primerNodito = primerNodito.getSiguiente();
            tamanho--;
            
            // Si la cola queda vacía después de sacar el nodo, actualizamos ultimoNodito
            if (primerNodito == null) {
                ultimoNodito = null;
        }
        
            System.out.println("Se Saco De La Cola El Elemento: " + aux.getDato());
            return aux.getDato();
      }
}
    
    public int getTamanho() {
        return tamanho;
    }
    
    public int peek(){ // mostrar el primer elemento de mi cola sin borrarlo
        if(validarVacioColita()){
            System.out.println("No Se Puede Mostrar El Elemento La Cola Esta Vacia");
            return -1;
        } else{
            System.out.println("El Elemento De La Cima O Primer Nodo Es: " + primerNodito.getDato());
            return primerNodito.getDato();
        }
    }
        
    public void eliminarCola(){ // elimina la cola
        while(!validarVacioColita()){
            pop();
        }
    }
    
    // imprimir cola 
    
    public void imprimirColitagud(){
        if(validarVacioColita()){
            System.out.println("La Impresion No Esta Habilitada La Cola Esta Vacia");
        } else{
            Nodo actual = primerNodito;
            System.out.println(" Cola: ");
            while (actual != null) {
                System.out.print(actual.getDato() + " ");
                actual = actual.getSiguiente();
            }
            System.out.println();
        } 
    }
  
}