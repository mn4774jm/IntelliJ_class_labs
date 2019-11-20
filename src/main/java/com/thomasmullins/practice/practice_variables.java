package com.thomasmullins.practice;

public class practice_variables {
    public static void main(String[] args) {
        int intNumber = 6;
        System.out.println(intNumber);
        double doubleNumber = 6.1234;
        System.out.println(doubleNumber);
        String school = "MCTC";
        System.out.println(school);
        int newIntNumber = intNumber+10;
        System.out.println(newIntNumber);
        int size = 12;
        size = 24;
        System.out.println(size);
        double multiNumber = doubleNumber*100;
        System.out.println(multiNumber);
        int length = 100;
        length = length -10;
        System.out.println(length);
        int divided = length/2;
        System.out.println("Length devided by 2 is "+divided);
        double temp = 80;
        double convert = (temp-32)/1.8;
        System.out.printf("%.2f degree celcius", convert);


    }
}
