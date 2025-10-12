package com.core.javaa.chapter1;

public class AVariables {

    public static void main(String[] args) {
        byte dataTypeOne = 5;
        short dataTypeTwo = 6;
        int dataTypeThree = 56;
        long dataTypeFour = 11150215l;
        float pieFloatValue= 3.141592567f;
        double pieDoubleValue = 3.1415926645d;
        String name = "Yogesh Kamra";
        char nameInitial = 'Y';
        boolean genderMale = true;

        System.out.println(dataTypeOne + "\n"+ dataTypeTwo
                + "\n"+ dataTypeThree + "\n"+ dataTypeFour
                + "\n"+ pieFloatValue + "\n"+pieDoubleValue
                + "\n"+ pieDoubleValue + "\n"+ name
                + "\n"+ nameInitial + "\n"+ genderMale
        );


        // formatting with Tab

        System.out.println(dataTypeOne + "\t"+ dataTypeTwo
                + "\t"+ dataTypeThree + "\t"+ dataTypeFour
                + "\t"+ pieFloatValue + "\t"+pieDoubleValue
                + "\t"+ pieDoubleValue + "\t"+ name
                + "\t"+ nameInitial + "\t"+ genderMale
        );
    }
}
