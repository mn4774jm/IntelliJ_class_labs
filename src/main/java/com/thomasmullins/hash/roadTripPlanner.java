package com.thomasmullins.hash;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.positiveDoubleInput;
import static input.InputUtils.positiveIntInput;

public class roadTripPlanner {
    public static void main(String[] args) {
        Map<String, Integer> distances = new HashMap<>();

        distances.put("Chicago", 408);
        distances.put("Miami", 1789);
        distances.put("Denver", 913);
        distances.put("Duluth", 154);
        distances.put("Brainerd", 127);
        distances.put("Stillwater", 26);
        distances.put("Ely", 245);
        distances.put("Red Wing", 54);

        int maxDistance = positiveIntInput("Enter the maximum distance you are willing to travel:\n");
        for (String city : distances.keySet()){
        }
        for (String city : distances.keySet()){
//            System.out.println(disTraveled);
//            if (disTraveled <= maxDistance){
//                System.out.println(distances.get());
//            }
            System.out.println(city);
            System.out.println(distances.get(city));
        }

    }
}
