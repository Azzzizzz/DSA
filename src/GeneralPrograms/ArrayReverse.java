package GeneralPrograms;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[5];
        for (int i=arr.length-1;i>=0;i--){
            newArr[arr.length-1 -i] = arr[i];

        }

        System.out.println(Arrays.toString(newArr));
    }
}
