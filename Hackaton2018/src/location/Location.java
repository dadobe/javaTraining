/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    String setCountry(){
        return country;
    }
    
    int setZip(){
        return zip;
    }
    
    void getCountry(String country){
        this.country = country;
    }
    
    void getZip(int zip){
        this.zip=zip;
    }
    
    public String toString2(){
        return "You choosed country " + country + " with zip code: " + zip;
    }
}
