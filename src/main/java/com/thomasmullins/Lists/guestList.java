package com.thomasmullins.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.stringInput;
import static input.InputUtils.yesNoInput;

public class guestList {
    public static void main(String[] args) {
        List<String> guestsList = new ArrayList<>();

        while (true) {
            String guest = stringInput("Enter new guest name, or press enter to finish: ").toUpperCase();
            while (guestsList.contains(guest)) {
                System.out.println(guest + " has already been invited");
                guest = stringInput("Please enter a new guest, or press enter to quit: ");
            }
            if (guest.length() == 0) { // if user presses enter, the length of text is 0
                break;
            }
            guestsList.add(guest);
        }


            int numberOfItems = guestsList.size();
            System.out.println("Your guest list currently contains " + numberOfItems + " attendees");
            Collections.sort(guestsList);
            System.out.println(guestsList);

            boolean answer = yesNoInput("Would you like to remove any guests? Enter Y or N");
            if (answer) {
                while (true) {
                    String nixed = stringInput("Enter guest name, or press enter when finished: ").toUpperCase();
                    while (guestsList.contains(nixed)) {
                        System.out.println(nixed + " will be removed");
                        guestsList.remove(nixed);

                    }
                    if (nixed.length() == 0) { // if user presses enter, the length of text is 0
                        numberOfItems = guestsList.size();
                        System.out.println("Your guest list currently contains " + numberOfItems + " attendees");
                        break;
                    }
                    guestsList.remove(nixed);
                }
                int finalNumber = guestsList.size();
                System.out.println("Here is your finalized guest list\n"+guestsList+"\nYou have invited "+finalNumber+" guests");
            }
        }
    }
