package enlazadasimple;

public class EnlazadaSimple {

    public static void main(String[] args) {
        
        Lista listica = new Lista();
        
        /*los nodos existentes “ceden” el centro cuando entra un nuevo nodo en los extremos.*/
        
        listica.insertarNodoInicio(12);
        listica.insertarNodoInicio(2);
        listica.insertarNodoFinal(4);
        listica.imprimirLista();
        
        
        
        
    }
    
    
    
}
