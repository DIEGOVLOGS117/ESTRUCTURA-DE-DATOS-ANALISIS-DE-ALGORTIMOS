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
 /*HUECO QUE ABRO ENTRE POSICIONES ORDENADAS DONDE SE METE EL ELEMENTO SE INICIALIZA EN EL PRIMER ELEMENTO 1*/
        for (int i = 1; i < vector.length; i++){
            int temp = vector[i]; // le asigno el valor del vector
            int posiciontemp = i; // solo coge la posicion por eso usa el i

            while(posiciontemp > 0 && vector[posiciontemp-1] > temp){
                vector[posiciontemp] = vector[posiciontemp-1];
                posiciontemp = posiciontemp-1;   
            }
            vector[posiciontemp] = posiciontemp;  
        }           
    }
    
    public void OrdenaditoDeLa3OtraFormaShellSort(int [] vector){ // for sume de a 4 de acuerdo al tamaño de la ventana
        
        int tamanho = vector.length;

        for(int gapcito = tamanho/2; gapcito > 0; gapcito /=2){
            
            for(int i = 0; i < vector.length; i++){
        int temp = vector[i];
        int j;
                    // Inserción con salto
            for (j = i; j >= gapcito && vector[j - gapcito] > temp; j -= gapcito) {
                vector[j] = vector[j - gapcito];

        }
                    vector[j] = temp;
        } 
    }   
 } 
    
   public void OrdenaditoDeLa4OtraFormaCountingSort(int [] vector){
       
       int tamanho = vector.length;
       int min = vector[0];
       int max = vector[0];
       
        for (int i = 0; i < tamanho; i++){ // recorrer el vector
            if (vector [i] > max){
                max = vector[i];
            }if(vector [i] < min){
                min = vector [i];
            }
        }
        
        // vector de conteo
        
        int vectorAuxRango = max - min + 1;
        int[] count = new int[vectorAuxRango];
        
        //contar concurrencias
        for (int i = 0; i < tamanho; i++) {
        count[vector[i] - min]++;
    }
        
     int index = 0;
    for (int i = 0; i < vectorAuxRango; i++) {
        while (count[i] > 0) {
            vector[index++] = i + min;
            count[i]--;
        }
    }    
}   
  
   public void OrdenaditoDeLa5OtraFormaRadixSort(int [] vector){
         
// sacar para unidades modulo de 100 lo unico que cambiara es cuando divide

   OrdenaditoDeLa4OtraFormaCountingSortParaRadixSort(vector);
      
   int unidades = 1;
   int decenas = 10;
   int centenas = 100;
   
    
       
       
       
       
       
        
       
}
   
   
   public void OrdenaditoDeLa4OtraFormaCountingSortParaRadixSort(int [] vector){
       
       int tamanho = vector.length;
       int min = vector[0];
       int max = vector[0];
       
        for (int i = 0; i < tamanho; i++){ // recorrer el vector
            if (vector [i] > max){
                max = vector[i];
            }if(vector [i] < min){
                min = vector [i];
            }
        }
        
        // vector de conteo
        
        int vectorAuxRango = max - min + 1;
        int[] count = new int[vectorAuxRango];
        
        //contar concurrencias
        for (int i = tamanho; i > 0; i--) {
        count[vector[i] - min]--;
    }
        
     int index = 0;
    for (int i = 0; i < vectorAuxRango; i++) {
        while (count[i] > 0) {
            vector[index++] = i + min;
            count[i]--;
        }
    }    
} 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}  
/*public void OrdenaditoDeLa3OtraFormaShellSort(int[] vector) {
    int n = vector.length;

    // Empieza con un gap grande y lo reduce
    for (int gap = n / 2; gap > 0; gap /= 2) {
        for (int i = gap; i < n; i++) {
            int temp = vector[i];
            int j;

            // Inserción con salto
            for (j = i; j >= gap && vector[j - gap] > temp; j -= gap) {
                vector[j] = vector[j - gap];
            }

            vector[j] = temp;
        }
    }
}
*/

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