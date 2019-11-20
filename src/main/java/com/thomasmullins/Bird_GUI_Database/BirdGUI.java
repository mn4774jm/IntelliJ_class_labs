package com.thomasmullins.Bird_GUI_Database;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class BirdGUI extends JFrame{
    private JPanel mainPanel;
    private JTable birdDataTable;

    private BirdDatabase db;

    BirdGUI(BirdDatabase db) {

        this.db = db;

        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setTitle("Bird Database Application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        configureTable();

    }

    private void configureTable() {

        Vector columnNames = db.getColumnNames();
        Vector<Vector> data = db.getAllBirds();

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        birdDataTable.setModel(tableModel);

    }
}
