package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci of a given number using recursion");
        System.out.println(fibo(7)); //13
    }

    //    T(n) = 2^n+1 -1 , which is 2^n
    static int fibo(int n) {
        if (n <= 2) return 1;

        return fibo(n - 1) + fibo(n - 2);
    }
}
