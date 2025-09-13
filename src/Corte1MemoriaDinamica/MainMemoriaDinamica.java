package Corte1MemoriaDinamica;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMemoriaDinamica {

    public static void main(String[] args) {

        Scanner scanercito = new Scanner(System.in);

        // Crear un ArrayList para almacenar nombres de estudiantes
        ArrayList<String> nombreEstudiantes = new ArrayList<String>();
        String nombre;

        // Bucle para ingresar nombres hasta que el usuario escriba "STOP"
        do {
            System.out.println("Digite el nombre del estudiante (o 'STOP' para terminar):");
            nombre = scanercito.nextLine();
            nombreEstudiantes.add(nombre);
        } while (!nombre.equalsIgnoreCase("STOP")); // Ignora mayúsculas/minúsculas

        // Mostrar los nombres ingresados (excepto "STOP")
        System.out.println("\nNombres ingresados:");
        for (int i = 0; i < nombreEstudiantes.size() - 1; i++) { // -1 para no mostrar "STOP"
            System.out.println("Nombre " + i + ": " + nombreEstudiantes.get(i));
        }

        // Reemplazar el nombre en la posición 2 (si existe)
        if (nombreEstudiantes.size() > 2) {
            nombreEstudiantes.set(2, "nombre modificado");
            System.out.println("\nNombres despues de reemplazar el indice 2:");
            for (int i = 0; i < nombreEstudiantes.size() - 1; i++) { // de nuevo excluyendo "STOP"
                System.out.println("Nombre " + i + ": " + nombreEstudiantes.get(i));
            }
        } else {
            System.out.println("\nNo hay suficientes nombres para modificar el índice 2.");
        }

        // Eliminar el primer registro (índice 0)
        if (!nombreEstudiantes.isEmpty()) {
            nombreEstudiantes.remove(0);
            System.out.println("\nNombres despues de remover el primero:");
            for (int i = 0; i < nombreEstudiantes.size() - 1; i++) { // excluye "STOP" final
                System.out.println("Nombre " + i + ": " + nombreEstudiantes.get(i));
            }
        } else {
            System.out.println("\nLa lista está vacia, no se puede remover.");
        }

        scanercito.close();
    }

}
