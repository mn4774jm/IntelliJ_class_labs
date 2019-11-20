package com.thomasmullins.loops;

import java.util.Arrays;

import static input.InputUtils.positiveDoubleInput;

public class yearly_bill {
    public static void main(String[] args) {


        double total = 0;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        double[] costPerMonth = new double[months.length];
        for (int x = 0; x < months.length; x++) {
            String monthOfYear = months[x];
            double month_cost = positiveDoubleInput("What did you spend in " + monthOfYear + "? ");
            costPerMonth[x] = month_cost;
            total += month_cost;
        }
        System.out.printf("%-10s %-13s\n", "Month", "Bill, in $");
        for (int x = 0; x < 12; x++) {
            System.out.printf("%-10s %7.2f\n", months[x], costPerMonth[x]);
        }{double average = total / 12;
            System.out.printf("%s %.2f", "Average monthly cost: $",average);
        }
    }
}
