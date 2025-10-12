package com.core.javaa.chapter1;

import java.util.Arrays;

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
        System.out.println("3rd  Type is PrintF - When you want to print more than 2 Variables of Java in the single line. we need to use special Comman Specifiers ");

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
        System.out.printf("%n%s%n%s", a3, b3);



    }
}
