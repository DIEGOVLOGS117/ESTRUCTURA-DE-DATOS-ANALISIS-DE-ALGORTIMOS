package Corte1MemoriaEstatica;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class GestorEdades {
    
    private int[] edades = new int[2];
    private Scanner scan = new Scanner(System.in);

    public void cargarEdades() {
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Digite edad del estudiante " + (i + 1) + ": ");
            edades[i] = scan.nextInt();
        }
    }

    public void mostrarEdades(String titulo) {
        System.out.println("\n--- " + titulo + " ---");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades[" + i + "] = " + edades[i]);
        }
    }

    public void ordenarEdades() {
        Arrays.sort(edades);
    }
}