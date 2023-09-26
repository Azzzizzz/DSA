package ArraysPrograms;

public class IsSorted {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("is sorted");
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr) {

        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] < arr[n]) {
                if (arr[i] > arr[i + 1]) return false;
            } else if (arr[i] < arr[i + 1]) return false;

        }
        return true;
    }
}
