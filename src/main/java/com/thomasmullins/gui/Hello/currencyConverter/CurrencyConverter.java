package com.thomasmullins.gui.Hello.currencyConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CurrencyConverter extends JFrame{

    private JTextField userEntry;
    private JButton convertButton;
    private JLabel convertOutput;
    private JLabel currencyLabel;
    private JPanel mainPanel1;
    //set combobox to work with strings
    private JComboBox<String> currencyComboBox;
    private JLabel convertTo;


    private double dollarsToEurosExchangeRate = 0.84;
    private double getDollarsToPoundsExchangeRate = 0.74;

    //constants to display in the combo box
    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    //create hashmap of the names of currencies and their exchange rates
    private HashMap<String, Double> exchangeRates = new HashMap<>();


    CurrencyConverter(){
        setPreferredSize(new Dimension(350,200));
        setLocationRelativeTo(null);
        setContentPane(mainPanel1);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //to make the enter key press the button
        getRootPane().setDefaultButton(convertButton);

        //set up exchange rates hashmap. Will refer to this when the conversion is performed.
        exchangeRates.put(EUROS, dollarsToEurosExchangeRate);
        exchangeRates.put(POUNDS, getDollarsToPoundsExchangeRate);

        //set up Jcombobox
        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dollarString = userEntry.getText();
            try {
                double dollars = Double.parseDouble(dollarString);
                //Convert selected item to expected type
                String toCurrency = (String) currencyComboBox.getSelectedItem();

                //get the exchange rate from the hashmap using the selection from the from the combobox as the key
                double exchangeRate = exchangeRates.get(toCurrency);

                //math
                double converted = dollars * exchangeRate;

                //the next line would be a static converter
//                double euros = dollars * dollarsToEurosExchangeRate;

                String resultString = String.format("%.2f dollars is equivalent to %.2f %s", dollars, converted, toCurrency);
                convertOutput.setText(resultString);

            } catch (NumberFormatException nfe) {
                //pop-up dialog box if user error caught
                JOptionPane.showMessageDialog(CurrencyConverter.this,
                        "Please enter a number without $ symbols or other characters");
                //add the next line if you want to clear the text box
                userEntry.setText("");
            }
            }
        });
    }
}
