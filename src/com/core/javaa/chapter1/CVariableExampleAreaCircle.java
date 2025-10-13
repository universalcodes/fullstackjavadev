package com.core.javaa.chapter1;

public class CVariableExampleAreaCircle {

    public static void main(String[] args) {
        int radius = 6;
       /* double doublePieValue = 3.14d;  In following line we are storing the pie Value in double datatype.
        float floatPieValue = 3.14f; In following line we are storing the pie Value in float datatype.
        point to remember if you want to use the value directly then ensure that d and f must be added providing
        the decimal value refer line 13 and 15.
        */
    //    int circleAreaResult = 3.14 * radius * radius; // Compile Time Error as Result stored in decimal value. int is not applicable here
        double circleAreaDoubleResult = 3.14d * radius * radius;  // Double data type can store decimal values with up to 15 digits of precision
        System.out.println("The Area of Circle as Double Data Type as Follows\t"+circleAreaDoubleResult);
        float circleAreaFloatResult =3.14f * radius * radius; // Float data type can store decimal values with up to 7 digits of precision
        System.out.println("The Area of Circle as Float Data Type as Follows\t"+circleAreaFloatResult);



    }
}
