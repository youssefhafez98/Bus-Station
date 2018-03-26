/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

/**
 *
 * @author user
 */
public class Customer {
   private String name;
   private String username;
   private String password;
   private int trips;
   private double balance;
   
   
   public Customer(String name, String username, String password)
   {
       Database d = new Database();
       this.name=name;
       this.username=username;
       this.password=password;
       this.trips = 0;
       this.balance=0.0;
       d.insertCustomer(username,password,name,trips,balance);
   }
   
   public static double calculateprice(int multiplier, int tickettype)
   {
       double price=0;
       if(multiplier>0)
       {
           price = multiplier * tickettype;
       }
       return price;
   }
}
