/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton2018;

import user.User;
import device.Device;

/**
 *
 * @author danieldominguez
 */
public class Hackaton2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User user = new User();
        user.setAge(18);
        user.setName("dadobe");
        System.out.println("age:"  + user.getAge() + " name:" +  user.getName());
        
        Device d1 = new Device("Smartphone","Samsung A5");
        //d1.setType ("Smartphone");
        //d1.setModel ("Samsung A5");
        System.out.println(d1.toString());
        
        
    }
    
}
