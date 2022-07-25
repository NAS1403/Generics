package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {
        MaxInt maxInt = new MaxInt();
        System.out.println("Test case 1");
        maxInt.maxvalue(7,5,6);
        System.out.println("Test case 2");
        maxInt.maxvalue(5,6,4);
        System.out.println("Test case 3");
        maxInt.maxvalue(5,6,8);
    }
}
