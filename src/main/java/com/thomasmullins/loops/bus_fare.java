package com.thomasmullins.loops;
import java.util.Arrays;

import static input.InputUtils.*;

public class bus_fare {
    public static void main(String[] args) {


        double total =0;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        double[] farePerDay = new double[days.length];
        for(int day = 0; day < days.length; day++){
            String dayOfWeek = days[day];
            double day_expense = positiveDoubleInput("On "+dayOfWeek+", what did you spend on fare? ");
            farePerDay[day] = day_expense;
            total += day_expense;
        }
        System.out.println("All of the fares for the week are: "+ Arrays.toString(farePerDay));
        System.out.println("For the week, you spent $"+total+" on bus fare.");
    }
}
