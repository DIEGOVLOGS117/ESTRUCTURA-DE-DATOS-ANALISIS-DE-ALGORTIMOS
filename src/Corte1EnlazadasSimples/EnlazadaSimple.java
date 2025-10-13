package Corte1EnlazadasSimples;

public class EnlazadaSimple {

    public static void main(String[] args) {
        
        /*los nodos existentes “ceden” el centro cuando entra un nuevo nodo en los extremos.*/
        
        Lista lista = new Lista(); 
//        lista.insertarNodoInicio(1);
//        lista.insertarNodoFinal(4);
//        lista.insertarNodoFinal(5);
//        lista.insertarNodoInicio(8);
//        lista.insertarNodoIndice(13, 3);
//        //lista.imprimirLista();
//        //lista.eliminarNodoFinal()a; 
//        //lista.eliminarIndice(1);
//        lista.imprimirLista();
//        lista.buscador(3);
//        
//        lista.Valorcito(1);  /// tarea para la casa hacer metodo para saber la posicion exacta
//        ///
//        ///
//       

//    lista.insertarNodoInicio(1);
//    lista.insertarNodoFinal(4);
//    lista.insertarNodoFinal(4);
//    lista.insertarNodoFinal(7);
//    lista.insertarNodoFinal(7);
    
    lista.insertarNodoInicio(1);
    lista.insertarNodoFinal(4);
    lista.insertarNodoFinal(5);
    


    lista.imprimirLista();
    
//    lista.eliminarNodosDuplicados();
//    System.out.println("DESPUES DE ELIMINAR");
//    lista.imprimirLista();
    
        System.out.println("LUEGO DE QUITAR LA COLA Y SER LA CABEZA");
        lista.ultimatonToInicio();
        
        lista.imprimirLista();



    
       
    }  
    
}