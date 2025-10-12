package com.core.javaa.chapter1;
public class APrintSimpleMessage {

    public static void main(String[] args) {
        System.out.println("There are three types of Prints in Java Println, print & printf");
        System.out.println("First type is - println means when you want to print something new Lines");
        System.out.println("this is my laptop");
        System.out.println("Full Stack Roadmap");
        System.out.println("2nd Type is Print = Every printed message comes in same line");
        System.out.print("this is my laptop");
        System.out.print("Full Stack Roadmap");
        System.out.print("Every printed message comes in same line in the case of Print\n");
        System.out.println("3rd  Type is PrintF - When you want to print more than 2 Variables of Java in the single line. we need to use special Common Specifiers ");

        //         Common Specifiers:
        //        - %s → String
//                - %f → Floating-point number
//                - %n → New line (platform-independent)
//                - %c → Character
//                - %d → Number
        int a = 67;
        int b = 45;
        System.out.printf("%n%d%n%d", a, b);
        float a1 = 67.2f;
        double b1 = 45.2d;
        System.out.printf("%n%f%n%f", a1, b1);
        char a2 = 'Y';
        char b2 = 'K';
        System.out.printf("%n%c%n%c", a2, b2);
        String a3 = "Yogesh";
        String b3 = "Kamra";
        System.out.printf("%n%s%n%s\n", a3, b3);
        System.out.println("Escape Sequences are listed: ");
        // Code of Escape Sequences
        System.out.println("Universal\nCodes");  // \n is used to write the code in the new line
        System.out.println("Universal\tCodes");  // \t is used to write the code in the tab space
        System.out.println("C:\\UniversalCodes");  //  \\ is used to  add the Backslash Code in the Message
        System.out.println("This is:\"UniversalCodes\"");   // \"Test\"  is used to  add the Double Quote Code in the Message
        System.out.println("This is:\'UniversalCodes\'");   // \'Test\' is used to  add the Single Quote Code in the Message
        System.out.println("Thisis\rUniversalCodes");  // \r is used to delete words before \r
        System.out.println("Thisiss\bUniversalCodess\b");  // \b  is used to delete last Character from the word.
        System.out.println("Universal\fCodes\fof\fMyWorld");  // \f is used to write the code where one form feed is added
    }
}
