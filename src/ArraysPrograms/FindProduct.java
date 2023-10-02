package ArraysPrograms;

import java.util.Arrays;

public class FindProduct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        int[] arr = {3, 4, 6, 1, 2};

        System.out.println("Product of elements except self");
//        System.out.println(Arrays.toString(findProductExceptSelfBF(arr)));
//        int totalProduct = calculateProduct(arr);
//        System.out.println(Arrays.toString(findProductExceptSelf(arr, totalProduct)));
        findProductUsingCaching(arr);
        System.out.println(Arrays.toString(arr));
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

    //the below solution will not work for large number elements
    //And it will not work correctly if the array values include negatives and zeros.
    static int[] findProductExceptSelf(int[] arr, int totalProduct) { //O(N), 0(N)
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = totalProduct / arr[i];
        }
        return temp;

    }

    static int[] findProductUsingCaching(int[] arr) { //O(N),0(N)
        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i - 1] * prefix[i - 1];
        }
        System.out.println(Arrays.toString(prefix));
        for (int i = n - 1; i > 0; i--) {
            suffix[i - 1] = arr[i] * suffix[i];
        }
        System.out.println(Arrays.toString(suffix));
        for (int i = 0; i < n; i++) {
            arr[i] = prefix[i] * suffix[i];
        }
        return arr;

    }

    static int[] findProductUsingCaching2(int[] arr) { //more optimized - used 2 for loops
        int n = arr.length;
        int[] output = new int[n];
        int product = 1;

        // Calculate the product of all elements to the left of each element
        for (int i = 0; i < n; i++) {
            output[i] = product;
            product *= arr[i];
        }

        product = 1;

        // Calculate the product of all elements to the right of each element
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= product;
            product *= arr[i];
        }

        return output;
    }

    static int[] findProductUsingCaching3(int[] arr) { // O(N), O(1)
        int n = arr.length;
        int[] output = new int[n];

        int rightProduct = 1;

        // Calculate the product of all elements to the left of each element
        for (int i = 0; i < n; i++) {
            output[i] = rightProduct;
            rightProduct *= arr[i];
        }

        int leftProduct = 1;

        // Calculate the product of all elements to the right of each element
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= leftProduct;
            leftProduct *= arr[i];
        }

        return output;
    }


    public static int calculateProduct(int[] arr) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            res *= arr[i];
        }
        return res;
    }


}
