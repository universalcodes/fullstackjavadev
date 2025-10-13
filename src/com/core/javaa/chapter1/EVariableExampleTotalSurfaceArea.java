package com.core.javaa.chapter1;

public class EVariableExampleTotalSurfaceArea {
    public static void main(String[] args) {
        int lengthValue = 60;
        int breadthValue = 60;
        int heightValue = 60;
       // int totalSurfaceAreaResult = 2*(lengthValue*breadthValue) + 2*(breadthValue*heightValue) + 2*(lengthValue*heightValue); // following code is correct but quite not readable much
        int totalSurfaceAreaResult = 2*(lengthValue*breadthValue + breadthValue*heightValue +lengthValue*heightValue); // following code is correct & more readable
        System.out.println("The Result of Total Surface Area as follows\t"+totalSurfaceAreaResult);


    }
}
