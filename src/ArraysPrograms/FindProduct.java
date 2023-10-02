package ArraysPrograms;

import java.util.Arrays;

public class FindProduct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Product of elements except self");
//        System.out.println(Arrays.toString(findProductExceptSelfBF(arr)));
        int totalProduct = calculateProduct(arr);
        System.out.println(Arrays.toString(findProductExceptSelf(arr, totalProduct)));
    }

    static int[] findProductExceptSelfBF(int[] arr) { //O(N^2), O(N)
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            int res = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                res = res * arr[j];
            }
            temp[i] = res;
        }
        return temp;
    }

    static int[] findProductExceptSelf(int[] arr, int totalProduct) { //O(N), 0(N)
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = totalProduct / arr[i];
        }
        return temp;
    }


    public static int calculateProduct(int[] arr) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            res *= arr[i];
        }
        return res;
    }


}
