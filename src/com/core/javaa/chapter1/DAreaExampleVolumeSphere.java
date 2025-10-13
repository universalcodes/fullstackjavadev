package com.core.javaa.chapter1;

public class DAreaExampleVolumeSphere {

    public static void main(String[] args) {
        int fixConstantValue = 4/3;
        int radiusVal = 78;
        double volumeSphereResultInDouble = fixConstantValue * 3.14d * radiusVal* radiusVal* radiusVal;  // In following line precise digits up to 15.
        float volumeSphereResultInFloat = fixConstantValue * 3.14f * radiusVal * radiusVal * radiusVal; // In following line precise digits up to 7.
        System.out.println("The Result of Volume of Sphere in double as follows\t"+volumeSphereResultInDouble);
        System.out.println("The Result of Volume of Sphere in float as follows\t"+volumeSphereResultInFloat);


    }
}
