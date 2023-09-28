package ArraysPrograms;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        System.out.println("left rotate");
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int n = arr.length;
//        System.out.println(Arrays.toString(leftRotateByOnePlace(arr)));
//        System.out.println(Arrays.toString(leftRotate(arr, 6)));
//        System.out.println(Arrays.toString(reverse(arr, 0, n - 1)));
//        leftRotateWithTwoPointers(arr, 2);
        rightRotationWithTwoPointers(arr, 2);
    }

    static int[] leftRotateByOnePlace(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

        return arr;
    }

    static int[] leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 1; j < n; j++) {
                arr[j - 1] = arr[j];
            }
            arr[n - 1] = temp;
        }
        return arr;
    }

    static int[] reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }


    static void leftRotateWithTwoPointers(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
        //2nd method
//        reverse(arr, 0, d - 1);
//        reverse(arr, d, n - 1);
//        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString((arr)));

//        reverse(arr, 0, n - 1);
//        reverse(arr, 0, d - 1);
//        reverse(arr, d, n - 1);
    }

    static void rightRotationWithTwoPointers(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
        reverse(arr, 0, n - 1);
        //2nd method
//        reverse(arr, 0, n - 1);
//        reverse(arr, 0, d - 1);
//        reverse(arr, d, n - 1);


        System.out.println(Arrays.toString((arr)));
    }

}
