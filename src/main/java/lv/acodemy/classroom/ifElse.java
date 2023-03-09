package lv.acodemy.classroom;

import javax.swing.*;

public class ifElse {

    public static void main(String[] args) {

        //IF
        /*
        if(condition){
        code to be executed
        }
         */

        boolean x = 5 > 2;
        System.out.println(x);

        if(x) {
            System.out.println("Yes, 5 is more than 2");
        }

        int evenNumber = 20;
        if(evenNumber % 2 == 0) {
            System.out.println("Number: " + evenNumber + " is even");
        }

        boolean isEvenNumber = 30 % 2 == 0;
        System.out.println(isEvenNumber);

        int number = 21;
        if(number % 2 == 0) {
            System.out.println("Number: " + number + " is even number");
        } else {
            System.out.println("Number: " + number + " is NOT even number");
        }


        /*
        // int age = 18;
        if(age <= 18) {
            System.out.println("You are not allowed to buy here!");
        } else {
            System.out.println("Welcome to our shop!");
        }
        //

         */


        boolean isSummer = true;
        if(isSummer) {
            System.out.println("Summer months: June, July, August");
        }

        int age = 18;

        if (age <= 17) {
            System.out.println("You are not allowed to buy here!");
        } else if (age <= 0) {
            System.out.println("Who are you?");
        } else {
            System.out.println("Welcome to the club!");
        }

        //
        String name ="Max";
        if (name.equals("John")) {
            System.out.println("Hello, John!");
        }else if (name.equals("Zina")) {
            System.out.println("You are not welcome");
        } else {
            System.out.println("Very interesting name!");
        }

        int currentMonth = 10;

        switch (currentMonth) {
            case 12:
            case 1:
                System.out.println("This is winter");
                break;
            default:
                if (currentMonth == 2) {
                    System.out.println("This is winter");
                } else if (currentMonth == 3) {
                    System.out.println("This is autumn");
                } else if (currentMonth == 4) {
                    System.out.println("this is autumn");


                    System.out.println("This is autumn");
                } else if (currentMonth == 5) {
                    System.out.println("This is autumn");
                } else if (currentMonth == 6 || currentMonth == 7 || currentMonth == 8) {
                    System.out.println("This is summer");
                } else if (currentMonth == 9 || currentMonth == 10 || currentMonth == 11) {
                    System.out.println("This is spring");
                } else {
                    throw new IllegalStateException("Incorrect month value: " + currentMonth);
                }
                break;
        }

        String student1 = "A";
        String student2 = "B";
        if (student1.equals("A") && student2.equals("B")) {
            System.out.println("Work together");
        }

        var myName = "Liza";
        System.out.println(myName);

    }
}
