package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.println(numbers[i]);

        }

        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"A", "B", "C", "D", "E" };
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("D")) {
            } else {
                System.out.println(names[i]);
            }

        }

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("==========//=========");

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        int x = 0;

        while  (x <= 10) {
            System.out.println(x);
            x++;
        }

        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];

        for (int j = 0; j < arrayOfNum.length; j++) {
            emptyArray[j] = arrayOfNum[j];

        }

        System.out.println(Arrays.toString(emptyArray));


















    }
}



