/*
 to restrict the usage of certain methods in class 
 we create the refernce of the interface those methods we want to use and our class have implemented it 
    means the reference nwo only call to the methods which are avaialbe in interface.
 */

import java.util.Scanner;

interface Bluetooth{
    void turnOn();
    void getNetworks();
}
interface Camera{
    void takePicture();
    void captureVideo();
    default void addTimeStamp(){
        System.out.println("Added timestamp");
    }
}
interface GPS{
    String[] getNetworks();
    void setNetworks(String networks[]);
}
class SmartPhone implements Camera,GPS{
    private String[] networks;
    public void takePicture(){
        System.out.println("Captured picture");
    }
    public void captureVideo(){
        System.out.println("Started recording....");
    }
    public String[] getNetworks(){
        return networks;
    }
    public void setNetworks(String networks[]){
        this.networks=networks;
    }
    public void greet(){
        System.out.println("good morning");
    }
}
public class PolymorphimsInInterface {
    public static void main(String[] args) {
        Camera camera; // here we create the reference of interface
        camera=new SmartPhone(); //created object of SmartPhone class and stored the addres of it in the refernece of Camera interface.
        camera.takePicture(); // this is allowed
        // camera.getNetworks(); // this is not allowed
        camera.addTimeStamp();// thsi is alsow allowed

        // Bluetooth bluetooth=new SmartPhone(); this will not work bcoz smartphone never implemented Bluetooth interface
        
    }
}
