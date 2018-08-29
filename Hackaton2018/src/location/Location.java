
package location;

/**
 *
 * @author danieldominguez
 */
public class Location {
    
    String country;
    int zip;
    
    public Location(){
        country = "No country specified";
        zip = 00000;
    }
    
    public Location(String country, int zip){
        this.country=country;
        this.zip=zip;
    }
    
    public String setCountry(){
        return country;
    }
    
    public int setZip(){
        return zip;
    }
    
    public void getCountry(String country){
        this.country = country;
    }
    
    public void getZip(int zip){
        this.zip=zip;
    }
    
    public String toString2(){
        return "You choosed country " + country + " with zip code: " + zip;
    }
}
