package com.thomasmullins.practice;

import java.util.Random;

import static input.InputUtils.intInput;


public class randomNumberGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        Random r = new Random();
        int random = r.nextInt((max - min) + 1) + min;
        int userGuess = intInput("Guess a number between 1 and 10: ");

            while (true) {
                if (userGuess > random) {
                    userGuess = intInput("Too high, try again:");
                } else if (userGuess < random) {
                    userGuess = intInput("Too low, try again: ");
                } else {
                    System.out.println("Correct! The random number was " + random);
                    break;
                }
            }

            }
        }




