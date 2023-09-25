package GeneralPrograms;

import java.util.Arrays;

public class ArrayMaxNum {
    public static void main(String[] args) {
        System.out.println("max");
        int[] arr = {10,2,3,5};
        int [] arr1 = {1,2,3,4,5};
//        System.out.println(MaxArrayNumber(arr));

//        System.out.println( computeAverage(arr) );

//        System.out.println(Arrays.toString(copyElementsToNewArray(arr)));

//        System.out.println(Arrays.toString(reverseArray(arr)));

        System.out.println(Arrays.toString(reverseArrayWithTwoPointers(arr1)));
    }


//find the maximum of the array values
    static int MaxArrayNumber(int[] arr){
        int maxNumber=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i] > maxNumber){
                maxNumber = arr[i];
            }

        }
        return maxNumber;

    }


//compute the average of the array values
    static int computeAverage(int[]arr){
        int sumOfArrayElements = 0;
        for(int i = 0; i< arr.length;i++){
            sumOfArrayElements = sumOfArrayElements + arr[i];
        }
        return sumOfArrayElements;
    }
//copy to another array
    static int[] copyElementsToNewArray(int[] arr){
        int [] newArray = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
               newArray[i] = arr[i];
        }
        return newArray;
    }

    // reverse the elements within an array
static int[] reverseArray(int[] arr){
        int [] newArray = new int[arr.length];
//
//        for(int i=arr.length-1; i>=0; i--){
//            newArray[arr.length - i - 1] = arr[i];
//
//        }
 //or
    for(int i = 0; i< arr.length; i++){
        newArray[i] = arr[arr.length-i-1];
    }
    arr = newArray;

        return arr;

}

    // reverse the elements within an array with pointer technique
static  int[] reverseArrayWithTwoPointers(int[] arr){
//    int[] p1 = arr[0], p2 = arr[arr.length-1];

   int p1 =  0, p2 = arr.length-1;
    while (p1<p2){
        int temp;
        temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
        p1++;
        p2--;
    }
    return  arr;

}


}

