package methods_Design_Process;

import static input.InputUtils.intInput;

public class credits {
    public static void main(String[] args) {
        int current_credits = intInput("How many credits do you have? ");
        int required = intInput("How many credits does your program require? ");
        int remaining = creditsLeft(current_credits, required);
        System.out.println("You have "+ remaining+" credits left to graduate");

    }

    public static int creditsLeft(int current_credits, int required) {
        return required-current_credits;
    }
}
