package EnlazadasDobles;

public class Lista2 {
    
    private Nodo2 cabeza,cola;
    private int tamanho = 0;

    public Lista2() {
        this.cabeza = null;  // si pierdo cola se pierde la lista
        this.cola = null;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    public boolean estaVacia(){
        if(cabeza == null){
            System.out.println("LE FALTA CABEZA");
            return true;
        }
        else {
            return false;
        }
    }  
    // agregar elementos al inicio y al final 
    
    public void imprimirListaIniAFin() {
    Nodo2 nodoRecorre = cabeza;
        System.out.println("Cabeza -> ");
        while(nodoRecorre != null) {
            System.out.println(nodoRecorre.dato + "->");
        }
        System.out.println("FINAL FINAL REAL MADRID GANA LA 16 CHAMPIONS");
} 
    public void imprimirListaFinAIni(){
        
    }
   
}