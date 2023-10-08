package Recursion;

public class Min {
    public static void main(String[] args) {
        System.out.println("minimum number in an given array");
        int[] arr = {3, 56, -1, 6, -8};
        System.out.println(min(arr, 0, arr[0]));
    }

    static int min(int[] arr, int i, int minSoFar) {
        int n = arr.length;
        if (i == n) return minSoFar;
        if (arr[i] < minSoFar) minSoFar = arr[i];
        return min(arr, i + 1, minSoFar);
    }
}
