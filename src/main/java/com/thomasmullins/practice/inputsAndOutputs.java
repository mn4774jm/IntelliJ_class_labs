package com.thomasmullins.practice;

import java.util.Scanner;

import static input.InputUtils.*;

public class inputsAndOutputs {
    public static void main(String[] args) {
        String userName = stringInput("What is your name? ");
        int numbStudents = positiveIntInput("How many students are in your class? ");
        int numRooms = positiveIntInput("How many rooms are in your home? ");
        double temp = positiveDoubleInput("What is the temperature outside, today? ");
        double change = positiveDoubleInput("In your pocket, how much money do you have in change? ");

//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input

//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter name, age and salary");
//
//        // String input
//        String name = myObj.nextLine();
//
        //Could these have been used by the crates lab?
//        // Numerical input
//        int age = myObj.nextInt();
//        double salary = myObj.nextDouble();
//
//        // Output input by user
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
    }
}
