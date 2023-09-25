package ArraysPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        System.out.println("Array List");
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.contains(4));
//        list.remove(2);
//        list.set(0, 99);
        Scanner in = new Scanner(System.in);
        System.out.println(list.size());

        for (int i = 0; i < 5; i++) {

            list.add(in.nextInt());

        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

        System.out.println(list);
    }
}
