package com.core.javaa.chapter1;

public class NStaticVariableWithDefaultValue {
        static byte byteDefaultValue;  // As following datatype doesn't have value so it will returns default Value 0
     //byte byteDefaultValue;  // Compile-time error if accessed from static context without an instance
        static short shortDefaultValue; // As following datatype doesn't have value so it will returns default Value 0
        static int intDefaultValue;  // As following datatype doesn't have value so it will returns default Value 0
        static long longDefaultValue;  // As following datatype doesn't have value so it will returns default Value 0
        static float floatDefaultValue; // As following datatype doesn't have value so it will returns default Value 0.0
        static double doubleDefaultValue; // As following datatype doesn't have value so it will returns default Value 0.0
        static char charDefaultValue; // As following datatype doesn't have value so it will returns default Value space is not visible.
        static int charDefaultValueViaInt; // As following datatype doesn't have value so it will returns default Value \u0000 is not visible.
        static boolean booleanDefaultValue; // As following datatype doesn't have value so it will returns default Value false
        static String stringDefaultValue; // As following datatype doesn't have value so it will returns default Value null
        static int arrayDefaultValue[]; // As following datatype doesn't have value so it will returns default Value null
     //   Note : - array default value depends on the datatype. for example lets we are using
    //  static String a[] then default value will be null/
        static Object objectDefaultValue; // As following datatype doesn't have value so it will returns default Value null


    public static void main(String[] args) {

        /*
        Points to remember
        1. Static Variable means we need to use within class.
        2. There is no object is required, we can access directly.
        3. Static variable can also return default value if we are storing any value within the datatype.
        4. We can use static variable as local variable where the scope of variable within the methods.
        5. Static variable is also called as class level global variable.
        6. Static Variable cant be reinitialized, but it can be reinitialized when it turns into local Variable.
        7. Static Variable are Stores based on class-level data like static variables, static methods, constants
        8. Static Variable can be accessed through ClassName.Variable cause lets say In local variable there is one variable
           byteDefaultValue which is used in  method also same variable is used in class level variable byteDefaultValue
           to differentiate that className.Variable is used
           Another lets say one static variable with same name used in different class then className.Variable is used
           for example -  one class lets say ClassOne has one variable called as static int number = 56;
            & Another class ClassTwo has same variable called as static int number = 56;
            then it will be used as ClassOne.number  & ClassTwo.number.
         */

        System.out.println(byteDefaultValue);
        System.out.println(intDefaultValue);
        System.out.println(shortDefaultValue);
        System.out.println(longDefaultValue);
        System.out.println(doubleDefaultValue);
        System.out.println(floatDefaultValue);
        System.out.println(charDefaultValue);
        System.out.println(booleanDefaultValue);
        System.out.println(stringDefaultValue);
        System.out.println(objectDefaultValue);
        System.out.println(arrayDefaultValue);
        charDefaultValue = 'Y'; // Here the charDefaultValue variable is turns into local variable & it becomes now local variable
        System.out.println(charDefaultValue);
        System.out.println(charDefaultValueViaInt);
        //there is one variable byteDefaultValue which is used in  method also same variable is used in class level variable byteDefaultValue to differentiate that className.Variable is used
       byte byteDefaultValue =78;
        System.out.println(byteDefaultValue);
        System.out.println(NStaticVariableWithDefaultValue.byteDefaultValue);
    }
}
