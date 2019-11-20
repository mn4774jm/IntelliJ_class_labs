package com.thomasmullins.practice;

import java.sql.SQLOutput;

import static input.InputUtils.*;

public class math {
    public static void main(String[] args) {
//        int songLength = 60*3;
//        System.out.printf("There are %d seconds in three minutes.\n", songLength);
//        int dayLength = 60*60*24;
//        System.out.printf("There are %d seconds in one day\n", dayLength);
//        double side = positiveDoubleInput("Enter the side of a square in inches: ");
//        double area = side*side;
//        System.out.printf("The are a of your square is %.2f inches\n", area);
//        double  KM = positiveDoubleInput("Enter a distance in KM to convert to Miles: ");
//        double toMiles = KM / 1.6;
//        System.out.printf("%.2f Kilometers is equal to %.2f Miles.\n",KM, toMiles);
//        double tax = 1.50/1.05;
//        double pretax = 1.5 - tax;
//        System.out.printf("The original price of the item was $%.2f.\n",tax);
//        int userNum = positiveIntInput("Please enter a positive whole number: ");
//        if(userNum %2 == 0){
//            System.out.println("The number you have chosen is even.\n");
//        }else{
//            System.out.println("Your number is odd.\n");
//        }
        int user = positiveIntInput("Enter a whole number: ");

        System.out.printf("The remainder of %d divided by 10 is ",user);
        System.out.println(user % 10);

    }
}
