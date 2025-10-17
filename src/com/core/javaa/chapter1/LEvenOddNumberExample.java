package com.core.javaa.chapter1;

import java.util.Scanner;

public class LEvenOddNumberExample {

    public static void main(String[] args) {
        /*
        Points to Remember
        1. In following program we are trying to find even or odd number
        2. we myst need to use int or non-decimal value.
        3. To Get the result in decimal value we should use decimal datatype
        4. Friction value cant be even, only value ends with .0 those are even number for example 8.0, 80.0, 800.00
         */


        Scanner takeInputFromScanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int enterNumber =  takeInputFromScanner.nextInt();
        System.out.println(enterNumber%2==0);  //% is a Modulus operator which is used to store remainder
        System.out.println("Enter Decimal Number");
        double enterDecimalNumber =  takeInputFromScanner.nextDouble();
        System.out.println(enterDecimalNumber%2==0);



    }
}
