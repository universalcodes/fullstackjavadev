package com.core.javaa.chapter1;

public class IDataTypes {

    public static void main(String[] args) {
    /*Points to Remember:

1. A data type is used to store a value, and it requires a variable to hold that value.
2. Data types in Java are categorized into two main types:
   - Primitive Data Types
   - Non-Primitive Data Types
3. Primitive Data Types are further classified as:
   - Numeric-Based: int, (32 Bits)  byte (8 bit), short (16 Bits), long (64 Bits), float (32 Bits), double (64 Bits)
   - Alphabetic-Based: char (16 Bits)
   - Condition-Based: boolean
4. Non-Primitive Data Types include:
   - String
   - Array
   - Object
5. Each data type has a defined minimum and maximum value range.
6. Some data types support **implicit (auto) typecasting**, meaning they automatically convert values from compatible types:
   - `int` can store values of `byte` and `short`
   - `float` and `double` can store integer values, but output them in decimal format
   - `char` can store numeric values and return the corresponding ASCII character
   - `int` can store `char` values and return the ASCII code
7. All data types have default values **except local variables**, which must be explicitly initialized before use.
8. we can store datatype value/literal as _;
*/

        //byte byteVal= 129;  // compile time error This value is out of range
        byte byteVal= 124;
        byte byteValAsUnderScore= 1_2_4; // Output will be 124 act underscore act like as space
        System.out.println(byteVal);
        System.out.println(byteValAsUnderScore);


        short shortVal= 124;
        short shortValAsUnderScore= 1_2_4_7; // Output will be 124 act underscore act like as space
        System.out.println(shortVal);
        System.out.println(shortValAsUnderScore);


        int intVal= 124;
        int intValAsUnderScore= 1_2_4_7_7; // Output will be 12477 act underscore act like as space
        System.out.println(intVal);
        System.out.println(intValAsUnderScore);



        long longVal= 134234456756345342l;
        long longValAsUnderScore= 1_34_234_4567_56345_342l; // Output will be 134234456756345342 act underscore act like as space
        System.out.println(longVal);
        System.out.println(longValAsUnderScore);



    }
}
