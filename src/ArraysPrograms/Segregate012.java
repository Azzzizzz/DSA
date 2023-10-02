package ArraysPrograms;

import java.util.Arrays;

public class Segregate012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 1, 2, 0, 1, 2};
        System.out.println("Segregate 012");
        segregate(arr);
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
}
