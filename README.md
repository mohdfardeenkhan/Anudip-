explanation of that code
Device Class:

This is the base class with attributes brand and model.
It has a constructor to initialize these attributes without using this.
The turnOn and turnOff methods print messages indicating the device's power state.
Laptop Class:

This class extends Device, inheriting its attributes and methods.
It adds an attribute batteryLife to store the battery percentage.
It has its own constructor, which calls the superclass constructor to initialize brand and model, and also initializes batteryLife without using this.
It has a method showBatteryStatus to print the battery life.
Main Class:

The main method creates an instance of Laptop.
It demonstrates the usage of inherited methods (turnOn and turnOff) and the showBatteryStatus method specific to the Laptop class.
