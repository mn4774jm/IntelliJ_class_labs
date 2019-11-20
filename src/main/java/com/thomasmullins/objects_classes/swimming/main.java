package com.thomasmullins.objects_classes.swimming;

import static input.InputUtils.*;

public class main {
    public static void main(String[] args) {
        String name = stringInput("Name of pool? ");
        double newLength = doubleInput("What is the length of the pool? ");
        double newDepth = doubleInput("How deep is it?");
        boolean newInside = yesNoInput("Is the pool in-doors? ");
        Pool userGen = new Pool(name, newLength, newDepth, newInside);
        System.out.println(userGen);
        System.out.println("Can swim in winter? " + userGen.canSwimInWinter());
//        Pool ymca = new Pool("YMCA Minneapolis", 50, 8,true );
//        Pool como = new Pool("Como", 20,6, false);
//        Pool edina = new Pool("Edina", 75, 10, true);
//
//        double totalDistance = como.distanceForLaps(5);
//        System.out.println(totalDistance);
//        double edinaLaps = edina.distanceForLaps(12);
//        System.out.println(edinaLaps);
//
//        System.out.println(ymca);
//        System.out.println(edina);
    }
}
