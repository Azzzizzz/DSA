package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("binary search");
        int[] arr = {1, 2, 4, 6, 7, 8, 9, 10};
        int[] arr2 = {};
        System.out.println(binarySearch(arr, 11));
    }

    static int binarySearch(int[] arr, int target) {

        if (arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < target) {
                start = mid + 1;
            } else end = mid - 1;

        }
        return -1;


    }
}
