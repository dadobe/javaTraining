
package hackaton2018;

import user.User;
import device.Device;
import location.Location;
import vehicle.Vehicle;

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
        
        Location l1 = new Location("Spain", 8860);
        System.out.println(l1.toString2());
        
        Vehicle v1 = new Vehicle();
        v1.setModel("Seat Ibiza");
        v1.setColor("Blue");
        System.out.println(v1.toString3());
        
    }
    
}
