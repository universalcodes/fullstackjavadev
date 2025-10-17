package com.core.javaa.chapter1;

public class KSimpleInterestExample {
    public static void main(String[] args) {
        int principalAmt = 78;
        int rateOfInterest = 12;
        int time = 5;
        int siResult = principalAmt * rateOfInterest * time /100;  // as per math's result 46.80 but integer stores only non-decimal value so the result is 46
        // To get exact result we need to use decimal data type then result would be 46.80
        System.out.println(siResult);

        double time2 = 5.0;  // It is
        double siResult2 = principalAmt * rateOfInterest * time2; // Here we  use decimal data type then result would be 46.80
        System.out.println(siResult2);






        /*
        Points to remember

                 */

    }
}
