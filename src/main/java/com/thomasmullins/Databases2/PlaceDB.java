package com.thomasmullins.Databases2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaceDB {

    private static final String DB_CONNECTION_URL = "jdbc:sqlite:places.sqlite";

    private static final String NAME_COL = "name";
    private static final String ELEV_COL = "elev";

    //Add constants
    static final String OK = "ok";
    static final String DUPLICATE = "Duplicate place name";

    static final int SQLITE_DUPLICATE_PRIMARY_KEY_CODE = 19;

    PlaceDB() {
        try (Connection conn = DriverManager.getConnection(DB_CONNECTION_URL);
             Statement statement = conn.createStatement()) {

            //Create a table in the database, if it does not exist already
            String createTableSQL = "CREATE TABLE IF NOT EXISTS places (name TEXT PRIMARY KEY, elev DOUBLE)";

            statement.executeUpdate(createTableSQL);
        }catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    public List<Place> fetchAllRecords() {
        List<Place> allRecords = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_CONNECTION_URL);
        Statement statement = conn.createStatement()) {

            String selectAllSQL = "SELECT * FROM places";
            ResultSet rsAll = statement.executeQuery(selectAllSQL);

            //Goes one row at a time, collects column information to variables, assigns as new place object, added to allrecords
            while (rsAll.next()) {
                String name = rsAll.getString(NAME_COL);
                double elevation = rsAll.getDouble(ELEV_COL);
                Place placeRecord = new Place(name, elevation);
                allRecords.add(placeRecord);
            }
            return allRecords; // If there's no data, thsi will be empty

        }catch (SQLException sqle) {
            throw new RuntimeException(sqle); // crashes program - Programmer must fix

        }
    }
    // insert new data
    // check for duplicate place names
    public String addRecord(Place place) {

        String addPlaceSQL = "INSERT INTO places VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_CONNECTION_URL);
        PreparedStatement addPlacePs = conn.prepareStatement(addPlaceSQL)) {
            //attempts to create new row. If successful ok is returned.
            addPlacePs.setString(1, place.getName());
            addPlacePs.setDouble(2, place.getElevation());
            addPlacePs.execute();
            return OK;

        }catch (SQLException sqle) {
            //if error is triggered and the error code is from a duplicate entry, duplicate is returned
            if (sqle.getErrorCode() == SQLITE_DUPLICATE_PRIMARY_KEY_CODE){
                return DUPLICATE;
            } else {
                throw new RuntimeException();
            }
        }
    }
    public void delete(Place place) {
        String deleteSQL = "DELETE FROM places WHERE name = ?";

        try(Connection conn = DriverManager.getConnection(DB_CONNECTION_URL);
        PreparedStatement deletePreparedStatement = conn.prepareStatement(deleteSQL)) {

            deletePreparedStatement.setString(1, place.getName());
            deletePreparedStatement.execute();
        }catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
}
