/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package device;

/**
 *
 * @author danieldominguez
 */
public class Device {
    
    String type;
    String model;
    
    public Device(String type, String model){
        this.type = type;
        this.model = model;
    }
    
    public String getType(){
        return type;
    }
    
    public void SetType(String type){
        this.type=type;
    }
    
    public String getModel(){
        return model;
    }
    
    public void SetModel(String model){
        this.model=model;
    }
    
    public String toString(){
        return "You choosed device type " + type + " and model " + model;
    }
}
