package com.thomasmullins.Databases2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PlaceGUI extends JFrame {
    private JTextField placeNameText;
    private JTextField elevationText;
    private JButton addButton;
    private JList<Place> placeList;
    private JButton deleteButton;
    private JPanel mainPanel;
    //Create controller object
    private Controller controller;

    private DefaultListModel<Place> allPlacesListModel;
     //added argument to reference the controller(main method) allows it to speak to the database (Required)
    PlaceGUI(Controller controller) {

        //store reference to the controller object.
        //Use to make requests to the controller, which forwards it to the DB
        this.controller = controller;

        //Configure the list model; set data source
        allPlacesListModel = new DefaultListModel<>();
        placeList.setModel(allPlacesListModel);

        addListeners(); //configure listeners in separate method

        //Regular setup tasks for the window / JFrame
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setVisible(true);
    }
    // Used to update the list automatically
    public void setListData(List<Place> data) {
        // Convenience method to update list.
        // Clear list model, and display all place data in JList
        allPlacesListModel.clear();

        if (data != null) {
            for (Place place : data) {
                allPlacesListModel.addElement(place);
            }
        }
    }

    //contains buttons and corresponding functions
    public void addListeners() {
        deleteButton.addActionListener(event -> {
            //Identify what is selected
            Place place = placeList.getSelectedValue();
            if (place == null){
                JOptionPane.showMessageDialog(PlaceGUI.this, "Please select a place to delete");
            } else {
                controller.deletePlace(place);
                List<Place> places = controller.getAllData();
                setListData(places);
            }
        });

        addButton.addActionListener(event -> {
            String place = placeNameText.getText();

            if(place.isEmpty()){
                errorDialog("Enter a place name");
                return;
            }
            double elev;

            try {
                elev = Double.parseDouble(elevationText.getText());
            }catch (NumberFormatException nfe) {
                errorDialog("Enter a number for elevation");
                return;
            }
            Place placeRecord = new Place(place, elev);
            String result = controller.addPlaceToDatabase(placeRecord);

            if (result.equals(PlaceDB.OK)){
                placeNameText.setText("");
                elevationText.setText("");

                // And request all data from DB to update list
                List<Place> allData = controller.getAllData();
                setListData(allData);

            } else {
                errorDialog(result);
            }
        });


    }

    //provide feedback to user when errors occur
    private void errorDialog(String msg) {
        JOptionPane.showMessageDialog(PlaceGUI.this, msg, "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}

