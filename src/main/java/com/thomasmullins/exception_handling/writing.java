package com.thomasmullins.exception_handling;
//Required imports for reading, writing, and exceptions
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writing {
    public static void main(String[] args) throws IOException {
        //if file does not exist, filewriter will create it. If the file does exist, it will be overwritten.
        //if you don't want to overwrite an append flag is required
        FileWriter writer = new FileWriter("Hello.txt");

        //wraps filewriter and does input/output in the background
        BufferedWriter bufWriter = new BufferedWriter(writer);
        // wwrite some strings
        bufWriter.write("Hello\n");
        bufWriter.write("Data Here\n");
        bufWriter.write("Goodbye\n");

        //Always close the file you are working on when finished
        bufWriter.close();

        //to access again a new writer and bufferedwriter needs to be created
        //Accesses Hello.txt again; will overwrite since it already exists
        writer = new FileWriter("Hello.txt");
        //create a new bufwriter
        bufWriter = new BufferedWriter(writer);

        //this will overwrite the orginal data
        bufWriter.write("This data\n");
        bufWriter.write("overwrites the first set of data\n");

        //close the buffered file and wrapping
        bufWriter.close();
    }
}
