package Corte2Ordenamiento;

public class Burbuja {
    
    public void burbuja(int[] vector){
        int temp;    
        for (int i = 0;  i < vector.length -1; i++){
            for(int j= i + 1; j < vector.length; j++){
                if(vector [j] < vector [i]){
                    temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
}   
}
}     
}
    public void imprimirVector (int [] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.print( "["+ vector [i] + "]");
        }
        System.out.println("");
    }
    
    public void ordenaditoDeLaOtraFormaSeleccion(int [] vector){
        int temporalcito;
        int posiminimactual;                     // actualiza y cuando tengo vector[lo de aca es el valor]
        
        for (int i = 0; i < vector.length-1; i++){
            posiminimactual = i;
               for (int j = i+1; j < vector.length; j++){
            if(vector[j] < vector[posiminimactual]){
                posiminimactual = j;
            }  
        }
        if (vector [posiminimactual] < vector[i]){
        temporalcito = vector [i];
        vector [i] = vector[posiminimactual];
        vector[posiminimactual] = temporalcito;
        }        
        }
    }
    
}