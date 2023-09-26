package GeneralPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayElementsExist {
    public static void main(String[] args) {
        char[] arr1 = {'a','z','c'};
        char[] arr2 = {'c','a','z'};

        int[] counts = new int[3];

int count = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//        if(count == arr1.length) {
//            System.out.println("true");
//        }else System.out.println("false");

//        char character = 'a'; // Replace 'a' with the character for which you want the ASCII value
//        int asciiValue = (int) character;
//        System.out.println(asciiValue);
        char[] alphabets = new char[26];

// Populate the array with lowercase alphabets
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabets[ch - 'a'] = ch;
        }

        System.out.println(Arrays.toString(alphabets));
        for (int i = 0; i < arr1.length; i++) {


        }

    }
}
