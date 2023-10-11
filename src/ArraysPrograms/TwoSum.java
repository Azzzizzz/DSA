package ArraysPrograms;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("return count of pairs divisible k");
//        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = {1, 3, 2, 6, 1, 2};

        System.out.println(pairsSumDividedByTarget(arr, 3));
    }

    static int pairsSumDividedByTarget(int[] arr, int target) {
        int n = arr.length; // n = 6

        int p1 = 0, p2 = 1, count = 0;


        while (p1 < n - 1) {

            if ((arr[p1] + arr[p2]) % target == 0) {
                count++;
                p2++;
            } else {
                p2++;
            }
            if (p2 == n) {
                p1++;
                p2 = p1 + 1;
            }

        }

        return count;

    }
}
