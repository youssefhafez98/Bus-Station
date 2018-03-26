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
   private String[] trips = new String[100];
   
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
