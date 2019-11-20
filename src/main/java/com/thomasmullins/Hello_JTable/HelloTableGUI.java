package com.thomasmullins.Hello_JTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class HelloTableGUI extends JFrame{
    private JPanel containsTable;
    private JTable helloTable;

    HelloTableGUI() {
        setContentPane(containsTable);

        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("Hello!");
        tableModel.addColumn("Greetings!");

        tableModel.addRow(new String []{"Hello", "Hola"});
        tableModel.addRow(new String []{"Bonjour", "ni hao"});

        helloTable.setModel(tableModel);

        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
