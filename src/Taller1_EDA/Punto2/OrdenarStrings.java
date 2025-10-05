package Taller1_EDA.Punto2;

import java.util.Arrays;
import java.util.Collections;

public class OrdenarStrings {
    
/* Crear una función que ordene un vector de tamaño fijo de manera ascendente o descendente usando la clase Arrays. La función debe recibir dos parámetros: el primer
parámetro es el vector de tamaño fijo (de tipo numérico o String) y el segundo parámetro es un String que describe la forma en cómo se debe ordenar el vector de entrada 
(“ascendente” o “descendente”). Incluir código (lstlisting) y captura de ejecución en el informe.*/

    public static String[] ordenarStrings(String[] vector, String tipoOrden) {
        String[] resultado = vector.clone();
        
        if (tipoOrden.equals("ascendente")) {
            Arrays.sort(resultado);
        } else if (tipoOrden.equals("descendente")) {
            Arrays.sort(resultado, Collections.reverseOrder());
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        String[] jugadores = {"Cristiano Ronaldo", "Buffon", "Mbappe", "Haaland", "Benzema", "Modric", "Casillas"};
        
        System.out.println("Jugadores ingresados: " + Arrays.toString(jugadores));
        
        String[] ascendente = ordenarStrings(jugadores, "ascendente");
        System.out.println("Orden A-Z: " + Arrays.toString(ascendente));
        
        String[] descendente = ordenarStrings(jugadores, "descendente");
        System.out.println("Orden Z-A: " + Arrays.toString(descendente));
    }
}