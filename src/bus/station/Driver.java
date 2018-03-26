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
public class Driver extends Employee {
    String[] trips = new String[20];
    
    public void Driver(String name)
    {
        this.name=name;
    }
    
    
    public void setSalary(int multiplier, int trips)
    {
        this.salary = (double)trips * multiplier;
    }
}
