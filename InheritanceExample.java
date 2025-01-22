/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods.
*/

package Java_Internship;
// Parent class: Vehicle
class Vehicle {
    String brand = "BMW";
    String model ="X5";
    int year=2024;

    // Method to drive
    public void drive() {
        System.out.println("The " + brand + " " + model + " from " + year + " is driving.");
    }
}

// Child class: Car, inheriting from Vehicle
class Car extends Vehicle {
    String color="Blue";

    // Method to honk
    public void honk() {
        System.out.println("The " + color + " BMW X5 is honking.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Call the drive and honk methods
        myCar.drive();  // From Vehicle class
        myCar.honk();   // From Car class
    }
}

/*OUTPUT
The BMW X5 from 2024 is driving.
The Blue BMW X5 is honking.
*/