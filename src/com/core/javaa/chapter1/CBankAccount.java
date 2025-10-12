package com.core.javaa.chapter1;

public class CBankAccount {


    static long iciciAccountNumber;
    static int minimumOpeningBalance;

    static int storeAmtEveryMonth;
    static int finalBankBalance;

    public static void main(String[] args) {

        int customerAge = 18;
        boolean customerGenderMale = true;
        long customerAadharCard = 2345678345l;
        String customerPanCard = "AIJPY3434A";

        boolean customerAadharValid = true;
        boolean customerPanCardValid = true;


        if(customerAge ==18 & customerPanCardValid == true  & customerAadharValid ==true  )
        {
            System.out.println("ICICI Account Opened");

             iciciAccountNumber = 324567895432456l;
            System.out.println("Account No as follows\t"+ iciciAccountNumber);
        }


         minimumOpeningBalance = 1000;
        System.out.println("This Account " + iciciAccountNumber + " has following Balance\t" + minimumOpeningBalance);


         storeAmtEveryMonth = 100;


        for (int i =1; i<=6; i++ )
        {
            minimumOpeningBalance +=  storeAmtEveryMonth;
            finalBankBalance=minimumOpeningBalance;
        }

        System.out.println(minimumOpeningBalance);

        System.out.println(finalBankBalance);
    }
}
