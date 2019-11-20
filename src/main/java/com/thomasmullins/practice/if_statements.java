package com.thomasmullins.practice;

import static input.InputUtils.*;

public class if_statements {
    public static void main(String[] args) {
        int userNum = intInput("Enter a number: ");
        if(userNum < 100){
            System.out.println("Your number is less than 100");
        }else if(userNum == 100){
            System.out.println("Your number is exactly 100");
        }else{
            System.out.println("Your number is greater than 100");
        }
        boolean truth = true;
        boolean fake = false;
        String name = stringInput("What is your name? ");
        if(name.length() >= 5){
            System.out.println("Your name is at least 5 letters long.");
        }else{
            System.out.println("Your name is less than 5 letters.");
        }
        if(name.length() % 2 == 0){
            System.out.println("There are an even number of letters in your name.");
        }else{
            System.out.println("There is an odd number of letters in your name.");
        }

    }
}
