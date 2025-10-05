package Taller2_EDA.Punto1ListasSimplesEjem1;

public class ListaPunto1Ejem1 {
    
    protected NodoPunto1Ejem1 cabeza;
    protected int tamanhoSimple;

    public ListaPunto1Ejem1() {
        this.cabeza = null;
        this.tamanhoSimple = 0;
}
    
    public void insertarNodoInicio(int dato){
        NodoPunto1Ejem1 nodito_Inicial = new NodoPunto1Ejem1(dato); // crear un nuevo nodo llamado nodito_Inicial la cual recibira el parametro dato
        nodito_Inicial.siguiente = cabeza;
        cabeza = nodito_Inicial;
        tamanhoSimple++;  
}
    
    public void insertarNodoFinal(int dato){
         NodoPunto1Ejem1 nodito_Final = new NodoPunto1Ejem1(dato); 
         NodoPunto1Ejem1 nodoRecorre = cabeza;
         while(nodoRecorre.siguiente != null){
             nodoRecorre = nodoRecorre.siguiente;
}
        nodoRecorre.siguiente = nodito_Final;
        tamanhoSimple++;      
}
    
    public void insertarNodoIndice(int dato, int posicion){
        NodoPunto1Ejem1 nodoIndice = new NodoPunto1Ejem1(dato);
        NodoPunto1Ejem1 nodoRecorre = cabeza;
        
        
        
    }
    
    public void imprimirListaPunto1Ejem1(){
        NodoPunto1Ejem1 nodoRecorre = cabeza;
        
    }
    
    
    
    
    
    
    
    
    
    
    
}