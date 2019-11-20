package methods_Design_Process;

import static input.InputUtils.intInput;

public class Counting {


    public static void main(String[] args) {

        int smallNumber = intInput("Please enter a small integer number: ");
        int largeNumber = intInput("Please enter a number larger than" + smallNumber);

        System.out.println("I will now count from "+smallNumber+" to "+ largeNumber);

        count(smallNumber, largeNumber);

    }
    public static void count(int min, int max) {

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}