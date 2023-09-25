package GeneralPrograms;

public class GCD {
    public static void main(String[] args) {
        System.out.println("GCD");
        System.out.println(gcd(8, 12));
        System.out.println(gcd2(12, 8));
        System.out.println(lcm(8, 12));

    }


    //todo naive solution for gcd

    static int gcd2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Time complexity => O(log(min(a, b)))
    static int gcd(int a, int b) {
        while (b > 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    static int lcm(int a, int b) {
//        gcd * lcm = a*b => lcm = a*b/gcd

        int g = gcd(a, b);
        return (a * b) / g;

    }
}

/*
The time complexity of the provided GCD (Greatest Common Divisor) program is generally considered to be
 **O(log(min(a, b)))**, where `a` and `b` are the two input integers.

Here's a breakdown of how this time complexity is derived:

- In each iteration of the `while` loop, the algorithm performs a modulo operation (`a % b`), which computes the remainder when `a` is divided by `b`. This operation typically takes **O(log(min(a, b)))** time complexity.

- In each iteration, the algorithm then updates the values of `a` and `b` as follows:
  - `a` is set to the previous value of `b`.
  - `b` is set to the value of the remainder (`rem`).

- The loop continues until `b` becomes zero, at which point the GCD is found, and the loop terminates.

The number of iterations of the loop depends on the input values `x` and `y` and the number of times the modulo operation is performed. In general, the number of iterations is proportional to the number of bits in the smaller of the two numbers. As a result, the time complexity is often expressed as **O(log(min(x, y)))**.

This time complexity is quite efficient, especially for large numbers, and it's one of the reasons why the Euclidean algorithm for finding the GCD is preferred for most practical purposes. It's significantly more efficient than trying all possible divisors, which would have a time complexity of **O(min(x, y))**.
 */
