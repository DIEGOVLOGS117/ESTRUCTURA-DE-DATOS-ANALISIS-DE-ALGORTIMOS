package Taller1_EDA.Punto2;

public class OrdenarNumeros {

/* Crear una función que ordene un vector de tamaño fijo de manera ascendente o descendente usando la clase Arrays. La función debe recibir dos parámetros: el primer
parámetro es el vector de tamaño fijo (de tipo numérico o String) y el segundo parámetro es un String que describe la forma en cómo se debe ordenar el vector de entrada 
(“ascendente” o “descendente”). Incluir código (lstlisting) y captura de ejecución en el informe.*/
    
    public static int[] ordenarNumeros(int[] vector, String tipoOrden) {
        int[] resultado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i];
        }

        if (tipoOrden == null ||
            (!tipoOrden.equalsIgnoreCase("ascendente") &&
             !tipoOrden.equalsIgnoreCase("descendente"))) {
            System.out.println("El tipo de orden no es válido. Use 'ascendente' o 'descendente'.");
            return resultado;
        }

        boolean swapped;
        int n = resultado.length;

        if (tipoOrden.equalsIgnoreCase("ascendente")) {
            do {
                swapped = false;
                for (int i = 0; i < n - 1; i++) {
                    if (resultado[i] > resultado[i + 1]) {
                        int temp = resultado[i];
                        resultado[i] = resultado[i + 1];
                        resultado[i + 1] = temp;
                        swapped = true;
                    }
                }
                n--;
            } while (swapped);
        } else {
            do {
                swapped = false;
                for (int i = 0; i < n - 1; i++) {
                    if (resultado[i] < resultado[i + 1]) {
                        int temp = resultado[i];
                        resultado[i] = resultado[i + 1];
                        resultado[i + 1] = temp;
                        swapped = true;
                    }
                }
                n--;
            } while (swapped);
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 9};

        int[] asc = ordenarNumeros(numeros, "ascendente");
        int[] desc = ordenarNumeros(numeros, "descendente");

        System.out.print("Números ascendente: ");
        for (int num : asc) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Números descendente: ");
        for (int num : desc) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}