package Corte1EnlazadasDobles;

// import Corte1EnlazadasSimples.Nodo; // Eliminado porque usas Nodo2

public class Lista2 {
    
    private Nodo2 cabeza;
    private Nodo2 cola;
    private int tamanho = 0;

    public Lista2() {
        this.cabeza = null;  // si pierdo cola se pierde la lista
        this.cola = null;
        this.tamanho = 0;
    }

    public int getTamanho() { // aaa
        return tamanho;
    }
    
    public boolean estaVacia(){
        if(cabeza == null){
            System.out.println(" LE FALTA CABEZA ");
            return true;
        }
        else {
            return false;
        }
    }  
    
    /*     public boolean estaVacia(){
        return tamanho == 0 || cabeza == null || cola == null;
    }  */
    
    // agregar elementos al inicio y al final 
    
    public void imprimirListaIniAFin() { 
        Nodo2 nodoRecorre = cabeza; // de inicio a fin iniciando desde la cabeza hasta la cola
        System.out.print(" Cabeza -> ");
        while(nodoRecorre != null) {
            System.out.print(nodoRecorre.dato + " -> ");
            nodoRecorre = nodoRecorre.siguiente;
        }
        System.out.println("null");
        System.out.println(" FINAL FINAL REAL MADRID GANA LA 16 CHAMPIONS ");
    } 
    
    public void imprimirListaFinAIni(){
        Nodo2 nodoRecorre = cola; // fin a inicio iniciando desde la cola hasta la cabeza
        
        System.out.print(" Final -> ");
        while(nodoRecorre != null){
            System.out.print(nodoRecorre.dato + " -> ");
            nodoRecorre = nodoRecorre.anterior;
        }
        System.out.println(" INICIO ");         
    }
    
//    public void InsertarNodito(int dato, int posicion){  // argumento de posicion pero que lo ingrese en una sola posicion
//        
//        if(posicion == 0 || posicion >= tamanho){
//        System.out.println("Eror al ingresar datos su posicion es invalida");
//        return;
//        }
//        
//        Nodo2 nodoIndice = new Nodo2(dato);
//        Nodo2 nodoRecorre = cabeza;  
//        
//        int cont = 0;
           
    public void InsertarNodoInicio(int dato){   // metodo de la profe 
        Nodo2 nuevo = new Nodo2(dato);
        if(estaVacia()){
            cola = nuevo;
        } else{
            cabeza.anterior = nuevo;
        }    
        nuevo.siguiente = cabeza;
        nuevo.anterior = null;
        cabeza = nuevo;
        tamanho++;  
    }
    
    public void InsertarNodoFin(int dato){
        Nodo2 nuevo = new Nodo2(dato);      
        if(cola == null){
            cabeza = nuevo;
        }else{
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
        }
        cola = nuevo;
        tamanho++;
    }
 
    public void InsertNodoIndice(int dato, int posicion){ // qe pasa si tengo una lista de millones de elementos y quiero ingresar a lo ultimos dos elementos de dicha lista.
        if (posicion < 0 || posicion > tamanho) {
            System.out.println("POSICION INCORRECTA VUELVA E INTENTE CON OTRA");
            return;        
        }
        if (posicion == 0) {
            InsertarNodoInicio(dato);
            return;
        }
        if (posicion == tamanho) {
            InsertarNodoFin(dato);
            return;
        } 
        Nodo2 nuevo = new Nodo2(dato);    
        Nodo2 actual = cabeza;
        
        int contador = 0;
        
        while (contador < posicion) {      
            actual = actual.siguiente;
            contador++;
        }
        
        /* actual es el nodo que estará en la posición "posicion" y El nuevo nodo irá antes de actual*/
        
        Nodo2 anterior = actual.anterior;
        
        anterior.siguiente = nuevo;
        nuevo.anterior = anterior;
        nuevo.siguiente = actual;
        actual.anterior = nuevo;
        
        tamanho++;   
    }

    public void eliminarInicio(){ // elimina la posicion cero de la lista
        if (estaVacia()) {
            System.out.println(" No Tenemos Nada Por Eliminar");
        } else if (cabeza == cola){
            cola = null;
            cabeza = null;
            tamanho--;    
        } else{
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            tamanho--;    
        }  
    }
    
    public void eliminarFInal(){ // elimina ls posicion ultima es decir la 0 iniciando desde la cola y  la posicion 5 iniciando desde la cabeza
        if (estaVacia()) {
            System.out.println(" No Tenemos Nada Por Eliminar");
        } else if (cabeza == cola){
            cola = null;
            cabeza = null;
            tamanho--;    
        } else{
            cola = cola.anterior;
            if (cola != null) {
                cola.siguiente = null;
            } else {
                cabeza = null; // si queda vacía la lista
            }
            tamanho--;    
        }  
    }
            
    public void eliminarIndiceIndicado(int pos){
        if(estaVacia()){
            System.out.println("No puede Eliminar Nada");
            return;
        }
        
        if (pos < 0 || pos >= tamanho) {
            System.out.println("Posición inválida");
            return;
        }

        if (pos == 0) {
            eliminarInicio();
            return;
        }

        if (pos == tamanho - 1) {
            eliminarFInal();
            return;
        }

        Nodo2 recorre = cabeza;
        int cont = 0;

        while (cont < pos) {
            recorre = recorre.siguiente;
            cont++;
        }

        // recorre es el nodo que queremos eliminar
        Nodo2 anterior = recorre.anterior;
        Nodo2 siguiente = recorre.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;
        tamanho--;
    }
    
    public void buscarElementoPos(int indice){
        if(indice < 0 || indice >= tamanho ){
            System.out.println("Error al ingresar datos: posición inválida");
            return;
        }
        
        Nodo2 actual = cabeza;
        int contador = 0;
        
        while(contador < indice){
            actual = actual.siguiente;
            contador++;
        }
        
        // Aquí 'actual' es el nodo en la posición 'indice'
        System.out.println("El elemento en la posición " + indice + " es: " + actual.dato);
    }
                
    public void buscarElemencabeoCola(int valor){
        if(estaVacia()){
            System.out.println("Su Lista Esta Vacia");
            return;  
        }
        else{
            
            Nodo2 actualCabeza = cabeza; // recorridos para la cola
            Nodo2 actualCola = cola; // recorridos para la cola
            
            while(actualCabeza != null && actualCola != null){ // validar
                
            if(actualCabeza.dato == valor){
                System.out.println("Encontrado Desde Cabeza: " + valor);
                return;  
            }
            
            if(actualCola.dato == valor){
                 System.out.println("Encontrado Desde Cola: " + valor);
                 return;
            }
            if (actualCabeza == actualCola || actualCabeza.siguiente == actualCola) {
            break;
        }
        actualCabeza = actualCabeza.siguiente;
        actualCola = actualCola.anterior;  
        }         
        System.out.println("Elemento No Encontrado");       
        }   
    }
    
    
    
    
    
}    