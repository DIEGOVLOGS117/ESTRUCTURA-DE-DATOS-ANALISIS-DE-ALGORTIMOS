package Corte1BajarEscaleras;

public class Escalera {
    
    public void bajarEscalera(int numeroEscalones){
        
        if(numeroEscalones ==0){  // caso base
            System.out.println("Termino Ya No Puede Bajar Mas Escalones");
        }else{ // caso recursivo
            System.out.println("Bajando Escalon " + numeroEscalones + ". Ahora Quedan" + (numeroEscalones-1));
            bajarEscalera(numeroEscalones-1);
        }      
    }
}