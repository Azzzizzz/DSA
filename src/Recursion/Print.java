package Recursion;

public class Print {
    public static void main(String[] args) {
        System.out.println("Print n to 1");
        print(6);
        System.out.println("Print 1 to n");
        print2(6);
    }


    //    T(n) = T(n-k) + k , which is equal to O(N)
    static void print(int n) {
        //base condition
        if (n == 0) return;

        System.out.println(n);
        print(n - 1);
    }

    static void print2(int n) {
        //base condition
        if (n == 0) return;
        print(n - 1);
        System.out.println(n);
    }
}
