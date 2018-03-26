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
public class Limousine extends Vehicle {
    
    public Limousine(String model)
    {
        this.multiplier = 3;
        this.type = "Limousine";
        this.model = model;
    }
}
