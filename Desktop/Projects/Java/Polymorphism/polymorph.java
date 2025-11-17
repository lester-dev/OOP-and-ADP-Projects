// Parent class
class Vehicle {

    // Overloaded methods (Compile-Time Polymorphism)
    void info() {
        System.out.println("This is a vehicle");
    }

    void info(String brand) {
        System.out.println("Brand: " + brand);
    }

    void info(String brand, int year) {
        System.out.println("Model: " + brand + ", Year: " + year);
    }

    // Color info
    void infoColor(String color) {
        System.out.println("Color: " + color);
    }

    // Transmission info
    void infoTransmission(String transmission) {
        System.out.println("Transmission: " + transmission);
    }

    // Method to be overridden
    void speed() {
        System.out.println("Vehicle has an average speed.");
    }
}

// Subclass 1
class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 150 km/h.");
    }
}

// Subclass 2
class Motorcycle extends Vehicle {
    @Override
    void speed() {
        System.out.println("Motorcycle runs at 120 km/h.");
    }
}

public class polymorph {
    public static void main(String[] args) {

        Vehicle v;

        // Using Car object
        v = new Car();
        v.info();
        v.info("Toyota");
        v.info("Vios", 2024);
        v.infoColor("Red");
        v.infoTransmission("Automatic");
        v.speed();

        System.out.println();

        // Using Motorcycle object
        v = new Motorcycle();
        v.info();
        v.info("Honda");
        v.info("City", 2020);
        v.infoColor("Black");
        v.infoTransmission("Manual");
        v.speed();
    }
}
