package com.thomasmullins.loops;

import static input.InputUtils.*;
public class password {
    public static void main(String[] args) {
        String secret_password = "Kittens";
        String user_password = stringInput("Enter the password: ");

        while ( ! user_password.equals(secret_password)){
            System.out.println("Access Denied");
            System.out.println("Try again");
            user_password = stringInput("Enter the password: ");
        }
        System.out.println("Correct, access granted!");
    }
}
