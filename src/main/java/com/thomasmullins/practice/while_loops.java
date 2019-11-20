package com.thomasmullins.practice;

import java.util.Random;

import static input.InputUtils.*;

public class while_loops {
    public static void main(String[] args) {
        /*
        Uses the random method, boolean input, and the use of if and while for validation and repeat functionality
         */
        while(true){
            boolean answer = yesNoInput("Would you like me to generate a random number? ");
            if(answer){
                int min = intInput("Enter a minimum number: ");
                int max = intInput("Enter a maximum number: ");
                while(min >= max){
                    System.out.printf("Your max number must be greater than %d.\n", min);
                    max = intInput("Please enter a new maximum value: ");
                }
                Random r = new Random();
                int random = r.nextInt((max-min)+1)+min;
                System.out.println(random);
            }else{
                System.out.println("Goodbye");
                break;
            }
        }
    }
}
