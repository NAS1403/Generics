package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {
        MaxFloat maxFloat = new MaxFloat();
        System.out.println("Test case 1");
        maxFloat.maxvalue(7.8F,5.5F,6.3F);
        System.out.println("Test case 2");
        maxFloat.maxvalue(5.2F,6.3F,4.5F);
        System.out.println("Test case 3");
        maxFloat.maxvalue(5.2F,6.2F,8.6F);
    }
}