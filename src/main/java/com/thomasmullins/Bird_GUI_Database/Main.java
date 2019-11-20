package com.thomasmullins.Bird_GUI_Database;

public class Main {
    public static void main(String[] args) {
        BirdDatabase db = new BirdDatabase();
        BirdGUI gui = new BirdGUI(db);
    }
}
