package Taller1_EDA.Punto5;

public class Recursion {
    
    public static void main(String[] args) {
        System.out.println(encontrarSuma(7)); // Debería imprimir 28
    }

    public static int encontrarSuma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + encontrarSuma(n - 1);
        }
    }
}