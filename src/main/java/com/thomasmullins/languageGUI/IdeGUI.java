package com.thomasmullins.languageGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Map;
import java.util.Vector;

public class IdeGUI extends JFrame {
    private JPanel containsTable;
    private JTable ideTable;
    private JButton addButton;
    private JTextField newIde;
    private JTextField newLanguage;
    private JButton reportButton;

    IdeGUI(Map<String, String> languages) {

        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("Language");
        tableModel.addColumn("IDE");

        // Add the initial data to the JTable DefaultTableModel
        for (String language : languages.keySet()) {
            //loop through keys to get values for languages
            tableModel.addRow(new String[]{language, languages.get(language)});
        }
            ideTable.setModel(tableModel);
            // Sort rows (Click on column headers to sort)
            ideTable.setAutoCreateRowSorter(true);

            setContentPane(containsTable);
            pack();
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            //action listener button to add new rows when the user adds them
            addButton.addActionListener(event ->{
               String language = newLanguage.getText();
               String ide = newIde.getText();
               String[] newIdeRow = { language, ide };
               tableModel.addRow(newIdeRow);
            });

            reportButton.addActionListener(event -> {
                // Vector is similar to Array but is thread safe
               for (Vector row : tableModel.getDataVector()) {
                   //must cast objects in table to specific types
                   String language = (String) row.get(0);
                   String ide = (String) row.get(1);
                   System.out.println("An IDE for " + language + " is " + ide);
               }
            });
        }
    }


