package methods_Design_Process;

import static input.InputUtils.stringInput;

public class Hellomethod {

    public static void main(String[] args) {

        String name = stringInput("Please enter your name: ");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }

    public static String makeGreeting(String n) {

        String greeting = "Hello "+n+"!";
        return greeting;
    }
}
