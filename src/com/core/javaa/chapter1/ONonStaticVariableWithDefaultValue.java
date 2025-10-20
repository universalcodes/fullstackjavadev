package com.core.javaa.chapter1;

public class ONonStaticVariableWithDefaultValue {
         byte byteDefaultValue;  // As following datatype doesn't have value so it will returns default Value 0
     //byte byteDefaultValue;  // Compile-time error if accessed from static context without an instance
         short shortDefaultValue; // As following datatype doesn't have value so it will returns default Value 0
         int intDefaultValue;  // As following datatype doesn't have value so it will returns default Value 0
         long longDefaultValue;  // As following datatype doesn't have value so it will returns default Value 0
         float floatDefaultValue; // As following datatype doesn't have value so it will returns default Value 0.0
         double doubleDefaultValue; // As following datatype doesn't have value so it will returns default Value 0.0
         char charDefaultValue; // As following datatype doesn't have value so it will returns default Value space is not visible.
         int charDefaultValueViaInt; // As following datatype doesn't have value so it will returns default Value \u0000 is not visible.
         boolean booleanDefaultValue; // As following datatype doesn't have value so it will returns default Value false
         String stringDefaultValue; // As following datatype doesn't have value so it will returns default Value null
         int arrayDefaultValue[]; // As following datatype doesn't have value so it will returns default Value null
     //   Note : - array default value depends on the datatype. for example lets we are using
    //  static String a[] then default value will be null/
         Object objectDefaultValue; // As following datatype doesn't have value so it will returns default Value null


    public static void main(String[] args) {

        /*
        Points to remember
        1. Non-Static Variable means we need to use within class.
        2. Non-Static object creation is required, we can't access directly. To create class based objects new is used.
        3. Non-Static variable can also return default value if we are storing any value within the datatype.
        4. We can use non-static variable as local variable where the scope of variable within the methods.
        5. Non-Static variable is also called as class level global variable.
        6. Non-Static Variable cant be reinitialized, but it can be reinitialized when it turns into local Variable.
        7. Non-Static Variable are Stores based on heap-level data like non-static variables, non-static methods, constants
        8. Non-Static Variable can be accessed through ClassName (Reference Variable).nonstatic variable  lets say
            In local variable there is one variable byteDefaultValue which is used in  method
            same variable is used in class level variable byteDefaultValue
           to differentiate that ClassName (Reference Variable).nonstatic variable. is used
           Another lets say one non-static variable with same name used in different class then className Reference Variable.nonstatic Variable is used
           for example -  one class lets say ClassOne has one variable called as  int number = 56;
            & Another class ClassTwo has same variable called as  int number = 56;
            then it will be used as
            ClassOne obj1 = new ClassOne()
              obj1.nonstatic variable
            ClassTwo obj2 = new ClassTwo()
              obj2.nonstatic variable
              & ClassTwo.number
         9. we can crate n of objects. To Access the one or more non-static variable we can use one object
            or more objects
         */

        //System.out.println(byteDefaultValue);  // Compile Time Error as we cant access the non-static variable directly.
/*
        Following code ONonStaticVariableWithDefaultValue accessNonStatic = new ONonStaticVariableWithDefaultValue();
        here is the explanation
        ONonStaticVariableWithDefaultValue is class Name
        accessNonStatic is classLevel Reference Variable
        new is pre-defined keyword which helps to create object
        ONonStaticVariableWithDefaultValue() is the default constructor which helps to invoke class level objects
*/

        ONonStaticVariableWithDefaultValue accessNonStatic = new ONonStaticVariableWithDefaultValue();
        System.out.println(accessNonStatic.byteDefaultValue); //here we have called the nonstatic variable with of dot(.), this is also called as dot operator
        System.out.println(accessNonStatic.intDefaultValue);
        System.out.println(accessNonStatic.shortDefaultValue);
        System.out.println(accessNonStatic.longDefaultValue);
        System.out.println(accessNonStatic.doubleDefaultValue);
        System.out.println(accessNonStatic.floatDefaultValue);
        System.out.println(accessNonStatic.charDefaultValue);
        System.out.println(accessNonStatic.booleanDefaultValue);
        System.out.println(accessNonStatic.stringDefaultValue);
        System.out.println(accessNonStatic.objectDefaultValue);
        System.out.println(accessNonStatic.arrayDefaultValue);
        accessNonStatic.charDefaultValue = 'Y'; // Here the charDefaultValue variable is turns into local variable & it becomes now local variable and value is reinitialized.
        System.out.println(accessNonStatic.charDefaultValue);
        System.out.println(accessNonStatic.charDefaultValueViaInt); // To See the Default value in integer format.
        //there is one variable byteDefaultValue which is used in  method also same variable is used in class level variable byteDefaultValue to differentiate that className.RefVariable.non-static variable is used
         byte byteDefaultValue =78;
        System.out.println(byteDefaultValue);
        System.out.println(accessNonStatic.byteDefaultValue);
    }
}
