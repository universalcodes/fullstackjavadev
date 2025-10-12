package com.core.javaa.chapter1;

import java.util.Scanner;

public class JArithmeticGraph {

    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Any AP Initial Value");
        int initialValue =sc2.nextInt();
        System.out.println("Enter Any Common Difference Value");
        int commanDifference =sc2.nextInt();
        System.out.println("Enter Any End Loop Value");

        int intEndloopValue =sc2.nextInt();
        for (int i = initialValue; i<= intEndloopValue ; i+=commanDifference) {
            int finalResult = initialValue+commanDifference;
            System.out.println(finalResult);

        }
        }
    }

