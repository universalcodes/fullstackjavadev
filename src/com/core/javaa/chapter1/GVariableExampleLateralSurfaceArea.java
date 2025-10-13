package com.core.javaa.chapter1;

public class GVariableExampleLateralSurfaceArea {
    public static void main(String[] args) {
        int lengthValue = 10;
        int breadthValue = 10;
        int heightValue = 10;
      //  int lateralSurfaceAreaResult = lengthValue + breadthValue * 2 * heightValue;  // Incorrect format
        int lateralSurfaceAreaResult = 2 * heightValue * (lengthValue+breadthValue);  // Ensure that bracket multiply cant be considered directly in Java we need to use * symbol

        System.out.println("The Result of Lateral Surface Area as follows\t"+lateralSurfaceAreaResult);


    }
}
