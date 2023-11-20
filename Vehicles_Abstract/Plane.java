package Vehicles_Abstract;

public class Plane extends Vehicle {
    int wings;

    Plane(String name, int speed, int wings) {
        super(name, speed);
        this.wings = wings;
    }

    String move() {
        return "The plane is flying.";
    }

    int getWings() {
        return wings;
    }
}