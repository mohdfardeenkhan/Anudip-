package practive.anudip;

//Device.java
class Device {
 // Attributes
 String brand;
 String model;

 // Constructor
 public Device(String b, String m) {
     brand = b;
     model = m;
 }

 // Methods
 public void turnOn() {
     System.out.println(brand + " " + model + " is now ON.");
 }

 public void turnOff() {
     System.out.println(brand + " " + model + " is now OFF.");
 }
}

//Laptop.java
class Laptop extends Device {
 // Additional attribute
 int batteryLife; // in percentage

 // Constructor
 public Laptop(String b, String m, int battery) {
     super(b, m); // Call the constructor of the superclass (Device)
     batteryLife = battery;
 }

 // Method to show battery status
 public void showBatteryStatus() {
     System.out.println("Battery life is at " + batteryLife + "%.");
 }
}

//Main.java
public class Main {
 public static void main(String[] args) {
     // Create a Laptop object
     Laptop myLaptop = new Laptop("Dell", "XPS 15", 85);

     // Using inherited methods
     myLaptop.turnOn();
     myLaptop.showBatteryStatus();
     myLaptop.turnOff();
 }
}

