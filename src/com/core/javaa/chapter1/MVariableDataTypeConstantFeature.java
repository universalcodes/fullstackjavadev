package com.core.javaa.chapter1;

public class MVariableDataTypeConstantFeature {

    public static void main(String[] args) {
    /*
    Points to Remember
    1. Constants in wrapper classes provide metadata about primitive types, such as limits and memory size.
    2. Constant can be used through Wrapper Class such as Integer, Short, Byte, Long, Float, Double & Character,
    3. For Constant - There are different constants to display  Max, Min, Bytes & Size based on their data type
     */

        //------------- Byte Constants
        byte byteMaxValue =Byte.MAX_VALUE;
        byte byteMinValue =Byte.MIN_VALUE;
        byte byteByteValue = Byte.BYTES;
        byte byteSizeValue = Byte.SIZE;

        System.out.println("The Max Value of Byte\t"+byteMaxValue);
        System.out.println("The Min Value of Byte\t"+byteMinValue);
        System.out.println("The Byte Value of Byte\t"+byteByteValue);
        System.out.println("The Bit Size of Byte\t"+byteSizeValue);


        //------------- Integer Constants
        short shortMaxValue =Short.MAX_VALUE;
        short shortMinValue =Short.MIN_VALUE;
        short shortByteValue = Short.BYTES;
        short shortSizeValue = Short.SIZE;

        System.out.println("The Max Value of Short\t"+shortMaxValue);
        System.out.println("The Min Value of Short\t"+shortMinValue);
        System.out.println("The Byte Value of Short\t"+shortByteValue);
        System.out.println("The Bit Size of Short\t"+shortSizeValue);



        //------------- Integer Constants
        int intMaxValue =Integer.MAX_VALUE;
        int intMinValue =Integer.MIN_VALUE;
        int intByteValue = Integer.BYTES;
        int intSizeValue = Integer.SIZE;

        System.out.println("The Max Value of Integer\t"+intMaxValue);
        System.out.println("The Min Value of Integer\t"+intMinValue);
        System.out.println("The Byte Value of Integer\t"+intByteValue);
        System.out.println("The Bit Size of Integer\t"+intSizeValue);


        //------------- Long Constants
        long longMaxValue =Long.MAX_VALUE;
        long longMinValue =Long.MIN_VALUE;
        long longByteValue = Long.BYTES;
        long longSizeValue = Long.SIZE;

        System.out.println("The Max Value of Long\t"+longMaxValue);
        System.out.println("The Min Value of Long\t"+longMinValue);
        System.out.println("The Byte Value of Long\t"+longByteValue);
        System.out.println("The Bit Size of Long\t"+longSizeValue);

        //------------- Float Constants
        float floatMaxValue =Float.MAX_VALUE;
        float floatMinValue =Float.MIN_VALUE;
        float floatByteValue = Float.BYTES;
        float floatSizeValue = Float.SIZE;

        System.out.println("The Max Value of Float\t"+floatMaxValue);
        System.out.println("The Min Value of Float\t"+floatMinValue);
        System.out.println("The Byte Value of Float\t"+floatByteValue);
        System.out.println("The Bit Size of Float\t"+floatSizeValue);


        //------------- Double Constants
        double doubleMaxValue =Double.MAX_VALUE;
        double doubleMinValue =Double.MIN_VALUE;
        double doubleByteValue = Double.BYTES;
        double doubleSizeValue = Double.SIZE;

        System.out.println("The Max Value of Double\t"+doubleMaxValue);
        System.out.println("The Min Value of Double\t"+doubleMinValue);
        System.out.println("The Byte Value of Double\t"+doubleByteValue);
        System.out.println("The Bit Size of Double\t"+doubleSizeValue);

        //------------- Character Constants
        char charMaxValue =Character.MAX_VALUE;
        char charMinValue =Character.MIN_VALUE;
        char charByteValue = Character.BYTES;
        char charSizeValue = Character.SIZE;

        System.out.println("The Max Value of Character\t"+charMaxValue);
        System.out.println("The Min Value of Character\t"+charMinValue);
        System.out.println("The Byte Value of Character\t"+charByteValue);
        System.out.println("The Bit Size of Character\t"+charSizeValue);

        //------------- Boolean Constants
        boolean booleanFalseVal =Boolean.FALSE;  // When user want to store Boolean Value as False
        boolean booleanTrueVal =Boolean.TRUE;   // When user want to store Boolean Value as True
       // boolean booleanTypeVal = Boolean.TYPE;

        System.out.println("The  Value of Boolean\t"+booleanFalseVal);
        System.out.println("The Value of Boolean\t"+booleanTrueVal);
        //System.out.println("The Byte Value of Boolean\t"+booleanType);

        //------------- String Constants
        String name = "universalcodes";
        System.out.println("Original String\t" + name);
        System.out.println("CASE_INSENSITIVE_ORDER\t" + String.CASE_INSENSITIVE_ORDER);

// As Long is number so we can display other datatype Number. It Don't throw any compile Time Error even though we are using long return datatype
// No Compile Time Error as Byte is smallest datatype also  we can use other return type such as non-Decimal data type such as short, int, long & byte itself
        long byteMaxValueViaLong =Byte.MAX_VALUE;
        long byteMinValueViaLong =Byte.MIN_VALUE;
        long byteByteViaLong =Byte.BYTES;
        long byteSizeValueViaLong =Byte.SIZE;


        // As Long is number so we can display other datatype Number. It Don't throw any compile Time Error even though we are using long return datatype
// No Compile Time Error as Short is 2nd smallest datatype also we can use other return type such as non-Decimal data type such as int
// Byte, int, long, float, double  can be used only for Bytes and Size as those values are smaller & easily Store able

//        byte shortMaxValueViabyte =Short.MAX_VALUE;  // Compile time Error in the case of Min & Max byte is smaller than short
//        byte shortMinValueViabyte =Short.MIN_VALUE;   // Compile time Error in the case of Min & Max byte is smaller than short
        long shortMaxValueViaLong =Short.MAX_VALUE;
        long shortMinValueViaLong =Short.MIN_VALUE;
        long shortByteViaLong =Short.BYTES;
        long shortSizeValueViaLong =Short.SIZE;

        // As Long is number so we can display other datatype Number. It Don't throw any compile Time Error even though we are using long return datatype
// No Compile Time Error as Integer is smaller datatype long No Other Datatype cant be used such as long & int itself
// Byte, int, long, float, double  can be used only for Bytes and Size as those values are smaller & easily Store able

        long intMaxValueViaLong =Integer.MAX_VALUE;
        long intMinValueViaLong =Integer.MIN_VALUE;
        long intByteValueViaLong = Integer.BYTES;
        long intSizeValueViaLong = Integer.SIZE;

        // In the Case of Double Min & Max Value only double itself applicable.
        // // byte, short, int, long & float can be used only for Bytes and Size as those values are smaller & easily Store able also double/float byte and size values are non-decimal

//        long doubleMaxValueViaLong =Double.MAX_VALUE;  // Compile Type Error as Double Contains Decimal Value & Long Contains Non-Decimal Value.
//        long doubleMinValueViaLong =Double.MIN_VALUE;  // Compile Type Error as Double Contains Decimal Value & Long Contains Non-Decimal Value.
        long doubleByteValueViaLong = Double.BYTES; // No Compile Time Error Double.BYTES Returns Non-Decimal Value
        long doubleSizeValueViaLong = Double.SIZE;  // No Compile Time Error Double.SIZE Returns Non- Decimal Value

// In the Case of float Min & Max Value only float & Double itself applicable.
// byte, short, int, long, float & double can be used only for Bytes and Size as those values are smaller & easily Store able also double/float byte and size values are non-decimal


//        long floatMaxValueViaLong =Float.MAX_VALUE;  // Compile Type Error as Float Contains Decimal Value & Long Contains Non-Decimal Value.
//        long floatMinValueViaLong =Float.MIN_VALUE;  // Compile Type Error as Float Contains Decimal Value & Long Contains Non-Decimal Value.
        double floatMaxValueViaDouble =Float.MAX_VALUE;  // No Compile Type Error as Float Contains Decimal Value & Float is smaller than Double
        double floatMinValueViaDouble =Float.MIN_VALUE;  // No Compile Type Error as Float Contains Decimal Value & Float is smaller than Double
        long floatByteValueViaLong = Float.BYTES; // No Compile Time Error Float.BYTES Returns Non-Decimal Value
        long floatSizeValueViaLong = Float.SIZE;  // No Compile Time Error Float.SIZE Returns Non-Decimal Value

        // In the Case of Long Min & Max Value only Long is applicable
        // // byte, short, int, long, can be used only for Bytes and Size as those values are smaller

         long longMaxValueViaLong=Long.MAX_VALUE;
        long longMinValueViaLong =Long.MIN_VALUE;
        // int longMaxValueViaInt =Long.MAX_VALUE;  // Compile Time Error As Integer is smaller than long & Cant store Max Value of Long when int return type is Provided.
        //int longMinValueViaInt =Long.MIN_VALUE; // Compile Time Error As Integer is smaller than long & Cant store Min Value of Long when int return type is Provided.
        int longByteValueViaInt = Long.BYTES;  // No Compile Time as int can store small values of long very easily.
        int longSizeValueViaInt = Long.SIZE;


         double byteMaxValueViaDouble =Integer.MAX_VALUE;  // Compile Time Error As Integer is smaller than long & Cant store Max Value of Long when int return type is Provided.
        double byteMinValueViaDouble =Byte.MIN_VALUE; // Compile Time Error As Integer is smaller than long & Cant store Min Value of Long when int return type is Provided.
        int byteByteValueViaDouble = Byte.BYTES;  // No Compile Time as int can store small values of long very easily.
        int byteSizeValueViaDouble = Byte.SIZE;



//        float DoubleMaxValueViaFloat =Double.MAX_VALUE;  // Compile Time Error As float is smaller than double & Cant store Max Value of Double when float return type is Provided.
//        float DoubleMinValueViaFloat =Double.MIN_VALUE; // Compile Time Error As float is smaller than double &Cant store Min Value of Double when float return type is Provided.
        float DoubleByteValueViaFloat = Double.BYTES;  // No Compile Time as float can store value of double byte as the value is smaller
        float DoubleSizeValueViaFloat = Double.SIZE; // No Compile Time as float can store value of double size as the value is smaller

    }
}
