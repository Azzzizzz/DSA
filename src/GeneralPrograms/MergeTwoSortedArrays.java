package GeneralPrograms;

//Merge two Sorted Arrays Without Extra Space
//Problem statement: Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

import java.util.Arrays;

/*
* Input:
n = 4, arr1[] = [1 4 8 10]
m = 5, arr2[] = [2 3 9]
*
* Output:
arr1[] = [1 2 3 4]
arr2[] = [8 9 10]

* */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("Merge two sorted arrays");
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
//        mergeTwoSortedArraysWithExtraSpace(arr1, arr2);
//        mergeTwoSortedArraysOptimal1(arr1, arr2);
        mergeTwoSortedArraysOptimal2(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void mergeTwoSortedArraysWithExtraSpace(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }

        }

        while (i < n) {
            arr3[k++] = arr1[i++];
        }

        while (j < m) {
            arr3[k++] = arr2[j++];
        }
        for (int l = 0; l < m + n; l++) {
            if (l < n) arr1[l] = arr3[l];
            else arr2[l - n] = arr3[l];
        }

        System.out.println(Arrays.toString(arr3));

    }


    static void mergeTwoSortedArraysOptimal1(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                swapFromTwoArrays(arr1, i, arr2, j);
                i--;
                j++;
            } else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    static void mergeTwoSortedArraysOptimal2(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int len = n + m;
        int gap = len / 2;
        while (gap > 0) {
            int i = 0;
            int j = i + gap;
            while (j < len) {
                if (i < n && j >= n) {
                    swapIfGreater(arr1, arr2, i, j - n);
                } else if (i >= n) {
                    swapIfGreater(arr2, arr2, i - n, j - n);

                } else {
                    swapIfGreater(arr1, arr1, i, j);

                }
                i++;
                j++;

            }
            gap = (gap <= 1) ? 0 : (gap + 1) / 2;

        }
    }


    public static void swapFromTwoArrays(int[] arr1, int i, int[] arr2, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void swapIfGreater(int[] arr1, int[] arr2, int i, int j) {

        if (arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }
}
