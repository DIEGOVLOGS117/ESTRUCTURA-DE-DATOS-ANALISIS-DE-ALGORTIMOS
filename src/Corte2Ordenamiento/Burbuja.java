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
    
    public void OrdenaditoDeLa2OtraFormaInsercion(int [] vector){
        
        int temporalcito;
        int posiciontemp;
        
        for (int i = 0; i < vector.length-1; i++){
            posiciontemp = i;
        for (int j = i+1; j < vector.length; j++){
        if(vector[j] < vector[posiciontemp]){
                posiciontemp = j;
            }  
        }
        
    

        
        }        
        }
        
        
    }
    
    
    
    
    /* public void ordenamientoPorInsercion(int[] vector) {
    int temporal, j;

    for (int i = 1; i < vector.length; i++) {
        temporal = vector[i];
        j = i - 1;

        // Mueve los elementos mayores que 'temporal' una posición adelante
        while (j >= 0 && vector[j] > temporal) {
            vector[j + 1] = vector[j];
            j--;
        }

        // Inserta el elemento en su posición correcta
        vector[j + 1] = temporal;
    }
}
*/
    
    
