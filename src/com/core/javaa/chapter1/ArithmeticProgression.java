package com.core.javaa.chapter1;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Any AP Number");
        int commanDifference =sc2.nextInt();
        int intEndloopValue =sc2.nextInt();
        for (int i = 1; i<= intEndloopValue ; i+=commanDifference) {
            System.out.println(i);
        }
        }
    }

