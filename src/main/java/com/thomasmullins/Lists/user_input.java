package com.thomasmullins.Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class user_input {
    public static void main(String[] args) {
        List<String> todolist = new ArrayList<>();

        while(true){
            String data = stringInput("Please type a task you need to complete, or press enter to quit: ");
            while (todolist.contains(data)){
                System.out.println("Your list already contains the item "+ data);
                data = stringInput("Please enter a new item, or press enter to quit: ");

            }
            if (data.length() == 0) { // if user presses enter, the length of text is 0
                break;
            }
            todolist.add(data);
        }

        System.out.println("Thank you. Here is what you entered.");
        for (String input : todolist) {
            int numberOfItems = todolist.size();
            System.out.println("Your To-DO list contains "+numberOfItems);
            System.out.println(input);
        }
    }
}
