/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author danieldominguez
 */
public class Vehicle {
    
    String model;
    String color;
    
    public Vehicle(){
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model=model;
    }
    
    public String toString3(){
        return "You choosed vehicle model " + model + " with color " + color;
    }
}
