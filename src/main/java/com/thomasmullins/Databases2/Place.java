package com.thomasmullins.Databases2;

public class Place {
    //create new variables for name and elevation
    private String name;
    private double elevation;

    Place(String n, double e) {
        name = n;
        elevation = e;
    }
    //create get/set methods
    public String getName() { return name; }

    public void setName(String name) { this.name = name;}

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {this.elevation = elevation; }
    //generate to string
    @Override
    public String toString() { return "Place: "+ name + " is at elevation "+ elevation + " meters"; }
}
