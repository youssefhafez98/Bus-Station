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
public class Bus extends Vehicle {

    public Bus(String model)
    {
        this.multiplier = 2;
        this.type = "Bus";
        this.model = model;
    }
}
