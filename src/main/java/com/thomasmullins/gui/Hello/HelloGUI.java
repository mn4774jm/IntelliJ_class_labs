package com.thomasmullins.gui.Hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    HelloGUI() {
        setPreferredSize(new Dimension(300,200));
        //centers window when program runs
        setLocationRelativeTo(null);
        //container for main frame
        setContentPane(mainPanel);
        //fit components into window
        pack();
        //makes window visible to user
        setVisible(true);
        //program closes when window is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //code goes here; whatever happens here will run when the button is clicked
                myFirstLabel.setText("Hello GUI Program");
            }
        });


    }
}
