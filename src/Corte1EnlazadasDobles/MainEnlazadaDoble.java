package Corte1EnlazadasDobles;

public class MainEnlazadaDoble {
    
    public static void main(String[] args) {
        
    Lista2 listica = new Lista2(); 
    
    // nodo de inicio
    listica.InsertarNodoInicio(17);
    listica.InsertarNodoInicio(7); 
    
    // nodo  final
    listica.InsertarNodoFin(30);
    listica.InsertarNodoFin(40);
    
    // insertar uno en un indice en especifico
    listica.InsertNodoIndice(25,1); // recordatorio que las listas inciian desde cero hacia arriba
   
    // insertar de inicio a fin
    System.out.println(" === Lista De Inicio A Fin: ===");
    listica.imprimirListaIniAFin();
    
    // insertar de fin a inicio
    System.out.println(" === Lista De Fin A Inicio: ===");
    listica.imprimirListaFinAIni();
    
    // tamaño de lista
    System.out.println(" El Tamanho De La Lista " + listica.getTamanho());
    
    // lista vacia
    listica.estaVacia();    
    }
}