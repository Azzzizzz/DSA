package ArraysPrograms;

import java.util.Arrays;

public class Segregate {
    public static void main(String[] args) {
        System.out.println("Segregate");
        int[] arr = {0, 1, 0, 1, 0, 1};
//        int[] arr = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1};

//        System.out.println(Arrays.toString(segregate(arr)));
        System.out.println(Arrays.toString(segregateWith2Pointers(arr)));
    }

    static int[] segregate(int[] arr) {

        int count = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) count++;
        }
        for (int i = 0; i < len; i++) {
            if (i < count) {
                arr[i] = 0;
            } else arr[i] = 1;
        }

        return arr;
    }

    static int[] segregateWith2Pointers(int[] arr) {
        int p1 = 0, p2 = arr.length - 1;
        while (p1 < p2) {
            if (arr[p1] == 0) p1++;
            if (arr[p2] == 1) p2--;
            if (p1 < p2 && arr[p1] == 1 && arr[p2] == 0) {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
        }
        return arr;
    }
}
