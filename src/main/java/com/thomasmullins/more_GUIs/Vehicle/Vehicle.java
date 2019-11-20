package com.thomasmullins.more_GUIs.Vehicle;

public class Vehicle {

    private String name;
    private String make;
    private String model;
    private boolean electric;

    public Vehicle(String name, String make, String model, boolean electric) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.electric = electric;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
    //create human-readable string using the fields in the vehicle class
    //this string will be displayed in the JList
    //this will be pulled automatically when the elements are added to the model
    public String toString() {
        String electricString = electric ? "Electric" : "Gasoline";
        return String.format("%s: %s %s. %s", name, make, model, electricString);
    }

}
