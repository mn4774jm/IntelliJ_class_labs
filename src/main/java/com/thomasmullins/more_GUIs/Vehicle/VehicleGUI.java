package com.thomasmullins.more_GUIs.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VehicleGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField nameTextField;
    private JTextField makeTextField;
    private JTextField modelTextField;
    private JCheckBox electricCheckBox;
    private JButton addButton;
    private JList<Vehicle> vehicleList; // Vehicle generic type added to the JList. guarantees you can only add vehicle objects
    private JButton deleteButton;
    //set-up for JList
    private DefaultListModel<Vehicle> vehicleListModel;

    VehicleGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(600, 600));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        //set-up for JList
        vehicleListModel = new DefaultListModel<>();
        vehicleList.setModel(vehicleListModel);

        //make only one item selectable at anytime
        vehicleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //VehicleGUI constructor
        addButton.addActionListener(event -> {
                String name = nameTextField.getText();
                String make = makeTextField.getText();
                String model = modelTextField.getText();
                boolean isElectric = electricCheckBox.isSelected();

                //verify that all text fields are filled in
                if (name.isBlank() || make.isBlank() || model.isBlank()) {
                    JOptionPane.showMessageDialog(VehicleGUI.this, "Fill in all fields");
                    return;
                }
                Vehicle vehicle = new Vehicle(name, make, model, isElectric);
                vehicleListModel.addElement(vehicle);

                //clear all input components after the vehicle has been added
                nameTextField.setText("");
                makeTextField.setText("");
                modelTextField.setText("");
                electricCheckBox.setSelected(false);

        });
        deleteButton.addActionListener(event -> {
            //what level is selected?
            Vehicle selectedVehicle = vehicleList.getSelectedValue();

            //confirm delete
            if (selectedVehicle == null) {
                return;
            }

            if (JOptionPane.showConfirmDialog(VehicleGUI.this,
                    "Delete " + selectedVehicle.getName() + "?",
                    "Delete Vehicle",
                    JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

                // remove vehicle from the list model
                vehicleListModel.removeElement(selectedVehicle);

            }

    });
    }
}
