package com.thomasmullins.Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class internetSpeeds {
    public static void main(String[] args) {
        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;

        for (int hour = 0; hour < totalHours; hour++){
            double speed = positiveDoubleInput("Enter internet speed for hour "+hour);
            speeds.add(speed);
        }
        while (speeds.contains(0.0)){
            speeds.remove(0.0);
        }
            System.out.println(speeds);

        for (int hour = 0; hour < speeds.size(); hour++){
            double speed = speeds.get(hour);
            System.out.printf("Hour %d speed %.2f\n", hour, speed);
        }
        int zeroCount = 0;
        for (double speed : speeds){
            if (speed == 0) {
                zeroCount++;
            }
        }
    }
}

//random number
//Random r = new Random();
//int rnd = r.nextInt(10);