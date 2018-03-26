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
public class Database {
    
    private Connection connect(){
        String ur1="jdbc:sqlite:D:/Database/BusStation.db";
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(ur1);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void insertCustomer(String username,String password, String name, int trips, double balance){
        String sq1="INSERT INTO customers(username,password,name,trips) VALUES(?,?,?,?,?)";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sq1)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, name);
            pstmt.setInt(4, trips);
            pstmt.setFloat(5, (float) balance);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insertVehicle(String vehID, String model, String type, int multiplier){
        String sq1="INSERT INTO vehicles(vehID,model,type,multiplier) VALUES(?,?,?,?)";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sq1)) {
            pstmt.setString(1, vehID);
            pstmt.setString(2, model);
            pstmt.setString(3, type);
            pstmt.setInt(4, multiplier);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
        public void insertEmployee(String empID,String name,double salary){
        String sq1="INSERT INTO employees(empID,name,salary) VALUES(?,?,?)";
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sq1)) {
            pstmt.setString(1, empID);
            pstmt.setString(2, name);
            pstmt.setFloat(3, (float)salary);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }
        
    public void insertTrip(String tripID,String date,String driver, String state, double price ){
        String sq1="INSERT INTO trips(ID,Name) VALUES(?,?,?,?,?)";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sq1)) {
            pstmt.setString(1, tripID);
            pstmt.setString(2, date);
            pstmt.setString(3, driver);
            pstmt.setString(4, state);
            pstmt.setFloat(5, (float)price);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void selectCustomers(){
        String sql = "SELECT username, name, password, trips, balance FROM customers";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                System.out.println(rs.getString("username") +  "\t" + 
                                   rs.getString("name") + "\t" +
                                   rs.getString("password")+ "\t" + rs.getInt("trips")+ "\t" + rs.getDouble("balance"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void selectEmployees(){
        String sql = "SELECT empID, name, salary FROM employees";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
           
            while (rs.next()) {
                System.out.println(rs.getString("empID") +  "\t" + 
                                   rs.getString("name") + "\t" +
                                   rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
