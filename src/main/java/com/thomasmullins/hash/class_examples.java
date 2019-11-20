package com.thomasmullins.hash;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class class_examples {
    public static void main(String[] args) {

        //Map<Key, Value> name of hashmap
        Map<String, Double> snowfall = new HashMap<>();
        //month is key, double is value

        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

//        //hasmap is unordered, much like dictionaries
//        System.out.println(snowfall);
//
//        //using a key again will overwrite original
//        snowfall.put("January", 6.0);
//        System.out.println(snowfall);
//
//        //call value with key using .get
//        System.out.println("The value for the key January is: " + snowfall.get("January"));
//
//        //null will be reported if the key value is not in the Hashmap
//        System.out.println("The value for the key January is: " + snowfall.get("1999"));

        ///////////Loops and hashmaps//////////////////////////////////
        //initialize counter
        double total = 0;
        //loop through months in
        for (String month : snowfall.keySet()) {
            System.out.println(month + " Snowfall total =" + snowfall.get(month));
        }
        //get total using for each loop
        for (double snow : snowfall.values()) {
            total += snow;
        }
        System.out.printf("The total sum of snowfall is %f inches", total);

        String userMonth = stringInput("Enter new month");
        double userSnow = positiveDoubleInput("Enter snowfall for " + userMonth);
        String normalizedNewMonth = normalizeMonth(userMonth);
        if (snowfall.containsKey(normalizedNewMonth)) {
            System.out.println("Key already exists.");
            boolean overwrite = yesNoInput("Overwrite data?");
                if (overwrite) {
                    snowfall.put(normalizedNewMonth, userSnow);
                }else{
                    System.out.println("Data was not overwritten.");
                }
            }

        System.out.println(snowfall);

    }

    private static String normalizeMonth(String userMonth) {
        System.out.println(userMonth);
        String monthInLower = userMonth.toLowerCase();
        String monthInUpper = userMonth.toUpperCase();
        String firstLetter = userMonth.substring(0, 1).toUpperCase();
        String restOfMonth = userMonth.substring(1);
        String Normalized = firstLetter + restOfMonth;
        return Normalized;

    }
}

