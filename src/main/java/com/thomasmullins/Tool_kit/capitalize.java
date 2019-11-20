package com.thomasmullins.Tool_kit;

import static input.InputUtils.positiveDoubleInput;
import static input.InputUtils.stringInput;

public class capitalize {
    public static void main(String[] args) {

        String userMonth = stringInput("Enter new month");
        double userSnow = positiveDoubleInput("Enter snowfall for " + userMonth);
        String normalizedNewMonth = normalizeMonth(userMonth);

    }

        private static String normalizeMonth(String userMonth) {
        //ensure that pointer exception isn't thrown
        if (userMonth == null) {
            return "";}
        if (userMonth.length() == 0){
            return userMonth;}

//            System.out.println(userMonth);
//            String monthInLower = userMonth.toLowerCase();
//            String monthInUpper = userMonth.toUpperCase();
            String firstLetter = userMonth.substring(0, 1).toUpperCase();
            String restOfMonth = userMonth.substring(1);
            String Normalized = firstLetter + restOfMonth;
            return Normalized;

        }
    }

