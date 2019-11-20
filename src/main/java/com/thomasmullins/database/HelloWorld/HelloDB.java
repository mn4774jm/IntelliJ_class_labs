package com.thomasmullins.database.HelloWorld;

import java.sql.*;

public class HelloDB {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sqlite:Hello.sqlite";

        //links code to database
        Connection connection = DriverManager.getConnection(url);

        Statement statement = connection.createStatement();

        // creates your rows and columns; will error if table already exists
        String createTableSql = "CREATE TABLE IF NOT EXISTS cats (name TEXT, age INTEGER)";
        statement.execute(createTableSql);

//        //creates a table if original table doesn't exist already. Otherwise moves on.
////         This will add already existing data to the table if the table isn't dropped
//        String createTableSql = "CREATE TABLE IF NOT EXISTS cats (name TEXT, age INTEGER)";
//        statement.execute(createTableSql);

        //insert data into table
        String insertDataSql = "INSERT INTO cats VALUES ('Maru', 10)";
        statement.execute(insertDataSql);

        //insert data into table
        insertDataSql = "INSERT INTO cats VALUES ('Hello Kitty', 45)";
        statement.execute(insertDataSql);

        //selecting all from cats
        String getAllCats = "SELECT * FROM cats";
        ResultSet allCats = statement.executeQuery(getAllCats);

        //loops through data columns one by one
        while (allCats.next()) {
            String catName = allCats.getString("name");
            int catAge = allCats.getInt("age");
            System.out.printf("%s is %d years old\n", catName, catAge );
        }
        //close table
        allCats.close();

        //drop table
        String dropTableSql = "DROP TABLE cats";
        statement.execute(dropTableSql);

        //close statement and connection to sql
        statement.close();
        connection.close();
    }
}
