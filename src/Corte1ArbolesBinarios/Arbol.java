package Corte1ArbolesBinarios;

public class Arbol {
    
    private Nodo raiz;
    private int tamanio;

    public Arbol() {
        this.tamanio = 0;
    }

    public Arbol(Nodo raiz, int tamanio) {
        this.raiz = raiz;
        this.tamanio = tamanio;
    }

    public boolean vacioArbolitogud(){
        if (raiz == null) {
            System.out.println(" Su Arbol Esta Vacio ");      
            return true;
        } else{
            System.out.println(" Su Arbol No Esta Vacio ");
            return false;
        }  
    }
        
    public void insertarRaiz(int dato)  {
        
    Nodo nuevo = new Nodo(dato);
    nuevo.setSiguiente(raiz);
   
    if (vacioArbolitogud()){  
        System.out.println(" No Puede Ingresar Paila Esta Vacio El ArbolGud");   
    }else if(raiz.dato < nuevo.dato) {
     raiz = nuevo.hijoIzq;   
    }else{
        raiz = nuevo.hijoDerech;
    }
        
    // secuencial para prox clase
                 
    }
    
}



/*   backup
public void insertarTest(int dato){
        if(vacioArbolitogud()){
        System.out.println(" No Puede Ingresar Paila Esta Vacio El ArbolGud"); 
        }else{
         Nodo nuevo = new Nodo (dato);
        nuevo.setSiguiente(raiz);
        raiz = nuevo;
        tamanio++;
        System.out.println("Ingreso " + dato + " Al Arbol");
        }
        
       
        
    }*/