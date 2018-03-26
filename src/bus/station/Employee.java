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
public abstract class Employee {
    protected String name;
    protected double salary;
    
    public double calculateSalary(int multiplier, int daysworked)
    {
        salary = multiplier * daysworked;
        return salary;
    }
    
}




