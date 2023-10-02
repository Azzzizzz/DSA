package ArraysPrograms;

import java.util.Arrays;

public class Segregate012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 1, 2, 0, 1, 2};
//        int[] arr = {0, 1, 2, 2, 1, 0};
        System.out.println("Segregate 012");
//        segregate(arr);
        segregateWith3Pointers(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void segregate(int[] arr) {
        int n = arr.length;
        int count_0s = 0;
        int count_1s = 0;
//        int count_2s = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) count_0s++;
            else if (arr[i] == 1) count_1s++;
//            else count_2s++;
        }


        for (int i = 0; i < count_0s; i++) {
            arr[i] = 0;
        }
        for (int i = count_0s; i < count_0s + count_1s; i++) {
            arr[i] = 1;
        }
        for (int i = count_0s + count_1s; i < n; i++) {
            arr[i] = 2;
        }
    }

    static void segregateWith3Pointers(int[] arr) {
        int n = arr.length;
        int p0 = 0, p1 = 0, p2 = n - 1;
        while (p1 <= p2) {
            if (arr[p1] == 0) {
                swap(arr, p0, p1);
                p0++;
                p1++;
            } else if (arr[p1] == 2) {
                swap(arr, p2, p1);
                p2--;
            } else p1++;
        }

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
