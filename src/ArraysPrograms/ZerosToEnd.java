package ArraysPrograms;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        System.out.println("Zeros to end");
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//        System.out.println(Arrays.toString(zerosToEndBF(arr)));
//        System.out.println(Arrays.toString(zerosToEnd(arr)));
        System.out.println(Arrays.toString(zerosToEndWithOrder(arr)));
    }

    static int[] zerosToEndBF(int[] arr) {

        int[] temp = new int[arr.length];
        int tempIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[tempIndex] = arr[i];
                tempIndex++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;

    }

    static int[] zerosToEnd(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 < p2) {
            if (arr[p1] != 0) p1++;
            if (arr[p2] == 0) p2--;
            if (arr[p1] == 0 && arr[p2] != 0) {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
        }

        return arr;
    }

    static int[] zerosToEndWithOrder(int[] arr) {
        int p1 = 0;
        int p2 = 1;

        while (p2 < arr.length) {
            if (arr[p1] != 0) p1++;
            if (arr[p2] == 0) p2++;
            if (arr[p1] == 0 && arr[p2] != 0) {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2++;

            }
        }
        return arr;
    }
}
