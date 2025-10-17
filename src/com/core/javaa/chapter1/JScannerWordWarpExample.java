package com.core.javaa.chapter1;
import java.util.Scanner;

public class JScannerWordWarpExample {

    public static void main(String[] args) {
        Scanner takeInputFromScanner = new Scanner(System.in);
        System.out.println("Enter 1st Word");
        String enterFirstWord =  takeInputFromScanner.nextLine(); // when user want to store more than one word/letter using space key, then nextLine is used
        System.out.println("Age");
        int enterNumber =  takeInputFromScanner.nextInt();
        System.out.println("Mobile Number");
        long  enterMobile =  takeInputFromScanner.nextLong();
        System.out.println("Enter Height");
        double enterHeight =  takeInputFromScanner.nextDouble();
        System.out.println("Enter Name Initial ");
        char enterNameInitial =   takeInputFromScanner.next().charAt(0);
        System.out.println("Enter Gender");
        boolean enterGenderValue =  takeInputFromScanner.nextBoolean();
        System.out.println("My name is"+enterFirstWord+ "\n" + "My age is "+ enterNumber
        + "\n" + "My Mobile is "+ enterMobile+"\n" + "My Height is "+ enterHeight
        +"\n" + "My Name Initial  is "+ enterNameInitial +"\n" + "My Gender is Male Which is "+ enterGenderValue);



    }
}
