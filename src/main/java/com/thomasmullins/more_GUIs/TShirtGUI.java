package com.thomasmullins.more_GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//extend JFrame
public class TShirtGUI  extends JFrame{
    private JPanel mainPanel;
    private JComboBox sizeComboBox;
    private JLabel selectedSizeLabel;
    private JComboBox<String> colorComboBox; //Generic type; Can only add strings.
    private JLabel selectedColorLabel;


    TShirtGUI() {
        //Create constructor

        //add objects to JComboBox
        //OK to add items directly but, if items may change or are created dynamically, or from a database
        //it will be better to use a jcombobox model to provide the items
        sizeComboBox.addItem("Small");
        sizeComboBox.addItem("Medium");
        sizeComboBox.addItem("Large");

        //Set up comboBoxModel in constructor
        //initialize using an array of strings
        //Can also use a vector list of data
        //Example benefits of using the comboboxmodel on slide 21 of moreGUIs
        String[] colors = {"Red", "Purple", "Green"};
        //Pulls items from list for use in the model
        DefaultComboBoxModel<String> colorModel = new DefaultComboBoxModel<>(colors);
        //sets up the combobox
        colorComboBox.setModel(colorModel);

        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300, 150));
        pack();
        setVisible(true);
        //code that tells the program not to close java altogether
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //added action listener for sizecomboBox
        sizeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set text to label using value from combobox
                //when saving object data to a variable you need to cast the correct type (String)
                String selectedSize = (String) sizeComboBox.getSelectedItem();
                selectedSizeLabel.setText("You selected " +selectedSize);
//                //This also works
//                selectedSizeLabel.setText("You selected " +sizeComboBox.getSelectedItem());
            }
        });
        //action listener for colorcombobox
        //lambda version that runs the same ways as the standard action listener used in the size combobox
        colorComboBox.addActionListener(event -> {
            selectedColorLabel.setText("You selected " + colorComboBox.getSelectedItem());

        });
    }
}
