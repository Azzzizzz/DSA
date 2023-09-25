package GeneralPrograms.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        System.out.println("string");
        // Array of strings
        String[] str = {
                "apple", "banana"
        };
        String[] str1 = new String[4];
        System.out.println("Enter 4 strings:");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < str1.length; i++) {

            str1[i] = in.next();

        }
        System.out.println(Arrays.toString(str1));
    }
}
