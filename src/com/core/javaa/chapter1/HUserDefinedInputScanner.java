package com.core.javaa.chapter1;

import java.util.Scanner;

public class HUserDefinedInputScanner {
    public static void main(String[] args) {
       /*
       Points to Remember
       .Scanner is used to take input from user. Scanner is class imported by java.util
       To take input from user we need to define data type for example if user want to store data as int
       Scanner takeInputFromScanner = new Scanner(System.in);
                System.in helps to take input from user where System is a class .in a method usually refers
       int enterNumber =  takeInputFromScanner.nextInt();
            nextInt() is method that helps to user the number.
       Similarly, we need need to use nextByte(), nextShort(), nextDouble(), nextFloat(), nextBoolean() except char
       for String we have to use nextline() -- if user storing more than one word /letter by using space then nextline() useful
       // When user want to single word/letter then next() is used, note if user enters more than one word/letter using space key, then only single word or letter has taken
       for char we should next.charAt(0); --  It Character always read Character from 0
       // If Users use any other Index 0 for eg next.charAt(1 or any other number );
       it throws run time error cause first character will return through 0 index by not 1.
        2. If user entered wrong value rather defined datatype it throws value mismatch exception
        for example - user has defined integer data type & user entered boolean/String then its gives value mismatch exception
        3. User can n number of Scanner in the Java class file.
        4. if User defined more than 1 Scanner then user can use\hit enter & use space key
        - If multiple inputs are entered together using space key (e.g., 4 5 7), Scanner.nextInt() reads them one by one in sequence then Output messages appear after each value is processed, even if all inputs were given at once.
        6. Once Scanner use is Completed, we should close the Scanner to close scanner we can use .close method.1
       * */

        Scanner takeInputFromScanner = new Scanner(System.in);
        System.out.println("Enter Integer Input from  User");
        int enterNumber =  takeInputFromScanner.nextInt();
        System.out.println("Entered Integer Number as:\t"+enterNumber);
        System.out.println("Enter Short Number");
        short enterNumber4 =  takeInputFromScanner.nextShort();
        System.out.println("Entered Short Number as:\t"+enterNumber4);
        System.out.println("Enter Byte Number");
        byte enterNumber5 =  takeInputFromScanner.nextByte();
        System.out.println("Entered Byte Number as:\t"+enterNumber5);
        System.out.println("Enter Long Number");
        long  enterNumber6 =  takeInputFromScanner.nextLong();
        System.out.println("Entered Long Number as:\t"+enterNumber6);
        System.out.println("Enter Double Number");
        double enterNumber7 =  takeInputFromScanner.nextDouble();
        System.out.println("Entered Double Number as:\t"+enterNumber7);
        System.out.println("Enter Float Number");
        float enterNumber8 =  takeInputFromScanner.nextFloat();
        System.out.println("Enter Float Number as:\t"+enterNumber8);
        System.out.println("Enter Character ");
        char enterNumber9 =   takeInputFromScanner.next().charAt(0);
        System.out.println("Entered Char as:\t"+enterNumber9);
        System.out.println("Enter String");
        String enterNumber10 =  takeInputFromScanner.next();  // When user want to single word/letter then next() is used, note if user enters more than one word/letter using space key, then only single word or letter has taken
        System.out.println("Entered String as:\t"+enterNumber10);
        System.out.println("Enter Multiple String");
        String enterNumber11 =  takeInputFromScanner.nextLine(); // when user want to store more than one word/letter using space key, then nextLine is used
        System.out.println("Entered Multiple String as:\t"+enterNumber11);
        System.out.println("Enter Boolean Value");
        boolean enterNumber12 =  takeInputFromScanner.nextBoolean();
        System.out.println("Entered Boolean as:\t"+enterNumber12);
       // boolean enterNumber13 =  takeInputFromScanner.nextInt(); // This will throw Compile Time error cause next method & datatype is not matched/same.
//        System.out.println("Enter Character to check Index ");
//        char enterNumber13 =   takeInputFromScanner.next().charAt(1);  // Following line throws run time error cause first character will return through 0 index by not 1.
//        System.out.println("Entered Char as:\t"+enterNumber13);


        takeInputFromScanner.close(); // Once the Scanner work is Completed then we are closing here using .close();



    }
}
