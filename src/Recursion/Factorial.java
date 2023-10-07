package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of a given number using recursion");
        System.out.println(fact(3));
    }

    //T(n) = n * T(n - 1), which is O(N)
    static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }
}
