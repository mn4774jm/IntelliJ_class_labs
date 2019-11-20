package com.thomasmullins.Lists;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    //main method created
    public static void main(String[] args) {

        //Create a new list to contain strings
        //could replace "ArrayList" with "LinkedList"
        //Linked list has to count proceduraly doesn't jump
        //faster than ArrayList
        List<String> arrayList = new ArrayList<>();

        //add data to the list
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Tom");
        arrayList.add("MCTC");

        //loop over list. For each string print
        arrayList.add(2, "palm"); //adds to the second position
        //index in list
        for (String s: arrayList) {
            //to uppercase
            System.out.println(s.toUpperCase());;
            System.out.println(s);

        }
        System.out.println("The word in position 1 is "+arrayList.get(1));//gets index and prints "World"
        arrayList.remove("Hello");//removes hello
        arrayList.remove(1);//removes world
        System.out.println(arrayList);
        if (arrayList.contains("Tom")){//checks to see if list contains an item
            System.out.println("This list contains the word Tom");
        }
        int numberOfStrings = arrayList.size();//checks size of list
        System.out.println(numberOfStrings);
        //Check to see if values exists
        //returns true or false
        System.out.println(arrayList.contains("Kittens"));
        System.out.println(arrayList.contains("Tom"));
        //replace an item
        arrayList.set(0, "Hello World");
        System.out.println(arrayList);

    }

}
