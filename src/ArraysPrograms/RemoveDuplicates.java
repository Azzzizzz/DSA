package ArraysPrograms;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates");
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
//        System.out.println(Arrays.toString(removeDuplicates(arr)));
//        System.out.println(Arrays.toString(removeDuplicatesWithTwoPointers(arr)));
        System.out.println(Arrays.toString(removeDuplicatesWithTwoPointers2(arr)));

    }

    static int[] removeDuplicates(int[] arr) {
        int[] uniqueArray = new int[arr.length];
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {

                if (arr[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = arr[i];
                uniqueCount++;
            }

        }

        return uniqueArray;
    }

    static int[] removeDuplicatesWithTwoPointers(int[] arr) {
        int p1 = 0;
        int p2 = 1;

        while (p2 < arr.length) {

            if (arr[p2] > arr[p1]) {
                arr[p1 + 1] = arr[p2];
                p1++;
            }
            p2++;

        }
        return arr;

    }

    static int[] removeDuplicatesWithTwoPointers2(int[] arr) {

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
//        System.out.println(i + 1); to return count

        return arr;
    }
}
