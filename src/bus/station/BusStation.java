/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.sql.*;
/**
 *
 * @author user
 */



public class BusStation {

    public static void createDb(String fileName){
        String url = "jdbc:sqlite:D:/Database/" + fileName + ".db";
 
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createTableCustomers(){
       String url="jdbc:sqlite:D:/Database/BusStation.db";
       String sq1="CREATE TABLE IF NOT EXISTS customers(\n" + "username text PRIMARY KEY,\n" + "name text\n"+ "password text\n" + "trips integer\n" + "balance real\n" + ");";
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sq1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
   }
    
    public static void createTableEmployees(){
       String url="jdbc:sqlite:D:/Database/BusStation.db";
       String sq1="CREATE TABLE IF NOT EXISTS employees(\n" + "empID text PRIMARY KEY,\n" + "name text\n"+ "salary real\n" + ");";
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sq1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
   
    public static void createTableVehicles(){
       String url="jdbc:sqlite:D:/Database/BusStation.db";
       String sq1="CREATE TABLE IF NOT EXISTS vehicles(\n" + "vehID text PRIMARY KEY,\n" + "model text\n"+ "type text\n" + "int multiplier\n" + ");";
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sq1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
   }
    
    public static void createTableTrips(){
       String url="jdbc:sqlite:D:/Database/BusStation.db";
       String sq1="CREATE TABLE IF NOT EXISTS trips(\n" + "tripID text PRIMARY KEY,\n" + "date text\n"+ "driver text\n" + "state text\n" + "price real\n" + ");";
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sq1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
   }
    
    public static void main(String[] args) {
        createDb("BusStation");
        createTableCustomers();
        createTableVehicles();
        createTableTrips();
        createTableEmployees();
    }
}
