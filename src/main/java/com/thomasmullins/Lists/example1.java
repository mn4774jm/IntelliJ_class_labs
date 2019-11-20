package com.thomasmullins.Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class example1 {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Enter item:");
            if (data.length() == 0) {
                break;
            }
            if (containsIgnoreCase(todoList, data)) {
                System.out.println("You already entered that");
            } else {
                todoList.add(data);
            }
        }

        System.out.println("Here's all your tasks");
        for (String task : todoList) {
            System.out.println(task);
        }
    }

    private static boolean containsIgnoreCase(List<String> todoList, String data) {
        for (String s : todoList) {
            if (s.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;  // if get to end of list without returning, it's not there
    }
}


