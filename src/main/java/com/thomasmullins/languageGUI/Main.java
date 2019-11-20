package com.thomasmullins.languageGUI;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Swift", "Xcode");
        languages.put("Java", "IntelliJ");
        languages.put("Python", "Pycharm");

        IdeGUI gui = new IdeGUI(languages);
    }
}
