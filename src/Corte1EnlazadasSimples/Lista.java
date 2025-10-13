package Corte1EnlazadasSimples;

public class Lista {
    
    private Nodo cabeza; 
    private int tamano;
    
    public Lista(){
        this.cabeza= null; 
        this.tamano= 0; 
         
    }
    
     public void insertarNodoInicio(int dato){
        Nodo nodoIni = new Nodo(dato);
        nodoIni.siguiente = cabeza; 
        cabeza = nodoIni; 
        tamano++;
    }
     
     public void insertarNodoFinal(int dato){
         Nodo nodoFin = new Nodo(dato);
         Nodo nodoRecorre = cabeza; // hice una copia 
         
         while (nodoRecorre.siguiente != null){
             nodoRecorre = nodoRecorre.siguiente;
         }
         
         nodoRecorre.siguiente = nodoFin;
         tamano++;
     }
     
     public void insertarNodoIndice(int dato,int posicion ){ // insear nodo en un indice 
         Nodo nodoIndice = new Nodo(dato);
         Nodo nodoRecorre = cabeza; 
         int cont = 0;
         while (cont <(posicion-1) && nodoRecorre.siguiente != null){
             nodoRecorre = nodoRecorre.siguiente; 
             cont ++;
         }
         if(cont == (posicion-1)){
         nodoIndice.siguiente = nodoRecorre.siguiente;
         nodoRecorre.siguiente = nodoIndice;
         tamano++;
         }
}
     public void imprimirLista(){
         Nodo nodoRecorre = cabeza; 
         
         while (nodoRecorre != null){
             System.out.println(nodoRecorre.dato + "->");
             nodoRecorre = nodoRecorre.siguiente;
         }
         System.out.println("NULL");
     }
     
     //Ahorrar memoria borrando las copaias hechas 
     public void eliminarNodoInicio(){
         Nodo inicio = cabeza; 
         cabeza = inicio.siguiente;
         inicio.siguiente = null; //romper el enlace
         tamano--;
     }

    public int getTamano() {
        return tamano;
    }
     
     
     public void eliminarNodoFinal(){
         if (cabeza.siguiente == null){
         cabeza=null;
     }else{
             Nodo nodoRecorre = cabeza;             
             while(nodoRecorre.siguiente.siguiente != null){
                 nodoRecorre = nodoRecorre.siguiente;
             }
             nodoRecorre.siguiente = null; // se elimina el nodo 
         }
         tamano--;
     }
     
     public void eliminarIndice(int posicion){
         Nodo nodoRecorre = cabeza; 
         int cont = 0;
         while (cont <(posicion-1) && nodoRecorre.siguiente != null){
             nodoRecorre = nodoRecorre.siguiente; 
             cont ++;     
         }

         Nodo aux = nodoRecorre.siguiente; // nodo a eliminar, creamos una copia del nodo 
         nodoRecorre.siguiente = aux.siguiente;// saltamos al otro nodo que queremos que se balla 
         aux.siguiente = null; //romper el enlace , eliminamos el nodo 
         tamano--;
     }

     public void buscador(int indice){
         if(indice == 0 || indice >= tamano){
             System.out.println("Eror al ingresar datos");
             return;
         } 
         if(indice == 0){
             System.out.println("En el inidce 0 o el primer nodo se encuentra el dato" + cabeza.dato);
             }else{
             int cont =0;
             Nodo recorre = cabeza;
             while(cont< indice){
                 recorre = recorre.siguiente; // recorre la lista
                 cont ++;
             }
             System.out.println("El dato que se encuentra en el indice " + indice + " es: " + recorre.dato);
            
         }
     }
     
     // buscar un valor especifico de mi lista sin posicion
     
     public void Valorcito(int dato){
        Nodo nodoRecorre = cabeza;
        boolean encontrarValor = false;
        
        while(nodoRecorre.siguiente != null){
            if(nodoRecorre.dato == dato){
        System.out.println("El Valor Especifico es: " + nodoRecorre.dato);
        encontrarValor = true; 
        break;
            }   
            else {
                System.out.println("No Esta Ese Elemento Troste Pongase A Llorar" );
                break;
            }

        }

     }
     
     public void eliminarNodosDuplicados(){
         Nodo recorrerLista = cabeza;
               while(recorrerLista != null && recorrerLista.siguiente != null){
             if(recorrerLista.dato == recorrerLista.siguiente.dato){
                 System.out.println("Se Encontro Dato Repetido " + recorrerLista.dato);
                 recorrerLista.siguiente = recorrerLista.siguiente.siguiente;
             }else{
                 recorrerLista = recorrerLista.siguiente;
             }
 
         }  
     }  
     
     public void ultimatonToInicio(){
         if(cabeza == null || cabeza.siguiente == null){
             System.out.println("Su Lista Esta Vacia");
             return;
         }
         Nodo fin = cabeza;
         while(fin.siguiente != null){
                fin =fin.siguiente;
         }
         Nodo Actual = cabeza;
         while(Actual.siguiente != fin){
             Actual = Actual.siguiente;
         }
         
     
     
     
     
   }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}

/* LISTAS ENLAZADAS SIMPLES CORREGIR Y ESTUDIAR PARA LUEGO EMPEZAR A LAS DOBLES .
https://youtu.be/f_JpVRrPUFo?si=XIofVaOqhuhxjmZW */