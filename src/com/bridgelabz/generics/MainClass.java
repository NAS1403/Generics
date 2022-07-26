package com.bridgelabz.generics;

import java.util.ArrayList;

public class MainClass {
    public static <T> void main(String[] args) {
        Integer[] intArray = {5,7,6,8};
        Float[] floatArray = {5.3F,9.2F,3.4F,8.6F};
        String[] stringArray = {"Abhi","Sagar","Shreyas","Megha"};
        MaxValue<Integer> maxValue = new MaxValue<>(intArray);
        maxValue.testMaximum();
        MaxValue<Float> maxValue1 = new MaxValue<>(floatArray);
        maxValue1.testMaximum();
        MaxValue<String> maxValue2 = new MaxValue<>(stringArray);
        maxValue2.testMaximum();
    }
}
