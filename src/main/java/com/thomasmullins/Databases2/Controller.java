package com.thomasmullins.Databases2;

import java.util.List;

public class Controller {

    private PlaceGUI gui;
    private PlaceDB db;
    //main method
    public static void main(String[] args) {
        new Controller().startApp();

    }

    private void startApp() {
        //create PlaceDB and PlaceGUI objects
        db = new PlaceDB();

        List<Place> allData = db.fetchAllRecords();

        //send a reference to itself when creating PlaceGUI
        //creates new gui and sends controller (this) to it.
        gui = new PlaceGUI(this);
        gui.setListData(allData);
    }

    List<Place> getAllData() {
        return db.fetchAllRecords();
    }
    String addPlaceToDatabase(Place place) {
        return db.addRecord(place);
    }
    void deletePlace(Place place) {
        db.delete(place);
    }
}
