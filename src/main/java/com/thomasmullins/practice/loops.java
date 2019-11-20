package com.thomasmullins.practice;

import static input.InputUtils.positiveIntInput;

public class loops {
    public static void main(String[] args) {
//        int userData = positiveIntInput("What number would you like to count to? ");
        for(int x =100; x < 200; x+=2){
            System.out.println(x+1);
        }
    }
}
