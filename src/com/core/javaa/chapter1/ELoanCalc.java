package com.core.javaa.chapter1;

public class ELoanCalc {

    public static void main(String[] args) {

        int loanAmt = 100000;
        int loanTenure = 12;
        double loanInterestRate = 10.50d;

        double finalAmtTobePaid = loanAmt/loanTenure * loanInterestRate;
        System.out.println(finalAmtTobePaid);


    }
}
