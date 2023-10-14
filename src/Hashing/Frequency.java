package Hashing;

public class Frequency {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 0, 8, 8, 2, 8, 3, 2};
        int[] arr = {-1, -2, 2, 0, -1, 3};
        System.out.println("Print the frequency using hashing");
//        frequency(arr);
        frequencyWithNegatives(arr);
    }

    static void frequency(int[] arr) {
        int n = arr.length;
        int[] map = new int[10];
        for (int i = 0; i < n; i++) {
            map[arr[i]] = map[arr[i]] + 1;

        }
        for (int i = 0; i < 10; i++) {
            if (map[i] != 0) {
                System.out.println(i + ":" + map[i]);
            }
        }
    }


    static void frequencyWithNegatives(int[] arr) {
        int n = arr.length;
        int[] map = new int[20];
        for (int i = 0; i < n; i++) {
            int index = arr[i] + 10;
            map[index] = map[index] + 1;
        }
        for (int i = 0; i < 20; i++) {
            if (map[i] != 0) {
                int value = i - 10;
                System.out.println(value + ":" + map[i]);
            }
        }
    }
}
