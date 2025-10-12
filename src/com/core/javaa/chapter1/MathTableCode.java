package com.core.javaa.chapter1;

import java.util.Scanner;

public class MathTableCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Math Table");
        int mathTableNumber = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            int finalResult = i* mathTableNumber;
            System.out.println(finalResult);

        }
    }
}
