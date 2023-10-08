package Recursion;

public class Max {
    public static void main(String[] args) {
        System.out.println("minimum number in an given array");
        int[] arr = {3, 56, -1, 6, -8};
        System.out.println(max(arr, 0, Integer.MIN_VALUE));
    }

    static int max(int[] arr, int i, int maxSoFar) {

        if (i == arr.length) return maxSoFar;

        if (arr[i] > maxSoFar) maxSoFar = arr[i];

        return max(arr, i + 1, maxSoFar);
    }
}
