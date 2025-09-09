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
   
}