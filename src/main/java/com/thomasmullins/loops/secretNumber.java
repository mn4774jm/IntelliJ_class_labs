package com.thomasmullins.loops;

import static input.InputUtils.intInput;
import java.util.Random;

public class secretNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10);


        int user_input = intInput("Guess a number between 1 and 10");
        while (user_input != randomNumber) {

            if (user_input > randomNumber) {
                System.out.println("The secret number is higher than " + user_input + ". Try again!");
                user_input = intInput("Guess a number between 1 and 10");

            } else if (user_input < randomNumber) {
                System.out.println("The secret number is lower than " + user_input + ". Try again!");
                user_input = intInput("Guess a number between 1 and 10");
            }
            System.out.println("Congratulations! The correct number is " + randomNumber + ".");
        }
    }
}
