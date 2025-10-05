package Taller1_EDA.Punto7;

public class Fibo {

    public static int fibonacciOptimizado(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }

        if (n == 0) {
            memo[0] = 0;
        } else if (n == 1) {
            memo[1] = 1;
        } else {
            memo[n] = fibonacciOptimizado(n - 1, memo) + fibonacciOptimizado(n - 2, memo);
        }

        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        fibonacciOptimizado(n, memo);

        System.out.print("Vector de Fibonacci: [");
        for (int i = 0; i <= n; i++) {
            System.out.print(memo[i]);
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

