package com.thomasmullins.objects_classes.swimming;

public class Pool {
    //field variables
    //private makes the objects only available to this method
    //Where variables are created
    private String name;
    private double length;
    private double depth;
    private boolean isInside;

    //constructor; requirements for argument
    Pool(String name, double length, double depth, boolean isInside) {
        this.name = name;
        this.length = length;
        this.depth = depth;
        this.isInside = isInside;
    }
    //instance method
    public double distanceForLaps(int laps) {
        return laps * length;
    }

    public boolean canSwimInWinter(){

        return isInside;
    }
    //instance method
    @Override // an annotation. Double checks that we are using the correct method name
    public String toString(){
//        String insideString = "inside";
//        if(!isInside){
//            insideString = "outside";
//        }
        String insideString = isInside ? "inside" : "outside"; // ternary operator
        return name + " Pool is " + length + " meters long and is "+depth+ " meters deep. This pool is "+insideString+".";
    }
}
