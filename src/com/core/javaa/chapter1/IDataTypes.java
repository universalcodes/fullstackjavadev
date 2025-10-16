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
   - String  - It is used to store multiple characters at once
   - Array  - Arrays to store multiple values with Same datatype. Arrays usually starts from 0 Index
              Run Time Error -1 Index don't exist in the array, it's throws ArrayIndexOutOfBoundsException
              if User tries to display index which is not present in the array its throws ArrayIndexOutOfBoundsException
              Arrays can store default value based on the datatype  if Array value is not defined
   - Object - Object is used to store any value & this is very useful especially in the case of array where user want to store different datatype & its value
5. Each data type has a defined minimum and maximum value range.
6. Some data types support **implicit (auto) typecasting**, meaning they automatically convert values from compatible types:
   - `int` can store values of `byte` and `short`
   - `float` and `double` can store non-decimal values, but output them in decimal format
   - `char` can store numeric values and return the corresponding ASCII character
   - `int` can store `char` values and return the ASCII code
   - boolean can store relational Operators based values but results always comes as boolean
7. All data types have default values **except local variables**, which must be explicitly initialized before use.
8. we can store datatype value/literal as _;
*/

        System.out.println("1. byte Data Type");
        //byte byteVal= 129;  // compile time error This value is out of range
        byte byteVal= 124;
        byte byteValAsUnderScore= 1_2_4; // Output will be 124 act underscore act like as space
        System.out.println(byteVal);
        System.out.println(byteValAsUnderScore);
        byte storeCharValueinByte = 'A';  // This is Implicit Typecasting where byte` can store `char` values and return the ASCII code
        System.out.println(storeCharValueinByte+"\n");

        System.out.println("2. short Data Type");
        short shortVal= 124;
        short shortValAsUnderScore= 1_2_4_7; // Output will be 124 act underscore act like as space
        System.out.println(shortVal);
        System.out.println(shortValAsUnderScore);
        short storeCharValueinShort = 'A';  // This is Implicit Typecasting where short` can store `char` values and return the ASCII code
        System.out.println(storeCharValueinShort+"\n");


        System.out.println("3. int Data Type");
        int intVal= 124;
        int intValAsUnderScore= 1_2_4_7_7; // Output will be 12477 act underscore act like as space
        System.out.println(intVal);
        System.out.println(intValAsUnderScore);
        short storeCharValueinInt = 'C';  // This is Implicit Typecasting where int` can store `char` values and return the ASCII code
        System.out.println(storeCharValueinInt+"\n");


        System.out.println("4. long Data Type");
        long longVal= 134234456756345342l;
        long longValAsUnderScore= 1_34_234_4567_56345_342l; // Output will be 134234456756345342 act underscore act like as space
        System.out.println(longVal);
        System.out.println(longValAsUnderScore);
        long storeCharValueinLong = 'D';  // This is Implicit Typecasting where int` can store `char` values and return the ASCII code
        System.out.println(storeCharValueinLong+"\n");

        System.out.println("5. float Data Type");
        float floatVal= 134.56f;
        float floatValAsUnderScore= 1.5_455f; // Output will be 1.5_455 act underscore act like as space
        System.out.println(floatVal);
        System.out.println(floatValAsUnderScore);
        float floatNonDecimalVal= 134;  // This is Implicit Typecasting where float can store non-decimal values, but output them in decimal format
        float floatNonDecimalValAsUnderScore= 1_5_7; // Output will be 157.0 act underscore act like as space
        System.out.println(floatNonDecimalVal);
        System.out.println(floatNonDecimalValAsUnderScore+"\n");

        System.out.println("6. double Data Type");
        double doubleVal= 134.56d;
        double doubleValAsUnderScore= 1.5_455_65176d; // Output will be 1.5_455_65176 act underscore act like as space
        double floatValThroughDouble= 134.56f;  // we can store float value in double as float number is smaller than double datatype
        double floatValThroughDoubleAsUnderScore= 1.5_455f;  // we can store float value in double as float number is smaller than double datatype
        System.out.println(doubleVal);
        System.out.println(doubleValAsUnderScore);
        System.out.println(floatValThroughDouble);
        System.out.println(floatValThroughDoubleAsUnderScore);
        double doubleNonDecimalVal= 134345;  // This is Implicit Typecasting where double can store non-decimal values, but output them in decimal format
        double doubleNonDecimalValAsUnderScore= 1_5_7_56_35; // Output will be 1575635.0 act underscore act like as space
        System.out.println(doubleNonDecimalVal);
        System.out.println(doubleNonDecimalValAsUnderScore+"\n");

        System.out.println("7. char Data Type");
        char storeCharValue= 'A';
        System.out.println(storeCharValue);
        char storeIntValueUnderChar = 56;   //In this char`can store numeric values and return the corresponding ASCII character
        System.out.println(storeIntValueUnderChar+"\n");
//        char storeCharValueAsUnderscore= 'A_B';  // Underscore is Not Applicable It throws Compile Time Error as Too many characters in character literal Character Stores only Single Character
//        char storeDecimalValueUnderChar = 56.56;   // Compile Time Error Only Non-Decimal digits are stored in to char.

        System.out.println("8. boolean Data Type");
        boolean storeBooleanValueasCondition = true;
        System.out.println(storeBooleanValueasCondition);
        boolean storeNumricCondition = 6>4;  // // This is Implicit Typecasting where boolean can store relational Operators based values but results always comes as boolean
        System.out.println(storeNumricCondition);
        boolean storeNumricConditionNew = 6*4==24;  // // This is Implicit Typecasting where boolean can store relational Operators based values but results always comes as boolean
        System.out.println(storeNumricConditionNew+"\n");

        //'--------- Primitive Data Type Starts Here---------

        System.out.println("9. String Data Type");
        String storeName = "Universal Codes";  // This is group of Characters
        System.out.println(storeName+"\n");

        // ----------------- Arrays ---------------
        System.out.println("10. Array Data Type");
        int storeArrValue[]= {4,54,4}; // Arrays to store multiple values with Same datatype. Arrays usually starts from 0 Index
//        System.out.println(storeArrValue[-1]);  // Run Time Error -1 Index don't exist in the array, it's throws ArrayIndexOutOfBoundsException
        System.out.println(storeArrValue[0] + "\t"+ storeArrValue[1] + "\t" + storeArrValue[2]+"\n"); // In following line output should be 4, 54, & 4

        int[] storeArrValSecondWay= {41,514,41}; // Another Way to Store Arrays Values If we put index symbol on datatype or variable it is same.
        System.out.println(storeArrValSecondWay[0] + "\t"+ storeArrValSecondWay[1] + "\t" + storeArrValSecondWay[2]+"\n"); // In following line output should be 4, 54, & 4
//        System.out.println(storeArrValue[3]); // This Throws Run Time Error As There are only 3 values in this storeArrValue Array.
        // if User tries to display index which is not present in the array its throws ArrayIndexOutOfBoundsException

        int[] storeArrValueThirdWay = new int[3];
        int storeArrValueFourWay[] = new int[3]; //Note we put index symbol on datatype or variable it is same.
        storeArrValueFourWay[0]= 78;   // Here we are Assigning values
        storeArrValueThirdWay[2] =67;
        System.out.println(storeArrValueFourWay[0]);
        System.out.println(storeArrValueFourWay[1]);  // As we haven't store the value of int array in index 1 then default value of int is displayed
        System.out.println(storeArrValueThirdWay[1]+"\n"); // As we haven't store the value of int array in index 1 then default value of int is displayed.
        // Note -  To Print all values of Arrays at once then loop is very useful.

        System.out.println("10. Object Data Type");
        //Object dataType is Very is useful where it predicts the datatype automatically based on their value
        Object storeIntValueInObject = 1;
        Object storeDecimalValueInObject = 23.5;
        Object storeLongValueInObject = 1324567234l;
        Object storeCharValueInObject = 'A';
        Object storeBooleanInObject = true;
        Object storeStringInObject = "Universal Codes";
        System.out.println(storeIntValueInObject);
        System.out.println(storeDecimalValueInObject);
        System.out.println(storeLongValueInObject);
        System.out.println(storeCharValueInObject);
        System.out.println(storeBooleanInObject);
        System.out.println(storeStringInObject+"\n");
        Object storeArrValueInObject[]= {4, 23.51, 1324567233l,'B', false, "UniversalCodes"}; // Arrays to store multiple values with Same datatype. Arrays usually starts from 0 Index
        System.out.println(storeArrValueInObject[0] + "\t"+ storeArrValueInObject[1] + "\t" + storeArrValueInObject[2] + "\t" + storeArrValueInObject[3]+ "\t" + storeArrValueInObject[4]+ "\t" + storeArrValueInObject[5]); // In following line output should be 4, 23.51, 1324567233l,'B', false, "UniversalCodes"

    }
}
