package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        //byte data type
        byte myCurrentAge = 25;
        System.out.println(myCurrentAge);

        //short data type
        short salaryPerMonth= 1000;
        System.out.println(salaryPerMonth);

        //char data type
        char firstNameLetter = 113;
        System.out.println(firstNameLetter);

        //int data type
        int dateOfBirth = 40298;
        System.out.println(dateOfBirth);

        //long data type
        long populationOfLatvia = 1884000;
        System.out.println(populationOfLatvia);

        //float data type
        float lapTime = 32.30F;
        System.out.println(lapTime);

        //double data type
        double lapTime2 = 32.30;
        System.out.println(lapTime2);

        //booLean is; has;
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;

        //String data type

        String name = "Liza";
        String surName = "Krinina";

        //Concatenation

        String fullName = name + " " + surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName +  myCurrentAge;
        System.out.println(fullNameWithAge);

        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        //*
        int a = 100;
        int b = 20;
        int c = a * b;

        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20 * 10");

        //division

        c = a / b;
        System.out.println(c);

        //%

        int number = 10 % 9;
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 == 0) {
                System.out.println("This is number:" + numbers[i]);

            }
        }

    }
}
