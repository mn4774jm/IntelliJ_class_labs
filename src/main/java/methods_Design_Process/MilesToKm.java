package methods_Design_Process;

import static input.InputUtils.doubleInput;

public class MilesToKm {
    public static void main(String[] args) {

        double miles = doubleInput("Please enter the number of miles: ");
        double km = milesToKm(miles);
        System.out.println(miles +" miles is equal to " + km + " kilometers");
    }

    public static double milesToKm(double miles) {

        double km = miles * 1.6;
        return km;
    }
}
//TODO convert pounds to kilograms