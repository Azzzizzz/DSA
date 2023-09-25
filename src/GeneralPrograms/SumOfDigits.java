package GeneralPrograms;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("digits");
//        System.out.println(sumOfNumbersTillN(4));
//        System.out.println(sumOfDigits(1236));
    }

    //
    static int sumOfNumbersTillN(int n) {
        int result = (n * (n + 1)) / 2; // O(1)
        // or naive
        //         for (int i = 1; i <= n; i++) {
        //             result += i;  // O(N)
        //
        //         }


        return result;
    }

    static int sumOfDigits(int n) { //O(N)
        int sum = 0;
        while (n > 0) {

            int rem = n % 10;
            sum += rem;
            n = n / 10;

        }
        return sum;

    }
}
