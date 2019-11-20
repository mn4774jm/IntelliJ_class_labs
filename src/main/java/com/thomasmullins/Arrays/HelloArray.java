package com.thomasmullins.Arrays;

import java.util.Arrays;

public class HelloArray {
    public static void main(String[] args) {
    //array of doubles
        double[] highTemps = new double[7];

        highTemps[0] = 75.5;
        highTemps[1] = 62;
        highTemps[2] = 54;
        highTemps[3] = 71.1;
        System.out.println(Arrays.toString(highTemps));

    //TODO make an array of 24 user names for Github
        String[] userNames = new String[24];
    //TODO make an array of 17 integers for for class attendance every week
        int[] attend = new int[17];
    }
}
