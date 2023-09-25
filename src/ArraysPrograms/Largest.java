package ArraysPrograms;

public class Largest {
    public static void main(String[] args) {
        System.out.println("largest");
        int[] arr = {14, 10, 9, 3, 10, 1, 12};
        System.out.println(secondLargest3(arr));
        System.out.println(secondSmallest(arr));

    }

    static int secondLargest2(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
        }
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }

    //In one pass.
    static int secondLargest3(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
//        int secondLargest = arr.length-1; or // Integer.MIN_VALUE


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }

    static int secondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];

            }
        }
        return secondSmallest;
    }
}
