package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        System.out.println("Integer Test case 1");
        maxValue.maxvalue(5,4,3);
        System.out.println("Integer Test case 2");
        maxValue.maxvalue(5,6,3);
        System.out.println("Integer Test case 3");
        maxValue.maxvalue(5,4,7);
        System.out.println("Float Test case 1");
        maxValue.maxvalue(5.2F,4.3F,3.2F);
        System.out.println("Float Test case 2");
        maxValue.maxvalue(5.2F,6.3F,3.2F);
        System.out.println("Float Test case 3");
        maxValue.maxvalue(5.2F,4.3F,7.2F);
        System.out.println("String Test case 1");
        maxValue.maxvalue("Peach","Apple","Banana");
        System.out.println("String Test case 2");
        maxValue.maxvalue("Apple","Zach","Banana");
        System.out.println("String Test case 3");
        maxValue.maxvalue("Apple","Banana","Class");
    }
}
