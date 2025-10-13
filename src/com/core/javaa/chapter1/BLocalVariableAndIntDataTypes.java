package com.core.javaa.chapter1;
public class BLocalVariableAndIntDataTypes {

    public static void main(String[] args) {
        System.out.println("Variables are used to store values based on their data type.");
        System.out.println("There are Three types of Variables.\n 1. Local Variables 2. Static Variable 3. Non Static Variable");
        System.out.println("In This Class we are discussing only local Variable");
        System.out.println("Local variable are used in method block which starts {}");
        System.out.println("Local Variable must be Initialize some value");
        System.out.println("To use Variable we should be aware of DataTypes");
        System.out.println("DataType is used to identify the value stored in variable\n for example - int a = 67;\t In this Example Integer Value is Stored");
        System.out.println("To use Variable we need to declare and Initialization the Variable");
        /*
        There are some rules to use Java Variables
        1. Variable name should be unique means duplicate variable is not allowed.
        for example int a = 67; int a = 78; this is not acceptable it displays compile time error even though values are different.
        2. Variable name should not contain predefined Java keyword
         for example - int package = 45; int int = 45; not acceptable.
        3. Variable declaration can be starts from alphabetic, $, _ special Characters can be used even though space is also not allowed between Variables
         other Special Character not allowed, Variable cant starts from numeric Value
         for example int a = 56;  -- Allowed
         int _a = 345; int $test = 234; -- Allowed
         int store Value = 345; int a! = 234; int a@ = 234; int a# = 234; int a% = 234; int a^ = 234; int a& = 234; int a* = 234; int a( = 234; int a) = 234; int a[ = 234; int a] = 234; int a\ = 234; int a: = 234 int a> = 234; int a< = 234; int a, = 234; int a; = 234; int a' = 234; int a" = 234; -- Not Allowed Compile Time Error
          int 1storeValue = 78;
       4.In case of multi words camel case is Applicable
       for example -  int storeSomeValue = 890;
       5. Variable can be ReInitialized where previous value can be replaced or Modified
         */


        int a;  // Here we declared the variable with int datatype but not stored any value.
        int b; // Here we declared the variable with int datatype but not stored any value.
        System.out.println("we can declare multiple variables in same line");
        int c, d, e, f; // In following line we have declared 4 variables.

        int a1 = 78;  // In following Code we have declared/store some value in int datatype.
        int b1 = 78;  // In following Code we have declared/store some value in int datatype.
        System.out.println("we can Initialize multiple variables in same line as well");
       // int b3, c3, d3 = 34;  // In following Example 3 Variables we are trying to store same value. Only d3 is initialized here; b3 and c3 remain uninitialized.
         int b3=89, c3=67, d3 = 34;  // In following Example, we need to Initialize the value of each variable
        System.out.println(b3+"\n"+c3+"\n"+d3);
        int storeSomeValue = 890;  //  -- In following line Variable has multiple words so camel Case Applied storeSomeValue--
        System.out.println(storeSomeValue);
        int _value = 8900;  // Variable Naming Convention can be start from _ for example - _value
        System.out.println(_value);
        int $value = 8190; // Variable Naming Convention can be start from $ for example - $value
        System.out.println($value);
//        int 1storeValue = 78;  // Not Allowed Variable Naming Convention cant be
//        System.out.println(1storeValue);   Compile Time Error
        int storeNewValue = 788;
        System.out.println(storeNewValue);
        storeNewValue = 233;  // In following line - storeNewValue is ReInitialized where previous value has been replaced.
        System.out.println(storeNewValue);










    }
}
